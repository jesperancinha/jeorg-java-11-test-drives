package org.jesperancinha.java11.crums.crum14;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum14 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 14 - Working with Collectors.toMap");

        final List<String> bandsInConcert = List.of("REM - Price = 20.3", "B-52's - Price = 34.5",
                "Paul Simon - Price = 102.4", "Sarah Brightman  - Price = 1.34", "John Cale  - Price = 24.0",
                "REM  - Price = 55.5");
        MAGENTA.printGenericLn("We were given an unorganized list of bands playing and their ticket prices");
        ORANGE.printGenericLn(bandsInConcert);
        MAGENTA.printGenericLn("We will now turn our list into a map of band and price");
        MAGENTA.printGenericLn("Then we'll solve the ambiguity by summing up the prices found");
        Map<String, Double> map1 = bandsInConcert.stream()
                .collect(Collectors.toMap(band -> band.split(" - Price = ")[0],
                        band -> Double.parseDouble(band.split(" - Price = ")[1]), (ticketPrice1, ticketPrice2) -> {
                            ORANGE.printGenericLn("ticketPrice1=$%.2f, ticketPrice1=$%.2f", ticketPrice1, ticketPrice2);
                            final double totalTicketPrice = ticketPrice1 + ticketPrice2;
                            ORANGE.printGenericLn("You have a band playing with price $%.2f", totalTicketPrice);
                            ORANGE.printGenericLn("Can you guess which  on is it?", totalTicketPrice);
                            return totalTicketPrice;
                        }));

        MAGENTA.printGenericLn("This is our organized band list ");
        BRIGHT_CYAN.printGenericLn(map1);

        YELLOW.printGenericLn("Now we just double the values to reduce the ticket to price 0. We found discounts on the web!!!");

        final LinkedHashMap<String, Double> concertsWithDiscount = Stream.of(map1.entrySet(), map1.entrySet())
                .flatMap(Collection::stream)
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (ticketPrice1, ticketPrice2) -> {
                    ORANGE.printGenericLn("ticketPrice1=$%.2f, ticketPrice2=$%.2f", ticketPrice1, ticketPrice2);
                    return ticketPrice1 - ticketPrice2;
                }, LinkedHashMap::new));
        concertsWithDiscount.forEach(
                (var artistName, var ticketSumValue) -> BLUE.printGenericLn("%s = $%.2f\n", artistName, ticketSumValue));

        MAGENTA.printGenericLn("But can still change this, because we created a LinkeHashMap now.");
        MAGENTA.printGenericLn("This means that we can change our results");
        concertsWithDiscount.put("REM", 40_000.2222);

        ORANGE.printGenericLn(concertsWithDiscount);

        map1 = bandsInConcert.stream()
                .collect(Collectors.toMap(band -> band.split(" - Price = ")[0],
                        band -> Double.parseDouble(band.split(" - Price = ")[1]), (ticketPrice1, ticketPrice2) -> {
                            ORANGE.printGenericLn("ticketPrice1=$%.2f, ticketPrice1=$%.2f", ticketPrice1, ticketPrice2);
                            final double totalTicketPrice = ticketPrice1 + ticketPrice2;
                            ORANGE.printGenericLn("You have a band playing with price $%.2f", totalTicketPrice);
                            ORANGE.printGenericLn("Can you guess which  on is it?", totalTicketPrice);
                            return totalTicketPrice;
                        }));

        MAGENTA.printGenericLn("So let's try again");
        final Map<String, Double> umutableConcerts = Collections.unmodifiableMap(
                Stream.of(map1.entrySet(), map1.entrySet())
                        .flatMap(Collection::stream)
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (ticketPrice1, ticketPrice2) -> {
                            ORANGE.printGenericLn("ticketPrice1=$%.2f, ticketPrice2=$%.2f", ticketPrice1, ticketPrice2);
                            return ticketPrice1 - ticketPrice2;
                        })));

        ORANGE.printGenericLn(umutableConcerts);
        MAGENTA.printGenericLn("Let's see if we can change them:");

        try {
            umutableConcerts.put("REM", 40_000.2222);
        } catch (UnsupportedOperationException e) {
            RED.printGenericLn("This is expected! We cannot change our map and we have free tickets! -> %s", e);
        }

        GREEN.printGenericLn("Let's remember that Collectors.toMap uses indexes or whatever value in the stream to setup the keys we need and the values");
        GREEN.printGenericLn("We can use these indexes to our advantage but we don't have to.");
        GREEN.printGenericLn("A BinaryOperator takes care of operations with the map values");
        GREEN.printGenericLn("The Extra supplier value is where the key/value pairs will be stored.");
        GREEN.printGenericLn("Pay attention to the Comparators use: Map.Entry.comparingByValue() and Map.Entry.comparingByKey()");
    }
}
