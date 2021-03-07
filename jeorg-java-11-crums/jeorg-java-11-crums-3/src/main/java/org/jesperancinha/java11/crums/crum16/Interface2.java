package org.jesperancinha.java11.crums.crum16;

public interface Interface2 extends Interface1 {
    default String howDoesItFeel() {
        return Interface1.super.howDoesItFeel();
    }
}
