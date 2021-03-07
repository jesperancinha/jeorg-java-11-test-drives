package org.jesperancinha.java11.tron;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class TronServiceImpl {
    public static TronService provider() {
        return () -> {
            Scanner scanner = new Scanner(System.in);
            printInputText80s("ACCESS CODE");
            String accessCode = scanner.nextLine();
            if (accessCode.equals("6")) {
                printInputText80s("PASSWORD");
                String password = scanner.nextLine();
                if (password.equals("SERIES PS 17")) {
                    String password2 = scanner.nextLine();
                    if (password2.equals("REINDEER FLOTILLA")) {
                        printInputText80s("YOU SHOULDN'T HAVE COME BACK FLYNN\n");
                        printInputText80s("CODE SERIES");
                        String codeSeries = scanner.nextLine();
                        if (codeSeries.equals("LSU-123")) {
                            printInputText80s("...ACTIVATE\n");
                            printInputText80s("THAT ISN'T GOING TO DO YOU ANY\n");
                            printInputText80s("GOOD, FLYNN. I'M AFRAID YOU...\n");
                            printInputText80sGreen("MAG IOX\n");
                            printInputText80sGreen("MODE: SCAN\n");
                            printInputText80sGreen("TARGETING\n");
                            printInputText80sGreen("SERVO PWR\n");
                            printInputText80sGreen("PWR CPLING\n");
                            printInputText80sGreen("LOGIC BYPS\n");
                            printInputText80sGreen("MCP CNTRL\n");
                            printInputText80sGreen("ACTIVE INPT\n");
                            printInputText80sGreen("SERVO CNTR\n");
                            printInputText80sGreen("GRID MATRIX\n");
                            printInputText80sGreen("FRG MNTR\n");
                            printInputText80sGreen("KCW CNTRL\n");
                            printInputText80sGreen("GDNCE INPT\n");
                            printInputText80sGreen("STRGE CLRD\n");
                            printInputText80sGreen("THERMO TRGT\n");
                            printInputText80sGreen("THERMO TRGT\n");
                            printInputText80sGreen("MODE: LOCK\n");
                            printInputText80sGreen("TARGET\n");
                            printInputText80sGreen("LOCK ON\n");
                            printInputText80sGreen("ACTIVATE\n");
                        } else {
                            printInputText80sRed("!!Unknown code series!!");
                        }
                    } else {
                        printInputText80sRed("!!Unknown second password!!");
                    }
                } else {
                    printInputText80sRed("!!Unknown password!!");
                }
            } else {
                printInputText80sRed("!!Unknown access code!!");
            }
        };
    }

    private static void printInputText80sRed(String text) throws InterruptedException {
        System.out.print("\033[0;31m");
        for (int i = 0; i < text.length(); i++) {
            sleep(100);
            System.out.print(text.charAt(i));
        }
        if (!text.contains("\n")) {
            System.out.print(" ");
        }
    }

    private static void printInputText80sGreen(String text) throws InterruptedException {
        System.out.print("\033[1;32m");
        for (int i = 0; i < text.length(); i++) {
            sleep(100);
            System.out.print(text.charAt(i));
        }
        if (!text.contains("\n")) {
            System.out.print(" ");
        }
    }

    private static void printInputText80s(String text) throws InterruptedException {
        System.out.print("\033[0;34m");
        for (int i = 0; i < text.length(); i++) {
            sleep(100);
            System.out.print(text.charAt(i));
        }
        if (!text.contains("\n")) {
            System.out.print(" ");
        }
    }
}
