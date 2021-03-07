package org.jesperancinha.java11.crums.crum32;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum32 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 32 - How to unbox");

        MAGENTA.printGenericLn("Unboxing operations can be done multiple ways");
        final Integer a = 123;
        final int aU = a;
        final long bU = a;
        final float cU = a;
        final double dU = a;
        final byte eU = a.byteValue();
        final short fU = a.shortValue();
        final char gU = (char) a.shortValue();

        ORANGE.printGenericLn(a);
        ORANGE.printGenericLn(aU);
        ORANGE.printGenericLn(bU);
        ORANGE.printGenericLn(cU);
        ORANGE.printGenericLn(dU);
        ORANGE.printGenericLn(eU);
        ORANGE.printGenericLn(fU);
        ORANGE.printGenericLn(gU);

        MAGENTA.printGenericLn("These are examples of unbxing operations that work as unboxing from an Integer");
        BLUE.printGenericLn("        final Integer a = 123;\n" + "        final int aU = a;\n"
                + "        final long bU = a;\n" + "        final float cU = a;\n" + "        final double dU = a;\n"
                + "        final byte eU = a.byteValue();\n" + "        final short fU = a.shortValue();\n"
                + "        final char gU = (char) a.shortValue();");

        MAGENTA.printGenericLn("These are examples of unbxing operations that work as unboxing from an Byte");
        final Byte bB = 123;
        final byte bAB = bB;
        final short bBB = bB;
        final char bCB = Character.highSurrogate(bB);
        final int bDB = bB;
        final long bEB = bB;
        final float bFB = bB;
        final double bGB = bB;
        ORANGE.printGenericLn(bB);
        ORANGE.printGenericLn(bAB);
        ORANGE.printGenericLn(bBB);
        ORANGE.printGenericLn(bCB);
        ORANGE.printGenericLn(bDB);
        ORANGE.printGenericLn(bEB);
        ORANGE.printGenericLn(bFB);
        ORANGE.printGenericLn(bGB);
        BLUE.printGenericLn("        final Byte bB = 123;\n" + "        final byte bAB = bB;\n"
                + "        final short bBB = bB;\n" + "        final char bCB = Character.highSurrogate(bB);\n"
                + "        final int bDB = bB;\n" + "        final long bEB = bB;\n" + "        final float bFB = bB;\n"
                + "        final double bGB = bB;");
        GREEN.printGenericLn("Unboxing works in the same way as primitive inter conversions");
        GREEN.printGenericLn("There are some exceptions");
        GREEN.printGenericLn("If the type to be converted to is shorter or doesn't match the range, unboxing will not happen implicitly");
    }
}
