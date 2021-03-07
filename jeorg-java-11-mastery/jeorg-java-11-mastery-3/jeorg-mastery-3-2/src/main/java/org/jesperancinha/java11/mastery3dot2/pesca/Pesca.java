package org.jesperancinha.java11.mastery3dot2.pesca;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Pesca implements Serializable {

    private final List<Peixe> peixes;

    private final Peixe[] peixeArray;

    private transient final List<Isca> peixesHidden;

    private transient final Isca[] peixeArrayHidden;

    public Pesca(List<Peixe> peixes, Peixe[] peixeArray) {
        this.peixes = peixes;
        this.peixeArray = peixeArray;
        this.peixesHidden = List.of(new Isca("Sardinha", 45.0));
        this.peixeArrayHidden = new Isca[]{new Isca("Sardinha", 45.0)};
        // This doesn't work. The left side cannot infer the collection type being created.
        // this.peixeArrayHidden = {new Isca("Sardinha", 45.0)};
    }

    @Override
    public String toString() {
        return "Pesca{" +
                "peixes=" + peixes +
                ", peixeArray=" + Arrays.toString(peixeArray) +
                ", peixesHidden=" + peixesHidden +
                ", peixeArrayHidden=" + Arrays.toString(peixeArrayHidden) +
                '}';
    }
}
