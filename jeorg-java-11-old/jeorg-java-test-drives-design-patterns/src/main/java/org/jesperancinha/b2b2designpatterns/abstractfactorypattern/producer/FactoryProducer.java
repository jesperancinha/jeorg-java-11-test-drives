package org.jesperancinha.b2b2designpatterns.abstractfactorypattern.producer;

import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory.AbstractFactory;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory.FlowerFactory;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory.MammalFactory;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class FactoryProducer {
    public AbstractFactory getFactory(String factoryName) {
        switch (factoryName) {
            case "Flower":
                return new FlowerFactory();
            case "Mammal":
                return new MammalFactory();
        }
        return null;
    }
}
