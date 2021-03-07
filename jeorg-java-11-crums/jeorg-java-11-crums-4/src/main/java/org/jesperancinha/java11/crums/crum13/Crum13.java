package org.jesperancinha.java11.crums.crum13;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum13 {
    class Running {
        public void running() throws Exception {
            ORANGE.printGenericLn("We are now running....");
        }
    }

    public class Marathon extends Running {
        public void running() {
            ORANGE.printGenericLn("We are now in the marathon...");
        }

    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 13 - Overriding throws");

        final Crum13 crum13 = new Crum13();
        Running running = crum13.new Marathon();
        try {
            running.running();
        } catch (Exception e) {
            RED.printThrowableAndExit(e);
        }

        GREEN.printGenericLn("The rule is always that the method overriding is always more specific if we choose to override the exception");
        GREEN.printGenericLn("No exception is always acceptable in the overriding method.");
    }
}
