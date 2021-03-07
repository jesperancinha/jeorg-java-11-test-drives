package org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory;

import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Flower;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Mammal;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers.Daisy;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers.Lily;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers.Rose;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class FlowerFactory extends AbstractFactory {
    public Flower getFlower(String flowerType) {
        switch (flowerType) {
            case "Daisy":
                return new Daisy();
            case "Lily":
                return new Lily();
            case "Rose":
                return new Rose();
        }
        return null;
    }

    public Mammal getMammal(String mammalType) {
        return null;
    }
}
