package org.jesperancinha.java11.mastery4dot1.modularity.hangar;

import org.jesperancinha.java11.mastery4dot1.modularity.pilot.Pilot;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public class Plane {

    private String model;

    public static void transportPilot() {
        BLUE.printGenericLn("***");
        GREEN.printGenericLn("--- Pilot is getting transported by the airplane ---");
        Pilot.presentPilot();
        GREEN.printGenericLn("--- %s ---", new Plane("Royal Navy F-4 Phantom II"));
        BLUE.printGenericLn("***");
    }

    private Plane(String model) {

        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                '}';
    }
}
