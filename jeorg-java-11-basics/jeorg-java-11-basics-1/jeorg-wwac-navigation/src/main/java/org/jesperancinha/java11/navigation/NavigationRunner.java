package org.jesperancinha.java11.navigation;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

public class NavigationRunner {
    public static void main(String[] args) {
        final String[] locations = new String[]{
                "UK",
                "France",
                "Monaco",
                "Italy",
                "Slovenia",
                "Croatia",
                "Bosnia and Herzegovina",
                "Montenegro",
                "Albania",
                "North Macedonia",
                "Greece",
                "Turkey",
                "Georgia",
                "India",
                "Myanmar",
                "Thailand",
                "Malaysia",
                "Singapore",
                "Australia",
                "New Zealand",
                "USA",
                "Mexico",
                "Morocco",
                "Spain",
                "Gibraltar",
                "UK"
        };

        System.out.println("****** Unsorted List");
        final List<String> elementsInAList = Arrays.stream(locations).collect(Collectors.toList());
        System.out.printf("****** %d elements \n", elementsInAList.size());
        System.out.println(elementsInAList);

        System.out.println("****** Unsorted Set, but unique");
        final Set<String> elementsInSet = Arrays.stream(locations).collect(Collectors.toSet());
        System.out.printf("****** %d elements \n", elementsInSet.size());
        System.out.println(elementsInSet);

        System.out.println("****** Sorted Set in a natural order. Note that a TreeSet is also a NavigableSet");
        NavigableSet<String> elementsInNavigableSet = Arrays.stream(locations).collect(Collectors.toCollection(ConcurrentSkipListSet::new));
        System.out.printf("****** %d elements \n", elementsInNavigableSet.size());
        System.out.println(elementsInNavigableSet);

        System.out.println("****** Sorted Set in a natural order. Note that a ConcurrentSkipListSet is also a NavigableSet");
        NavigableSet<String> elementsInTreeSeet = Arrays.stream(locations).collect(Collectors.toCollection(TreeSet::new));
        System.out.printf("****** %d elements \n", elementsInTreeSeet.size());
        System.out.println(elementsInTreeSeet);

    }
}
