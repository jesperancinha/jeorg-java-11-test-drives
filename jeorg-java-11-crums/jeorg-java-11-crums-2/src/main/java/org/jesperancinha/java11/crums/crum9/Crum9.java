package org.jesperancinha.java11.crums.crum9;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum9 extends B implements A {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 9 - Shadowing in static members?");
        // Reference to 'a' is ambiguous, both 'B.a' and 'A.a' match
        // a = 40;
        MAGENTA.printGenericLn("This is possible -> %d", A.a);
        MAGENTA.printGenericLn("This is possible -> %d", B.a);

        MAGENTA.printGenericLn("This is possible -> %d", b);
        MAGENTA.printGenericLn("This is possible -> %d", C.b);

        // 'org.jesperancinha.java11.crums.crum9.C' is not an enclosing class
        // C.this.b;

        YELLOW.printGenericLn("From instance is the same thing:");

        new Crum9().fromInstance();

        GREEN.printGenericLn("Because both a's are at the same level, they do not shadow each other");
        GREEN.printGenericLn("This way the compiler doesn't know what to do if only a is given.");
        GREEN.printGenericLn("b's don't have this problem, because b in B overshadows b in C, given they B is a subclass of C");
        GREEN.printGenericLn("As a curiosity we see that the static this doesn't work due to C not being an enclosing class");
    }

    private void fromInstance() {
        MAGENTA.printGenericLn("This is possible -> %d", A.a);
        MAGENTA.printGenericLn("This is possible -> %d", B.a);

        MAGENTA.printGenericLn("This is possible -> %d", b);
        MAGENTA.printGenericLn("This is possible -> %d", C.b);

    }
}
