package org.jesperancinha.java11.mastery3dot1.tickets;

import java.util.Date;

public class UnsafeTicket {
    private final Date date;

    private final String concert;

    private final String artist;

    public UnsafeTicket(Date date, String concert, String artist) {
        this.date = date;
        this.concert = concert;
        this.artist = artist;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "UnsafeTicket{" +
                "date=" + date +
                ", concert='" + concert + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
