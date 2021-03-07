package org.jesperancinha.java11.crums.crum8;

import java.util.Arrays;
import java.util.List;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum8 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 8 - Keywords and Values");
        final List<String> keywords = Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default",
                "goto", "package", "synchronized", "boolean", "do", "if", "private", "this", "break", "double",
                "implements", "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum",
                "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final",
                "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const", "float",
                "native", "super", "while");
        MAGENTA.printGenericLn("You can find all Java keywords on the oracle website:");
        MAGENTA.printGenericLn("https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html");
        int i = 0;
        int a = 0;
        OHNO:
        for (int j = 0; j < 100; j++) {
            a++;
            BOOP:
            for (int k = 0; k < 100; k++) {
                if (k == 0) {
                    a++;
                    break BOOP;
                    // Unreachable statement
                    // a++;
                }
                break OHNO;
            }
        }
        YELLOW.printGenericLn("A should be 200 ->  %s", a);
        LINE:
        if (i < 2) {
            MAGENTA.printGenericLn("These are all the keywords:");
            MAGENTA.printGenericLn(keywords);
            i++;
            break LINE;
        }

    }
}
