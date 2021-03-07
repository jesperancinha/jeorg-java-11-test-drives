package org.jesperancinha.java11.crums.crum8;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum8 implements B {

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 8 - Overriding interface methods and creating methods after Java 9");

        final Crum8 crum8 = new Crum8();

        final int i = crum8.countSheeps();
        final int theSheeps = crum8.getTheSheeps();

        ORANGE.printGenericLn("We've counted %d sheeps from a total of %d", i, theSheeps);

        YELLOW.printGenericLn("And sheeps make this sound %s", B.sheepMakesASound());
        GREEN.printGenericLn("An interface can have methods that @Override other methods");
        GREEN.printGenericLn("An interface can contain private methods that contain a body");
        GREEN.printGenericLn("Static methods are also valida, public by default and must have a body");
    }

    @Override
    public int getTheSheeps() {
        return 4000;
    }
}
