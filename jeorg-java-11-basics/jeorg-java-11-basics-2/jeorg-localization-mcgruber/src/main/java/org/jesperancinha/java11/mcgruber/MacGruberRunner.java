package org.jesperancinha.java11.mcgruber;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Locale;

/**
 * From http://www.themovietimeline.com/film8353
 * <p>
 * 1963
 * <p>
 * Sunday 17th March: Mcgruber is born according to his passport. (Kotelnich, Russia)
 * <p>
 * Wednesday 24th April: Casey Janine Fitzpatrick is born. (Pueblo, Colorado USA)
 * <p>
 * 1999
 * <p>
 * Sunday 4th July: Casey Janine Fitzpatrick dies. (Pueblo, Colorado USA)
 * <p>
 * 2001
 * <p>
 * Saturday 26th May: Macgruber's passport is issued.
 * <p>
 * 2003
 * <p>
 * Sunday 24th August: Macgruber's passport is issued.
 * <p>
 * 2010
 * <p>
 * September: Macgruber forms a team and searches for Cunth.
 * <p>
 * Sunday 19th September: Macgruber has sex with Vicki and then with Casey's ghost.
 * <p>
 * Monday 20th September: Macgruber foils Cunth's plan and saves the world.
 * <p>
 * 2011
 * <p>
 * March: Macgruber and Vicki get married, but not without being interrupted by Cunth, who is killed by Macgruber.
 * <p>
 * Thursday 26th May: Macgruber's passport expires.
 * <p>
 * 2013
 * <p>
 * Saturday 24th August: Macgruber's passport expires.
 */
public class MacGruberRunner {
    public static void main(String[] args) {
        try {
            new SimpleDateFormat("e m", Locale.FRANCE);
        } catch (Exception e) {
            System.out.printf("Note that 'e' is not accepted in SimpledDateFormat resulting in exception\n-  %s\n-- //  --\n", e.getMessage());
        }
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("h s y d m", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("hh ss yy dd mmm", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("hhh sss yyy ddd mmmm", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("hhhh ssss yyyy dddd mmmmm", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat("hhhhhh sssss yyyyy ddddd mmmmmmmmm", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat6 = new SimpleDateFormat("z H S D M", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat7 = new SimpleDateFormat("zz HH SS DD MM", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat8 = new SimpleDateFormat("zzz HHH SSS DDD MMM", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat9 = new SimpleDateFormat("zzzz HHHH SSSS DDDD MMMM", Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat10 = new SimpleDateFormat("zzzzz HHHHHH SSSSSSSS DDDDDDDD MMMMMMMMMM", Locale.ENGLISH);

        System.out.println("--- We start out with MacGruber's birth date ---");
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat1.toPattern(), simpleDateFormat1.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat2.toPattern(), simpleDateFormat2.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat3.toPattern(), simpleDateFormat3.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat4.toPattern(), simpleDateFormat4.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat5.toPattern(), simpleDateFormat5.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat6.toPattern(), simpleDateFormat6.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat7.toPattern(), simpleDateFormat7.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat8.toPattern(), simpleDateFormat8.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat9.toPattern(), simpleDateFormat9.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.printf("Format: %s\nResult: %s\n", simpleDateFormat10.toPattern(), simpleDateFormat10.format(Date.valueOf(LocalDate.of(1963, 3, 17))));
        System.out.println("--- // ---");
        System.out.println("--- We now find more interesting dates---");

        final LocalDateTime mcgruberBDate = LocalDateTime.of(1963, 3, 17, 9, 15, 30, 999999999);
        SimpleDateFormat simpleDateFormatBDay = new SimpleDateFormat("'day 'D' of year 'y' on month 'MMMM(MM)' which the day was 'dd' on a 'EEEE' around 'hh:mm:ss.SSS, zzz", Locale.ENGLISH);
        System.out.printf("1. MacGruber was probably born more exactly on the %s\n", simpleDateFormatBDay.format(Date.from(mcgruberBDate.toInstant(ZoneOffset.UTC))));

        final LocalDateTime caseyBDate = LocalDateTime.of(1963, 4, 24, 9, 15, 30, 999999999);
        SimpleDateFormat simpledateFormatBDsideKick = new SimpleDateFormat("MMMM' and that was month 'M' of year 'y' and it was day 'dd' of that month, which was also day 'DD' of that year and so the birth time was at 'H' and 'm' minutes with the chronometers marking 's' seconds and 'S' milliseconds,' zz.");
        System.out.printf("2. Casey Janine Fitzpatrick was probably born more exactly on the %s\n", simpledateFormatBDsideKick.format(Date.from(caseyBDate.toInstant(ZoneOffset.UTC))));

        final LocalDateTime caseyDDate = LocalDateTime.of(1999, 7, 4, 9, 15, 30, 999999999);
        SimpleDateFormat simpledateFormatDDsideKick = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss.SSSSSS z");
        System.out.printf("3. Casey Janine Fitzpatrick died on (notice the daylight savings change): %s\n", simpledateFormatDDsideKick.format(Date.from(caseyDDate.toInstant(ZoneOffset.UTC))));

        final LocalDateTime macgrubersPassport = LocalDateTime.of(2001, 5, 26, 9, 15, 30, 999999999);
        SimpleDateFormat simpledateFormatPassport = new SimpleDateFormat("'issued on the: 'yyyyMMddHHmmssSSS zzzzz");
        System.out.printf("4. MacGruber gets his passport): %s\n", simpledateFormatPassport.format(Date.from(macgrubersPassport.toInstant(ZoneOffset.UTC))));
    }
}
