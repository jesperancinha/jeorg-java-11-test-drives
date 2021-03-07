package org.jesperancinha.java11.operators2;

import java.util.IllegalFormatConversionException;

/**
 * Integral types are:
 * int, char, short, byte, long
 * Think of them as fully round values.
 * The bitwise compliment operator (~) only works with integratl types.
 */
public class Operator2Runner {
    public static void main(String[] args) {
        var doubleNumber = 100.123454999d;
        var floatNumber = 413.2343242423f;
        var intNumber = 100;
        var intNumber2 = 122;
        var boolValue = false;
        // var notBoolValue = ~boolValue;

        System.out.printf("doubleNumber %% 2 = %f\n", doubleNumber % 2);
        System.out.printf("doubleNumber %% 2 = %f\n", doubleNumber % 100.123454999d);
        System.out.printf("floatNumber %% 2 = %f\n", floatNumber % 2);
        System.out.printf("floatNumber %% 2 = %f\n", floatNumber % 413.2343242423f);
        try {
            System.out.printf("intNumber %% 2 = %f\n", intNumber % 2);
        } catch (IllegalFormatConversionException e) {
            System.out.printf("Remember that formats can be strict! Your result is an integer. In that case %%f won't work!: Exception: %s",
                    e.getMessage());
        }
        System.out.printf("intNumber %% 2 = %f\n", intNumber % 2.0);
        System.out.printf("intNumber %% 2 = %f\n", intNumber % 3.3333);

        System.out.printf("For number %d the opposite in binary would be %d\n", intNumber, ~intNumber);
        System.out.printf("Checking in binary: For number %s the opposite in binary would be %s\n",
                Integer.toBinaryString(intNumber), Integer.toBinaryString(~intNumber));

        System.out.println("Here is the operator & (bitwise and), with two integral operands:");
        System.out.printf("%d & %d = %d\n", intNumber, intNumber2, intNumber & intNumber2);
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(intNumber), Integer.toBinaryString(intNumber2),
                Integer.toBinaryString(intNumber & intNumber2));
    }
}
