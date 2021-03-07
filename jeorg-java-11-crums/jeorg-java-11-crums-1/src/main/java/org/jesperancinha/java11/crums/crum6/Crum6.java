package org.jesperancinha.java11.crums.crum6;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum6 {
    public static void main(String[] args) {
        final String text = "Crum 6 - String length() is not length nor is it size()";
        BLUE.printGenericTitleLn(text);
        MAGENTA.printGenericLn("This string has %s characters", text.length());
        // Cannot resolve symbol 'length'
        // MAGENTA.printGenericTitleLn("This string has %s characters", text.length);
        // Cannot resolve method 'size' in 'String'
        // MAGENTA.printGenericTitleLn("This string has %s characters", text.size());
        MAGENTA.printGenericLn("Note that it is important to understand that length is an instance method of String");
        MAGENTA.printGenericLn("length is not an instance member of String");
        MAGENTA.printGenericLn("size is not an instance method of String");
        YELLOW.printGenericLn("This is what will happen during compile time:\n"
                + "        // Cannot resolve symbol 'length'\n"
                + "        // MAGENTA.printGenericTitleLn(\"This string has %s characters\", text.length);\n"
                + "        // Cannot resolve method 'size' in 'String'\n"
                + "        // MAGENTA.printGenericTitleLn(\"This string has %s characters\", text.size());");

    }
}
