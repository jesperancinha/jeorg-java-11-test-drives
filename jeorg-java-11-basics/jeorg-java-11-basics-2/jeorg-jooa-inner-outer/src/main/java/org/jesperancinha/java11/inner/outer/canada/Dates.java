package org.jesperancinha.java11.inner.outer.canada;

import java.time.LocalDate;

public class Dates {
    protected final LocalDate canadaDate = LocalDate.of(1986, 7, 21);

    public String value;

    public Dates() {
        System.out.println("Dates default constructor called!");
        this.value = "Default";
    }

    public Dates(String value) {
        System.out.println("Dates specific constructor called!");
        this.value = value;
    }
}
