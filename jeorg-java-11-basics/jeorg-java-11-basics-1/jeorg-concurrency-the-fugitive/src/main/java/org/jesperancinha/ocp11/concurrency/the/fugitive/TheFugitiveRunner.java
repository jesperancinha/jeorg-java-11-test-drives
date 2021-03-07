package org.jesperancinha.java11.concurrency.the.fugitive;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class TheFugitiveRunner {
    private static final ReentrantLock backDoorLock = new ReentrantLock();
    private static final ReentrantLock frontDoorLock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        backDoorLock.lock();
        System.out.println("Lock1");
        backDoorLock.lock();
        System.out.println("Lock2");

        var f1 = frontDoorLock.tryLock();
        System.out.println(f1);
        var f2 = frontDoorLock.tryLock();
        System.out.println(f2);

        System.out.println("The current thread that achieves locking, can acquire a lock multiple times.");
        System.out.println("It must also release it that many multiple times.");

        backDoorLock.unlock();
        backDoorLock.unlock();

        frontDoorLock.unlock();
        frontDoorLock.unlock();

        System.out.println("***** The Fugitive One ****");

        var executorServiceBackDoor = Executors.newFixedThreadPool(2);
        var executorServiceFrontDoor = Executors.newFixedThreadPool(2);

        executorServiceBackDoor.submit(() -> {
            backDoorLock.lock();
            System.out.println("Richard Kimble - I'm Richard Kimble and I've locked the door!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                RED.printThrowableAndExit(e);
            }
            System.out.println("RK - I'm Richard Kimble and I'm going for a stroll!");
            backDoorLock.unlock();
        });
        executorServiceBackDoor.submit(() -> {
            backDoorLock.lock();
            System.out.println("Criminal - I'm the criminal and I've locked the door! Won't unlock it until I'm done");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                RED.printThrowableAndExit(e);
            }
            // backDoorLock.unlock();
        });

        executorServiceBackDoor.shutdown();
        executorServiceBackDoor.awaitTermination(5000, TimeUnit.SECONDS);

        System.out.println("***** The Fugitive Two ****");

        executorServiceFrontDoor.submit(() -> {
            frontDoorLock.lock();
            System.out.println("RK - I'm Richard Kimble and I've locked the door!");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                RED.printThrowableAndExit(e);
            }
            System.out.println("RK - I'm Richard Kimble and I'm going for a stroll!");
            frontDoorLock.unlock();
        });
        executorServiceFrontDoor.submit(() -> {
            if (frontDoorLock.tryLock()) {
                System.out.println("C - I'm the criminal and I've locked the door! Won't unlock it until I'm done");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    RED.printThrowableAndExit(e);
                }
            } else {
                System.out.println("C - Oh Oh, I have to escape, he is still in there!");
            }
            // backDoorLock.unlock();
        });

        executorServiceFrontDoor.shutdown();
        executorServiceFrontDoor.awaitTermination(5000, TimeUnit.SECONDS);
    }
}
