package org.jesperancinha.java11.crums.crum10;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum10 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 10 - Modulus operator investigation");

        YELLOW.printGenericLn(33.33 % 2);
        YELLOW.printGenericLn(33.33 % 3);
        YELLOW.printGenericLn(33.33 % 3.3);

        double a = 1.2;
        float b = 1.2f;

        YELLOW.printGenericLn(a % 1.2);
        YELLOW.printGenericLn(b % 1.2);

        long y = 6;
        long p = 9;

        final long l = p % y;
        final int m = (int) (p % y);
        final float o = p % y;
        final double q = p % y;

        YELLOW.printGenericLn(l);
        YELLOW.printGenericLn(m);
        YELLOW.printGenericLn(o);
        YELLOW.printGenericLn(q);
    }
}
