package org.jesperancinha.java11.crums.crum37;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum37 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 37 - Exceptions are final");

        MAGENTA.printGenericLn("A very simple concept is that thrown exceptions from a multi-catch are final");
        MAGENTA.printGenericLn("We'll test this now:");

        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            // e = new Exception();
            RED.printGenericLn("This is expected -> %s", e);

        }
        GREEN.printGenericLn("We cannot reassign exceptions coming from a multi catch");
        GREEN.printGenericLn("We do not need to memorize this");
        GREEN.printGenericLn("The compiler just doesn't know which exception type is going to be thrown");
        GREEN.printGenericLn("Since exceptions in a multi-catch have no relation with each other, the compiler makes them final");

    }
}
