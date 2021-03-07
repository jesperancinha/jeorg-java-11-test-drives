package org.jesperancinha.java11.crums.crum11;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printNewLine;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;

public class Crum11 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 11 - All english letters fit a byte");

        for (byte i = 'A'; i <= 122; i++) {
            BRIGHT_MAGENTA.printGeneric(i);
            BRIGHT_MAGENTA.printGeneric((char) i);
        }

        printNewLine();

    }
}
