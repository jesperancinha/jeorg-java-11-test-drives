package org.jesperancinha.java11.crums.crum25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum25 {
    public static void main(String[] args) throws InterruptedException {
        final List<String> options = Arrays.stream(args)
                .collect(Collectors.toList());
        final boolean skipTime = options.contains("-skipTime");

        BLUE.printGenericTitleLn("Crum 25 - When does GC washes away an object");

        String a = IntStream.range(0, Integer.MAX_VALUE / 1000)
                .boxed()
                .map(Object::toString)
                .collect(Collectors.joining());
        long before = getMemoryAllocation(skipTime);
        a = null;
        long after = getMemoryAllocation(skipTime);
        long objectSize = before - after;
        MAGENTA.printGenericLn("This is the estimated byte object size -> %d bytes", objectSize);
        a = IntStream.range(0, Integer.MAX_VALUE / 1000)
                .boxed()
                .map(Object::toString)
                .collect(Collectors.joining());
        before = getMemoryAllocation(skipTime);
        MAGENTA.printGenericLn("This is the estimated byte object size doing the same test -> %d bytes", objectSize);
        after = getMemoryAllocation(skipTime);
        MAGENTA.printGenericLn("This difference if we don't point to null -> %d bytes", before - after);
        a = null;
        after = getMemoryAllocation(skipTime);
        objectSize = before - after;
        MAGENTA.printGenericLn("This is the estimated byte object size for the second time -> %d bytes", objectSize);

        GREEN.printGenericLn("What we need to bear in mind is that, although we are using the same reference, if we set it to null, the object instance loses its references");
        GREEN.printGenericLn("Independently of the Garbage collection mechanism used, the basic principle is the same");
        GREEN.printGenericLn("If no references are attached to the instance created, that instance is eligible to be removed by Garbage Collections");

    }

    private static long getMemoryAllocation(boolean skipTime) throws InterruptedException {
        System.gc();
        System.runFinalization();
        if (!skipTime) {
            Thread.sleep(1000);
        }
        return Runtime.getRuntime()
                .totalMemory() - Runtime.getRuntime()
                .freeMemory();
    }
}
