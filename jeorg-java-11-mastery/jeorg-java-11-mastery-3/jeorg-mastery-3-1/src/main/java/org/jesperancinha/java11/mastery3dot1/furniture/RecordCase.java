package org.jesperancinha.java11.mastery3dot1.furniture;

import java.time.LocalDateTime;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class RecordCase extends Case {

    int currentYear = LocalDateTime.now().getYear();

    public RecordCase(int capacity) {
        super(capacity);
    }

    public void showCapacity() {
        ORANGE.printGenericLn("This RecordCase has a capacity of %d records", super.capacity);
    }

    public void printStuff() {
        ORANGE.printGenericLn("Current year is %d", currentYear);
    }

    public static void describeMe() {
        YELLOW.printGenericLn("I'm a record case class -> %s", RecordCase.class.getName());
    }

}
