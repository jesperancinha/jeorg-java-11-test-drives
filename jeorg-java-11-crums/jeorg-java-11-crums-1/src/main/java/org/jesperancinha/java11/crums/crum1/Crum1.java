package org.jesperancinha.java11.crums.crum1;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowTitleLn;

public class Crum1 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 1 - Calling static");
        // Pay attention to parenthesis and where they are needed
        Leaf.print();
        printRainbowTitleLn(Leaf.IAMASTATIC);
        new Leaf().printLocal();
    }
}
