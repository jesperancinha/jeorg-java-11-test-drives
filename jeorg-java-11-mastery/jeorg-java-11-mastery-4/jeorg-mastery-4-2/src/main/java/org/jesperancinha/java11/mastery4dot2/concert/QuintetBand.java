package org.jesperancinha.java11.mastery4dot2.concert;

import java.util.List;

public class QuintetBand extends Band {

    private int capacity;

    public QuintetBand(List<String> members, String bandName) {
        super(5, members, bandName);
        this.capacity = 5;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public List<String> getMembers() {
        return super.getMembers();
    }

    @Override
    public String toString() {
        return "QuintetBand{" +
                "capacity=" + capacity +
                '}' + super.toString();
    }
}
