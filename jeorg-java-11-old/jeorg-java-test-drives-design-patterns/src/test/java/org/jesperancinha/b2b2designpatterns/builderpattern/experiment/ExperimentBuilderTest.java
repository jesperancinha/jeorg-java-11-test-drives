package org.jesperancinha.b2b2designpatterns.builderpattern.experiment;

import org.jesperancinha.b2b2designpatterns.builderpattern.bacterias.AerosphaeraTaetra;
import org.jesperancinha.b2b2designpatterns.builderpattern.bacterias.CarnococcusAllantoicus;
import org.jesperancinha.b2b2designpatterns.builderpattern.containers.GelBlocks;
import org.jesperancinha.b2b2designpatterns.builderpattern.cultures.Agar;
import org.jesperancinha.b2b2designpatterns.builderpattern.cultures.BeefBroth;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 */
public class ExperimentBuilderTest {
    @Test
    public void createAerosphaeraTaetraExperiment() {
        final ExperimentBuilder experimentBuilder = new ExperimentBuilder();

        final Experiment experiment = experimentBuilder.createAerosphaeraTaetraExperiment();
        final List<Item> allItems = experiment.getItems();
        final Item item1 = allItems.get(0);
        final Item item2 = allItems.get(1);

        assertThat(allItems.size()).isEqualTo(2);
        assertThat(item1 instanceof Agar).isTrue();
        assertThat(item2 instanceof AerosphaeraTaetra).isTrue();
        assertThat(((AerosphaeraTaetra) item2).getForm() instanceof GelBlocks).isTrue();
    }

    @Test
    public void createCarnococcusAllantoicusExperiment() {
        final ExperimentBuilder experimentBuilder = new ExperimentBuilder();

        final Experiment experiment = experimentBuilder.createCarnococcusAllantoicusExperiment();
        final List<Item> allItems = experiment.getItems();
        final Item item1 = allItems.get(0);
        final Item item2 = allItems.get(1);

        assertThat(allItems.size()).isEqualTo(2);
        assertThat(item1 instanceof BeefBroth).isTrue();
        assertThat(item2 instanceof CarnococcusAllantoicus).isTrue();
        assertThat(((CarnococcusAllantoicus) item2).getForm() instanceof GelBlocks).isTrue();
    }

}