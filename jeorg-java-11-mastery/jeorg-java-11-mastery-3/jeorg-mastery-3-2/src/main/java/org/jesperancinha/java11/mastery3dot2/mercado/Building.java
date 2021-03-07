package org.jesperancinha.java11.mastery3dot2.mercado;

import java.io.Serializable;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Building extends Construction implements Serializable {
    float height;
    float dimX;
    float dimY;

    public Building(float height, float dimX, float dimY, String mainMaterial) {
        super(mainMaterial);
        this.height = height;
        this.dimX = dimX;
        this.dimY = dimY;
        ORANGE.printGenericLn("Building constructor has been called! %s", toString());
    }

    public Building() {
        ORANGE.printGenericLn("Building (no-args) constructor has been called! %s", toString());
    }

    public static void getInfo() {
        YELLOW.printGenericLn("A Building has a height, dimX and  dimY");
    }

    public String getCurrentInfo() {
        return "height=" + height +
                ", dimX=" + dimX +
                ", dimY=" + dimY;
    }

    @Override
    public String toString() {
        return ("Building{" +
                "height=" + height +
                ", dimX=" + dimX +
                ", dimY=" + dimY +
                '}').concat(super.toString());
    }
}
