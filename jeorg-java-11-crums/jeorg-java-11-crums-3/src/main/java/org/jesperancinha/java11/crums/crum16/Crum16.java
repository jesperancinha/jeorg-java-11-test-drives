package org.jesperancinha.java11.crums.crum16;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum16 {

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 16 - Advanced ways of using super between interfaces and classes");

        var class2 = new Class2();
        MAGENTA.printGenericLn(class2.howDoesItFeel());

        GREEN.printGenericLn("The point is that super is not valid to use in interfaces directly");
        GREEN.printGenericLn("We can use super, but we need to use the Interface name as a reference first");
        GREEN.printGenericLn("This is also valid between class and interface");
        GREEN.printGenericLn("Between classes only super alone is valid");
        GREEN.printGenericLn("Using the reference name before will refer to a possible instance enclosing class");
    }
}
