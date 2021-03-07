package org.jesperancinha.java11.crums.crum30;

import java.util.Arrays;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum30 {

    @Deprecated
    @FunctionalInterface()
    private interface Table {

        void test(String... a);

    }

    public class BigTable implements Table {

        @Override
        @SafeVarargs
        public final void test(String... a) {

        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 30 - RUNTIME annotations");

        Arrays.stream(Table.class.getAnnotations())
                .forEach(annotation -> MAGENTA.printGenericLn(annotation));

        try {
            Arrays.stream(BigTable.class.getMethod("test", String[].class)
                    .getAnnotations())
                    .forEach(annotation -> MAGENTA.printGenericLn(annotation));
        } catch (NoSuchMethodException e) {
            RED.printThrowableAndExit(e);
        }

        GREEN.printGenericLn("Important to know is that SafeVarags, Deprecated and FunctionalInterface are all RUNTIME annotations");
        GREEN.printGenericLn("This means that we can find them during runtime.");
    }
}
