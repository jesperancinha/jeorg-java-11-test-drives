package org.jesperancinha.java11.crums.crum11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum11 {

    private static class BaseSuper {
        public <T> Collection<? super CharSequence> areYouOutOfTouch(Collection<T> lyrics) {
            return new ArrayList<>(lyrics);
        }
    }

    private static abstract class Base {

        public <T> Collection<T> areYouOutOfTouch(Collection<T> lyrics) {
            return (Collection<T>) Arrays.asList("You didn't Override this!!");
        }

    }

    private static class Main1 extends Base {
        public Collection<String> areYouOutOfTouch(List<String> lyrics) {
            ORANGE.printGenericLn(lyrics);
            return Arrays.asList("I'm out of time");
        }
    }

    private static class Main2 extends Base {
        public <T> Collection<T> areYouOutOfTouch(Collection<T> lyrics) {
            ORANGE.printGenericLn(lyrics);
            return (Collection<T>) Arrays.asList("I'm out of time");
        }
    }

    private static class Main3 extends Base {
        public <T> List<T> areYouOutOfTouch(Collection<T> lyrics) {
            ORANGE.printGenericLn(lyrics);
            return (List<T>) Arrays.asList("I'm out of time");
        }
    }

    private static class Main4 extends Base {
        public <T> List<T> areYouOutOfTouch(List<T> lyrics) {
            ORANGE.printGenericLn(lyrics);
            return (List<T>) Arrays.asList("I'm out of time");
        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 11 - Overriding and overloading generics");

        YELLOW.printGenericLn("from: https://genius.com/Hall-and-oates-out-of-touch-lyrics ");
        MAGENTA.printGenericLn("1 - %s", new Main1().areYouOutOfTouch(Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("2 - %s", new Main1().areYouOutOfTouch(Collections.singletonList("You're out of touch")));
        MAGENTA.printGenericLn("3 - %s", new Main1().areYouOutOfTouch((Collection) Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("4 - %s", new Main2().areYouOutOfTouch(Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("5 - %s", new Main2().areYouOutOfTouch((Collection) Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("6 - %s", new Main3().areYouOutOfTouch(Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("7 - %s", new Main3().areYouOutOfTouch((Collection) Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("8 - %s", new Main4().areYouOutOfTouch(Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("9 - %s", new Main4().areYouOutOfTouch((Collection) Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("10 - %s", new BaseSuper().areYouOutOfTouch(Arrays.asList("You're out of touch")));
        MAGENTA.printGenericLn("11 - %s", new BaseSuper().areYouOutOfTouch(Arrays.asList(1123443432342L)));
        final Collection<? super CharSequence> objects = new BaseSuper().areYouOutOfTouch(
                new ArrayList<>(Arrays.asList("I'm out of time!")));
        MAGENTA.printGenericLn("12 - %s", objects);
        objects.add(new StringBuilder());
        final Object next = objects.iterator()
                .next();
        MAGENTA.printGenericLn("Notice that '%s' is an Object! Using super in a wildcard allows us to write only specific types but offers no guarantee about the read type", next);
        // Required type:
        // capture of ? super CharSequence
        // objects.add(1L);
        GREEN.printGenericLn("You need to be careful with type erasure -> Set<String> and Set<Object> have the same type erasure.");
        GREEN.printGenericLn("If they have the same type erasure, the compiler will try to override the two methods.");
        GREEN.printGenericLn("If the sub method return type isn't at least the same type or a sub type of the overridden one, then the compiler will report an error.");
        GREEN.printGenericLn("Using wildcard extends, you cannot add any element to the list. You know that the element is of a specific type or subtype only, but you don't know which");
        GREEN.printGenericLn("You can read wildcard extends though with the guarantee of the given type");
        GREEN.printGenericLn("Super in a wildcard generic type, means that every element has a given super type. This also means that adding an element of that type or subtype is allowed");
        GREEN.printGenericLn("Further reading: https://stackoverflow.com/questions/4343202/difference-between-super-t-and-extends-t-in-java");
    }
}
