package org.jesperancinha.java11.mastery3dot1.furniture;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class BookCase extends Case {
    public BookCase(int capacity) {
        super(capacity);
    }

    public void showCapacity() {
        ORANGE.printGenericLn("This RecordCase has a capacity of %d records", super.capacity);
    }
}
