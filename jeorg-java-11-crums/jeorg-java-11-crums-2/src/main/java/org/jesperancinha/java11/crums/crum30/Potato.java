package org.jesperancinha.java11.crums.crum30;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Potatos.class)
public @interface Potato {
    int id() default 0;

    String name();
}
