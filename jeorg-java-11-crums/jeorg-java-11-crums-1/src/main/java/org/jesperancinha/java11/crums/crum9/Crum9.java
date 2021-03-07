package org.jesperancinha.java11.crums.crum9;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum9 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 9 - Unreacheable code");
        // Unreachable statement
        // while(false){
        //
        // }

        while (true) {
            break;
        }
        if (false) {

        }
        do {

        } while (false);

        // Unreachable statement
        // for(;false;){
        //
        // }

        for (; ; ) {
            break;
        }

        for (; true; ) {
            break;

        }

        boolean a = false;
        for (; a & false; ) {
            YELLOW.printGenericLn(a);
        }

        MAGENTA.printGenericLn("The exception in this case is if");
        MAGENTA.printGenericLn("If can have unreachable conditions");
        MAGENTA.printGenericLn("If while and for loops may not have unreachable conditions");
        MAGENTA.printGenericLn("do{}while() loops are always reachable at least once");
        MAGENTA.printGenericLn("An unreachable condition in a for or a while loop is characterized by being constantly false");
        MAGENTA.printGenericLn("Constantly false means that the compiler reads literally a false value");

    }
}
