package org.jesperancinha.java11.mastery3dot1.tickets;

import java.util.Date;

public class PrivateTicket {

    private final Date date;

    private final String concert;

    private final String artist;

    private PrivateTicket(Date date, String concert, String artist) {
        this.date = (Date) date.clone();
        this.concert = concert;
        this.artist = artist;
    }

    public static PrivateTicket createTicket(Date date, String concert, String artist) {
        return new PrivateTicket(date, concert, artist);
    }

    public Date getDate() {
        return (Date) this.date.clone();
    }

    @Override
    public String toString() {
        return "PrivateTicket{" +
                "date=" + date +
                ", concert='" + concert + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
