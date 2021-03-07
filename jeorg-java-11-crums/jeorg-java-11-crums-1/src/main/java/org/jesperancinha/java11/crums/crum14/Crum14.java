package org.jesperancinha.java11.crums.crum14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum14 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 14 - Type Arrays legal operations");

        final List<Double> list = new ArrayList<>();
        list.add(111d);

        BRIGHT_CYAN.printGenericLn(list);
        BRIGHT_CYAN.printGenericLn(list.contains(111d));
        BRIGHT_CYAN.printGenericLn(list.contains(111f));
        BRIGHT_CYAN.printGenericLn(list.contains("WOW"));
        BRIGHT_CYAN.printGenericLn(list.containsAll(List.of(111d)));
        BRIGHT_CYAN.printGenericLn(list.containsAll(Collections.singletonList(111d)));

        MAGENTA.printGenericLn("Notice that you can only add elements strictly of the type of the array");
        MAGENTA.printGenericLn("Contains works with all types though");
        MAGENTA.printGenericLn("Contains expects and Object and containsAll expects a list of Objects");
    }
}
