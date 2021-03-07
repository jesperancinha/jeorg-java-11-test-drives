package org.jesperancinha.java11.mastery4dot2.band;

import org.jesperancinha.java11.mastery4dot2.concert.Band;
import org.jesperancinha.java11.mastery4dot2.concert.GenericBand;

import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.Map;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class GeneralBandManager extends BandManager {

    @Override
    public Map<GenericBand, LocalDateTime> getUpcomingDates(Band t, Temporal d) {
        final Map<GenericBand, LocalDateTime> genericBandLocalDateTimeHashMap = new HashMap<>();
        genericBandLocalDateTimeHashMap.put((GenericBand) t, (LocalDateTime) d);
        ORANGE.printGenericLn("Overriden called!!");
        return new HashMap<>(genericBandLocalDateTimeHashMap);
    }

    public Map<GenericBand, LocalDateTime> getUpcomingDates(GenericBand t, Temporal d) {
        ORANGE.printGenericLn("Overloaded called!!");
        return new HashMap<>(Map.of(t, (LocalDateTime) d));
    }
}
