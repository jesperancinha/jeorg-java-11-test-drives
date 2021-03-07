package org.jesperancinha.java11.mastery4dot1.modularity.pilot;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public class Pilot {

    public static void presentPilot() {
        BLUE.printGeneric("***");
        GREEN.printGenericLn("--- Pilot %s ---", new Pilot("Tom Lecky-Thompson"));
        BLUE.printGeneric("***");
    }

    private String name;

    private Pilot(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                '}';
    }
}
