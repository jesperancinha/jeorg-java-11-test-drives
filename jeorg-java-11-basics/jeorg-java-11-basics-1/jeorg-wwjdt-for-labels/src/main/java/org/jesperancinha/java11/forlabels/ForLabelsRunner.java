package org.jesperancinha.java11.forlabels;

public class ForLabelsRunner {
    public static void main(String[] args) {
        MAIN:
        for (int i = 0; i < 10; i++) {
            DISCHARD:
            for (int j = 0; j < 20; j++) {
                if (j == 12) {
                    if (i % 2 == 0) {
                        System.out.println("17");
                    }
                    break DISCHARD;
                } else {
                    continue;
                }
            }
            System.out.println("12 Found!");
            if (i == 5) {
                break MAIN;
            }
        }
    }
}
