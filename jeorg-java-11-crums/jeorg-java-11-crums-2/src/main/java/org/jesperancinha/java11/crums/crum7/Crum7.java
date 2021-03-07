package org.jesperancinha.java11.crums.crum7;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum7 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 7 - Generating exceptions from arrays");

        var arrayInt = new int[][]{{1, 2, 3}, null};

        MAGENTA.printGenericLn("First we generate a NullPointerException");

        try {
            var value = arrayInt[1][0];
        } catch (NullPointerException e) {
            RED.printGenericLn("What we did here is to reach to position 1, which we know is null and then try to reach any of its elements");
            RED.printGenericLn("We cannot do that because the position 0 of a null element results in a NullPointerException -> %s", e);
        }

        try {
            var value = arrayInt[-1];
        } catch (IndexOutOfBoundsException e) {
            RED.printGenericLn("Position -1 does not exist!");
            RED.printGenericLn("And so we get a IndexOutOfBoundsException -> %s", e);
        }

        var strings = new String[]{"all", "I", "want", "for", "xmas", "is", "you"};

        MAGENTA.printGenericLn("If we have an array of strings -> %s", Arrays.stream(strings)
                .collect(Collectors.toList()));

        try {
            var value = strings[-1];
        } catch (IndexOutOfBoundsException e) {
            RED.printGenericLn("Position -1 does not exist!");
            RED.printGenericLn("And so we get a IndexOutOfBoundsException -> %s", e);
        }

        try {
            "Mariah Carey".charAt(1000);
        } catch (StringIndexOutOfBoundsException e) {
            RED.printGenericLn("The StringIndexOutOfBoundsException is also an IndexOutOfBoundsException");
            RED.printGenericLn("It is platform dependent and so it is not a good idea in general to catch such a specific exception");
            RED.printGenericLn("But we will get this exception or the IndexOutOfBoundsException if we are out of range -> %s", e);
        }

        GREEN.printGenericLn("The point is that we can generate NullPointerException if we try to access an indez of something that is already Null");
        GREEN.printGenericLn("If the index of something that is not null falls out of the accepted range we always get and IndexOutOfBoundsException");
        GREEN.printGenericLn("In our example we get an ArrayIndexOutOfBoundsException and a StringIndexOutOfVoundsException");
        GREEN.printGenericLn("Both are too specific and in some cases, just too cool for cats");
    }
}
