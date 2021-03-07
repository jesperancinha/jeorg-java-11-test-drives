package org.jesperancinha.java11.crums.crum18;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum18 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 18 - Fun with numbers and formats");

        MAGENTA.printGenericLn("%c", 'a');
        MAGENTA.printGenericLn("%c", 'b');
        MAGENTA.printGenericLn("%c", 'c');
        MAGENTA.printGenericLn("%c", 'd');
        MAGENTA.printGenericLn("%c", 'c');
        MAGENTA.printGenericLn(0b10101010);
        MAGENTA.printGenericLn(Integer.toBinaryString(170));
        MAGENTA.printGenericLn("%n");
        MAGENTA.printGenericLn("%h", 17);

        ORANGE.printGenericLn("https://www.javatpoint.com/java-string-format");
    }
}
