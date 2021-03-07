package org.jesperancinha.java11.mastery4dot3.transport;

import java.util.List;

public class Limousine extends FourWheels {
    private final List<String> fans;

    public Limousine(List<String> fans) {
        this.fans = fans;
    }

    @Override
    public String toString() {
        return "Limousine{" + "fans=" + fans + '}';
    }
}
