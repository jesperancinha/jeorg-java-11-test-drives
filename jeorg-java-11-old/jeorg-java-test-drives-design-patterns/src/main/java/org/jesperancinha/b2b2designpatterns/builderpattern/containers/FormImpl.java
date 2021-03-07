package org.jesperancinha.b2b2designpatterns.builderpattern.containers;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public abstract class FormImpl implements Form {
    protected Integer density;

    public FormImpl(Integer density) {
        this.density = density;
    }

    @Override
    public Integer getDensity() {
        return null;
    }
}
