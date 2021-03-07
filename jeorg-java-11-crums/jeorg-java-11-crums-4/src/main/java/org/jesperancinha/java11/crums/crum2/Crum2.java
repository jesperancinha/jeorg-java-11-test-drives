package org.jesperancinha.java11.crums.crum2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum2 {

    private static class Boat {
        List<? super CharSequence> getBoats() {
            return Arrays.asList("O Armonense", "Rio Belo", "Mira Sado");
        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 2 - List, Collections and bounded types");

        MAGENTA.printGenericLn("We have these boat names:");

        final List<? super CharSequence> boats = new Boat().getBoats();

        ORANGE.printGenericLn(boats);
        MAGENTA.printGenericLn("We have created these boats without bounded types");
        final CharSequence a_estrela = (CharSequence) new String("A Estrela");
        boats.set(0, a_estrela);
        MAGENTA.printGenericLn("This means that all elements have to be String");
        ORANGE.printGenericLn(boats);
        boats.set(1, "Ferreirinha");
        ORANGE.printGenericLn(boats);
        MAGENTA.printGenericLn("The difference here is that when we perform a get from this list, we get Object:");
        final Object text = boats.get(0);
        ORANGE.printGenericLn(text);

        MAGENTA.printGenericLn("Lets now create an ArrayDeque of our boats:");

        // Cannot resolve constructor 'ArrayDeque(java.util.List<capture<? super java.lang.CharSequence>>)'
        // final ArrayDeque<String> arrayDeque = new ArrayDeque<String>(boats);
        final ArrayDeque<String> arrayDeque = new ArrayDeque<String>(boats.stream()
                .map(x -> (String) x)
                .collect(Collectors.toList()));

        ORANGE.printGenericLn(arrayDeque);

        Object[] args3 = new Object[]{arrayDeque instanceof List};
        MAGENTA.printGenericLn("An ArrayDeque is not a List! -> %s", args3);
        Object[] args2 = new Object[]{boats instanceof List};
        MAGENTA.printGenericLn("But the boat list is a List! -> %s", args2);
        Object[] args1 = new Object[]{arrayDeque instanceof Collection, boats instanceof Collection};
        MAGENTA.printGenericLn("And both of them are collections: %s  %s", args1);
        GREEN.printGenericLn("Unbounded types or wildcards with super determine the base type that can be added to a list");
        GREEN.printGenericLn("These, however, say nothing about the return type.");
        GREEN.printGenericLn("Not all Collections are Lists");
        GREEN.printGenericLn("An ArrayList is a List, and is also a Collection");
        GREEN.printGenericLn("A List is not a Collection. They are different interfaces");
        GREEN.printGenericLn("An ArrayDeque is a Collection but it is not a List");
        GREEN.printGenericLn("An ArrayDeque is Deque");

    }
}
