package org.jesperancinha.java11.mastery2dot1.animals;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public abstract class Mamal implements Animal {
    @Override
    public void saySomething() {
        GREEN.printGeneric("You still didn't implement me!");
    }
}
