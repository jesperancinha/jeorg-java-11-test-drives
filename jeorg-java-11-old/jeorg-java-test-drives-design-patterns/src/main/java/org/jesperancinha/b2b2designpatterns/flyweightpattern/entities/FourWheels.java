package org.jesperancinha.b2b2designpatterns.flyweightpattern.entities;

import java.awt.*;

/**
 * Created by joaofilipesabinoesperancinha on 11-04-16.
 */
public interface FourWheels {
    void setColor(Color color);

    void setMaxSpeed(Integer maxSpeed);

    String rideTheCar();
}
