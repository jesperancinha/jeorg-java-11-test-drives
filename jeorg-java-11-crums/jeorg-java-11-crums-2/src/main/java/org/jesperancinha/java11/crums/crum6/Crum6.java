package org.jesperancinha.java11.crums.crum6;

import java.io.PrintWriter;
import java.io.Reader;
import java.util.Objects;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum6 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 6 - Using Console in java");

        var console = System.console();
        if (Objects.isNull(console)) {
            BRIGHT_MAGENTA.printGenericLn("No console found! Please run this program from the command line to be able to exercise Crum6");
        } else {
            MAGENTA.printGenericLn("Please insert a password:");
            final char[] password = console.readPassword();
            MAGENTA.printGenericLn("This is your password -> %s", new String(password));
            final Reader reader = console.reader();
            MAGENTA.printGenericLn("Reader which can be used by other readers -> %s", reader);
            final PrintWriter printWriter = console.writer();
            MAGENTA.printGenericLn("PrintWriter which can be used by other writers -> %s", printWriter);
            console.format("We can also write your passord (%s) this way\n", new String(password));
            MAGENTA.printGenericLn("Try writing a string now:");
            final String s = console.readLine();
            MAGENTA.printGenericLn("This is your string %s", s);
            GREEN.printGenericLn("Our console always has `readPassword`, `readLine`, a `writer`, a `reader` and we can write to the output via `format`");
        }
    }
}
