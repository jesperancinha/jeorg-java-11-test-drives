package org.jesperancinha.java11.mastery3dot2.festival;

import java.time.LocalDate;

public class Artist {
    private final String name;
    private final LocalDate localDate;

    public Artist(String name, LocalDate localDate) {
        this.name = name;
        this.localDate = localDate;
    }

    public static int compare(Artist artist, Artist artist1) {
        return artist.localDate.compareTo(artist1.localDate);
    }
}
