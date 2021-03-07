package org.jesperancinha.java11.tron;

import java.util.Objects;
import java.util.ServiceLoader;

public class TronRunner {
    public static void main(String[] args) throws InterruptedException {
        var serviceLoader = ServiceLoader.load(TronService.class);
        var first = serviceLoader.findFirst().orElse(null);
        Objects.requireNonNull(first).importSubjectIntoVirtualWorld();
    }
}
