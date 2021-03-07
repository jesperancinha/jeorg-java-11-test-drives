package org.jesperancinha.java11.crums.crum7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum7 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 7 - indexOf and contains");

        MAGENTA.printGenericLn("indexOf and contains accept Object.");
        final List<String> strings = Arrays.asList("Doja Cat", "Nicky Minaj", "Cardi B", "Cher");

        try {
            strings.add("What?");
        } catch (UnsupportedOperationException e) {
            RED.printGenericLn("This is expected! Arrays.asList returns a fixed size list -> %s", e);
            MAGENTA.printGenericLn("What we can do is swap Nicky Minaj with just Nicky:");
            strings.set(1, "Nicky");
            ORANGE.printGenericLn(strings);
        }

        var singerNames = new ArrayList<>(strings);

        MAGENTA.printGenericLn("These are all our singers:");
        ORANGE.printGenericLn(singerNames);
        MAGENTA.printGenericLn("Let's check if cher is there:");
        ORANGE.printGenericLn(singerNames.contains("Cher"));
        MAGENTA.printGenericLn("Now we try to find a double there:");

        // 'List<String>' may not contain objects of type 'Double'
        ORANGE.printGenericLn(singerNames.contains(1.4));
        MAGENTA.printGenericLn("So this is of course false.");
        MAGENTA.printGenericLn("We can now try to find the index of Camilla Cabello in the list.");
        ORANGE.printGenericLn("Oh oh, it's not there and so the index is %d", singerNames.indexOf("Camilla Cabello"));
        ORANGE.printGenericLn("But we do find Cardi B %d", singerNames.indexOf("Cardi B"));
        ORANGE.printGenericLn("But if we look for a number, this time an Integer, we still get %d", singerNames.indexOf(1234));
        singerNames.add("Camilla Cabello");
        MAGENTA.printGenericLn("We now have added Camilla Cabello");
        ORANGE.printGenericLn("And there we go, Camilla Cabello has now index %d in our list", singerNames.indexOf("Camilla Cabello"));

        GREEN.printGenericLn("indexOf and contains accept objects");
        GREEN.printGenericLn("Setting a wrong type as a parameter is pointless, but it doesn't cause an exception");
        GREEN.printGenericLn("In both cases this is just a find operation which makes it logic that it does not throw an exception and instead it just returns false");
        GREEN.printGenericLn("As an added curiosity, not that Arrays.asList returns a fixed size list. It is still mutable. List.of is immutable");
    }
}
