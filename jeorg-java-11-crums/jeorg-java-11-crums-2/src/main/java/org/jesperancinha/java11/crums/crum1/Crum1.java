package org.jesperancinha.java11.crums.crum1;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum1 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 1 - Method parameters, since var is not allowed");
        GREEN.printGenericLn("Different ways to overload a method");

        MAGENTA.printGenericLn("If a < 10 or b < 20 or c < 30, we cannot calculate our int average -> %d", average(3, 4, 5));
        MAGENTA.printGenericLn("If a >= 10 and b >= 20 and c >=30, we can calculate our int average -> %d", average(10, 20, 30));
        MAGENTA.printGenericLn("If all three parameters are long, we can still calculate it -> %d", average(3L, 4L, 5L));

        GREEN.printGenericLn("We cannot have var parameters and so overloading or overriding is never possible with parameters var.");
    }

    public static int average(int a, int b, int c) {
        var canItA = a >= 10;
        var canItB = b >= 20;
        var canItC = c >= 30;
        if (canItA & canItB & canItC) {
            return (a + b + c) / 3;
        }
        return -1;
    }

    // Cannot resolve symbol 'var'
    // public static int average(var a, var b, var c) {
    public static int average(long a, long b, long c) {
        return (int) ((a + b + c) / 3);
    }
}

