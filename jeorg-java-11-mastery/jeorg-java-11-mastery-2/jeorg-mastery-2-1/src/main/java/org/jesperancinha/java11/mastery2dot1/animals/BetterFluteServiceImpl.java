package org.jesperancinha.java11.mastery2dot1.animals;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class BetterFluteServiceImpl {
    public static FluteService provider() {
        return () -> RED.printGenericLn("Playing the better flute...");
    }
}
