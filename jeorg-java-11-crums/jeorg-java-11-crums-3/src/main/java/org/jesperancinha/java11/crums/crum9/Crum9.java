package org.jesperancinha.java11.crums.crum9;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum9 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 9 - Unreachable after a try catch");

        final int i = calculateTheCalculation();

        MAGENTA.printGenericLn("When running this, please uncomment line with // return 100. For now this returns %d", i);
        GREEN.printGenericLn("The reason why the code does not compile is because both the try and the catch return a value");
        GREEN.printGenericLn("If we uncomment the final block, it will always return 400");
        GREEN.printGenericLn("If we uncomment the last return it won't even compile");

    }

    private static int calculateTheCalculation() {
        try {
            return 102;
        } catch (Exception e) {
            return 101;
        } finally {
            // return 400;
        }
        // return 100;
    }
}
