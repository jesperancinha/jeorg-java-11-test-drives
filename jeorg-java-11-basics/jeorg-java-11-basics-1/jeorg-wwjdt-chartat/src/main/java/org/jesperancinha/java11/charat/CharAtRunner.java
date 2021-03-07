package org.jesperancinha.java11.charat;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class CharAtRunner {
    public static void main(String[] args) {
        var testString = "No more I love you's\n" +
                "The language is leaving me";

        System.out.println("**** The language is leaving me");
        var firstCharacter = testString.charAt(0);
        var firstCharacterWithChar = testString.charAt('\u0000');
        var firstCharacter32 = testString.charAt(32);
        var firstCharacterWithChar32 = testString.charAt(' ');
        var firstCharacter46 = testString.charAt(46);
        var firstCharacterWithChar46 = testString.charAt('.');

        try {
            testString.charAt(100000);
        } catch (final Exception e) {
            RED.printThrowableAndExit(e);
            System.out.printf("**** Character is off the string. Exception: %s\n", e.getMessage());
            System.out.printf("**** Exception type: %s\n", e.getClass());
        }

        try {
            testString.charAt(testString.length());
        } catch (final Exception e) {
            RED.printThrowableAndExit(e);
            System.out.printf("**** Character is off the string. Exception: %s\n", e.getMessage());
            System.out.printf("**** Exception type: %s\n", e.getClass());
        }

        System.out.printf("---- First character using int is %s and the first character using char is %s\n", firstCharacter, firstCharacterWithChar);
        System.out.printf("---- 32nd character using int is %s and the 32nd character using char is %s\n", firstCharacter32, firstCharacterWithChar32);
        System.out.printf("---- 46nd character using int is %s and the 46nd character using char is %s\n", firstCharacter46, firstCharacterWithChar46);
    }
}
