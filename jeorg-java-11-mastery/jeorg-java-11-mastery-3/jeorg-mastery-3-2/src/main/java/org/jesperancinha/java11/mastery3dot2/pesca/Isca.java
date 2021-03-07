package org.jesperancinha.java11.mastery3dot2.pesca;

import java.util.UUID;

public class Isca implements Comparable<Isca>, Catch {

    public final String commonName;

    public final double size;

    private final UUID uuid = UUID.randomUUID();

    public CrateSize crateSize = null;

    public Isca(String commonName, double size) {
        this.commonName = commonName;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Isca{" +
                "commonName='" + commonName + '\'' +
                ", size=" + size +
                ", uuid=" + uuid +
                ", crateSize=" + crateSize +
                '}';
    }

    @Override
    public int compareTo(Isca o) {
        if (this.commonName.equals(o.commonName)) {
            return (int) (this.size - o.size);
        }
        return this.commonName.compareTo(o.commonName);
    }

    @Override
    public String getCommonName() {
        return commonName;
    }

    @Override
    public double getSize() {
        return size;
    }
}
