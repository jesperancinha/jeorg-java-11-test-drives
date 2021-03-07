package org.jesperancinha.java11.crums.crum28;

public class Stone implements Comparable<Stone> {

    final String name;

    final Integer number;

    public Stone(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public int compareTo(Stone o) {
        if (number.equals(o.number)) {
            return name.compareTo(o.name);
        }
        return number.compareTo(o.number);
    }

    @Override
    public String toString() {
        return "Stone{" + "name='" + name + '\'' + ", number=" + number + '}';
    }
}
