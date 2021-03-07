package org.jesperancinha.java11.carmen.sandiego;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

import static org.jesperancinha.java11.carmen.sandiego.CarmenSandiegoCGAPrinter.printInputText;

public class CarmenSandiegoRunner {
    public static void main(String[] args) throws InterruptedException {

        printInputText(CarmenSandiegoColor.BRIGHT_BLUE, "---- WHERE IN THE WORLD IS CARMEN SANDIEGO ----\n");

        NumberFormat numberFormat = NumberFormat.getNumberInstance(new Locale("fr", "FR"));
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, new Locale("fr", "FR"));
        printInputText(CarmenSandiegoColor.BRIGHT_MAGENTA, "- In \"Becoming Carmen Sandiego Part I\", Carmen needs to jump around 50 yards in Poitiers city of France.\n");
        printInputText(CarmenSandiegoColor.BRIGHT_GREEN, "Let's see how does that look like in french notation:\n");
        printInputText(CarmenSandiegoColor.BRIGHT_CYAN, String.format("Carmen jumped: %s cm\n", numberFormat.format(50 / 1.0936 * 100)));
        printInputText(CarmenSandiegoColor.BRIGHT_RED, String.format("The clip on YouTube has been uploaded on the: %s.\n", dateFormat.format(new Date(2019 - 1900, 0, 22))));

        NumberFormat numberFormatIndo = NumberFormat.getNumberInstance(new Locale("id", "ID"));
        DateFormat dateFormatIndo = DateFormat.getDateInstance(DateFormat.LONG, new Locale("id", "ID"));
        printInputText(CarmenSandiegoColor.BRIGHT_MAGENTA, "- In \"The Sticky Rice Caper\", Carmen mentions the most produced product in Indonesia: Rice.\n");
        printInputText(CarmenSandiegoColor.BRIGHT_GREEN, "Let's see how does that look like in indonesian notation:\n");
        printInputText(CarmenSandiegoColor.BRIGHT_CYAN, String.format("Indonesia produces %s tons of rice per year according to Carmen.\n", numberFormatIndo.format(70_000_000)));
        printInputText(CarmenSandiegoColor.BRIGHT_RED, String.format("The transcript was placed on Fandom on the: %s.\n", dateFormatIndo.format(new Date(2019 - 1900, 9, 6))));

        NumberFormat numberFormatDefault = NumberFormat.getNumberInstance(Locale.getDefault());
        DateFormat dateFormatDefault = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault());
        printInputText(CarmenSandiegoColor.BRIGHT_MAGENTA, String.format("- And you? Where are you now? Language=%s, Country=%s\n", Locale.getDefault().getDisplayLanguage(), Locale.getDefault().getDisplayCountry()));
        printInputText(CarmenSandiegoColor.BRIGHT_GREEN, "Let's see how does that look like in your notation:\n");
        printInputText(CarmenSandiegoColor.BRIGHT_CYAN, String.format("You live on a planet which has a radius of %s Km.\n", numberFormatDefault.format(6_371)));
        printInputText(CarmenSandiegoColor.BRIGHT_RED, String.format("You are reading this on the: %s.\n", dateFormatDefault.format(new Date())));

    }
}
