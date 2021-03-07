package org.jesperancinha.java11.operatos;

public class OperatorRunner {
    public static void main(String[] args) {
        int a = 100;
        int b = a << 1;
        int d = a >> 1;
        int c = a >>> 1;

        System.out.printf("Let's smooth operate from %d:\n%s\n", a, Integer.toBinaryString(a));
        System.out.printf("Left position should be positive %d:\n%s one position multiplies by 2\n", b, Integer.toBinaryString(b));
        System.out.printf("Right position should be positive %d:\n%s one position divides by 2\n", d, Integer.toBinaryString(d));
        System.out.printf("Right position should be positive %d:\n%s one position divides by 2 unsigned\n", c, Integer.toBinaryString(c));

        a = -100;
        b = a << 1;
        d = a >> 1;
        c = a >>> 1;

        System.out.printf("Let's smooth operate from %d:\n%s\n", a, Integer.toBinaryString(a));
        System.out.printf("Left position should be positive %d:\n%s one position multiplies by 2\n", b, Integer.toBinaryString(b));
        System.out.printf("Right position should be positive %d:\n%s one position divides by 2\n", d, Integer.toBinaryString(d));
        System.out.printf("Right position should be positive %d:\n%s one position makes a mess. BONUS: Guess why this number\n", c, Integer.toBinaryString(c));
    }
}
