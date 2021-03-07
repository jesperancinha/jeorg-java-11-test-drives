package org.jesperancinha.java11.mastery2dot1.animals;

public class DuckCharacter extends Bird {

    public DuckCharacter(String name) {
        super("Oboe");
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String found() {
        return "Forest";
    }
}
