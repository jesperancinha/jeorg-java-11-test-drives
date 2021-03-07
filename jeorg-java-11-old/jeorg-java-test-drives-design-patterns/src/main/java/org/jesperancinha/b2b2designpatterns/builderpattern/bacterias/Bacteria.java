package org.jesperancinha.b2b2designpatterns.builderpattern.bacterias;

import org.jesperancinha.b2b2designpatterns.builderpattern.containers.GelBlocks;
import org.jesperancinha.b2b2designpatterns.builderpattern.experiment.Item;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public abstract class Bacteria implements Item {
    private final GelBlocks form;

    public Bacteria() {
        this.form = new GelBlocks();
    }

    public GelBlocks getForm() {
        return form;
    }
}
