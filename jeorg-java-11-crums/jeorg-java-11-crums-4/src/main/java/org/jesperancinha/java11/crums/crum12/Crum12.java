package org.jesperancinha.java11.crums.crum12;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum12 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 12 - Caching with numbers");

        Integer i = Integer.parseInt("127");
        Integer ia = i;
        Integer j = -128;
        Integer ja = j;
        Integer k = 0;
        Integer ka = k;
        Integer l = Integer.parseInt("234");
        Integer la = l;

        ia++;
        ia--;
        ja++;
        ja--;
        ka++;
        ka--;
        la++;
        la--;

        ORANGE.printGenericLn(i == ia);
        ORANGE.printGenericLn(j == ja);
        ORANGE.printGenericLn(k == ka);
        ORANGE.printGenericLn(l == la);

        GREEN.printGenericLn("Java optimizes values from -128 to 127. The rest of the objects use cache. This is why the equals fails for the last case");
    }
}
