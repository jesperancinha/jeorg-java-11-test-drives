package org.jesperancinha.java11.crums.crum15;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowTitleLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum15 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 15 - Unmutable vs Concurrent HashMaps");

        final List<String> plantsInDutch = List.of("Rhododendrons", "Camile", "tulpen");
        final Map<String, Integer> initPlants = plantsInDutch.stream()
                .collect(Collectors.toUnmodifiableMap(s -> s, t -> plantsInDutch.size()));

        MAGENTA.printGenericLn("We've just created a list with some flowers we've initialized to %d", plantsInDutch.size());

        ORANGE.printGenericLn(initPlants);
        final String rose = "Rose";
        MAGENTA.printGenericLn("If we try to add a %s to it:", rose);
        try {
            initPlants.put("rose", plantsInDutch.size());
        } catch (UnsupportedOperationException exception) {
            RED.printGeneric("This is expected! We cannot ever change an unmutable list! -> %s", exception);
        }

        MAGENTA.printGenericLn("We can also make a concurrent Map and give it another try:");

        final ConcurrentMap<String, Integer> initPlants2 = plantsInDutch.stream()
                .collect(Collectors.toConcurrentMap(s -> s, t -> plantsInDutch.size()));

        ORANGE.printGenericLn("We now have a map that seems to be the same:");
        ORANGE.printGenericLn(initPlants2);
        MAGENTA.printGenericLn("If we try to add a rose to it:");
        initPlants2.put("rose", plantsInDutch.size());
        ORANGE.printGenericLn("We realize that we can!!");
        ORANGE.printGenericLn(initPlants2);
        MAGENTA.printGenericLn("Can we add a \"Woestijnviolier\" to it while we iterate through it?");
        MAGENTA.printGenericLn("We can try that!");

        final Iterator<Map.Entry<String, Integer>> iterator = initPlants2.entrySet()
                .iterator();

        while (iterator.hasNext()) {
            initPlants2.put("Woestijnviolier", plantsInDutch.size());
            printRainbowTitleLn(iterator.next());
        }

        MAGENTA.printGenericLn("And this is our final result!");
        ORANGE.printGenericLn(initPlants2);

        GREEN.printGenericLn("Please note that a ConcurrentHashMap is a heavier operation than another kind of Map, because operations are synchronized and thread safe");
        GREEN.printGenericLn("An unmutable collection such as an UnmutableHashMap, cannot be changed after its creation");
    }
}
