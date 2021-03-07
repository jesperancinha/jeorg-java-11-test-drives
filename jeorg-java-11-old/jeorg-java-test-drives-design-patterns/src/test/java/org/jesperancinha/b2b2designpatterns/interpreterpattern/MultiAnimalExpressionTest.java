package org.jesperancinha.b2b2designpatterns.interpreterpattern;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joaofilipesabinoesperancinha on 13-04-16.
 */
public class MultiAnimalExpressionTest {

    public static final String ORANGUTAN = "Orangutan";
    public static final String MONKEY = "Monkey";
    public static final String GORILLA = "Gorilla";
    public static final String WOMBAT = "Wombat";

    @Test
    public void interpret() {
        final AnimalMaxWeightExpression expression1 = new AnimalOneExpression(MONKEY, 100);
        final AnimalMaxWeightExpression expression2 = new AnimalOneExpression(GORILLA, 400);
        final AnimalMaxWeightExpression expression3 = new AnimalOneExpression(ORANGUTAN, 600);
        final AnimalMaxWeightExpression expression4 = new AnimalOneExpression(WOMBAT, 20);

        final MultiAnimalExpression multiAnimalExpression = new MultiAnimalExpression(
                expression1,
                expression2,
                expression3,
                expression4
        );

        assertThat(multiAnimalExpression.interpret(MONKEY + "," + 100)).isTrue();
        assertThat(multiAnimalExpression.interpret(GORILLA + "," + 400)).isTrue();
        assertThat(multiAnimalExpression.interpret(ORANGUTAN + "," + 600)).isTrue();
        assertThat(multiAnimalExpression.interpret(WOMBAT + "," + 20)).isTrue();
    }

    @Test
    public void interpret_false() {
        final AnimalMaxWeightExpression expression1 = new AnimalOneExpression(MONKEY, 100);
        final AnimalMaxWeightExpression expression2 = new AnimalOneExpression(GORILLA, 400);
        final AnimalMaxWeightExpression expression3 = new AnimalOneExpression(ORANGUTAN, 600);
        final AnimalMaxWeightExpression expression4 = new AnimalOneExpression(WOMBAT, 20);

        final MultiAnimalExpression multiAnimalExpression = new MultiAnimalExpression(
                expression1,
                expression2,
                expression3,
                expression4
        );

        assertThat(multiAnimalExpression.interpret(MONKEY + "," + 101)).isFalse();
        assertThat(multiAnimalExpression.interpret(GORILLA + "," + 401)).isFalse();
        assertThat(multiAnimalExpression.interpret(ORANGUTAN + "," + 601)).isFalse();
        assertThat(multiAnimalExpression.interpret(WOMBAT + "," + 21)).isFalse();
    }
}