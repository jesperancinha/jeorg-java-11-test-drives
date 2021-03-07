package org.jesperancinha.java11.crums.crum17;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum17 {

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 17 - Multiple classes in one file");

        MainOne.main(null);
        MainTwo.main(null);

        MAGENTA.printGenericLn("Notice that we are able to create two classes in one file");
        MAGENTA.printGenericLn("For this to be possible, they have to be package protected");
        MAGENTA.printGenericLn("Methods can be public");
    }
}
