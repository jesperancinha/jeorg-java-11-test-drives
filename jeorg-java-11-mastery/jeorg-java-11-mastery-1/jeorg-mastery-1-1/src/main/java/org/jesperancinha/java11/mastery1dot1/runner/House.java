package org.jesperancinha.java11.mastery1dot1.runner;

public class House implements Habitat {

    // 12. Default initializations are 0 for primitive numeric values and null for Java Objects.s
    int rocks;
    float price;
    Protagonist houseBoss;

    public void testInitialization() {
        // 16. Only local variables need be initialized
        // Variable 'rocksSuggested' might not have been initialized
        int rocksSuggested = 140000;
        System.out.println("%%%%%%%%% Welcome to you new rock house! %%%%%%%%%");
        System.out.printf("%%%%%% Your house has been initialized to %d rocks %%%%%%\n", rocks);
        System.out.printf("%%%%%% Your house has been initialized to cost %f pebbles %%%%%%\n", price);
        System.out.printf("%%%%%% The current boss of the house is %s  %%%%%%\n", houseBoss);

        System.out.printf("%%%%%% It is suggested that you build your house with %d rocks %%%%%%\n", rocksSuggested);
    }
}
