package org.jesperancinha.java11.mastery2dot1.animals;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public abstract class Bird implements Animal {

    private String instrument;
    public String name;

    @Override
    public void saySomething() {
        GREEN.printGeneric("You still didn't implement me!");

    }

    public Bird(final String instrument) {
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "instrument='" + instrument + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
