package org.jesperancinha.java11.mastery2dot1.animals;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public abstract class Human extends Mamal {

    private String instrument;
    public String name;

    public Human(String instrument) throws NoBlahException {
        this.instrument = instrument;
        if (instrument.equals("blah")) {
            throw new NoBlahBlahBlahException();
        }
    }

    @Override
    public void saySomething() {
        GREEN.printGeneric("Ih ih ih\n");
    }

    @Override
    public String found() {
        return "House";
    }

    @Override
    public String getInstrument() {
        return instrument;
    }

    @Override
    public String toString() {
        return "Human{" +
                "instrument='" + instrument + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
