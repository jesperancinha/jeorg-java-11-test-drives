package org.jesperancinha.java11.crums.crum30;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Potatos {
    Potato[] value();
}
