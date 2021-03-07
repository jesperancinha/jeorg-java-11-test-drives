package org.jesperancinha.java11.crums.crum31;

public class Sandwich {
    private final Integer id;

    private final String name;

    public Sandwich(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sandwich{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
