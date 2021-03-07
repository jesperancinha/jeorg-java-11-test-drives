package org.jesperancinha.java11.mastery4dot1.society;

public class TheGreatSocietyAdapter<Q> {

    public <T, P> Q printSocietyAdapterMethod(T t, P p) {
        if (t instanceof Number && p instanceof Number) {
            return (Q) (Double) (((Number) t).doubleValue() + ((Number) p).doubleValue());
        }
        return (Q) ("This is a message from the GSA->" + t.toString() + p.toString());
    }
}
