package org.jesperancinha.java11.mastery4dot1.concert;

import java.time.LocalDateTime;

public class Artist implements Venue {
    final String name;
    final LocalDateTime start;
    final LocalDateTime end;

    public Artist(String name, LocalDateTime start, LocalDateTime end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
