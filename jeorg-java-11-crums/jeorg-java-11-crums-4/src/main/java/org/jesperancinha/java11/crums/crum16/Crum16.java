package org.jesperancinha.java11.crums.crum16;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum16 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 16 - Zipping in Java 11");

        MAGENTA.printGenericLn("We can zip in Java 11 in multiple ways");
        MAGENTA.printGenericLn("One way is to just use the indexes of a list");

        MAGENTA.printGenericLn("We are given a list of cups and a list of their prices. Their orders match");

        var cups = List.of("Black Cup", "Chinese Cup", "Delft Cup", "Euro cup", "Black Cup");
        var prices = List.of(12.3, 400.2, 123000.4, 40000000.12, 123.5);

        ORANGE.printGenericLn("Our cups: %s", cups);
        ORANGE.printGenericLn("Our prices: %s", prices);

        try {
            final Map<String, Double> collect = IntStream.range(0, cups.size())
                    .boxed()
                    .collect(Collectors.toMap(cups::get, prices::get));
        } catch (IllegalStateException e) {
            RED.printGenericLn("This is expected! We did not implement a disambiguation! Black Cup exists more than once in the list -> %s", e);
        }

        MAGENTA.printGenericLn("So let's disambiguate now:");
        final Map<String, Double> summingAndCollecting = IntStream.range(0, cups.size())
                .boxed()
                .collect(Collectors.toMap(cups::get, prices::get, Double::sum));

        MAGENTA.printGenericLn("We now have the price sum of all cups per type");

        ORANGE.printGenericLn(summingAndCollecting);

        GREEN.printGenericLn("We should always implement a disambiguation method");
        GREEN.printGenericLn("Disambiguation is not strictly necessary if we know that no element is repeated");
        GREEN.printGenericLn("We can specify the hashmap type if we want to.");
        GREEN.printGenericLn("The hash map types must not be immutable because the collector uses a Supplier as a starting point.");
    }
}
