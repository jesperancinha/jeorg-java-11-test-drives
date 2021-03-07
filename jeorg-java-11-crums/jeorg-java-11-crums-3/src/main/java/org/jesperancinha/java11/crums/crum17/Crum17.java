package org.jesperancinha.java11.crums.crum17;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum17 {

    public interface Green {

    }

    public class Leave implements Green {

    }

    public class Bush extends Leave {

    }

    public class BlackCurrant extends Bush {

        @Override
        public String toString() {
            return "Oh my god! It's a black currant!";
        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 17 - Double Casting and how it can be done");

        final Crum17 crum17 = new Crum17();

        final Green blackCurrant = (Green) (Bush) crum17.new BlackCurrant();

        MAGENTA.printGenericLn("This cast does work and we get a Green -> %s", blackCurrant);

        GREEN.printGenericLn("Although mostly unnecessary, a double casting is perfectly acceptable in Java");
    }
}
