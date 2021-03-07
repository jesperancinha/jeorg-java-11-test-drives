package org.jesperancinha.java11.constructor;

public class GroupBand extends Band {
    protected String name;

    public String getName() {
        return name;
    }

    public String getActivity() {
        return activity;
    }

    @Override
    public String toString() {
        return "GroupBand{" +
                "name='" + name + '\'' +
                ", activity='" + activity + '\'' +
                '}';
    }
}
