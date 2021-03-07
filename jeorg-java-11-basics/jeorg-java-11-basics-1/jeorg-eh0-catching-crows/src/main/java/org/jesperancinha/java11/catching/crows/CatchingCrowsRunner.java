package org.jesperancinha.java11.catching.crows;

import java.util.Random;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class CatchingCrowsRunner {

    private static final Random random = new Random();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                catchCrow();
            } catch (SuperSickCrowExcetion e) {
                System.out.println("Super Sick crow found!");
                RED.printThrowableAndExit(e);
            } catch (SickCrowException e) {
                System.out.println("Sick crow found!");
                RED.printThrowableAndExit(e);
            } catch (CrowException e) {
                RED.printThrowableAndExit(e);
            }
        }

        System.out.println("Let's use our favourite crow catcher!");

        try (var crowCatcher = new CrowCatcher()) {
            try {
                crowCatcher.catchCrow();
            } catch (CrowException e) {
                System.out.println("We have found something. Notice that close is next!");
                RED.printThrowableAndExit(e);
            }
        }
    }

    public static void catchCrow() throws CrowException {
        final int i = random.nextInt(3);
        switch (i) {
            case 0:
                throw new CrowException();
            case 1:
                throw new SickCrowException();
            default:
                throw new SuperSickCrowExcetion();
        }

    }
}
