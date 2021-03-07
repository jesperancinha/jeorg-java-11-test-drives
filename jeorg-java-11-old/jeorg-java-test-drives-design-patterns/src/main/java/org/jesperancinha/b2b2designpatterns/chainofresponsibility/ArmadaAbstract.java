package org.jesperancinha.b2b2designpatterns.chainofresponsibility;

/**
 * Created by joaofilipesabinoesperancinha on 23-04-16.
 */
public abstract class ArmadaAbstract {
    public static int FORMATION1 = 0;
    public static int FORMATION3 = 1;
    public static int FORMATION6 = 2;

    int chainLevel;

    ArmadaAbstract nextFormation;

    void setNextFormation(ArmadaAbstract nextFormation) {
        this.nextFormation = nextFormation;
    }

    public void issueFighters(int issuedLevel, String ref) {
        if (this.chainLevel <= issuedLevel) {
            makeFightersExitHanger(ref);
        }
        if (nextFormation != null) {
            nextFormation.issueFighters(issuedLevel, ref);
        }
    }

    abstract void makeFightersExitHanger(String ref);
}
