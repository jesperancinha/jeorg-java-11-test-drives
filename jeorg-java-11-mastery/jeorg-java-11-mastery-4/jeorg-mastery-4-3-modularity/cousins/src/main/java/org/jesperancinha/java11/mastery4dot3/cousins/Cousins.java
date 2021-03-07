package org.jesperancinha.java11.mastery4dot3.cousins;

public class Cousins {
    public final String getCousins() {
        return new org.jesperancinha.java11.mastery4dot3.cousins.of.cousins.Cousins().getCousins()
                .concat("\n")
                .concat(String.format("They have %s cousins", (int) (Math.random() * 100)));
    }
}
