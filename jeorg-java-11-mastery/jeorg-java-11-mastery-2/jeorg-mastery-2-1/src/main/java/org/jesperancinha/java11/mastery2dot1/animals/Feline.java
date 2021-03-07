package org.jesperancinha.java11.mastery2dot1.animals;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public abstract class Feline extends Mamal {

    private String instrument;
    public String name;

    public Feline(String instrument) {
        this.instrument = instrument;
    }

    @Override
    public void saySomething() {
        GREEN.printGeneric("Miau!!!!\n");
    }

    @Override
    public String found() {
        return "forest";
    }

    @Override
    public String getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Feline{" +
                "instrument='" + instrument + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
