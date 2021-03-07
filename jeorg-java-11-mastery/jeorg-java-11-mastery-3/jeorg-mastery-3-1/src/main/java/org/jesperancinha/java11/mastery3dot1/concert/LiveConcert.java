package org.jesperancinha.java11.mastery3dot1.concert;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class is 50% thread-safe
 * The write accessors perform unsynchronized changes.
 * The object itself is not only final but it is also of an Atomic kind
 * Atomic operations are thread safe.
 */
public class LiveConcert implements Concert {

    private final AtomicInteger counter;

    private final int capacity;

    public LiveConcert(int capacity) {
        this.capacity = capacity;
        this.counter = new AtomicInteger();
    }

    public int addConcertGoer() throws ConcerCapacityExceededException {
        if (counter.get() >= capacity) {
//            RED.printGenericLn("LiveConcert has reach is maximum capacity of %d people", capacity);
            throw new ConcerCapacityExceededException();
        }
        sleep();
        return this.counter.incrementAndGet();
    }

    public int getCurrentCount() {
        return this.counter.getAcquire();
    }
}
