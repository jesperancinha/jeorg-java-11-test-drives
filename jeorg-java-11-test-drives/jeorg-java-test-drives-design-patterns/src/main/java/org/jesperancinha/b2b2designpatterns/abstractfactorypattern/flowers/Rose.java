package org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers;

import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.FlowerImpl;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class Rose extends FlowerImpl {
    public Rose() {
        this.petals = 5;
    }

    @Override
    public Integer getNumberOfPetals() {
        return petals;
    }
}
