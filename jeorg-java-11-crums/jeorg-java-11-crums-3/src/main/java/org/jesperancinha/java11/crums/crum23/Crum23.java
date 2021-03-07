package org.jesperancinha.java11.crums.crum23;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum23 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 23 - Parsers return type");

        MAGENTA.printGenericLn("Parsers always return a primitive in their commond method:");

        final byte parB = Byte.parseByte("123");
        final short parS = Short.parseShort("3334");
        final int parI = Integer.parseInt("112223444");
        final long parL = Long.parseLong("23423432422342342");
        final float parF = Float.parseFloat("123");
        final double parD = Double.parseDouble("333444.34343");

        YELLOW.printGenericLn("These are the results:");

        ORANGE.printGenericLn(parB);
        ORANGE.printGenericLn(parS);
        ORANGE.printGenericLn(parI);
        ORANGE.printGenericLn(parL);
        ORANGE.printGenericLn(parF);
        ORANGE.printGenericLn(parD);

        GREEN.printGenericLn("This is just to show that all different static method parsers of the different java.lang.Number types, all return a primitive");

    }
}
