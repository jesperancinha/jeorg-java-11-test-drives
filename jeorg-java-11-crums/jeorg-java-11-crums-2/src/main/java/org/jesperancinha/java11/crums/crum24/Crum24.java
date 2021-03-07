package org.jesperancinha.java11.crums.crum24;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum24 {

    private static class Happy {
        public void showParty() {
            ORANGE.printGenericLn("Happy");
        }
    }

    private static class Hurray extends Happy {
        public void showParty() {
            ORANGE.printGenericLn("Hurray");
        }
    }

    private static class Party extends Hurray {
        public void showParty() {
            ORANGE.printGenericLn("Party");
        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 24 - Overriding methods");

        MAGENTA.printGeneric("We cannot shadow methods, but we can override them.");
        MAGENTA.printGeneric("Overriding means that after compilation, there is only the most specific method available");

        var happy1 = new Happy();

        MAGENTA.printGenericLn("For the happy class we only have one method of course");
        happy1.showParty();

        var hurray1 = new Hurray();
        var happy2 = (Happy) hurray1;
        MAGENTA.printGenericLn("By creating Hurray, we will overrice the Happy method and thus even with casting,\nthis will result in the sane Hurray method");

        hurray1.showParty();
        happy2.showParty();

        var party1 = new Party();
        var hurray2 = (Hurray) party1;
        var happy3 = (Happy) party1;
        MAGENTA.printGenericLn("By creating a Party, we will override the Happy method and the Hurray method and thus even with casting,\nthis will result in the same Party method");
        party1.showParty();
        hurray2.showParty();
        happy3.showParty();

        GREEN.printGenericLn("This means that overriding literaly overwrites the super method.");
    }
}
