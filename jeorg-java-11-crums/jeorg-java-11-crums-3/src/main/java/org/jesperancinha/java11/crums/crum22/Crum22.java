package org.jesperancinha.java11.crums.crum22;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum22 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 22 - System properties and HashTable");

        StringBuilder sb = new StringBuilder();
        for (var key : System.getProperties()
                .keySet()) {
            sb.append(key);
            sb.append(" ");
        }
        MAGENTA.printGenericLn(sb.toString());
        sb.setLength(0);

        for (var keySet : System.getProperties()
                .entrySet()) {
            sb.append(String.format("%s->%s,", keySet.getKey(), keySet.getValue()));
        }
        MAGENTA.printGenericLn(sb.toString());
        GREEN.printGenericLn("It's important to understand System.getProperties returns a HashTable of all system properties");
        GREEN.printGenericLn("A HashTable is synchronized and thread safe.");
        GREEN.printGenericLn("The Properties object return is a subtype of a hashtable.");

    }
}
