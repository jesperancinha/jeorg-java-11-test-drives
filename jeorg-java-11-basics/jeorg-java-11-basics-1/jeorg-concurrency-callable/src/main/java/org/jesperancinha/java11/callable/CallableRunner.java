package org.jesperancinha.java11.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class CallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Boolean> callable = () -> {
            System.out.println("------ Starting callable...");
            Thread.sleep(1000);
            System.out.println("------ Failing callable...");
            throw new Exception("I don't know what to do with myself");
        };

        Runnable runnable = () -> {
            System.out.println("------ Starting runnable...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                RED.printThrowableAndExit(e);
            }
            System.out.println("------ Failing runnable...");
            try {
                throw new Exception("I don't know what to do with myself");
            } catch (Exception e) {
                RED.printThrowableAndExit(e);
            }
        };

        try {
            if (callable.call()) {
                System.out.println("------ Callable was a success!");
            }

        } catch (Exception e) {
            RED.printThrowableAndExit(e);
        }

        runnable.run();
        System.out.println("------ I don't know if Runnable was a success...");

        System.out.println("Let's try all of this with executors...");

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Boolean> submitCallable = executor.submit(callable);
        Future<?> submitRunnable = executor.submit(runnable);
        executor.awaitTermination(2, TimeUnit.SECONDS);
        executor.shutdown();

        try {
            System.out.println("******************* When there is an exception we can re-throw it via the callable future:");
            System.out.println(submitCallable.get());
        } finally {
            System.out.println("******************* When there is an exception we get just a null fia the runnable future");
            System.out.println(submitRunnable.get());
        }

    }
}
