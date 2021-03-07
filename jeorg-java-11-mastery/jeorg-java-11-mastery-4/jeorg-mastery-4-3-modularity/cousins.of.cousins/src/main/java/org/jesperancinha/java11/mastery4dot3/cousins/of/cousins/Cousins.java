package org.jesperancinha.java11.mastery4dot3.cousins.of.cousins;

public class Cousins {
    public final String getCousins() {
        return String.format("They have %s cousins of cousins", (int) (Math.random() * 100));
    }
}
