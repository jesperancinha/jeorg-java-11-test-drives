package org.jesperancinha.java11.mastery4dot2.band;

import org.jesperancinha.java11.mastery4dot2.concert.Band;

import java.time.temporal.Temporal;
import java.util.Map;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class EffectiveBandManager extends BandManager {
    @Override
    public Map<Band, Temporal> getUpcomingDates(Band t, Temporal b) {
        ORANGE.printGenericLn("Overriden called!!");
        return Map.of(t, b);
    }
}
