package org.jesperancinha.java11.mastery1dot2.runner;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public class Turtle {
    protected void feelHand() throws InterruptedException {
        GREEN.printGeneric("Feels alive!\n");
    }

    public void sneakyFeelHand() throws InterruptedException {
        feelHand();
    }
}
