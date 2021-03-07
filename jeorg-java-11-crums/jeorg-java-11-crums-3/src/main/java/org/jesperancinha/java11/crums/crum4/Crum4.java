package org.jesperancinha.java11.crums.crum4;

import org.jesperancinha.console.consolerizer.console.Consolerizer;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum4 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 4 - The contents of a BufferedReader");

        MAGENTA.printGenericLn("A buffered reader provides buffered functionality to a reader");
        MAGENTA.printGenericLn("This is actually the reason why a BufferedReader can be initialized with any reader, including itself");

        var bufferedReader1 = new BufferedReader(
                new InputStreamReader(new ByteArrayInputStream("This is a good String".getBytes())));

        int read;
        try {
            while ((read = bufferedReader1.read()) != -1) {
                YELLOW.printGeneric((char) read);
            }
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }

        Consolerizer.printNewLine();
        bufferedReader1 = new BufferedReader(
                new InputStreamReader(new ByteArrayInputStream("This is a good String".getBytes())));

        var bufferedReader2 = new BufferedReader(bufferedReader1);

        try {
            while ((read = bufferedReader2.read()) != -1) {
                YELLOW.printGeneric((char) read);
            }
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        Consolerizer.printNewLine();

        GREEN.printGenericLn("The point is that a BufferedReader can be creater with all java.io.Reader subtypes and java.io.Reader included");
    }
}
