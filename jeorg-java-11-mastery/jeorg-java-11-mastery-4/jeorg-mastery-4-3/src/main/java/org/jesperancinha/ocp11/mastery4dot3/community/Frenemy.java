package org.jesperancinha.java11.mastery4dot3.community;

import org.jesperancinha.java11.mastery4dot3.record.Album;

import java.util.Arrays;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;

public class Frenemy {
    private final String name;

    public Frenemy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void lendAlbum(Album album) {
        BLUE.printGenericLn("Thanks for the album!");
        BLUE.printGenericLn(album);
        scratchAlbum(album);
    }

    private void scratchAlbum(Album album) {
        album.getSongs().forEach(song -> Arrays.fill(song, (byte) 0));
    }

    @Override
    public String toString() {
        return "Frenemy{" + "name='" + name + '\'' + '}';
    }
}
