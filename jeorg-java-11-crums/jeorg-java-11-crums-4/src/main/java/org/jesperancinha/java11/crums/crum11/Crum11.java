package org.jesperancinha.java11.crums.crum11;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum11 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 11 - Advanced String literal comparison");

        final String a = "Java";

        final String b = "Java";

        final String c = "J" + 'a' + 'v' + 'a';

        final String va = "va";
        String va1 = "va";

        final String d = "Ja" + va;

        final String e = "Ja" + va1;

        String f = "java";

        String g = "java";

        MAGENTA.printGenericLn("Since they are literals %s is equal to %s, %s == %s = %s", a, b, a, b, a == b);
        MAGENTA.printGenericLn("Since they are literals %s is equal to %s, %s == %s = %s", a, c, a, c, a == c);
        MAGENTA.printGenericLn("Since they are literals %s is equal to %s, %s == %s = %s", a, d, a, d, a == d);
        MAGENTA.printGenericLn("Since they are literals %s is equal to %s, %s == %s = %s", f, g, f, g, f == g);
        MAGENTA.printGenericLn("These are not literals and so %s is not equal to %s, %s == %s = %s", a, e, a, e, a == e);

        GREEN.printGenericLn("There is a difference and a very functional one between using final and not using final");
        GREEN.printGenericLn("When using final, the literals work to create Strings in the String pool");
        GREEN.printGenericLn("When not using final, the result becomes a reference and the bitwise == operator does not work.");
    }
}
