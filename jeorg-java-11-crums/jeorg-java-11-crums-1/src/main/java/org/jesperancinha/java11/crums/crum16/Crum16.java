package org.jesperancinha.java11.crums.crum16;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum16 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 16 - How to import statically");

        YELLOW.printGenericLn("Maximum value for an integer is %s", MAX_VALUE);
        YELLOW.printGenericLn("Minimum value for a Long is %s", MIN_VALUE);

        BLUE.printGenericLn("This is how import static is done. Notice the order:");
        BLUE.printGenericLn("import static java.lang.Integer.MAX_VALUE;\n" + "import static java.lang.Long.MIN_VALUE;\n"
                + "import static org.jesperancinha.console.consolerizer.console.Consolerizer.printBlueGenericLn;\n"
                + "import static org.jesperancinha.console.consolerizer.console.Consolerizer.printBlueGenericTitleLn;\n"
                + "import static org.jesperancinha.console.consolerizer.console.Consolerizer.printYellowGenericLn;");
    }
}
