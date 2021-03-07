package org.jesperancinha.java11.mastery3dot2.marisco;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Caranguejo {
    {
        YELLOW.printGenericLn("Caranguejo strolls around on the beach! 🦀");
        if (true) {
            throw new RuntimeException("Oh no! It ran away  in panic!! 💨");
        }
    }

    public static Caranguejo fishCaranguejo() {
        YELLOW.printGenericLn("Trying to catch Caranguejo 🕸");
        return new Caranguejo();
    }
}
