package org.jesperancinha.java11.mastery4dot1.concert;

@Deprecated
public class DeprecatedArtist implements Venue {

    private String name;

    @Deprecated
    public DeprecatedArtist(String name) {
        this.name = name;
    }

    @Deprecated
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DeprecatedArtist{" +
                "name='" + name + '\'' +
                '}';
    }
}
