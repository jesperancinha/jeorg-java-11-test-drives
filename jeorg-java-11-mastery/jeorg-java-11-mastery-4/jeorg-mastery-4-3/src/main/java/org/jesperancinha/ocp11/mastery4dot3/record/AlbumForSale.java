package org.jesperancinha.java11.mastery4dot3.record;

public class AlbumForSale {
    final String name;
    final Long yearOfPurchase;

    public AlbumForSale(String name, Long yearOfPurchase) {
        this.name = name;
        this.yearOfPurchase = yearOfPurchase;
    }

    public String getName() {
        return name;
    }

    public Long getYearOfPurchase() {
        return yearOfPurchase;
    }

    @Override
    public String toString() {
        return "AlbumForSale{" + "name='" + name + '\'' + ", yearOfPurchase=" + yearOfPurchase + '}';
    }
}
