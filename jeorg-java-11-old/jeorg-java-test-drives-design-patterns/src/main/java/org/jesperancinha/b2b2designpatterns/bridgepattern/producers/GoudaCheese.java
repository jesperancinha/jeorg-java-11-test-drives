package org.jesperancinha.b2b2designpatterns.bridgepattern.producers;

import java.util.logging.Logger;

/**
 * Created by joaofilipesabinoesperancinha on 13-04-16.
 */
public class GoudaCheese implements CheeseMakerAPI {
    private static final Logger LOGGER = Logger.getLogger(GoudaCheese.class.getName());

    @Override
    public boolean makeCheese() {
        LOGGER.info("Gouda Cheese is made!");
        return false;
    }
}
