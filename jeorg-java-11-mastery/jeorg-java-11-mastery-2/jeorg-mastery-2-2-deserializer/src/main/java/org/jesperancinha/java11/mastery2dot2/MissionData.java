package org.jesperancinha.java11.mastery2dot2;

import java.io.Serializable;

public class MissionData implements Serializable {

    public static final long serialVersionUID = 1;

    public float cost = 283;
    public String mission;
    public int year = 1970;
    public int month = 4;
    public int day = 11;
    public String destination;
    public String origin;

    @Override
    public String toString() {
        return "MissionCompleteData{" +
                "cost=" + cost +
                ", mission='" + mission + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", destination='" + destination + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
