package org.jesperancinha.java11.crums.crum12;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum12 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 12 - How many strings we create");

        final String a = "Whatup?";
        final String b = new String(a);
        final String c = a + b;
        final Object d = new Object();

        MAGENTA.printGenericLn("We just created three strings:");
        MAGENTA.printGenericLn(a);
        MAGENTA.printGenericLn(b);
        MAGENTA.printGenericLn(c);

        ORANGE.printGenericLn(a == b);
        ORANGE.printGenericLn(b == c);
        ORANGE.printGenericLn(a == c);
        ORANGE.printGenericLn(a == "Whatup?");
        ORANGE.printGenericLn(b == "Whatup?");
        ORANGE.printGenericLn(b.equals(a));
        ORANGE.printGenericLn(a.hashCode());
        ORANGE.printGenericLn(b.hashCode());
        ORANGE.printGenericLn(c.hashCode());
        ORANGE.printGenericLn("Oh, and we created object d -> %s", d);

    }
}
