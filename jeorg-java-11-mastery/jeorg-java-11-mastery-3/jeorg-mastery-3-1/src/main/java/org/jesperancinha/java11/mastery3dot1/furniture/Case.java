package org.jesperancinha.java11.mastery3dot1.furniture;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Case implements Container {

    int capacity = 50;

    public Case(int capacity) {
        this.showCapacity();
        this.capacity = capacity;
        this.showCapacity();
        this.printStuff();
    }

    public void showCapacity() {
        ORANGE.printGenericLn("This Case has a capacity of %d elements", capacity);
    }

    public void printStuff() {
        ORANGE.printGenericLn("I have nothing to say.");
    }

    @Override
    public String toString() {
        return "Case{" +
                "capacity=" + capacity +
                '}';
    }

    public static void describeMe() {
        YELLOW.printGenericLn("I'm a case class -> %s", Case.class.getName());
    }
}
