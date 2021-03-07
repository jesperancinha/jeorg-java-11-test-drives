package org.jesperancinha.b2b2designpatterns.chainofresponsibility;

import org.jesperancinha.tests.logs.LoggerInfoTest;
import org.junit.jupiter.api.Test;

import static org.jesperancinha.b2b2designpatterns.chainofresponsibility.ArmadaAbstract.FORMATION1;
import static org.jesperancinha.b2b2designpatterns.chainofresponsibility.ArmadaAbstract.FORMATION3;
import static org.jesperancinha.b2b2designpatterns.chainofresponsibility.ArmadaAbstract.FORMATION6;

/**
 * Created by joaofilipesabinoesperancinha on 23-04-16.
 */
public class ArmadaAbstractTest extends LoggerInfoTest {
    private final ArmadaAbstract arado = new Arado(FORMATION1);
    private final ArmadaAbstract bell = new Bell(FORMATION3);
    private final ArmadaAbstract caproni = new Caproni(FORMATION6);

    public ArmadaAbstractTest() {
        super(Arado.class, Bell.class, Caproni.class);
    }

    @Test
    public void testChainOfResponsibilityFull() {
        final ArmadaAbstract armadaAbstractChain = getArmadaTestChain();
        final String ref = "all fighters!";
        armadaAbstractChain.issueFighters(FORMATION6, ref);

        assertLogOrder(
                "Fighter Arado has left the hanger with ref all fighters!",
                "Fighter Bell left the hanger with ref all fighters!",
                "Fighter Caproni has left the hanger with ref all fighters!"
        );
    }

//    @Test
//    public void testChainOfResponsibilityHalf() {
//        final ArmadaAbstract armadaAbstractChain = getArmadaTestChain();
//        final String ref = "two fighters!";
//
//        armadaAbstractChain.issueFighters(FORMATION3, ref);
//
//        assertLogOrder(
//                "Fighter Arado has left the hanger with ref two fighters!",
//                "Fighter Bell left the hanger with ref two fighters!"
//        );
//        assertNotLogged("Fighter Caproni has left the hanger with ref two fighters!");
//    }

    @Test
    public void testChainOfResponsibilityFirst() {
        final ArmadaAbstract armadaAbstractChain = getArmadaTestChain();
        final String ref = "one fighter!";
        armadaAbstractChain.issueFighters(FORMATION1, ref);

        assertLogOrder("Fighter Arado has left the hanger with ref one fighter!");
        assertNotLogged(
                "Fighter Bell left the hanger with ref one fighter!",
                "Fighter Caproni has left the hanger with ref two fighter!"
        );
    }

    private ArmadaAbstract getArmadaTestChain() {
        arado.setNextFormation(bell);
        bell.setNextFormation(caproni);
        return arado;
    }
}
