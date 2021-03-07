package org.jesperancinha.java11.crums.crum5;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum5 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 5 - default had no mandatory place in a switch");

        final int i = 10;
        switch (i) {
            default:
                YELLOW.printGenericLn("Default");
            case 1:
                YELLOW.printGenericLn("1");
            case 2:
                YELLOW.printGenericLn("2");
            case 3:
                YELLOW.printGenericLn("3");
            case 4:
                YELLOW.printGenericLn("4");
            case 5:
                YELLOW.printGenericLn("5");
            case 6:
                YELLOW.printGenericLn("6");
        }
        MAGENTA.printGenericLn("Note that although some code is unreachable, this complete code is compilable");
        MAGENTA.printGenericLn("Also not that unreachable means in this case that the individual cases are note selectable given that 10 is set before entering the switch");
    }
}
