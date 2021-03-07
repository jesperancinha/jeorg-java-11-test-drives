package org.jesperancinha.java11.flashmodule.module2;

import org.jesperancinha.console.consolerizer.console.Consolerizer;

public class FlashModule2 {
    public static void main(String[] args) {
        Consolerizer.printRainbowStack("You are running Flash Module 2");
        Consolerizer.printRainbowStack("Never forget that the module-path works for .class and jar files");
        Consolerizer.printRainbowStack("The output folder is the -d directory plus the name of the modules");
        Consolerizer.printRainbowStack("You must remember that -p or --module-path, can contain either a jar or the just the exploded format");
        Consolerizer.printRainbowStack("The main class is always located in folder <module_name/<package_name>/<mainClass>.class");
    }
}
