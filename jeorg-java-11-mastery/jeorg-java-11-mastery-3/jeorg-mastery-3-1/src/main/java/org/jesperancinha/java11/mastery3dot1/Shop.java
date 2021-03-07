package org.jesperancinha.java11.mastery3dot1;

import org.jesperancinha.java11.mastery3dot1.items.Record;
import org.jesperancinha.java11.mastery3dot1.items.ShopItem;
import org.jesperancinha.java11.mastery3dot1.items.VinylRecord;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Shop {
    public static void checkItem(ShopItem shopItem) {
        ORANGE.printGenericLn("Object %s is cleared to be sold as a ShopItem!", shopItem);
    }

    public static void checkItem(Record record) {
        ORANGE.printGenericLn("Object %s is cleared to be sold as a Record!", record);
    }

    public static void checkItem(VinylRecord vinylRecord) {
        ORANGE.printGenericLn("Object %s is cleared to be sold as a VinylRecord!", vinylRecord);
    }
}
