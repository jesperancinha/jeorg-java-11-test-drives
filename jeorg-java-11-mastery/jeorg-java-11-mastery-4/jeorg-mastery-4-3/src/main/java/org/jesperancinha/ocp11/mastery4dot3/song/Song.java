package org.jesperancinha.java11.mastery4dot3.song;

import java.time.LocalDate;

public final class Song {

    private final String song;
    private final String band;
    private final LocalDate hitLocalDate;

    public Song(String song, String band, LocalDate hitLocalDate) {
        this.song = song;
        this.band = band;
        this.hitLocalDate = hitLocalDate;
    }

    public final String getSong() {
        return song;
    }

    public final String getBand() {
        return band;
    }

    public final LocalDate getHitLocalDate() {
        return hitLocalDate;
    }
}
