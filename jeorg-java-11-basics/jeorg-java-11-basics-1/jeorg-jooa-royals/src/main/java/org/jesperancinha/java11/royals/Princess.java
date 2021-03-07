package org.jesperancinha.java11.royals;

import org.jesperancinha.java11.people.People;

public class Princess extends People {
    protected void waveToPublic() {
        System.out.println("The princess waves to the public");
    }

    private void makeFurniture() {
        System.out.println("Princesses don't make furniture on demand. You have to call another method");
    }

    public void doWhateverPrincessesDo() {
        System.out.println("I do princess things");
        System.out.println("Now I make furniture");
        makeFurniture();

    }

}
