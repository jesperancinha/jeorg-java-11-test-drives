package org.jesperancinha.java11.crums.crum5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum5 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 5 - DateTimeFormatter of pattern");

        var dateTimeFormatter = DateTimeFormatter.ofPattern("e d y h H s m 'wow!' 'This is cool'");
        ORANGE.printGenericLn(dateTimeFormatter);
        MAGENTA.printGenericLn(dateTimeFormatter.format(LocalDateTime.now()));
        var dateTimeFormatter2 = DateTimeFormatter.ofPattern("ee dd yy hh HH ss mm");
        ORANGE.printGenericLn(dateTimeFormatter2);
        MAGENTA.printGenericLn(dateTimeFormatter2.format(LocalDateTime.now()));
        try {
            var dateTimeFormatter3 = DateTimeFormatter.ofPattern("eee ddd yyy hhh HHH sss mmm");
            ORANGE.printGenericLn(dateTimeFormatter3);
            MAGENTA.printGenericLn(dateTimeFormatter3.format(LocalDateTime.now()));
        } catch (java.lang.IllegalArgumentException e) {
            RED.printGenericLn("This is expected. The parameter for day of the month may only have 2 digits at max -> %s", e);
        }

        try {
            var dateTimeFormatter3 = DateTimeFormatter.ofPattern("eee dd yyy hhh HHH sss mmm");
            ORANGE.printGenericLn(dateTimeFormatter3);
            MAGENTA.printGenericLn(dateTimeFormatter3.format(LocalDateTime.now()));
        } catch (java.lang.IllegalArgumentException e) {
            RED.printGenericLn("This is expected. The parameter for hour may only have 2 digits at max -> %s", e);
        }

        try {
            var dateTimeFormatter3 = DateTimeFormatter.ofPattern("eee dd yyy hh HHH sss mmm");
            ORANGE.printGenericLn(dateTimeFormatter3);
            MAGENTA.printGenericLn(dateTimeFormatter3.format(LocalDateTime.now()));
        } catch (java.lang.IllegalArgumentException e) {
            RED.printGenericLn("This is expected. The parameter for 24 hour may only have 2 digits at max -> %s", e);
        }

        try {
            var dateTimeFormatter3 = DateTimeFormatter.ofPattern("eee dd yyy hh HH ss mmm");
            ORANGE.printGenericLn(dateTimeFormatter3);
            MAGENTA.printGenericLn(dateTimeFormatter3.format(LocalDateTime.now()));
        } catch (java.lang.IllegalArgumentException e) {
            RED.printGenericLn("This is expected. The parameter for seconds may only have 2 digits at max -> %s", e);
        }

        try {
            var dateTimeFormatter3 = DateTimeFormatter.ofPattern("eee dd yyy hh HH ss mmm");
            ORANGE.printGenericLn(dateTimeFormatter3);
            MAGENTA.printGenericLn(dateTimeFormatter3.format(LocalDateTime.now()));
        } catch (java.lang.IllegalArgumentException e) {
            RED.printGenericLn("This is expected. The parameter for minutes may only have 2 digits at max -> %s", e);
        }

        var dateTimeFormatter3 = DateTimeFormatter.ofPattern("eee dd yyy hh HH ss mm");
        ORANGE.printGenericLn(dateTimeFormatter3);
        MAGENTA.printGenericLn(dateTimeFormatter3.format(LocalDateTime.now()));

        var dateTimeFormatter4 = DateTimeFormatter.ofPattern("eeee dd yyyy hh HH ss mm");
        ORANGE.printGenericLn(dateTimeFormatter4);
        MAGENTA.printGenericLn(dateTimeFormatter4.format(LocalDateTime.now()));

        var dateTimeFormatter5 = DateTimeFormatter.ofPattern("eeeee dd yyyyy hh HH ss mm");
        ORANGE.printGenericLn(dateTimeFormatter5);
        MAGENTA.printGenericLn(dateTimeFormatter5.format(LocalDateTime.now()));

        try {
            var dateTimeFormatter6 = DateTimeFormatter.ofPattern("eeeeee dd yyyyyy hh HH ss mm");
            ORANGE.printGenericLn(dateTimeFormatter6);
            MAGENTA.printGenericLn(dateTimeFormatter6.format(LocalDateTime.now()));
        } catch (java.lang.IllegalArgumentException e) {
            RED.printGenericLn("This is expected. The maximum repetition possible for any patter is 5 -> %s", e);
        }

        GREEN.printGenericLn("We can generally say that 5 is the maximum digit repetition for a DateTimeFormatter");
        GREEN.printGenericLn("We can introduce our own text. To escape it we put it between single quotes");
        GREEN.printGenericLn("Some digit types like 24 hour, hour, minute, second, day of the month, only allow up to 2 repetitions");
    }
}
