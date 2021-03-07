package org.jesperancinha.java11.mastery3dot1.items;

import java.util.Objects;

public class ShopItem {

    private final String barCode;

    private final String name;

    private final String year;

    private final String publisher;

    private final String specialEdition;

    public ShopItem(String barCode, String name, String year, String publisher, String specialEdition) {
        this.barCode = barCode;
        this.name = name;
        this.year = year;
        this.publisher = publisher;
        this.specialEdition = specialEdition;
    }

    public boolean equals(ShopItem o) {
        if (this == o) return true;
        if (!(o instanceof ShopItem)) return false;
        ShopItem shopItem = o;
        return Objects.equals(name, shopItem.name) &&
                Objects.equals(year, shopItem.year) &&
                Objects.equals(publisher, shopItem.publisher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShopItem)) return false;
        ShopItem shopItem = (ShopItem) o;
        return Objects.equals(name, shopItem.name) &&
                Objects.equals(year, shopItem.year) &&
                Objects.equals(specialEdition, shopItem.specialEdition) &&
                Objects.equals(publisher, shopItem.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, publisher);
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "barCode='" + barCode + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", publisher='" + publisher + '\'' +
                ", specialEdition='" + specialEdition + '\'' +
                '}';
    }
}
