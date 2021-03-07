package org.jesperancinha.java11.crums.crum3;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum3 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 3 - The dangling if problem");
        if (1 != 1)
            if (2 == 2)
                YELLOW.printGenericLn("This won't go to the output");
        MAGENTA.printGenericLn("You don't see the last print, because the first statement doesn't match");
        MAGENTA.printGenericLn("Also, do you notice that there is no compilation error?");
        MAGENTA.printGenericLn("Always check the identation. It is often misleading");
        MAGENTA.printGenericLn("This if illustrates the dangling If problem of Java coming from C/C++");
    }
}
