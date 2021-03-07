package org.jesperancinha.b2b2designpatterns.flyweightpattern.factory;

import org.jesperancinha.b2b2designpatterns.flyweightpattern.entities.FourWheels;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joaofilipesabinoesperancinha on 11-04-16.
 */
public class CarFactoryTest {
    @Test
    public void getFourWheels() {

    }

    @Test
    public void getFourWheelsMap() {
        final CarFactory carFactory = new CarFactory();

        final FourWheels car1a = carFactory.getFourWheels("Flash");
        final FourWheels car2a = carFactory.getFourWheels("Debunker");
        final FourWheels car3a = carFactory.getFourWheels("Constructor");
        final FourWheels car4a = carFactory.getFourWheels("Pacifist");

        setCarProperties(car1a, Color.BLACK, 1);
        setCarProperties(car2a, Color.RED, 2);
        setCarProperties(car3a, Color.YELLOW, 3);
        setCarProperties(car4a, Color.WHITE, 4);

        assertThat(car1a.rideTheCar()).isEqualTo("Car Flash is riding up to  1 km/h with a fine -16.777.216 color tone");
        assertThat(car2a.rideTheCar()).isEqualTo("Car Debunker is riding up to  2 km/h with a fine -65.536 color tone");
        assertThat(car3a.rideTheCar()).isEqualTo("Car Constructor is riding up to  3 km/h with a fine -256 color tone");
        assertThat(car4a.rideTheCar()).isEqualTo("Car Pacifist is riding up to  4 km/h with a fine -1 color tone");

        final FourWheels car1b = carFactory.getFourWheels("Flash");
        final FourWheels car2b = carFactory.getFourWheels("Debunker");
        final FourWheels car3b = carFactory.getFourWheels("Constructor");
        final FourWheels car4b = carFactory.getFourWheels("Pacifist");

        assertThat(car1b.rideTheCar()).isEqualTo("Car Flash is riding up to  1 km/h with a fine -16.777.216 color tone");
        assertThat(car2b.rideTheCar()).isEqualTo("Car Debunker is riding up to  2 km/h with a fine -65.536 color tone");
        assertThat(car3b.rideTheCar()).isEqualTo("Car Constructor is riding up to  3 km/h with a fine -256 color tone");
        assertThat(car4b.rideTheCar()).isEqualTo("Car Pacifist is riding up to  4 km/h with a fine -1 color tone");

        setCarProperties(car1b, Color.BLUE, 5);
        setCarProperties(car2b, Color.LIGHT_GRAY, 6);
        setCarProperties(car3b, Color.DARK_GRAY, 7);
        setCarProperties(car4b, Color.PINK, 8);

        assertThat(car1b.rideTheCar()).isEqualTo("Car Flash is riding up to  5 km/h with a fine -16.776.961 color tone");
        assertThat(car2b.rideTheCar()).isEqualTo("Car Debunker is riding up to  6 km/h with a fine -4.144.960 color tone");
        assertThat(car3b.rideTheCar()).isEqualTo("Car Constructor is riding up to  7 km/h with a fine -12.566.464 color tone");
        assertThat(car4b.rideTheCar()).isEqualTo("Car Pacifist is riding up to  8 km/h with a fine -20.561 color tone");

        assertThat(carFactory.getFourWheelsMap().size()).isEqualTo(4);
    }

    private void setCarProperties(FourWheels car1a, Color color, int maxSpeed) {
        car1a.setColor(color);
        car1a.setMaxSpeed(maxSpeed);
    }
}