package org.jesperancinha.java11.crums.crum36;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum36 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 36 - When return from try and finally compete with each other");

        String result1 = getNumber(1);
        String result2 = getNumber(2);

        MAGENTA.printGenericLn("If no exception is thrown we get %s", result1);
        MAGENTA.printGenericLn("If exception is thrown we get %s", result2);

        GREEN.printGenericLn("We know that finally is the last operation guaranteed to happen");
        GREEN.printGenericLn("This is why its return value wins when competing with an thrown catch exception or the successful case");

    }

    private static String getNumber(int i) {
        try {
            if (i == 1) {
                return new Crum36() + "1";
            }
            throw new Exception();
        } catch (Exception e) {
            return "2";
        } finally {
            return "3";
        }
    }

    @Override
    public String toString() {
        YELLOW.printGenericLn("As you can see, the return operations still happen, regardless.");
        return super.toString();
    }
}
