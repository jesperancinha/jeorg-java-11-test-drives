package org.jesperancinha.java11.crums.crum29;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum29 {
    public static void main(String[] args) {

        BLUE.printGenericTitleLn("Crum 29 - isBlank or strip?");

        char c = Character.LINE_SEPARATOR;

        var stringA = c + "Feels like I'm walking on broken glass" + c;

        var stringB = "" + c;

        MAGENTA.printGenericLn("Although strip() flows the UTF standard, it is a slective way of striping strings");

        ORANGE.printGenericLn("With strip, stringA is not empty -> %s", stringA.strip() == "");
        ORANGE.printGenericLn("With strip, stringB is also not empty -> %s", stringB.strip() == "");
        ORANGE.printGenericLn("With isBlank, stringA is not blank -> %s", stringA.isBlank());
        ORANGE.printGenericLn("With isBlank, stringB is actually blank -> %s", stringB.isBlank());

        GREEN.printGenericLn("The idea is that if we want to check for blank Strings, we should use isBlank");

    }
}
