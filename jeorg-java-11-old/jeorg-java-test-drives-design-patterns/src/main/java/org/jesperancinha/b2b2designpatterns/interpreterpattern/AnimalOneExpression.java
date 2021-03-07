package org.jesperancinha.b2b2designpatterns.interpreterpattern;

/**
 * Created by joaofilipesabinoesperancinha on 13-04-16.
 */
public class AnimalOneExpression implements AnimalMaxWeightExpression {
    private String animal;
    private Integer maxWeight;

    public AnimalOneExpression(String animal, Integer maxWeight) {
        this.animal = animal;
        this.maxWeight = maxWeight;
    }

    @Override
    public boolean interpret(String context) {
        final String[] contextItems = context.split(",");
        if (contextItems[0].equals(animal) && Integer.parseInt(contextItems[1]) <= maxWeight) {
            return true;
        }
        return false;
    }
}
