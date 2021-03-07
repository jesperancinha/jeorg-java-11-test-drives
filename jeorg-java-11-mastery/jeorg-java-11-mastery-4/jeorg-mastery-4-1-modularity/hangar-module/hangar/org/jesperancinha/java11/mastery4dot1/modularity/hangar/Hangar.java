package org.jesperancinha.java11.mastery4dot1.modularity.hangar;

import org.jesperancinha.java11.mastery4dot1.modularity.pilot.Pilot;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public class Hangar {

    private String name;

    public static void presentHangar() {
        BLUE.printGeneric("***");
        GREEN.printGenericLn("--- Starting point was %s ---", new Hangar("Royal Air Force Space at St Pancras, London, UK"));
        BLUE.printGeneric("***");
        Pilot.presentPilot();
        Plane.transportPilot();

    }

    private Hangar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "name='" + name + '\'' +
                '}';
    }
}
