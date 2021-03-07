package org.jesperancinha.java11.crums.crum34;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum34 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 34 - Assignment return values");

        MAGENTA.printGenericLn("An assignment returns a value");
        int a;
        Object[] args2 = new Object[]{a = 5 + 10};
        MAGENTA.printGenericLn("a = 5 + 10 will return %d", args2);
        float b;
        Object[] args1 = new Object[]{b = 1234.5f * 1234.3f};
        MAGENTA.printGenericLn("b = 1234.5 * 1234.3 will return %f", args1);

        MAGENTA.printGenericLn("We can confirm that at the same time the assignment has completed:");
        MAGENTA.printGenericLn("This is the value for a:");
        MAGENTA.printGenericLn(a);
        MAGENTA.printGenericLn("This is the value for b:");
        MAGENTA.printGenericLn(b);

        GREEN.printGenericLn("The point with this crum is just to show that an assignment returns the value the variable is being assigned to");

    }
}
