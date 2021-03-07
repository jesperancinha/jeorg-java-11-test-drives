package org.jesperancinha.java11.cpf.bills;

public class BillsRunner {
    public static void main(String[] args) {
        final int a;
        final int weeksOnTheChart = 20;
        final int resultW = a = weeksOnTheChart;
        final int b;
        final int year = 1999;
        final int resultY = b = year;
        final int c;
        final int month = 7;
        final int resultM = c = month;
        final String d;
        final String albumName = "Bills, Bills, Bills";
        final String resultAN = d = albumName;
        final boolean f;
        final boolean stillListenedToAsBefore = true;
        final boolean resultSLAB = f = stillListenedToAsBefore;

        System.out.printf("Destiny's Child single %s stayed on the charts for %d weeks\n", resultAN, resultW);
        System.out.printf("It's peak year was %d\n", resultY);
        System.out.printf("It's peak month was %d\n", resultM);
        System.out.printf("Do people still listen to this single? %s\n", resultSLAB);
        System.out.printf("Our variables are a=%d, b=%d, c=%d, d=%s, f=%s\n", a, b, c, d, f);
    }
}
