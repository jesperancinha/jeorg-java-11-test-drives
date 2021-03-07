package org.jesperancinha.java11.mastery3dot1.tickets;

import java.util.Date;

public final class FinalTicket {
    private final Date date;

    private final String concert;

    private final String artist;

    public FinalTicket(Date date, String concert, String artist) {
        this.date = (Date) date.clone();
        this.concert = concert;
        this.artist = artist;
    }

    public Date getDate() {
        return (Date) this.date.clone();
    }

    @Override
    public String toString() {
        return "FinalTicket{" +
                "date=" + date +
                ", concert='" + concert + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
