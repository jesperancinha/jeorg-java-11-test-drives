package org.jesperancinha.java11.mastery4dot3.yourcousins;

public class YourCousins {
    public final String getCousins() {
        return String.format("You have %s cousins", (int) (Math.random() * 100));
    }
}
