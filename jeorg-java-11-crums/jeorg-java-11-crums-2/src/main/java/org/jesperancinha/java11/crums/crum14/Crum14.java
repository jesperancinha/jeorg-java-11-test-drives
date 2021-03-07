package org.jesperancinha.java11.crums.crum14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum14 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 14 - Creating a list from an array");

        final Integer[] array = new Integer[]{1, 2, 3, 4, 5, 6, 7};

        var listOfArray1 = List.of(array);
        var listOfArray2 = Arrays.asList(array);

        MAGENTA.printGenericLn("We start out from array %s", Arrays.stream(array)
                .collect(Collectors.toList()));
        BRIGHT_MAGENTA.printGenericLn("We have these lists:");
        YELLOW.printGenericLn(listOfArray1);
        YELLOW.printGenericLn(listOfArray2);

        MAGENTA.printGenericLn("If we change the source array:");
        array[0] = 9;
        MAGENTA.printGenericLn(Arrays.stream(array)
                .collect(Collectors.toList()));

        BRIGHT_MAGENTA.printGenericLn("Checking any of our lists again we should not have the same values:");
        YELLOW.printGenericLn(listOfArray1);
        YELLOW.printGenericLn(listOfArray2);

        final int array2[] = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        var listOfArray3 = List.of(array2);
        var listOfArray4 = Arrays.asList(array2);

        BRIGHT_MAGENTA.printGenericLn("Last curiosity is if we try to creatr the same Lists from an array of primitive values:");
        YELLOW.printGenericLn(listOfArray3);
        YELLOW.printGenericLn(listOfArray4);

        MAGENTA.printGenericLn("Notice that we didn't create a list of Integers");
        MAGENTA.printGenericLn(listOfArray3.get(0));
        MAGENTA.printGenericLn("Instead, we have created a List of an array of integers");
        MAGENTA.printGenericLn("This is because Generic Lists are prepared to work with objects and ca interpret an array of objects");
        MAGENTA.printGenericLn("They do not, however interpret an array of primitive values such as int.");

        // Type argument cannot be of primitive type
        // List<int> abc = new ArrayList<>();

        GREEN.printGenericLn("The first list isn't changed. We must never forget that List.of returns an unmutable ArrayList.");
        GREEN.printGenericLn("The second list changes because ArrayList is mutable and had been created initially from the source array, which stays in memory");

    }
}
