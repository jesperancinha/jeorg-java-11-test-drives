package org.jesperancinha.java11.lunar.module;

import org.jesperancinha.console.consolerizer.console.Consolerizer;

public class LunarModule implements LunarInterface {
    public void detachModule() {
        Consolerizer.printRainbowTitleLn("Apollo 13 - Lunar Module detached...");
    }
}
