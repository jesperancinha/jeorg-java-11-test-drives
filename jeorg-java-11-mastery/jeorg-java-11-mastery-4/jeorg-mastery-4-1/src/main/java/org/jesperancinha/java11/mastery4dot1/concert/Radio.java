package org.jesperancinha.java11.mastery4dot1.concert;

import java.util.List;

public class Radio {

    private List<String> artists;

    public Radio(List<String> artists) {

        this.artists = artists;
    }

    public String getRandomArtist() {
        return artists.get((int) (Math.random() * artists.size()));
    }
}
