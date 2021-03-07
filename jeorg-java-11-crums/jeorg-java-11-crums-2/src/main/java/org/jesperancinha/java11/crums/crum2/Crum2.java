package org.jesperancinha.java11.crums.crum2;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum2 {

    private static final int dob = 1979;

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 2 - Accessing static variables");

        MAGENTA.printGenericLn("The year was %d", dob);
        MAGENTA.printGenericLn("The year was also %d", Crum2.dob);
        MAGENTA.printGenericLn("The year was in a very strange way also  %d", new Crum2().dob);
        MAGENTA.printGenericLn("The year was in another very strange way also  %d", new Crum2().getDob());

        GREEN.printGenericLn("Static access looks simple, but it has a lot of nuances");
        GREEN.printGenericLn("`this` can still be  used to a access static variables from a local instance context");

    }

    /**
     * The this context also allows access to static variables
     * Although this is not very used and not advisable, it is still possible to do.
     *
     * @return
     */
    public int getDob() {
        return dob;
    }
}
