package org.jesperancinha.java11.cpf.switches;

public class SwitchesRunner {
    public static void main(String[] args) {
        switch ("Mabinogion") {
            case "Mabinogion":
                System.out.println("GOTCHA!!");
            default:
                System.out.println("You escape this time!! BONUS: Guess which number...");
        }
    }
}
