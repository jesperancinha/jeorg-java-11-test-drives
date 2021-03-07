package org.jesperancinha.java11.crums.crum4;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printNewLine;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum4 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 4 - Variable initialization on for loops");

        // Variable 'i' might not have been initialized
        // int i;
        int i = 0;
        for (; i < 10; i++) {
            MAGENTA.printGeneric(i);
        }
        printNewLine();
        MAGENTA.printGenericLn("The point is that all variables in a for loop need to be initialized");
        MAGENTA.printGenericLn("This is pretty much the case of every local variable before using them for the first time");
    }
}
