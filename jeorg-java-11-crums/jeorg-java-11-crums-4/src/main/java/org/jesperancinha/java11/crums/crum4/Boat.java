package org.jesperancinha.java11.crums.crum4;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Boats.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Boat {
    String value();

    BoatType type();
}
