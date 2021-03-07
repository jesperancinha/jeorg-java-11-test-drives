package org.jesperancinha.java11.crums.crum14;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface Special {
}
