package org.jesperancinha.java11.crums.crum10;

public enum DocesPortugueses {

    FAROFIAS(12.4),
    DOMRODRIGO(2234.0) {
        @Override
        String getDescription() {
            return "We don't know anything about Dom Rodrigo";
        }
    };

    private final String designation;
    private Double d;

    DocesPortugueses(Double d) {

        this.d = d;
        this.designation = DOCES + " " + d;
    }

    String getDescription() {
        return designation + " costs " + d;
    }

    static final String DOCES = "Doces Portugueses";
}
