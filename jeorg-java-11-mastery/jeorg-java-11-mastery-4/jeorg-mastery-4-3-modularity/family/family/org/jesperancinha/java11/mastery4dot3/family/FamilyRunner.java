package org.jesperancinha.java11.mastery4dot3.family;

import org.jesperancinha.java11.mastery4dot3.cousins.Cousins;
import org.jesperancinha.java11.mastery4dot3.yourcousins.YourCousins;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class FamilyRunner {
    public static void main(String[] args) {
        var cousins = new Cousins();
        var yourCousins = new YourCousins();
        BLUE.printGenericLn("Let's start a family party!");
        BLUE.printGenericLn("We start with their cousins!");
        MAGENTA.printGenericLn(cousins.getCousins());
        BLUE.printGenericLn("And now we start with our cousins!");
        MAGENTA.printGeneric(yourCousins.getCousins());
    }
}
