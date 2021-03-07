package org.jesperancinha.java11.crums.crum8;

interface A {
    int getTheSheeps();

    private boolean theSheepsAreAlright() {
        return true;
    }

    default int countSheeps() {
        return theSheepsAreAlright() ?
                200 :
                100;
    }
}
