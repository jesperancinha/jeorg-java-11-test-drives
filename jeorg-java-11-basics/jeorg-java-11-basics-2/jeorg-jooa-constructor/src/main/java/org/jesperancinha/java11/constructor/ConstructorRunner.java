package org.jesperancinha.java11.constructor;

public class ConstructorRunner {
    public static void main(String[] args) {
        var popBand = new PopBand("manic monday!!!", "The Bangles");
        var rockBand = new RockBand("Starships");

        System.out.printf("%s  - activity=%s, name=%s\n", popBand, popBand.getActivity(), popBand.getName());
        System.out.printf("%s  - activity=%s, name=%s\n", rockBand, rockBand.getActivity(), rockBand.getName());
    }
}
