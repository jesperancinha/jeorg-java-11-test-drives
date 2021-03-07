package org.jesperancinha.java11.mastery3dot1.concert;

/**
 * This class and its internal object are 100% Thread safe.
 * No changes to counter occur and the counter is marked as final.
 */
public class VirtualConcert implements Concert {

    private final int counter;

    public VirtualConcert(int counter) {
        this.counter = counter;
    }

    public int addConcertGoer() throws ConcerCapacityExceededException {
//        RED.printGenericLn("VirtualConcert cannot be changed once created!");
        throw new ConcerCapacityExceededException();
    }

    public int getCurrentCount() {
        return this.counter;
    }
}
