package org.jesperancinha.b2b2designpatterns.facadepattern.entities;

import java.util.logging.Logger;

/**
 * Created by joaofilipesabinoesperancinha on 11-04-16.
 */
public class Sagittarius implements Constellation {
    private static final Logger LOGGER = Logger.getLogger(Sagittarius.class.getName());

    @Override
    public void drawCostellation() {
        LOGGER.info("Constellation Sagittarius is drawn!");
    }
}
