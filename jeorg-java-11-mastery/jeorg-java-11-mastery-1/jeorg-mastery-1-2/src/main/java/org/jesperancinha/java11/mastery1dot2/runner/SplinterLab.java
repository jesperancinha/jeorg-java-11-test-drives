package org.jesperancinha.java11.mastery1dot2.runner;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;

public class SplinterLab extends Lab {

    // 5. Return type in overriden methods
    @Override
    MutantTurtle doExperiment() throws InterruptedException {
        GREEN.printGeneric("We are creating a mutant!");
        return new MutantTurtle();
    }

    public class SecretLab extends SplinterLab {
        public SplinterLab getLab() throws InterruptedException {
            GREEN.printGeneric("This lab is your lab so you are calling your own lab! \n");
            return this;
        }
    }

    public class Erlenmeyer extends Glass {

    }

    private class Glass extends Shape {

    }
}
