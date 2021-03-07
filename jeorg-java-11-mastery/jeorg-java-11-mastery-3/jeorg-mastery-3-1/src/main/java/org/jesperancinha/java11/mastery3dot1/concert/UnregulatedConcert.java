package org.jesperancinha.java11.mastery3dot1.concert;

/**
 * This class is 100% NOT thread-safe
 * The write accessors perform unsynchronized changes.
 * The object itself is not final
 */
public class UnregulatedConcert implements Concert {

    private int counter = 0;

    private final int capacity;

    public UnregulatedConcert(int capacity) {
        this.capacity = capacity;
    }

    public int addConcertGoer() throws ConcerCapacityExceededException {
        if (counter >= capacity) {
//            RED.printGenericLn("UnregulatedConcert has reach is maximum capacity of %d people", capacity);
            throw new ConcerCapacityExceededException();
        }
        sleep();
        counter++;
        return counter;
    }

    public int getCurrentCount() {
        return counter;
    }
}
