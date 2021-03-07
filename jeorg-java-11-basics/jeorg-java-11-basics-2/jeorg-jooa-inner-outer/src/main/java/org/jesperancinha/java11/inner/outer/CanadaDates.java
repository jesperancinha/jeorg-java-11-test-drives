package org.jesperancinha.java11.inner.outer;

import org.jesperancinha.java11.inner.outer.canada.Dates;

public class CanadaDates extends Dates {

    public java.time.LocalDate getCanadaDate() {
        return this.canadaDate;
    }

    public CanadaDates() {
        super();
    }

    public CanadaDates(String value) {
        this();
        System.out.println("This is called!");
        this.value = value;
    }

    public CanadaDates(String value, String value2) {
        super(value.concat(value2));
        // Either one or the other
        // this();
        System.out.println("Super is called!");
    }
}
