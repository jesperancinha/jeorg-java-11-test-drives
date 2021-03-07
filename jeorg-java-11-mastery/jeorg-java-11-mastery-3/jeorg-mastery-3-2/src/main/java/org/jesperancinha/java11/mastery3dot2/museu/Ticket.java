package org.jesperancinha.java11.mastery3dot2.museu;

import java.util.UUID;

public class Ticket {

    private UUID tickerNumber = UUID.randomUUID();

    private final String name;

    public Ticket(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "tickerNumber=" + tickerNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
