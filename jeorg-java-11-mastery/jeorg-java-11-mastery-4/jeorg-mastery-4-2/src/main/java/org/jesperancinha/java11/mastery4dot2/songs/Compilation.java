package org.jesperancinha.java11.mastery4dot2.songs;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class Compilation {
    private List<String> songs = new CopyOnWriteArrayList<>();

    public final void addSong(final String song) {
        songs.add(song);
    }

    public final Iterator<String> iterator() {
        return songs.iterator();
    }

}
