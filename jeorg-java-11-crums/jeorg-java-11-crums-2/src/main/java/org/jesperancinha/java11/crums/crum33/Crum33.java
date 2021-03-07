package org.jesperancinha.java11.crums.crum33;

import java.util.Arrays;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum33 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 33 - Enumerates and how they work");

        MAGENTA.printGenericLn("We can list all enumerates if we just call values");
        MAGENTA.printGenericLn("The printed value is exactly the same key we define in the code");
        Arrays.stream(CashContainer.values())
                .forEach(text -> ORANGE.printGenericLn(text));

        MAGENTA.printGenericLn("We can also retrieve the value per key String:");
        ORANGE.printGenericLn("%s has index %s", "KITTENACCOUNT", CashContainer.valueOf("KITTENACCOUNT"));
        MAGENTA.printGenericLn("It is case sensitive!");
        try {
            ORANGE.printGenericLn("%s has index %s", "KITTENAccount", CashContainer.valueOf("KITTENAccount"));
        } catch (IllegalArgumentException e) {
            RED.printGenericLn("This is expected! Note that an invalid value results in a RuntimeException of type IllegalArgumentException -> %s", e);
        }
        MAGENTA.printGenericLn("And if we try to clone it:");
        try {
            CashContainer.LIONACCOUNT.tryToClone();
        } catch (CloneNotSupportedException e) {
            RED.printGenericLn("This is expected, we tried to make clone accessible to the outside world. That is not possible. For enum throws a direct exception");
            RED.printGenericLn("If we got to (java.lang.Enum) we find:");
            RED.printGenericLn("    /**\n" + "     * Throws CloneNotSupportedException.  This guarantees that enums\n"
                    + "     * are never cloned, which is necessary to preserve their \"singleton\"\n" + "     * status.\n"
                    + "     *\n" + "     * @return (never returns)\n" + "     */\n"
                    + "    protected final Object clone() throws CloneNotSupportedException {\n"
                    + "        throw new CloneNotSupportedException();\n" + "    }");
            RED.printGenericLn("And then we get this exception ->", e);
        }
        GREEN.printGenericLn("Enums only have two public methods available to the outside world");
        GREEN.printGenericLn("One gives you an array with all enum possible values");
        GREEN.printGenericLn("Another gives you the enum value by the String that case-sensitively matches the key given in the code");
        GREEN.printGenericLn("We can make methods inside enum. Enums are not cloneable. Trying to call that method from inside the enum results in an exception called CloneNotSupportedException");
    }
}
