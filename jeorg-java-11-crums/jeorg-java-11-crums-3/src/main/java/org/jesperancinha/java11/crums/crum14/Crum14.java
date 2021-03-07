package org.jesperancinha.java11.crums.crum14;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum14 {

    public static class Kitten {
        private final String name;

        public Kitten(@Special String name) {
            this.name = name;
        }

        @Override
        public @Special String toString() {
            return "Kitten{" + "name='" + name + '\'' + '}';
        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 14 - Annotations on types");
        final @Special String foxy = "Foxy";
        var kitten = new @Special Kitten(foxy);

        final @Special String bibi = "Bibi";
        var kittenName = new @Special String(bibi);
        var kitten2 = new @Special Kitten(kittenName);
        MAGENTA.printGenericLn("We have created two kittens:");

        ORANGE.printGenericLn("This is %s, %s", foxy, kitten);
        ORANGE.printGenericLn("This is %s, %s", bibi, kitten2);

        GREEN.printGenericLn("We were able to use this @Special annotation in type and parameter type parameters.");
    }
}
