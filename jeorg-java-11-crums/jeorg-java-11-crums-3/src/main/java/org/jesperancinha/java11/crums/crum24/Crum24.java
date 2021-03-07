package org.jesperancinha.java11.crums.crum24;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum24 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 24 - Break with label and continue with label");

        BRIGHT_MAGENTA.printGenericLn("Break with label");

        LABEL1:
        printRainbowLn("||");
        int i = 1;
        LABEL2:
        for (i = 0; i < 1000; i++) {
            if (i == 2) {
                break LABEL2;
            }
        }
        YELLOW.printGenericLn("Value of i is now %d", i);
        BRIGHT_MAGENTA.printGenericLn("Continue with label");

        int k = 0;
        LABEL3:
        for (i = 0; i < 1000; i++) {
            if (i > 4) {
                continue LABEL3;
            }
            k++;
        }
        YELLOW.printGenericLn("Value of k is now %d", k);

        GREEN.printGenericLn("The difference between continue and break is that the first ignores and the second stops");
        GREEN.printGenericLn("A break can be considered as an old return or a GOTO to the next instruction");
        GREEN.printGenericLn("A continue can be considered as an old if then GOTO or a GOTO to a former instruction");
        GREEN.printGenericLn("The main point is that LABELS work for continue and break in the same way with different results");

    }
}
