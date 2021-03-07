package org.jesperancinha.java11.crums.crum2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum2 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 2 - java.util.RandomAccess interface");
        final List<String> options = Arrays.stream(args)
                .collect(Collectors.toList());
        final boolean skipTime = options.contains("-skipTime");
        MAGENTA.printGenericLn("We know that ArrayList implements the RandomAccessInterface");
        MAGENTA.printGenericLn("We know that LinkedList does not implement the RandomAccessInterface");

        MAGENTA.printGenericLn("The first is said to a have a constant time access to each of their elements.");
        MAGENTA.printGenericLn("The second is said to take longer for the last elements for each retrieval");

        LocalDateTime time1 = LocalDateTime.now();
        var arrayList = new ArrayList<Integer>();
        int MAX_ELEMENTS = 50000000;
        if (skipTime) {
            MAX_ELEMENTS = 1000;
        }
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            arrayList.add(i);

        }
        LocalDateTime time2 = LocalDateTime.now();

        var linkedList = new LinkedList<Integer>();
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            linkedList.add(i);
        }
        LocalDateTime time3 = LocalDateTime.now();

        MAGENTA.printGenericLn("It took %s nanoseconds to fill the array list", time1.until(time2, ChronoUnit.NANOS));
        MAGENTA.printGenericLn("It took %s nanoseconds to fill the linked list", time2.until(time3, ChronoUnit.NANOS));

        for (int i = 0; i < 10; i++) {
            calculate(arrayList, linkedList);
        }

        GREEN.printGenericLn("The idea is that with massive amount of elements, the ArrayList will maintain constant time access");
        GREEN.printGenericLn("This is because it implements the RandomAccess interface");
        GREEN.printGenericLn("When it comes to the LinkedList, it is not marked with that, and ths means that it implements its own algorithm");
        GREEN.printGenericLn("In practice, what we do see with our example is that the longer the lists are the longer it takes to add elements");
        GREEN.printGenericLn("For the ArrayList, that time doesn't seem to differ much per added element");
        GREEN.printGenericLn("For the LinkedList, there is a noticeable difference. For a small number of elements, a LinkedList may be a better option.");
        GREEN.printGenericLn("Try to run with and without the -skipTime flag 😊.");

    }

    private static void calculate(ArrayList<Integer> arrayList, LinkedList<Integer> linkedList) {
        LocalDateTime time3 = LocalDateTime.now();

        var lastElementArrayList = arrayList.get(arrayList.size() - 1);
        LocalDateTime time4 = LocalDateTime.now();

        var fistElementArrayList = arrayList.get(0);
        LocalDateTime time5 = LocalDateTime.now();

        var lastElementLinkedList = linkedList.get(linkedList.size() - 1);
        LocalDateTime time6 = LocalDateTime.now();
        var firstElementLinkedList = linkedList.get(0);
        LocalDateTime time7 = LocalDateTime.now();

        printRainbowLn('-', 10);
        MAGENTA.printGenericLn("It took %s nanoseconds to get the last element of the array list", time3.until(time4, ChronoUnit.NANOS));
        MAGENTA.printGenericLn("It took %s nanoseconds to get the first element of the array list", time4.until(time5, ChronoUnit.NANOS));
        MAGENTA.printGenericLn("It took %s nanoseconds to get the last element of the linked list", time5.until(time6, ChronoUnit.NANOS));
        MAGENTA.printGenericLn("It took %s nanoseconds to get the first element of the linked list", time6.until(time7, ChronoUnit.NANOS));
    }
}
