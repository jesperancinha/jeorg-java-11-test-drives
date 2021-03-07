package org.jesperancinha.b2b2designpatterns.flyweightpattern.entities;

import java.awt.*;
import java.text.MessageFormat;
import java.util.Locale;

/**
 * Created by joaofilipesabinoesperancinha on 11-04-16.
 */
public class Car implements FourWheels {
    /**
     * Max speed by km/h
     */
    private Integer maxSpeed;

    private Color color;

    private String knownName;

    public Car(String knownName) {
        this.knownName = knownName;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String rideTheCar() {
        MessageFormat messageFormat = new MessageFormat("Car {0} is riding up to  {1} km/h with a fine {2} color tone", Locale.GERMANY);
        return messageFormat.format(
                new Object[]{
                        knownName,
                        maxSpeed,
                        color.getRGB()
                }
        );
    }
}
