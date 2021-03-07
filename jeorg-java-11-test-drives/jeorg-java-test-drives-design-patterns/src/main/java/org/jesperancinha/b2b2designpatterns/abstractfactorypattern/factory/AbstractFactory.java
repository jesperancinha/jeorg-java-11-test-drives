package org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory;

import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Flower;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Mammal;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public abstract class AbstractFactory {
    public abstract Flower getFlower(String flowerType);

    public abstract Mammal getMammal(String mammalType);
}
