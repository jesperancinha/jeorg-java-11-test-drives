package org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers;

import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.FlowerImpl;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class Lily extends FlowerImpl {
    public Lily() {
        this.petals = 3;
    }

    @Override
    public Integer getNumberOfPetals() {
        return petals;
    }
}
