package org.jesperancinha.java11.mastery3dot1.concert;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public interface Concert {
    int addConcertGoer() throws ConcerCapacityExceededException;

    int getCurrentCount();

    default void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            RED.printGenericLn("Error has occurred! %s", e);
        }
    }
}
