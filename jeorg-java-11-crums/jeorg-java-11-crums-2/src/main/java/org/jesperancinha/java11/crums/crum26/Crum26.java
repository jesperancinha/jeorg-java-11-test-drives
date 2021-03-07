package org.jesperancinha.java11.crums.crum26;

import java.util.stream.IntStream;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum26 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 26 - Making arithmetic calculations with streams");

        final int intStream1Value = IntStream.range(0, 1000)
                .sum();

        MAGENTA.printGenericLn("When we calculate sum from an intStream we get a result int value %d", intStream1Value);

        final double doubleStreamValue = IntStream.range(0, 1000)
                .asDoubleStream()
                .average()
                .orElse(0);

        MAGENTA.printGenericLn("When we calculate the average from a double stream we get a result int value %f", doubleStreamValue);

        final int intStreamSumValueFromAReduceOperation = IntStream.range(0, 1000)
                .boxed()
                .reduce(0, Integer::sum);
        MAGENTA.printGenericLn("When we calculate sum from a stream we get a result int value %d", intStreamSumValueFromAReduceOperation);

        GREEN.printGenericLn("A few differences between DoubleStream and IntStream");
        GREEN.printGenericLn("It should be obvious that and IntStream has range and DoubleStream doesn't.");
        GREEN.printGenericLn("The reason is that we can increment integral numbers. However with floats and doubles, that is just no possible because of the extensive increment possible combinations.");
    }
}
