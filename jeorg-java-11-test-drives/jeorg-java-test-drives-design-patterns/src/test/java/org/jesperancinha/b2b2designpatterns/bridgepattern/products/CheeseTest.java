package org.jesperancinha.b2b2designpatterns.bridgepattern.products;

import org.jesperancinha.b2b2designpatterns.bridgepattern.producers.CabralesCheese;
import org.jesperancinha.b2b2designpatterns.bridgepattern.producers.GoudaCheese;
import org.jesperancinha.b2b2designpatterns.bridgepattern.producers.IlhaCheese;
import org.jesperancinha.b2b2designpatterns.bridgepattern.producers.SerraCheese;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joaofilipesabinoesperancinha on 13-04-16.
 */
public class CheeseTest {
    @Test
    public void makeCheese() {
        final Logger loggerCabrales = Logger.getLogger(CabralesCheese.class.getName());
        final Logger loggerGouda = Logger.getLogger(GoudaCheese.class.getName());
        final Logger loggerIlha = Logger.getLogger(IlhaCheese.class.getName());
        final Logger loggerSerra = Logger.getLogger(SerraCheese.class.getName());
        final Formatter formatter = new SimpleFormatter();
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final Handler handler = new StreamHandler(out, formatter);
        loggerCabrales.addHandler(handler);
        loggerGouda.addHandler(handler);
        loggerIlha.addHandler(handler);
        loggerSerra.addHandler(handler);

        final Cheese cabralesCheese = new Cheese(5, 10, new CabralesCheese());
        final Cheese goudaCheese = new Cheese(15, 20, new GoudaCheese());
        final Cheese ilhaCheese = new Cheese(25, 30, new IlhaCheese());
        final Cheese serraCheese = new Cheese(35, 40, new SerraCheese());

        cabralesCheese.makeCheese();
        goudaCheese.makeCheese();
        ilhaCheese.makeCheese();
        serraCheese.makeCheese();

        assertThat(cabralesCheese.getRadius()).isEqualTo(5);
        assertThat(goudaCheese.getRadius()).isEqualTo(15);
        assertThat(ilhaCheese.getRadius()).isEqualTo(25);
        assertThat(serraCheese.getRadius()).isEqualTo(35);

        assertThat(cabralesCheese.getHeight()).isEqualTo(10);
        assertThat(goudaCheese.getHeight()).isEqualTo(20);
        assertThat(ilhaCheese.getHeight()).isEqualTo(30);
        assertThat(serraCheese.getHeight()).isEqualTo(40);

        handler.flush();
        final String fullLog = out.toString();

        assertThat(fullLog).contains("Cabrales Cheese is made!");
        assertThat(fullLog).contains("Gouda Cheese is made!");
        assertThat(fullLog).contains("Ilha Cheese is made!");
        assertThat(fullLog).contains("Serra Cheese is made!");
    }

}