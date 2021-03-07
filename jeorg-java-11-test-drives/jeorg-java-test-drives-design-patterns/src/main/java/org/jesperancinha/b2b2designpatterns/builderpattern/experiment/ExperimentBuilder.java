package org.jesperancinha.b2b2designpatterns.builderpattern.experiment;

import org.jesperancinha.b2b2designpatterns.builderpattern.bacterias.AerosphaeraTaetra;
import org.jesperancinha.b2b2designpatterns.builderpattern.bacterias.CarnococcusAllantoicus;
import org.jesperancinha.b2b2designpatterns.builderpattern.cultures.Agar;
import org.jesperancinha.b2b2designpatterns.builderpattern.cultures.BeefBroth;

/**
 * Created by joaofilipesabinoesperancinha on 10-04-16.
 * Disclaimer: This software is not about biology.
 * This is just here for software demonstration purposes only.
 * Do NOT rely on this piece of code to make real experiments.
 */
public class ExperimentBuilder {
    public Experiment createAerosphaeraTaetraExperiment() {
        final Experiment experiment = new Experiment();
        experiment.addItem(new Agar());
        experiment.addItem(new AerosphaeraTaetra());
        return experiment;
    }

    public Experiment createCarnococcusAllantoicusExperiment() {
        final Experiment experiment = new Experiment();
        experiment.addItem(new BeefBroth());
        experiment.addItem(new CarnococcusAllantoicus());
        return experiment;
    }
}
