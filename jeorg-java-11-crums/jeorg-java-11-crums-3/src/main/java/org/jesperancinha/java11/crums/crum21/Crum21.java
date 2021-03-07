package org.jesperancinha.java11.crums.crum21;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum21 {

    private final class Saxophone {
        // Inner classes cannot have static declarations
        // static String  SMOOTH_OPERATOR = "No need to ask he's a smooth operator";

        // Yes they can!, If they are final of course
        final static String SMOOTH_OPERATOR = "No need to ask he's a smooth operator";

    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 21 - Inner classes and static methods");

        YELLOW.printGenericLn("from https://genius.com/Sade-smooth-operator-lyrics");
        MAGENTA.printGenericLn("We can access SMOOTH_OPERATOR:");

        ORANGE.printGenericLn(Saxophone.SMOOTH_OPERATOR);

        GREEN.printGenericLn("The nuance here is that non-static inner classes normally cannot have anything static");
        GREEN.printGenericLn("However if static members are marked at final, then it is possible to do so.");
        GREEN.printGenericLn("This has mostly to do wth the fact that an inner class is dependent of its container instance and so changes to the static member would introduce a very confusing code");

    }
}
