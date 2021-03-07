package org.jesperancinha.java11.mastery2dot2;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE_PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(value = RUNTIME)
@Target(value = {TYPE_USE, TYPE_PARAMETER})
public @interface Rocket {
}
