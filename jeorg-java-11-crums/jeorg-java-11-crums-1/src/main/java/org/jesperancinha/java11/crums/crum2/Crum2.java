package org.jesperancinha.java11.crums.crum2;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum2 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 2 - Max of Max");
        MAGENTA.printGenericLn("Let's get the Maxiums of the different integral and non-integral types");
        BRIGHT_MAGENTA.printGenericLn("Maximum of byte is -> %s", Byte.MAX_VALUE);
        BRIGHT_MAGENTA.printGenericLn("Maximum of short is -> %s", Short.MAX_VALUE);
        BRIGHT_MAGENTA.printGenericLn("Maximum of char is (note that char cannot be printed as a number with %%s) -> %s", (int) Character.MAX_VALUE);
        BRIGHT_MAGENTA.printGenericLn("Maximum of int is -> %s", Integer.MAX_VALUE);
        BRIGHT_MAGENTA.printGenericLn("Maximum of long is -> %s", Long.MAX_VALUE);
        BRIGHT_MAGENTA.printGenericLn("Maximum of float is -> %s", Float.MAX_VALUE);
        BRIGHT_MAGENTA.printGenericLn("Maximum of double is -> %s", Double.MAX_VALUE);

        GREEN.printGenericLn("Maximum of one byte values can only be -> %s", Byte.MAX_VALUE);
        GREEN.printGenericLn("Maximum of two byte values can only be -> %s", Math.max(Short.MAX_VALUE, Character.MAX_VALUE));
        GREEN.printGenericLn("Maximum of four byte values can only be -> %s", Math.max(Integer.MAX_VALUE, Float.MAX_VALUE));
        GREEN.printGenericLn("Maximum of eight byte values can only be -> %s", Math.max(Long.MAX_VALUE, Double.MAX_VALUE));

    }
}
