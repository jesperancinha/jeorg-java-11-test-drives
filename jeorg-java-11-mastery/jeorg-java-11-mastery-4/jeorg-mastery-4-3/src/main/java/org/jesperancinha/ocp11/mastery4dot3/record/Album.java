package org.jesperancinha.java11.mastery4dot3.record;

import java.nio.charset.Charset;
import java.util.List;
import java.util.stream.Collectors;

public final class Album {
    private final String albumName;

    private final String band;

    private final List<byte[]> songs;

    public Album(String albumName, String band, List<byte[]> songs) {
        this.albumName = albumName;
        this.band = band;
        this.songs = songs;
    }

    public final String getAlbumName() {
        return albumName;
    }

    public final String getBand() {
        return band;
    }

    public final List<byte[]> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        final String songsToString = songs.stream()
                .map(song -> new String(song, Charset.defaultCharset()))
                .collect(Collectors.joining(", "));
        return "Album{" + "albumName='" + albumName + '\'' + ", band='" + band + '\'' + ", songs=" + songsToString
                + '}';
    }

    public final Album copy() {
        return new Album(albumName, band, songs.stream()
                .map(byte[]::clone)
                .collect(Collectors.toList()));
    }
}
