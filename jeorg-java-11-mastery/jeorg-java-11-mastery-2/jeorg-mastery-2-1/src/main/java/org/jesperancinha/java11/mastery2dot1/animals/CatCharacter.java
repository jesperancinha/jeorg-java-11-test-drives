package org.jesperancinha.java11.mastery2dot1.animals;

public class CatCharacter extends Feline {

    public CatCharacter(String name) {
        super("Clarinet");
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String found() {
        return null;
    }

    @Override
    public String getInstrument() {
        return null;
    }
}
