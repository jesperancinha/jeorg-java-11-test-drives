package org.jesperancinha.java11.mastery2dot1.animals;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class FluteServiceImpl {
    public static FluteService provider() {
        return new FluteService() {
            @Override
            public void play() {
                RED.printGenericLn("Playing the flute...");
            }
        };
    }
}
