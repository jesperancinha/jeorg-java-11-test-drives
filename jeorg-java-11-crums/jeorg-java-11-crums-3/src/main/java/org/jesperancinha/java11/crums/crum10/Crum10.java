package org.jesperancinha.java11.crums.crum10;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum10 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 10 - ClassNotFoundException and NotSuchFieldException");

        try {
            calculateExceptions();
        } catch (NoSuchFieldException e) {
            RED.printGenericLn("This is expected! NoSuchFieldException is a checked exception that needs to be in throws -> %s", e);
        }
        try {
            calculateException2();
        } catch (ClassNotFoundException e) {
            RED.printGenericLn("This is expected! ClassNotFoundException is a checked exception that needs to be in throws -> %s", e);
        }
        try {
            calculateException3();
        } catch (Exception e) {
            RED.printGenericLn("This is expected! Exception is a checked exception that needs to be in throws -> %s", e);
        }

        GREEN.printGenericLn("It is important to know that subclasses of ReflectiveOperationException are also checked exceptions");
        GREEN.printGenericLn("If they are thrown, they need to be catch or the method needs to have throws.");

    }

    private static void calculateException3() throws Exception {
        throw new Exception();
    }

    private static void calculateException2() throws ClassNotFoundException {
        throw new ClassNotFoundException();
    }

    private static void calculateExceptions() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
}
