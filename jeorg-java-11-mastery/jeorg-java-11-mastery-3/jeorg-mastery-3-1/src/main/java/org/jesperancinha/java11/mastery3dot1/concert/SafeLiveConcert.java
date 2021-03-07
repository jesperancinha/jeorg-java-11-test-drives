package org.jesperancinha.java11.mastery3dot1.concert;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class is 100% thread-safe
 * The write accessors perform synchronized changes.
 * The object itself is not only final but it is also of an Atomic kind
 * Atomic operations are thread safe.
 */
public class SafeLiveConcert implements Concert {

    private final AtomicInteger counter;

    private final int capacity;

    public SafeLiveConcert(int capacity) {
        this.capacity = capacity;
        this.counter = new AtomicInteger();
    }

    public synchronized int addConcertGoer() throws ConcerCapacityExceededException {
        if (counter.get() >= capacity) {
//            RED.printGenericLn("SafeLiveConcert has reach is maximum capacity of %d people", capacity);
            throw new ConcerCapacityExceededException();
        }
        sleep();
        return this.counter.incrementAndGet();
    }

    public int getCurrentCount() {
        return this.counter.getAcquire();
    }
}
