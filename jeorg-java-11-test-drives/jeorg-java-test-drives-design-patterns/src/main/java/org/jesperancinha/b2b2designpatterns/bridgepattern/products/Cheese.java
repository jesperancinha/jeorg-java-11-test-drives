package org.jesperancinha.b2b2designpatterns.bridgepattern.products;

import org.jesperancinha.b2b2designpatterns.bridgepattern.producers.CheeseMakerAPI;

/**
 * Created by joaofilipesabinoesperancinha on 13-04-16.
 */
public class Cheese implements DairyProduct {
    private final int radius;

    private final int height;

    private final CheeseMakerAPI cheeseMaker;

    public Cheese(int radius, int height, CheeseMakerAPI cheeseMakerAPI) {
        this.radius = radius;
        this.height = height;
        this.cheeseMaker = cheeseMakerAPI;
    }

    @Override
    public void makeCheese() {
        cheeseMaker.makeCheese();
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }
}
