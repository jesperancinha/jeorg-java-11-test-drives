package org.jesperancinha.java11.mastery4dot2.concert;

import org.h2.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.stream.Collectors;

public class Ticket {

    private static final Collection<Ticket> allTickets = new ConcurrentLinkedDeque<>();

    private final String bandName;

    private final String venue;

    private final String ticketNumber;

    private final LocalDateTime localDateTime;

    public Ticket(String bandName, String venue, String ticketNumber, LocalDateTime localDateTime) {
        this.bandName = bandName;
        this.venue = venue;
        this.ticketNumber = ticketNumber;
        this.localDateTime = localDateTime;
        allTickets.add(this);
    }

    public Ticket(String bandName, String venue, Long ticketNumber, LocalDateTime localDateTime) {
        this.bandName = bandName;
        this.venue = venue;
        this.ticketNumber = ticketNumber.toString();
        this.localDateTime = localDateTime;
        allTickets.add(this);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "venue='" + venue + '\'' +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }

    public static Ticket unregisterTicket(final String numberOfTicket) {
        var ticket1 = getTicket(numberOfTicket);
        allTickets.remove(ticket1);
        return ticket1;
    }

    public static Ticket getTicket(String numberOfTicket) {
        return allTickets.stream().filter(ticket -> ticket.ticketNumber.equals(numberOfTicket)).findAny().orElse(null);
    }

    public static Ticket unregisterTicket(final Long ticketNumber) {
        var ticket1 = getTicket(ticketNumber.toString());
        allTickets.remove(ticket1);
        return ticket1;
    }

    public static List<String> getTicketsStringNumbers(final String bandName) {
        return allTickets.stream()
                .filter(ticket -> ticket.bandName.equals(bandName))
                .map(ticket -> ticket.ticketNumber)
                .collect(Collectors.toUnmodifiableList());
    }

    /**
     * We are using h2 library to check isNumber
     * Lots of libraries also implement some for of isNumber Library
     *
     * @param bandName
     * @return
     */
    public static List<Long> getTicketsLongNumbers(final String bandName) {
        return allTickets.stream()
                .filter(ticket -> ticket.bandName.equals(bandName) && StringUtils.isNumber(ticket.ticketNumber))
                .map(ticket -> Long.parseLong(ticket.ticketNumber))
                .collect(Collectors.toUnmodifiableList());
    }

    public String getBandName() {
        return bandName;
    }

    public String getVenue() {
        return venue;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }
}
