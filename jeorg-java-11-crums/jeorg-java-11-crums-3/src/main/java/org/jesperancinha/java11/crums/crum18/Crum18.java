package org.jesperancinha.java11.crums.crum18;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum18 {

    public static class Plate {
        private final String design;
        private final LocalDateTime localDateTime;

        public Plate(String design, LocalDateTime localDateTime) {
            this.design = design;
            this.localDateTime = localDateTime;
        }

        public LocalDateTime getLocalDateTime() {
            return localDateTime;
        }

        public String getDesign() {
            return design;
        }

        @Override
        public String toString() {
            return "Plate{" + "design='" + design + '\'' + ", localDateTime=" + localDateTime + '}';
        }
    }

    public static void main(String[] args) {

        BLUE.printGenericTitleLn("Crum 18 - Understanding Comparator and Comparable");

        final Comparator<Plate> comparator = (p1, p2) -> p1.getDesign()
                .compareTo(p2.getDesign());
        final Comparator<Plate> comparator2 = Comparator.comparing(Plate::getDesign);
        final Comparator<Plate> comparator3 = comparator2.thenComparing(Comparator.comparing(Plate::getLocalDateTime));

        final var streamOfInts = IntStream.of(12, 44, 22, 73, 94, 12, 54);
        final Comparator<Integer> compareTo = Integer::compareTo;
        streamOfInts.boxed()
                .max(compareTo);

        MAGENTA.printGenericLn("The first thing to understand is that Numberic Object and Strings are comparables:");
        Object[] args7 = new Object[]{Integer.valueOf(100) instanceof Comparable};
        ORANGE.printGenericLn("Integer -> %s ", args7);
        Object[] args6 = new Object[]{Double.valueOf(100) instanceof Comparable};
        ORANGE.printGenericLn("Double -> %s ", args6);
        Object[] args5 = new Object[]{Float.valueOf(100) instanceof Comparable};
        ORANGE.printGenericLn("Float -> %s ", args5);
        Object[] args4 = new Object[]{Byte.valueOf((byte) 100) instanceof Comparable};
        ORANGE.printGenericLn("Byte -> %s ", args4);
        Object[] args3 = new Object[]{Short.valueOf((short) 100) instanceof Comparable};
        ORANGE.printGenericLn("Short -> %s ", args3);
        Object[] args2 = new Object[]{Character.valueOf((char) 100) instanceof Comparable};
        ORANGE.printGenericLn("Character -> %s ", args2);
        Object[] args1 = new Object[]{"Whatevever" instanceof Comparable};
        ORANGE.printGenericLn("String -> %s ", args1);

        MAGENTA.printGenericLn("This means that they all implement method compareTo");

        MAGENTA.printGenericLn("In lambda experssions, when we implement Comparators and use the standard compareTo, we can do that because the elements are Comparable");

        MAGENTA.printGenericLn("In our list of plates we have:");

        var plateList = List.of(new Plate("Chinese Porcelain", LocalDateTime.now()),
                new Plate("Delft Porcelain", LocalDateTime.now()), new Plate("Braga Porcelain", LocalDateTime.now()));

        ORANGE.printGenericLn(plateList);

        MAGENTA.printGenericLn("If we sort by the first comparator we've made, we find:");
        ORANGE.printGenericLn(plateList.stream()
                .sorted(comparator)
                .collect(Collectors.toList()));

        MAGENTA.printGenericLn("If we sort by the second comparator we've made, we find:");
        ORANGE.printGenericLn(plateList.stream()
                .sorted(comparator2)
                .collect(Collectors.toList()));

        MAGENTA.printGenericLn("If we sort by the third comparator we've made, we find:");
        ORANGE.printGenericLn(plateList.stream()
                .sorted(comparator3)
                .collect(Collectors.toList()));

        GREEN.printGenericLn("A Comparator is not a Comparable");
        GREEN.printGenericLn("We compare with comparables");
        GREEN.printGenericLn("Comparable is an interface");
        GREEN.printGenericLn("Comparator is a functional interface, which receives two arguments of the same type and return an int");
        GREEN.printGenericLn("The int represents a form of distance between the two comparable objects");
        GREEN.printGenericLn("The original compareTo method is an implementation of the Comparator functional interface");

    }
}
