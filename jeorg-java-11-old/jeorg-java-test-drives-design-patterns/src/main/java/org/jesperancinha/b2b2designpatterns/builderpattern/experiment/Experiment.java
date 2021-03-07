package org.jesperancinha.b2b2designpatterns.builderpattern.experiment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class Experiment {
    final List<Item> items;

    public Experiment() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
