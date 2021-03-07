package org.jesperancinha.b2b2designpatterns.interpreterpattern;

import java.util.Arrays;

/**
 * Created by joaofilipesabinoesperancinha on 13-04-16.
 */
public class MultiAnimalExpression implements AnimalMaxWeightExpression {
    private final AnimalMaxWeightExpression animalOne;
    private final AnimalMaxWeightExpression animalTwo;

    public MultiAnimalExpression(AnimalMaxWeightExpression... animalExpressions) {
        this.animalOne = animalExpressions[0];
        if (animalExpressions.length > 2) {
            this.animalTwo = new MultiAnimalExpression(
                    Arrays.copyOfRange(
                            animalExpressions,
                            1,
                            animalExpressions.length
                    )
            );
        } else {
            this.animalTwo = animalExpressions[1];
        }
    }

    @Override
    public boolean interpret(String context) {
        return animalOne.interpret(context) || animalTwo.interpret(context);
    }
}
