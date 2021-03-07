package org.jesperancinha.java11.mastery2dot1.animals;

public class GrandFatherCharacter extends Human {

    public GrandFatherCharacter(String name) throws NoBlahException {
        super("bassoon");
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
