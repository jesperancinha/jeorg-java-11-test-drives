package org.jesperancinha.java11.flashmodule.module3;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowStack;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class FlashModule3 {
    public static void main(String[] args) {
        printRainbowStack("You are running Flash Module 3");
        ORANGE.printGenericLn("You can run a module and specify where the modules are using:");
        printRainbowStack("-p");
        printRainbowStack("--module-path");
        GREEN.printGenericLn("-p and --module-path are the same");
        printRainbowStack("-p and --module-path are the same and specify where the modules are");
        printRainbowStack("You can specify the folder where they are and/or the jars directly separated by colon");
        GREEN.printGenericLn("This is valid for compile (javac) and running (java)");
        GREEN.printGenericLn("This is valid for compile (javac) and running (java)");
        GREEN.printGenericLn("This is valid for compile (javac) and running (java)");
        GREEN.printGenericLn("This is valid for compile (javac) and running (java)");
    }
}
