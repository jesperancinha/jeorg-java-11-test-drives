package org.jesperancinha.java11.crums.crum27;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum27 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 27 - Boxing and Autoboxing");

        final Boolean aBoolean = true;
        final Byte aByte = 127;
        final Short aShort = 32767;
        final Character character = 'a';
        final Integer aInteger = 1122334455;
        final Long aLong = 2233445566778899L;
        final Float aFloat = 1881.1881f;
        final Double aDouble = 1881.1881;

        MAGENTA.printGenericLn("These are the basic boxing operations:");
        BLUE.printGenericLn("        final Boolean aBoolean = true;\n" + "        final Byte aByte = 127;\n"
                + "        final Short aShort = 32767;\n" + "        final Integer aInteger = 1122334455;\n"
                + "        final Long aLong = 2233445566778899L;\n" + "        final Float aFloat = 1881.1881f;\n"
                + "        final Double aDouble = 1881.1881;");
        MAGENTA.printGenericLn("Some boxing operations aren't that simple:");

        final String iAmANumberInAString = 12345 + " - This is a number. Did you notice the boxing operation?";

        BLUE.printGenericLn("        final String iAmANumberInAString = 12345 + \" - This is a number. Did you notice the boxing operation?\";");

        ORANGE.printGenericLn("All numbers so far:");
        ORANGE.printGenericLn(aBoolean);
        ORANGE.printGenericLn(aByte);
        ORANGE.printGenericLn(aShort);
        ORANGE.printGenericLn(character);
        ORANGE.printGenericLn(aInteger);
        ORANGE.printGenericLn(aLong);
        ORANGE.printGenericLn(aFloat);
        ORANGE.printGenericLn(aDouble);
        ORANGE.printGenericLn(iAmANumberInAString);

        MAGENTA.printGenericLn("The reason why adding with \"+\" a number to String results in boxing operations is because that the number implicitly boxed so that the toString is called");
        MAGENTA.printGenericLn("It's difficult to determine this and to assess what is going on but we'll try");

        final int b = 1;
        final int c = 2;
        final String a = b + " this is a sentence and autoboxing has happened" + c;
        MAGENTA.printGenericLn("This sentence was built with auto-boxing -> %s", a);

        final Integer bC = 1;
        final Integer cC = 1;
        final String aC = b + "this is a sentence and autoboxing has not happened. It was already pre-done" + c;
        MAGENTA.printGenericLn("This sentence was built with pre-auto-boxing -> %s", a);

        GREEN.printGenericLn("Auto-boxing is basically the way Java uses auto-version from primitive types to their object counter parts");
        GREEN.printGenericLn("Auto-boxing needs to match the type being boxed in");
        GREEN.printGenericLn("In a String building, this happens implicitly and all numbers are converted to their object counterparts, where the toString is later being called.");

    }
}
