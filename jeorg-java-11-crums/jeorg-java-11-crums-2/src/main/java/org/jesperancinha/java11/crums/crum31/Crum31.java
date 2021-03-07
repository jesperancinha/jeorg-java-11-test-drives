package org.jesperancinha.java11.crums.crum31;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum31 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 31 - The things a Comparator do");

        final List<Sandwich> sandwiches = Arrays.asList(new Sandwich(3, "Bolas de Berlin"),
                new Sandwich(4, "Bolo de arroz"), new Sandwich(1, "Bolo de arroz"), new Sandwich(2, "Dom Rodrigo"));
        MAGENTA.printGenericLn("We have a list of sandwiches");
        MAGENTA.printGenericLn(sandwiches);
        MAGENTA.printGenericLn("We can organize them by id");

        final List<Sandwich> collect = sandwiches.stream()
                .sorted((a, b) -> a.getId()
                        .compareTo(b.getId()))
                .peek(text2 -> ORANGE.printGenericLn(text2))
                .collect(Collectors.toList());

        MAGENTA.printGenericLn(collect);

        MAGENTA.printGenericLn("We can also organize them by name");

        final List<Sandwich> collect1 = sandwiches.stream()
                .sorted(Comparator.comparing(s -> s.getName()))
                .peek(text1 -> ORANGE.printGenericLn(text1))
                .collect(Collectors.toList());

        MAGENTA.printGenericLn(collect1);

        final Comparator<Sandwich> comparing = Comparator.comparing(s -> s.getName());
        final Comparator<Sandwich> comparator = comparing.thenComparing((a, b) -> a.getId()
                .compareTo(b.getId()));
        final List<Sandwich> collect2 = sandwiches.stream()
                .sorted(comparator)
                .peek(text -> ORANGE.printGenericLn(text))
                .collect(Collectors.toList());

        MAGENTA.printGenericLn("We can also organize first by Id and then name");
        MAGENTA.printGenericLn(collect2);

        final Stream<Sandwich> sorted = sandwiches.stream()
                .sorted();
        MAGENTA.printGenericLn("Finally we can sort them with a terminating function");
        MAGENTA.printGenericLn(sorted);
        GREEN.printGenericLn("We can make our own comparators");
        GREEN.printGenericLn("If we know we are only using an item to compare or even if we have more we can use Comparator and thenComparing if further must follow suit");
        GREEN.printGenericLn("Note that Comparator only knows the type from the left hand side of assignment");
        GREEN.printGenericLn("This means that in the lambda flow declaration, it is not possible to define a Comparator, thenComparing. The lambda will identify an Object only");
    }
}
