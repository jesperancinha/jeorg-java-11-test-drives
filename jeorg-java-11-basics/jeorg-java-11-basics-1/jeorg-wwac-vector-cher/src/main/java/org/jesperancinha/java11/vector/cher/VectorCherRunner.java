package org.jesperancinha.java11.vector.cher;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VectorCherRunner {
    private static final int REPETITION_NUMBER = 100;

    public static void main(String[] args) throws InterruptedException {
        var vectorCher = new Vector<String>();
        var listCher = new ArrayList<String>();

        System.out.println("-------------- Testing Vectors.... -------------");
        final LocalDateTime startVector = LocalDateTime.now();
        System.out.println(startVector);
        ExecutorService executorVector = Executors.newFixedThreadPool(26 * REPETITION_NUMBER);
        for (int i = 0; i < REPETITION_NUMBER; i++) {
            addChers26AlbumsToAVector(vectorCher, executorVector);
        }
        executorVector.shutdown();
        executorVector.awaitTermination(10, TimeUnit.SECONDS);
        final LocalDateTime endVector = LocalDateTime.now();
        System.out.println(endVector);
        System.out.printf("It took %d milliseconds to complete filling the vector\n", startVector.until(endVector, ChronoUnit.MILLIS));

        System.out.println("-------------- Testing Lists.... -------------");
        final LocalDateTime startList = LocalDateTime.now();
        System.out.println(startList);
        ExecutorService executorList = Executors.newFixedThreadPool(26 * REPETITION_NUMBER);
        for (int i = 0; i < REPETITION_NUMBER; i++) {
            addChers26AlbumsToAnArrayList(listCher, executorList);
        }
        executorList.shutdown();
        executorList.awaitTermination(10, TimeUnit.SECONDS);
        final LocalDateTime endList = LocalDateTime.now();
        System.out.println(endList);
        System.out.printf("It took %d milliseconds to complete filling the list\n", startList.until(endList, ChronoUnit.MILLIS));

        System.out.println(vectorCher.subList(0, 26));
        System.out.println(listCher.subList(0, 26));
    }

    private static void addChers26AlbumsToAnArrayList(ArrayList<String> listCher, ExecutorService executorList) {
        executorList.submit(() -> listCher.add("All I Really Want to Do"));
        executorList.submit(() -> listCher.add("The Sonny Side of Chér"));
        executorList.submit(() -> listCher.add("Chér"));
        executorList.submit(() -> listCher.add("With Love, Chér"));
        executorList.submit(() -> listCher.add("Backstage"));
        executorList.submit(() -> listCher.add("3614 Jackson Highway"));
        executorList.submit(() -> listCher.add("Gypsys, Tramps & Thieves[A]"));
        executorList.submit(() -> listCher.add("Foxy Lady"));
        executorList.submit(() -> listCher.add("Bittersweet White Light"));
        executorList.submit(() -> listCher.add("Half-Breed"));
        executorList.submit(() -> listCher.add("Dark Lady"));
        executorList.submit(() -> listCher.add("Stars"));
        executorList.submit(() -> listCher.add("I'd Rather Believe in You"));
        executorList.submit(() -> listCher.add("Cherished"));
        executorList.submit(() -> listCher.add("Take Me Home"));
        executorList.submit(() -> listCher.add("Prisoner"));
        executorList.submit(() -> listCher.add("I Paralyze"));
        executorList.submit(() -> listCher.add("Cher"));
        executorList.submit(() -> listCher.add("Heart of Stone"));
        executorList.submit(() -> listCher.add("Love Hurts"));
        executorList.submit(() -> listCher.add("It's a Man's World"));
        executorList.submit(() -> listCher.add("Believe"));
        executorList.submit(() -> listCher.add("not.com.mercial[D]"));
        executorList.submit(() -> listCher.add("Living Proof"));
        executorList.submit(() -> listCher.add("Closer to the Truth"));
        executorList.submit(() -> listCher.add("Dancing Queen"));
    }

    private static void addChers26AlbumsToAVector(Vector<String> vectorCher, ExecutorService executorVector) {
        executorVector.submit(() -> vectorCher.add("All I Really Want to Do"));
        executorVector.submit(() -> vectorCher.add("The Sonny Side of Chér"));
        executorVector.submit(() -> vectorCher.add("Chér"));
        executorVector.submit(() -> vectorCher.add("With Love, Chér"));
        executorVector.submit(() -> vectorCher.add("Backstage"));
        executorVector.submit(() -> vectorCher.add("3614 Jackson Highway"));
        executorVector.submit(() -> vectorCher.add("Gypsys, Tramps & Thieves[A]"));
        executorVector.submit(() -> vectorCher.add("Foxy Lady"));
        executorVector.submit(() -> vectorCher.add("Bittersweet White Light"));
        executorVector.submit(() -> vectorCher.add("Half-Breed"));
        executorVector.submit(() -> vectorCher.add("Dark Lady"));
        executorVector.submit(() -> vectorCher.add("Stars"));
        executorVector.submit(() -> vectorCher.add("I'd Rather Believe in You"));
        executorVector.submit(() -> vectorCher.add("Cherished"));
        executorVector.submit(() -> vectorCher.add("Take Me Home"));
        executorVector.submit(() -> vectorCher.add("Prisoner"));
        executorVector.submit(() -> vectorCher.add("I Paralyze"));
        executorVector.submit(() -> vectorCher.add("Cher"));
        executorVector.submit(() -> vectorCher.add("Heart of Stone"));
        executorVector.submit(() -> vectorCher.add("Love Hurts"));
        executorVector.submit(() -> vectorCher.add("It's a Man's World"));
        executorVector.submit(() -> vectorCher.add("Believe"));
        executorVector.submit(() -> vectorCher.add("not.com.mercial[D]"));
        executorVector.submit(() -> vectorCher.add("Living Proof"));
        executorVector.submit(() -> vectorCher.add("Closer to the Truth"));
        executorVector.submit(() -> vectorCher.add("Dancing Queen"));
    }

}
