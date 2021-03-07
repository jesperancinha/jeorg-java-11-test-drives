package org.jesperancinha.java11.mastery3dot2.marisco;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Lingueirao {

    static {
        YELLOW.printGenericLn("Lingueirão comes out to clean up his house! 🪒");
        if (true) {
            throw new RuntimeException("Oh no! A bird just caught him! We won't fish this one! 🦅");
        }
    }

    public static Lingueirao fishLingueirao() {
        YELLOW.printGenericLn("Trying to catch Lingueirão 🕸");
        return new Lingueirao();
    }
}
