package org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory;

import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Flower;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Mammal;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.mammals.Dog;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.mammals.Platypus;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.mammals.Whale;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class MammalFactory extends AbstractFactory {
    public Flower getFlower(String flowerType) {
        return null;
    }

    public Mammal getMammal(String mammalType) {
        switch (mammalType) {
            case "Dog":
                return new Dog();
            case "Platypus":
                return new Platypus();
            case "Whale":
                return new Whale();
        }
        return null;
    }
}
