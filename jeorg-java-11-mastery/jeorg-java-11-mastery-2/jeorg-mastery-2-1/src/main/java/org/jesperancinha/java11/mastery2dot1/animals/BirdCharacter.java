package org.jesperancinha.java11.mastery2dot1.animals;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public class BirdCharacter extends Bird {

    public BirdCharacter(String name) {
        super("Flute");
        this.name = name;
    }

    @Override
    public void saySomething() {
        GREEN.printGeneric("Quack Quack");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String found() {
        return "pond";
    }
}
