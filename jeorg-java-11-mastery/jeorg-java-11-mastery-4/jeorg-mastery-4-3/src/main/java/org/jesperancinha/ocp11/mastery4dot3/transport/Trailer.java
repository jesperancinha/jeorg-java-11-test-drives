package org.jesperancinha.java11.mastery4dot3.transport;

public abstract class Trailer extends FourWheels {

    private final String band;

    Trailer(String band) {
        this.band = band;
    }

    public String getBand() {
        return band;
    }

    @Override
    public String toString() {
        return "Trailer{" + "band='" + band + '\'' + '}';
    }
}
