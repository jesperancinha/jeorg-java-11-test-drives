package org.jesperancinha.java11.crums.crum1;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowTitleLn;

public class Leaf {

    public static Integer IAMASTATIC = 123;

    public static void print() {
        printRainbowTitleLn("This is a rainbow in %s ", Leaf.class.toString());
        printRainbowTitleLn("I can print my static member this way %s ", IAMASTATIC);
        printRainbowTitleLn("Or I can print my static member this way %s ", Leaf.IAMASTATIC);
    }

    //'print()' is already defined in 'org.jesperancinha.java11.crums.crum1.Leaf'
    //public void print(){
    public void printLocal() {
        printRainbowTitleLn("This is a rainbow in %s ", Leaf.class.toString());
        printRainbowTitleLn("I can print my static member this way %s from local", IAMASTATIC);
        printRainbowTitleLn("Or I can print my static member this way %s from local", Leaf.IAMASTATIC);
    }
}
