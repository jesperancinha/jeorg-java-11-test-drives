package org.jesperancinha.java11.crums.crum26;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum26 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 26 - List.of and List.copyOf do not support null elements");

        var strings = new String[]{"Paul Simon", "PJ Harvey", "Courtney Love", null, "Roy Orbinson"};

        ORANGE.printGenericLn("We have a list of artists:");

        BRIGHT_MAGENTA.printGenericLn(Arrays.stream(strings).collect(Collectors.toList()));

        ORANGE.printGenericLn("Let's make an immutable list of it:");

        try {
            List.of(strings);
        } catch (NullPointerException e) {
            RED.printGenericLn("This is expected! The NullPointerException is thrown because there is a null element -> %s", e);
        }

        try {
            List.copyOf(Arrays.asList(strings));
        } catch (NullPointerException e) {
            RED.printGenericLn("This is expected! The NullPointerException is thrown because there is a null element -> %s", e);
        }

        GREEN.printGenericLn("It is important to understand the null values aren't accepted in some list creations.");
        GREEN.printGenericLn("The creation of immutable lists require that all elements are filled in.");
        GREEN.printGenericLn("A null value does not make since in immutable lists");

    }
}
