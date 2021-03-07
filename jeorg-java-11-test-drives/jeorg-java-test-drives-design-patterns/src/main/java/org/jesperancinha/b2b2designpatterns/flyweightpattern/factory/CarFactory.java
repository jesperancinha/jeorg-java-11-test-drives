package org.jesperancinha.b2b2designpatterns.flyweightpattern.factory;

import org.jesperancinha.b2b2designpatterns.flyweightpattern.entities.Car;
import org.jesperancinha.b2b2designpatterns.flyweightpattern.entities.FourWheels;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by joaofilipesabinoesperancinha on 11-04-16.
 */
public class CarFactory {
    final Map<String, FourWheels> fourWheelsMap;

    public CarFactory() {
        fourWheelsMap = new HashMap<>();
    }

    public FourWheels getFourWheels(String knownName) {
        FourWheels fourWheels = fourWheelsMap.get(knownName);

        if (fourWheels == null) {
            fourWheels = new Car(knownName);
            fourWheelsMap.put(knownName, fourWheels);
        }

        return fourWheels;
    }

    public Map<String, FourWheels> getFourWheelsMap() {
        return fourWheelsMap;
    }
}
