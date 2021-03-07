package org.jesperancinha.java11.carmen.sandiego;

import static java.lang.Thread.sleep;

public class CarmenSandiegoCGAPrinter {

    static void printInputText(final CarmenSandiegoColor carmenSandiegoColor, String text) throws InterruptedException {
        System.out.print(carmenSandiegoColor.getConsoleColor());
        for (int i = 0; i < text.length(); i++) {
            sleep(10);
            System.out.print(text.charAt(i));
        }
        if (!text.contains("\n")) {
            System.out.print(" ");
        }
    }
}
