package org.jesperancinha.java11.crums.crum11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum11 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 11 - Wildcards, diamonds, generics and objects");

        final List<String> bandList = new ArrayList<String>();
        bandList.add("Vampire Weekend");
        bandList.add("Los Campesinos!");
        bandList.add("The Cure");
        bandList.add("PJ Harvey");
        bandList.add("Nick Cave and the bad seeds");

        MAGENTA.printGenericLn("We can have a band list with a generic type List -> %s", bandList);

        final List<?> bandListWildcard = bandList;
        // Required type:
        // capture of ?
        // Provided:
        // String
        // bandListWildcard.add("sneaky");

        MAGENTA.printGenericLn("If you play with this new reference, you'll realize you cannot easily add an element to the list -> %s", bandListWildcard);

        final List<? extends String> bandListWildcardExtends = bandList;
        bandList.add("Sneaky");
        final String band1 = bandListWildcardExtends.get(0);
        BRIGHT_CYAN.printGenericLn(band1);

        // capture of ? extends String
        // String test = "Anna Domino";
        // bandListWildcardExtends.add(test);

        MAGENTA.printGenericLn("Even with extend, you'll be faced with the same problem -> %s", bandListWildcardExtends);

        final List<String> bandListDiamond = new ArrayList<>();
        bandListDiamond.add("Vampire Weekend");
        bandListDiamond.add("Los Campesinos!");
        bandListDiamond.add("The Cure");
        bandListDiamond.add("PJ Harvey");
        bandListDiamond.add("Nick Cave and the bad seeds");
        MAGENTA.printGenericLn("We can create a band list with diamond notation -> %s", bandListDiamond);

        final List<Object> bandListObject = new ArrayList<>();
        bandListObject.add("Vampire Weekend");
        bandListObject.add("Los Campesinos!");
        bandListObject.add("The Cure");
        bandListObject.add("PJ Harvey");
        bandListObject.add("Nick Cave and the bad seeds");
        bandListObject.add(1234567890);
        MAGENTA.printGenericLn("If we create a list of objects, we can create big mess -> %s", bandListObject);
        MAGENTA.printGenericLn("And if we analyze its types -> %s", bandListObject.stream()
                .map(Object::getClass)
                .collect(Collectors.toList()));

        final List<?> bandListWildcardDiamond = new ArrayList<>(
                Arrays.asList("Vampire Weekend", "Los Campesinos!", "The Cure", "PJ Harvey",
                        "Nick Cave and the bad seeds"));
        final Object o = bandListWildcardDiamond.get(0);
        BRIGHT_CYAN.printGenericLn(o);
        MAGENTA.printGenericLn("We can create wildcard lists in combinastion with diamond notation created instances.");
        MAGENTA.printGenericLn("Note that since the reference is a wildcard, adding is also not an easy option in this case");

        GREEN.printGenericLn("Bottom line is that generic are good, use of Object is sloppy, diamond notation saves text and wildcards is better not to use");
        GREEN.printGenericLn("Wildcards, can be used if you don't care about type check");
        MAGENTA.printGenericLn("Generics are perfect for type safety");
        MAGENTA.printGenericLn("Objects do not guarantee type safety and can create fairly complicated code");
        MAGENTA.printGenericLn("Diamond notation saves text and the diamond is always placed on the right side of the assignment");
        MAGENTA.printGenericLn("Wildcard notation may be justified to use in seldom situations and is always placed on the left side of the assignment");
        MAGENTA.printGenericLn("Wildcard and diamond notation can be used at the same time in one assignment operation");
    }
}
