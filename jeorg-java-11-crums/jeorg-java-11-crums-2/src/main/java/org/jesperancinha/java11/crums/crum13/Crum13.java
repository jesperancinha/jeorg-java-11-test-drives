package org.jesperancinha.java11.crums.crum13;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowStack;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum13 {

    public static String expectation = "You did not expected this did you?";

    public static Crum13 getInstance() {
        return null;
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 13 - Getting static values from a null reference");

        MAGENTA.printGenericLn("Pretty bewildering this example if you don't know it, but it is possible! 😱");

        final Crum13 instance = getInstance();
        BRIGHT_CYAN.printGenericLn("Our crum instance is %s", instance);
        printRainbowStack(instance.expectation);
        BRIGHT_MAGENTA.printGenericLn("We can even get another null -> %s", instance.getInstance());
        GREEN.printGenericLn("References can be used to access static members, regardless that the instance itself is null or not");
        GREEN.printGenericLn("A reference is not attached to any static member");

    }
}
