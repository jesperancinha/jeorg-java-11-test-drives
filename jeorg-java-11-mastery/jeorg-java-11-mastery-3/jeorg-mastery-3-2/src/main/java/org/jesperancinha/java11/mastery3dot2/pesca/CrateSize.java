package org.jesperancinha.java11.mastery3dot2.pesca;

public enum CrateSize {
    TYPE1(0, 10),
    TYPE2(10, 20),
    TYPE3(20, 30);
    private int min;
    private int max;

    CrateSize(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
