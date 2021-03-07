package org.jesperancinha.java11.mastery3dot1.furniture;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public interface Container {

    static void describeMe() {
        YELLOW.printGenericLn("I'm a container interface -> %s", Container.class.getName());
    }
}
