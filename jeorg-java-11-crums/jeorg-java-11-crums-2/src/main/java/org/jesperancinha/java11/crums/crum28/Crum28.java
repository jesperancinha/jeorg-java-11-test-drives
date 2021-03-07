package org.jesperancinha.java11.crums.crum28;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum28 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 28 - Comparator and Comparable");

        final Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (int) (Math.pow(2, o1) - Math.pow(2, o2));
            }
        };
        final Comparable<Integer> comparable1 = new Comparable<Integer>() {
            @Override
            public int compareTo(Integer o) {
                return 100 - o;
            }
        };

        MAGENTA.printGenericLn("Comparator is quite something else than a Comparator");
        final int i = comparable1.compareTo(109);
        MAGENTA.printGenericLn(i);
        final int j = comparator1.compare(10, 11);
        MAGENTA.printGenericLn(j);
        MAGENTA.printGenericLn("We create a list of stones");

        var stones = Arrays.asList(new Stone("Icestone", 111), new Stone("Coblestone", 45), new Stone("Marblestone", 123));

        MAGENTA.printGenericLn("Unordered:");
        MAGENTA.printGenericLn(stones);
        MAGENTA.printGenericLn("Collection ordered");
        Collections.sort(stones);
        MAGENTA.printGenericLn(stones);
        MAGENTA.printGenericLn("Custom Comparator ordered");
        stones.sort(new Comparator<Stone>() {
            @Override
            public int compare(Stone o1, Stone o2) {
                if (o2.number.equals(o1.number)) {
                    return o2.name.compareTo(o1.name);
                }
                return o2.number.compareTo(o1.number);
            }
        });
        MAGENTA.printGenericLn(stones);

        GREEN.printGenericLn("Notice the subtle but very function difference between Comparator and Comparable");
        GREEN.printGenericLn("Comparable is used in an implementation of a type");
        GREEN.printGenericLn("Comparator is used can be used as a custom comparator for our already defined type");
    }
}
