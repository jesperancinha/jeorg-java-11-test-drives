package org.jesperancinha.java11.mastery3dot2.mercado;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Construction implements Space {
    String mainMaterial;

    public Construction(String mainMaterial) {
        this.mainMaterial = mainMaterial;
        ORANGE.printGenericLn("Construction constructor has been called! %s", this.toString());
    }

    public Construction() {
        ORANGE.printGenericLn("Construction (no-args) constructor has been called! %s", this.toString());
    }

    public static void getInfo() {
        YELLOW.printGenericLn("A Construction has mainMaterial");
    }

    public String getCurrentInfo() {
        return "mainMaterial='" + mainMaterial;
    }

    @Override
    public String toString() {
        return "Construction{" +
                "mainMaterial='" + mainMaterial + '\'' +
                '}';
    }
}
