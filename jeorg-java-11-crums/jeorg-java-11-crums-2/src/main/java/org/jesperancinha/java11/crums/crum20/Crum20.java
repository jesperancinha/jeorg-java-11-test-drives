package org.jesperancinha.java11.crums.crum20;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public class Crum20 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 20 - Revise security Guideline 2.3");

        GREEN.printGenericLn("From: https://www.oracle.com/java/technologies/javase/seccodeguide.html");
        GREEN.printGenericLn("Guideline 2-3 / CONFIDENTIAL-3: Consider purging highly sensitive from memory after use\n"
                + "To narrow the window when highly sensitive information may appear in core dumps, debugging, and confidentiality attacks, it may be appropriate to zero memory containing the data immediately after use rather than waiting for the garbage collection mechanism.\n"
                + "\n"
                + "However, doing so does have negative consequences. Code quality will be compromised with extra complications and mutable data structures. Libraries may make copies, leaving the data in memory anyway. The operation of the virtual machine and operating system may leave copies of the data in memory or even on disk.");

    }
}
