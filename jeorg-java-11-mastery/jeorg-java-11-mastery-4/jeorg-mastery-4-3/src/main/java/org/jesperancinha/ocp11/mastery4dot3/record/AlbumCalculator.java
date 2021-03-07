package org.jesperancinha.java11.mastery4dot3.record;

import java.util.Map;
import java.util.stream.Collectors;

public class AlbumCalculator extends Calculator {

    // 'getAverageByte()' in 'org.jesperancinha.java11.mastery4dot3.record.AlbumCalculator'
    // clashes with 'getAverageByte()'
    // in 'org.jesperancinha.java11.mastery4dot3.record.Calculator';
    // attempting to use incompatible return type
    // @Override
    // public int getAverageByte() {
    //    return 0;
    // }

    private final Map<String, Integer> songsPerAlbum;

    public AlbumCalculator(Map<String, Integer> songsPerAlbum) {
        this.songsPerAlbum = songsPerAlbum;
    }

    @Override
    public byte getAverageByte() {
        return (byte) songsPerAlbum.values().stream().mapToInt(i -> i).average().orElse(0);
    }

    @Override
    public short getAverageShort() {
        return songsPerAlbum.values().stream().collect(Collectors.averagingInt(i -> i)).shortValue();
    }

    @Override
    public char getAverageCharacter() {
        return (char) songsPerAlbum.values().stream().collect(Collectors.averagingInt(i -> i)).shortValue();
    }

    @Override
    public int getAverageInt() {
        return songsPerAlbum.values().stream().collect(Collectors.averagingInt(i -> i)).intValue();
    }

    @Override
    public long getAverageLong() {
        return songsPerAlbum.values().stream().mapToInt(i -> i).sum() / songsPerAlbum.size();
    }

    @Override
    public float getAverageFloat() {
        return songsPerAlbum.values().stream().collect(Collectors.averagingDouble(i -> i)).floatValue();

    }

    @Override
    public double getAverageDouble() {
        return songsPerAlbum.values().stream().collect(Collectors.averagingDouble(i -> i));
    }

    @Override
    public String toString() {
        return "AlbumCalculator{" + "songsPerAlbum=" + songsPerAlbum + '}';
    }
}
