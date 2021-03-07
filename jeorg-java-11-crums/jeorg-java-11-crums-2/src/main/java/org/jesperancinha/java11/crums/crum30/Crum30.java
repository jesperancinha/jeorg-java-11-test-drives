package org.jesperancinha.java11.crums.crum30;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum30 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 30 - @Repeatable annotation");
        MAGENTA.printGenericLn(new MashedPotatoes());

        GREEN.printGenericLn("Remember that the rule is that @Repeatable must have a container class");
        GREEN.printGenericLn("The container class must have an array of the repeating type");
    }
}
