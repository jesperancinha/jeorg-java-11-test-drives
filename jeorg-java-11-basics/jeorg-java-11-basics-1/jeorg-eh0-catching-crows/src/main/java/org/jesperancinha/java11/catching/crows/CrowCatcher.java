package org.jesperancinha.java11.catching.crows;

import java.io.Closeable;
import java.util.Random;

public class CrowCatcher implements Closeable {
    private final Random random = new Random();

    @Override
    public void close() {
        System.out.println("Turning catcher off...");
    }

    public void catchCrow() throws CrowException {
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
