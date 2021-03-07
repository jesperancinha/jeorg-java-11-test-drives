package org.jesperancinha.java11.mastery1dot2.runner;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

//4. Default methods multi-implementation
public class Shell implements CalcifiedFrame, SkinFrame {
    public void protectTheShell() {
        GREEN.printGeneric("We now are properly protected with CalcifiedShell and Skin\n");
    }
}
