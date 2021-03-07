package org.jesperancinha.java11.mastery4dot2.styles;

public class Indie {
    private static final boolean harshVoice = false;

    private static final boolean sweetVoice = true;

    private static final boolean huskyVoice = true;

    private static final boolean digitalInstruments;

    static {
        digitalInstruments = true;
    }

    private final String name;

    private final boolean indieMusic;

    {
        indieMusic = true;
    }

    public Indie(String name) {
        // This won't work if a static member is final or effectively final
        // harshVoice = false;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Indie{" +
                "harshVoice=" + harshVoice +
                ", sweetVoice=" + sweetVoice +
                ", huskyVoice=" + huskyVoice +
                ", digitalInstruments=" + digitalInstruments +
                ", name='" + name + '\'' +
                ", indieMusic=" + indieMusic +
                '}';
    }
}
