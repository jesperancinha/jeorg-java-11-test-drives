package org.jesperancinha.java11.mastery2dot2;

import java.io.Serializable;

@Rocket
public class MissionData implements Serializable {

    public static final long serialVersionUID = 1;

    public String mission;
    public String destination;
    public String origin;

    @Override
    public String toString() {
        return "MissionData{" +
                "mission='" + mission + '\'' +
                ", destination='" + destination + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
