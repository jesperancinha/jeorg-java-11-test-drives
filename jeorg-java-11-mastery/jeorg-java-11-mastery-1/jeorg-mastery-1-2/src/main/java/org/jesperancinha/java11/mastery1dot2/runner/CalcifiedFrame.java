package org.jesperancinha.java11.mastery1dot2.runner;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public interface CalcifiedFrame {
    default void protectTheShell() {
        GREEN.printGeneric("CalcifiedFrame");
    }
}
