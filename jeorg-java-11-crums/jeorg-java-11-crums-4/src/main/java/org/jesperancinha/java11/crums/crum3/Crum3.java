package org.jesperancinha.java11.crums.crum3;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printNewLine;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowTitle;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum3 {
    public static void main(String[] args) {

        BLUE.printGenericTitleLn("Crum 3 - Creating different types of fors");

        BLUE.printGenericLn("        //'var' is not allowed in a compound declaration\n" + "        // for(var a=0, b=0; b<10; b++){\n"
                + "        //     \n" + "        // }");
        //'var' is not allowed in a compound declaration
        // for(var a=0, b=0; b<10; b++){
        //
        // }

        for (var i = 0; i < 10; i++) {

        }

        MAGENTA.printGenericLn("We cannot use var do declare variables in a compound");

        for (int i = 0, j = 10; i < 10; i++) {
            printRainbowTitle("" + i + " " + j);
        }
        printNewLine();

        MAGENTA.printGenericLn("We an however declare var outside the for loop:");

        var a = 0;
        for (; a < 20; a++) {
            printRainbowTitle("" + a);
        }
        printNewLine();

        GREEN.printGenericLn("In Java 11 a for loop can be a bit complicated to understand at some point");
        GREEN.printGenericLn("Important key things to remember");
        GREEN.printGenericLn("var cannot be declared inside de for compound");
        GREEN.printGenericLn("var can be declared outside and used within the loop");
        GREEN.printGenericLn("We can declare multi-variables but we cannot re-declared them");
    }
}
