package org.jesperancinha.java11.crums.crum7;

import java.util.ArrayList;
import java.util.List;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum7 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 7 - List can be added by index");

        final List<String> list = new ArrayList<>();

        try {
            list.add(4, "peanuts");
        } catch (IndexOutOfBoundsException e) {
            RED.printGenericLn("This exception happens because the list isn't that big yet, so 0 is our only option in the beginning -> %s", e);
        }

        list.add(0, "peanuts");
        list.add(0, "almonds");
        MAGENTA.printGenericLn(list);
    }
}
