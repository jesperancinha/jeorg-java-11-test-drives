package org.jesperancinha.java11.mastery4dot2.concert;

import java.util.List;

public class GenericBand extends Band {

    private int capacity;

    public GenericBand(final int capacity, final List<String> members, final String bandName) {
        super(capacity, members, bandName);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public List<String> getMembers() {
        return super.getMembers();
    }

    @Override
    public String toString() {
        return "GenericBand{" +
                "capacity=" + capacity +
                '}' + super.toString();
    }
}
