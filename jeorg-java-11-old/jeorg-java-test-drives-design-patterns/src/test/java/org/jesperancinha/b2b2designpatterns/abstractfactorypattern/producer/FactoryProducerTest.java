package org.jesperancinha.b2b2designpatterns.abstractfactorypattern.producer;

import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Flower;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.entities.Mammal;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory.AbstractFactory;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory.FlowerFactory;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.factory.MammalFactory;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers.Daisy;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers.Lily;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.flowers.Rose;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.mammals.Dog;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.mammals.Platypus;
import org.jesperancinha.b2b2designpatterns.abstractfactorypattern.mammals.Whale;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class FactoryProducerTest {
    public static final String MAMMAL = "Mammal";
    public static final String FLOWER = "Flower";
    public static final String NOTHING = "Nothing";
    public static final String DAISY = "Daisy";
    public static final String LILY = "Lily";
    public static final String ROSE = "Rose";
    public static final String DOG = "Dog";
    public static final String PLATYPUS = "Platypus";
    public static final String WHALE = "Whale";

    private FactoryProducer factoryProducer;

    @BeforeEach
    public void setUp() {
        factoryProducer = new FactoryProducer();
    }

    @AfterEach
    public void tearDown() {
        factoryProducer = null;
    }

    @Test
    public void getFactory() {
        final AbstractFactory mammalFactory = factoryProducer.getFactory(MAMMAL);
        final AbstractFactory flowerFactory = factoryProducer.getFactory(FLOWER);
        final AbstractFactory nothingFactory = factoryProducer.getFactory(NOTHING);

        final Flower daisy = flowerFactory.getFlower(DAISY);
        final Flower lily = flowerFactory.getFlower(LILY);
        final Flower rose = flowerFactory.getFlower(ROSE);
        final Flower nothingFlower = flowerFactory.getFlower(NOTHING);

        final Mammal dog = mammalFactory.getMammal(DOG);
        final Mammal platypus = mammalFactory.getMammal(PLATYPUS);
        final Mammal whale = mammalFactory.getMammal(WHALE);
        final Mammal nothingMammal = mammalFactory.getMammal(NOTHING);

        //Fake tests. they should all be null
        final Flower fakedaisy = mammalFactory.getFlower(DAISY);
        final Flower fakelily = mammalFactory.getFlower(LILY);
        final Flower fakerose = mammalFactory.getFlower(ROSE);
        final Flower fakenothingFlower = mammalFactory.getFlower(NOTHING);

        final Mammal fakedog = flowerFactory.getMammal(DOG);
        final Mammal fakeplatypus = flowerFactory.getMammal(PLATYPUS);
        final Mammal fakewhale = flowerFactory.getMammal(WHALE);
        final Mammal fakenothingMammal = flowerFactory.getMammal(WHALE);

        assertThat(mammalFactory instanceof MammalFactory).isTrue();
        assertThat(flowerFactory instanceof FlowerFactory).isTrue();
        assertThat(nothingFactory).isNull();

        assertThat(daisy instanceof Daisy).isTrue();
        assertThat(lily instanceof Lily).isTrue();
        assertThat(rose instanceof Rose).isTrue();
        assertThat(nothingFlower).isNull();

        assertThat(dog instanceof Dog).isTrue();
        assertThat(platypus instanceof Platypus).isTrue();
        assertThat(whale instanceof Whale).isTrue();
        assertThat(nothingMammal).isNull();

        //Fake assertions

        assertThat(fakedaisy).isNull();
        assertThat(fakelily).isNull();
        assertThat(fakerose).isNull();
        assertThat(fakedaisy).isNull();
        assertThat(fakenothingFlower).isNull();
        assertThat(fakedog).isNull();
        assertThat(fakeplatypus).isNull();
        assertThat(fakewhale).isNull();
        assertThat(fakenothingMammal).isNull();
    }
}