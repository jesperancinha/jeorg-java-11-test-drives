package org.jesperancinha.b2b2designpatterns.chainofresponsibility;

import java.text.MessageFormat;
import java.util.logging.Logger;

/**
 * Created by joaofilipesabinoesperancinha on 23-04-16.
 */
public class Bell extends ArmadaAbstract {
    final static Logger logger = Logger.getLogger(Arado.class.getName());

    public Bell(int chainLevel) {
        this.chainLevel = chainLevel;
    }

    @Override
    void makeFightersExitHanger(String ref) {
        logger.info(MessageFormat.format("Fighter Bell left the hanger with ref {0}", ref));
    }
}
