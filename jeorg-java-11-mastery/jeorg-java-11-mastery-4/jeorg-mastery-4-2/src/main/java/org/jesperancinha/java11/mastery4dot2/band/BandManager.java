package org.jesperancinha.java11.mastery4dot2.band;

import org.jesperancinha.java11.mastery4dot2.concert.Band;

import java.time.temporal.Temporal;
import java.util.Map;

public abstract class BandManager {
    public <T extends Band, D extends Temporal> Map<T, D> getUpcomingDates(T t, D d) {
        return Map.of(t, d);
    }
}
