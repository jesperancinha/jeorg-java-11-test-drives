package org.jesperancinha.java11.crums.crum7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum7 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 7 - unmodifiableList");

        var numA = new Integer[]{11, 22};
        var list1 = new ArrayList<Integer>(List.of(numA));
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        list1.add(null);
        var list2 = Collections.unmodifiableList(list1);
        try {
            var list4 = List.of(list1.toArray(new Integer[0]));
        } catch (NullPointerException e) {
            RED.printGeneric("This is expected! Although Collections.unmodifiableList allow Null values, List.Of do not! -> %s", e);
        }
        list1.set(2, 99);
        List<List<Integer>> list3 = List.of(list1, list2);

        ORANGE.printGenericLn(list3);
        GREEN.printGenericLn("Remember that unlike List.of, unmodifiableLists do allow null values");
    }
}
