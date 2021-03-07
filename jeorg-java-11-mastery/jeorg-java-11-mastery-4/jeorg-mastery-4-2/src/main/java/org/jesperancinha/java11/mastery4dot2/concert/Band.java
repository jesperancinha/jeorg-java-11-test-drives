package org.jesperancinha.java11.mastery4dot2.concert;

import java.util.ArrayList;
import java.util.List;

/**
 * Please not the {@link Band} is not a final class!
 */
public class Band {

    public int capacity = 4;

    private List<String> members;
    private String bandName;

    public Band(final List<String> members, final String bandName) {
        this.bandName = bandName;
        this.members = new ArrayList<>(capacity);
        this.members.addAll(members);
    }

    Band(final int capacity, final List<String> members, String bandName) {
        this.members = new ArrayList<>(capacity);
        this.bandName = bandName;
        this.members.addAll(members);
    }

    public List<String> getMembers() {
        return members;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Band{" +
                "capacity=" + capacity +
                ", members=" + members +
                ", bandName='" + bandName + '\'' +
                '}';
    }

    public String getBandName() {
        return bandName;
    }
}
