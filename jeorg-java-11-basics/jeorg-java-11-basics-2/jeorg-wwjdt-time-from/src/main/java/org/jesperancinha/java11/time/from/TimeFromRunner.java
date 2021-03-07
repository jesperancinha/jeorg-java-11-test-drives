package org.jesperancinha.java11.time.from;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.UnsupportedTemporalTypeException;
import java.util.Date;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

/**
 * Please note the package types!!
 * <p>
 * from http://www.themovietimeline.com/film106
 * <p>
 * Back to the Future - timeline
 * Add something for this title
 * <p>
 * 1910
 * <p>
 * Sam Baines, future grandfather to Marty McFly, is born.
 * <p>
 * 1915
 * <p>
 * Stella, later to be Stella Baines, mother to Lorraine and grandmother to Marty McFly, is born.
 * <p>
 * 1955
 * <p>
 * Saturday 5th November: Marty McFly arrives in Hill Valley, from 1985; Doc Brown invents the flux capacitor when he slips off his toilet.
 * <p>
 * Saturday 12th November: The Enchantment Under The Sea Dance, a bit of a storm, and some time-travel.
 * <p>
 * 1968
 * <p>
 * Marty McFly and Jennifer Parker born. (Hill Valley, CA)
 * <p>
 * 1985
 * <p>
 * Saturday 26th October: Einstein the dog travels a minute into the future, and Marty is chased by Libyans back into 1955.
 * <p>
 * Sunday 27th October: 11am
 */
public class TimeFromRunner {
    public static void main(String[] args) {
        System.out.println("--------- java.time..* ---------");
        System.out.println("--------- java.time.format.* ---------");
        System.out.println("--------- java.time.temporal.* ---------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'Year='yyyy' Month='MMM' Day='dd' Month='L' Day of Week='c' Quarter='q");
        LocalDate localDate = LocalDate.of(1955, 11, 5);
        System.out.printf("Marty McFly arrives in Hill Valley on: %s\n", dateTimeFormatter.format(localDate));

        System.out.println("--------- java.util.Date ---------");

        try {
            java.util.Date date = new Date(1955 - 1900, 10, 12);
            // System.out.printf("The Enchantment Under The Sea Dance happens on on: %s\n", df.format(date));
            System.out.printf("The Enchantment Under The Sea Dance happens on: %s\n", dateTimeFormatter.format(date.toInstant()));
        } catch (UnsupportedTemporalTypeException e) {
            RED.printThrowableAndExit(e);
            System.out.printf("This fails because Instance does not contain zone information. In the next example we'll use a trick to do so: %s\n", e.getMessage());
        }

        java.util.Date date = new Date(1955 - 1900, 10, 12);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.printf("1900 - The Enchantment Under The Sea Dance happens on: %s\n", dateTimeFormatter.format(localDateTime));

        System.out.println("--------- java.sql.Date ---------");
        try {
            java.sql.Date date2 = new java.sql.Date(1985 - 1900, 9, 26);
            LocalDateTime localDateTime2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());
            System.out.printf("1900 - Marty is chased by Libyans on: %s\n", dateTimeFormatter.format(localDateTime2));
        } catch (UnsupportedOperationException e) {
            RED.printThrowableAndExit(e);
            System.out.printf("This fails because java.sql.Date does not support time components. In the next example we'll use a trick to do so: %s\n", e.getMessage());
        }

        java.sql.Date date2 = new java.sql.Date(1985 - 1900, 9, 26);
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(Instant.ofEpochMilli(date2.getTime()), ZoneId.systemDefault());
        System.out.printf("1900 - Marty is chased by Libyans on: %s\n", dateTimeFormatter.format(localDateTime2));
    }
}

