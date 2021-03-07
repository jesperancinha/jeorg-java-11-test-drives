package org.jesperancinha.java11.mastery1dot1.runner;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 3. This is an illegal operation
// Package member classes cannot be static
// In other words, top-level classses cannot be static
// public static class City {
public class City {

    // 1. We can, however create static member inner classes
    public static class RockHouse extends House {

    }

    final int b = 1000;

    // 2. We can return anonymous class.
    // In our case our anonymous class is a subclass of RockHouse
    // Note that anonymous classes may not be static.
    // The reason is very simple.
    // An anonymous class implies the creation of an instance class.
    // Instance classes are never static.
    public RockHouse getAnonymousRockHouse() {
        return new RockHouse() {
        };
    }

    public static Protagonist createCaracter() {

        final int a = 10;

        var c = 10000;
        var d = 10000;
        d = 1000;
        int f = 18;
        int g = 19;
        g = 20;
        // 4. In the same way as package member classes, local classes cannot be made stacic
        // Local is many times also referred to as automatic
        // Since this is a local class, the public key is pointless.
        // Not only is pointless but it is also illegal to use.
        // public static class Flinstone extends Protagonist {
        class Flinstone extends Protagonist {
            Flinstone() {
                System.out.println("These variables are visible.");
                System.out.println("Variable a is inside the inner class, static class method.");
                System.out.println(a);
                // 14. Value b cannot be accessed because our method is static.
                // This is a different scope than the outer class
                // Non-static field 'b' cannot be referenced from a static context
                // System.out.println(b);
                System.out.println("Variable c is effectively final.");
                System.out.println(c);
                // 14. Variable 'd' is accessed from within inner class, needs to be final or effectively final
                //System.out.println(d);

                System.out.println("Variable f is accepted because it is local a.k.a. automatic variable. It also is effectively final");
                System.out.println(f);
                // 14. Variable 'g' is accessed from within inner class, needs to be final or effectively final
                //System.out.println(g);
            }
        }

        return new Flinstone();

    }

    /**
     * Neighbourhood watch for the Flinstones City Bedrock!
     *
     * @param dino       a character. Mostly Dino {@link String}
     * @param flinstones a family member list. Mostly The Flinstones {@link java.util.Arrays}
     * @throws InterruptedException Something wrong may happen
     */
    public void neighbourhoodWatch(String dino, String[] flinstones) throws InterruptedException {
        // 17. Read/Write paradigm with Locks
        // Note that the idea is not to synchronize reads
        // We are synchronizing the write operation as a whole against all reading threads running in parallel.
        // This is the basis of the ReentrantReadWriteLock kind of Lock.
        var executor = Executors.newFixedThreadPool(10);
        var mainLock = new ReentrantReadWriteLock();
        var readLock = mainLock.readLock();
        var writeLock = mainLock.writeLock();
        executor.submit(() -> {
            try {
                while (true) {
                    writeLock.lock();
                    System.out.printf("STOP! %s goes to the bathroom...\n", dino);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        System.out.println("Stop! Go home!");
                        break;
                    }
                    writeLock.unlock();
                    System.out.println("Stop! Go home!");
                }
            } finally {
                writeLock.unlock();
                System.out.println("Stop! Go home!");
            }
        });
        for (int i = 0; i < 9; i++) {
            executor.submit(() -> {
                while (true) {
                    try {
                        readLock.lock();
                        System.out.printf("%s sees %s passing by...\n", dino, flinstones[(int) (Math.random() * flinstones.length - 1)]);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Stop! Go home!");
                            break;
                        }
                    } finally {
                        readLock.unlock();
                    }
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
        executor.shutdownNow();
    }
}
