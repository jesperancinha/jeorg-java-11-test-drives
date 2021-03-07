package org.jesperancinha.java11.crums.crum33;

public enum CashContainer {
    KITTENACCOUNT,
    PANTHERACCOUNT,
    ELEPHANTACCOUNT,
    GIRAFFEACCOUNT,
    PUPPIEACCOUNT,
    LIONACCOUNT;

    public CashContainer tryToClone() throws CloneNotSupportedException {
        return (CashContainer) clone();
    }
}
