package org.jesperancinha.java11.inner.outer.canada;

import java.time.LocalDate;

public class PublicDates {
    /**
     * We are withing the package.
     * <p>
     * This means that we can access both package and protected scoped variables.
     * Withing the package we don't need to have a subclass.
     */
    public LocalDate getProtectedDate() {
        return new Dates().canadaDate;
    }
}
