package org.jesperancinha.java11.mastery4dot3;

import org.jesperancinha.console.consolerizer.console.Consolerizer;
import org.jesperancinha.java11.mastery4dot3.community.Frenemy;
import org.jesperancinha.java11.mastery4dot3.instrument.Guitar;
import org.jesperancinha.java11.mastery4dot3.record.Album;
import org.jesperancinha.java11.mastery4dot3.record.AlbumCalculator;
import org.jesperancinha.java11.mastery4dot3.record.AlbumForSale;
import org.jesperancinha.java11.mastery4dot3.record.AnimalCollectiveList;
import org.jesperancinha.java11.mastery4dot3.song.Song;
import org.jesperancinha.java11.mastery4dot3.transport.Limousine;
import org.jesperancinha.java11.mastery4dot3.transport.TourTrailer;
import org.jesperancinha.java11.mastery4dot3.transport.Trailer;
import org.jesperancinha.java11.mastery4dot3.transport.Transport;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;
import java.util.function.BiConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerGraphs.printUnicornsLn;

public class Mastery4Dot3Runner {
    private static boolean skipQuestions;

    public static void main(String[] args) {
        if (args.length > 0) {
            skipQuestions = "-skip".equals(args[0]);
        }
        Consolerizer.typingWaitGlobal = 0;
        Consolerizer.maxLineCharsGlobal = 200;
        Consolerizer.rainbowLineChars = 20;
        BLUE.printGenericLn("==================== Master Module mastery-4-3 And Then Indie ====================");
        BLUE.printGenericLn("----> Run with VM command -ea or -enableassertions for a more accurate run");
        BLUE.printGenericLn("----> Run with -skip to skip questions");
        BLUE.printGenericLn("----> Note that this mastery need the prepare.sh script to be run first.");

        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
        exercise14();
        exercise15();
        exercise16();
        exercise17();
        exercise18();
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 19. `String` `replace` old/new");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We are closing this module with \"After the Curtain\" from musical group Beirut.");
        GREEN.printGenericLn("After this module, please continue your studies. Look out for new modules as they will keep coming");

        var testCurtain = "After the curtain".replace("curtain", "curtain") == "After the curtain";
        var testC = "After the curtain".replace('c', 'c') == "After the curtain";

        MAGENTA.printGenericLn("Testing \"After the curtain\" with Strings:");
        MAGENTA.printGenericLn(testCurtain);
        MAGENTA.printGenericLn("Testing \"After the curtain\" with Character:");
        MAGENTA.printGenericLn(testC);
        BLUE.printGenericLn("This strange phenomenon happen because of this:");
        BLUE.printGenericLn("    public String replace(char oldChar, char newChar) {\n" + "        if (oldChar != newChar) {\n"
                + "            String ret = isLatin1() ? StringLatin1.replace(value, oldChar, newChar)\n"
                + "                                    : StringUTF16.replace(value, oldChar, newChar);\n"
                + "            if (ret != null) {\n" + "                return ret;\n" + "            }\n"
                + "        }\n" + "        return this;\n" + "    }");
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. String constants can be compared with the equals logical operator.");
        GREEN.printGenericLn("2. The `replace` method, with string, always returns a new string, which invalidates the use of the logic operator.");
        GREEN.printGenericLn("3. The `replace` method, with a char, returns a new string, if the chars are different, which not always invalidates the use of the logic operator.");
        GREEN.printGenericLn("4. Replacing with the same character returns the same String.");
        moduleEnd();
    }

    private static void exercise18() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 18. Abstract classes and the `new` keyword");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We have a plan for a guitar. It is probably the most important instrument in Indie music.");
        GREEN.printGenericLn("Deadline is approaching and you have to deliver it! It's not ready!");
        GREEN.printGenericLn("You do have an initial Blueprint and so we'll create our guitar like that!");

        final Guitar guitar = new Guitar() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return "This guitar isn't ready!";
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };

        MAGENTA.printGenericLn("This is our guitar at the moment -> %s", guitar);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Although a very simple concept, it is important to notice that no abstractions may exist in instances.");
        GREEN.printGenericLn("2. This is why, when we crate instances of anonymous classes, we are force to implement whatever is left from the abstraction.");
    }

    private static void exercise17() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 17. `jdeps` `--module-path` `-cp` `--class-path` and `-classpath`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: Let's examine jdeps by looking at Song \"Cousins\" from Vampire Weekend..,Again!");
        GREEN.printGenericLn("Please run mastery-4-3-modularity in order to fulfill this exercise.");
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. You can call jdeps with -cp -classpath or --class-path.");
        GREEN.printGenericLn("2. The last element of the command can be converted to an automatic module.");
        GREEN.printGenericLn("3. Elements in class path are considered normal jars.");
        GREEN.printGenericLn("4. Automatic modules can still read from the class path.");
        GREEN.printGenericLn("5. Named modules cannot.");
        GREEN.printGenericLn("6. The later two are the reason why the firs command works well and the following doesn't.");
    }

    private static void exercise16() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 16. Overriding methods returning primitives");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We are going to see how many songs per record, on average, are Animal Collective developing.");
        GREEN.printGenericLn("We want one or more methods that return different types: Byte, Short, Character, Integer, Long, Float and Double");
        GREEN.printGenericLn("We will use the AlbumCalculator for that");

        var albumCalculator = new AlbumCalculator(new HashMap<>() {{
            put("Spirit They're Gone, Spirit They've Vanished", 10);
            put("Danse Manatee", 12);
            put("Campfire Songs", 5);
            put("Here Comes the Indian", 7);
            put("Sung Tongs", 12);
            put("Feels", 9);
            put("Strawberry Jam", 9);
            put("Merriweather Post Pavilion", 11);
            put("Centipede Hz", 11);
            put("Painting With", 12);
        }});

        MAGENTA.printGenericLn("This is our album collection:");
        MAGENTA.printGenericLn(albumCalculator);
        MAGENTA.printGenericLn("And here are different ways to calculate average songs per album:");

        final byte averageByte = albumCalculator.getAverageByte();
        final char averageCharacter = albumCalculator.getAverageCharacter();
        final double averageDouble = albumCalculator.getAverageDouble();
        final float averageFloat = albumCalculator.getAverageFloat();
        final int averageInt = albumCalculator.getAverageInt();
        final long averageLong = albumCalculator.getAverageLong();
        final short averageShort = albumCalculator.getAverageShort();

        MAGENTA.printGenericLn("Byte -> %s", averageByte);
        MAGENTA.printGenericLn("Character -> %s", averageCharacter);
        MAGENTA.printGenericLn("Double -> %s", averageDouble);
        MAGENTA.printGenericLn("Float -> %s", averageFloat);
        MAGENTA.printGenericLn("Integer -> %s", averageInt);
        MAGENTA.printGenericLn("Long -> %s", averageLong);
        MAGENTA.printGenericLn("Short -> %s", averageShort);

        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Methods with primitive return types can only be overridden by methods of the same return type.");
        GREEN.printGenericLn("2. There is no averagingFloat collector.");
        GREEN.printGenericLn("3. Look into the code and bear in mind the different ways to calculate average.");
    }

    private static void exercise15() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 15. add `override` in an `ArrayList`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We are going to store our Animal Collective record collection in and ArrayList.");
        GREEN.printGenericLn("But is isn't no ordinary list! This is a AnimalCollectiveList!");
        var acList = new AnimalCollectiveList();
        acList.add("Feels");
        acList.add("Strawberry Jam");
        acList.add("Merriweather Post Pavilion");
        YELLOW.printGenericLn("We would have gotten something different if we tried to override with add(Object)");
        YELLOW.printGenericLn("     'add(E)' in 'java.util.ArrayList' clashes with 'add(Object)' in 'org.jesperancinha.java11.mastery4dot3.record.AnimalCollectiveList';\n"
                + "     both methods have same erasure, yet neither overrides the other");
        MAGENTA.printGenericLn("This is our record collection:");
        MAGENTA.printGenericLn(acList);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. We cannot overload or override any of the original ArrayList methods with Object because of type erasure.");
        GREEN.printGenericLn("2. Type erasure \"Replace all type parameters in generic types with their bounds or Object if the type parameters are unbounded\"");
        GREEN.printGenericLn("3. If for example we attempt to override with add(Object), this won't work");
        GREEN.printGenericLn("4. Type erasure will replace add(T) with add(Object) and this will conflict with our own add(Object)");
        GREEN.printGenericLn("5. Since they don't override each other, this becomes impossible to do.");
    }

    private static void exercise14() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 14. When to call `flush`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We'll save lyrics of Animal Collective's single \"FloriDada\" from 2016 into a file.");
        GREEN.printGenericLn("Do we need to flush it?");

        var lyrics =
                "from: https://www.azlyrics.com/lyrics/animalcollective/floridada.html\nChild\n" + "Of limousines\n"
                        + "What's the best place\n" + "That you have seen\n" + "All of the hands\n" + "That you have shook\n"
                        + "Home of the queen of everything fancy\n" + "Is there a smell\n" + "That you can tell\n"
                        + "Gives you some peace\n" + "Sends you to hell\n" + "All of the beds\n" + "That you have yearned\n"
                        + "Is there a dream to\n" + "Where you'd return\n" + "Where is the plight\n" + "With the most stars\n"
                        + "Where do you drink";
        try (final BufferedWriter bfw = new BufferedWriter(new FileWriter("/tmp/floridada.txt"))) {
            bfw.write(lyrics, 0, lyrics.length());
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }

        MAGENTA.printGenericLn("Lyrics have  been written to \"/tmp/floridada.txt\".");
        MAGENTA.printGenericLn(lyrics);
        BLUE.printGenericLn("Please check file contents!");
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. The underlying close operation flushes the content to file.");
        GREEN.printGenericLn("2. Flush is usually called if you want to write sequentially to a file and not in one go.");
        GREEN.printGenericLn("3. This way, we can hold  the buffer in memory and possibly perform changes before  flushing it to a file.");
        GREEN.printGenericLn("4. We can also use flush, if we want to keep the buffer available for future writes to a file.");
    }

    private static void exercise13() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 13. Creating and filtering an `IntStream`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We will examine the position on the charts for Animal Collective at present: 2020/12/06");
        GREEN.printGenericLn("Specifically we'll look at peal positions for the \"Merriweather Post Pavilion\" album.");
        final var peakPositionsMPP = new int[]{13, 4, 63, 31, 25, 46, 58, 21, 37, 26};
        MAGENTA.printGenericLn("These are the peak positions for differenct countries:");
        MAGENTA.printGenericLn(Arrays.stream(peakPositionsMPP)
                .boxed()
                .collect(Collectors.toList()));
        final IntPredicate topTen = position -> position <= 10;
        final IntPredicate topTen1 = (int position) -> position <= 10;
        final var topTenCount = IntStream.of(peakPositionsMPP)
                .filter(topTen)
                .count();
        MAGENTA.printGenericLn("This many counties reached the top ten:");
        MAGENTA.printGenericLn(topTenCount);
        final var topTenCount1 = IntStream.of(peakPositionsMPP)
                .filter(topTen1)
                .count();
        MAGENTA.printGenericLn("If we want to specify type, we can, but its not needed:");
        MAGENTA.printGenericLn(topTenCount1);
        IntUnaryOperator takeItToNumberOne = a -> a - 3;
        final var toNumberOne = IntStream.of(peakPositionsMPP)
                .map(takeItToNumberOne)
                .parallel()
                .collect(ArrayList<Integer>::new, ArrayList::add, ArrayList::addAll);
        MAGENTA.printGenericLn("We can also pretend that they reached number 1 with a mapping trick:");
        MAGENTA.printGenericLn(toNumberOne);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. IntStream is different than Stream.");
        GREEN.printGenericLn("2. We know that collect does not take a Collector. It takes a Supplier, a ObjIntConsumer and a BiConsumer.");
        GREEN.printGenericLn("3. BiConsumer only works for parallel streams.");
        GREEN.printGenericLn("4. IntStream filters work with IntPredicates. They differ from normal predicates in that they only accept integers.");
        GREEN.printGenericLn("5. We cannot use a common Predicate in place of a IntPredicate. They are different.");
        GREEN.printGenericLn("6. We can map using a IntUnaryOperator.");
        GREEN.printGenericLn("7. IntStreams only accept int or varargs of type int. Lists are not allowed. Only arrays.");
    }

    private static void exercise12() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 12. Complex `operands` and `operators`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: In this case, there isn't really much we can do in terms of our Indie Theme.");
        GREEN.printGenericLn("In this exercise we just want to make a random execution flow and guess what is happening.");

        int z = 10;
        int w = 20;
        z = ++w;
        w += --z;
        if ((w == w + 4 - z--) & (w == --z)) {
            z -= 20;
        }
        BLUE.printGenericLn("        int z = 10;\n" + "        int w = 20;\n" + "        z= ++w;\n" + "        w += --z;\n"
                + "        if( (w == w + 4 - z--) & ( w == --z)){\n" + "            z -=20;\n" + "        }");
        Scanner sc = new Scanner(System.in);
        MAGENTA.printGeneric("Please guess what is the value of z at the end of this execution:");
        int guess;
        if (skipQuestions) {
            GREEN.printGenericLn("18");
            guess = 18;
        } else {
            guess = sc.nextInt();
        }
        if (guess == z) {
            MAGENTA.printGenericLn("You got it right!");
            MAGENTA.printGenericLn(z);
        } else {
            RED.printThrowableAndExit(new Exception(String.format("Unfortunately your guess %d, isn't correct. Please try again...", guess)));
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Operand evaluation is difficult. Keep an eye out for module java-11-mastery-logics for more exercises like this.");
        GREEN.printGenericLn("2. Operations follow typical Math operation and follow accolade definitions.");
        GREEN.printGenericLn("3. Operands get evaluated first, before the operations.");
        GREEN.printGenericLn("4. Disambiguation happens from left to right.");
    }

    private static void exercise11() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 11. `readPassword` in `Console`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: Capital Cities made a funny video, where to get to their video set, a password is asked at the entrance.");
        GREEN.printGenericLn("See the video here: https://www.youtube.com/watch?v=w7JFSLu8OHI");
        GREEN.printGenericLn("So, what's the password?");

        var console = System.console();
        if (Objects.isNull(console)) {
            MAGENTA.printGenericLn("Unfortunately, console is only available if you invoke this program via the command line");
            YELLOW.printGenericLn("Please build this project and run:");
            YELLOW.printGenericLn("java  -jar target/mastery-4-3-1.0.0-SNAPSHOT.jar ");
        } else {
            final char[] password = console.readPassword();
            final String passwordString = new String(password);
            MAGENTA.printGenericLn("You've typed '%s' as a password", passwordString);
            if (!passwordString.equals("More than a mystery")) {
                RED.printThrowableAndExit(new Exception(
                        String.format("Your password '%s' is wrong! We have to stop here. Please try again",
                                passwordString)));
            }
            MAGENTA.printGenericLn("You got it right!");
            GREEN.printGenericLn("Take-away");
            GREEN.printGenericLn("1. New String also accepts a char array");
            GREEN.printGenericLn("2. When typing a password, nothing is shown on screen, but the String is clearly introduced in the code.");
        }
    }

    private static void exercise10() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 10. Collecting duplicate entries to a `Map`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We have a collection of Capital Cities CD's");
        GREEN.printGenericLn("Now we want put those in a Map so that we have a reference to the year we bought them.");
        GREEN.printGenericLn("However, we made mistake and put two entries of the same album.");
        GREEN.printGenericLn("Can we still collect this into a Map?");

        var recordList = List.of(new AlbumForSale("In a Tidal Wave of Mystery", 2016L),
                new AlbumForSale("Solarize", 2019L), new AlbumForSale("Solarize", 2018L));
        MAGENTA.printGenericLn("Our album list:");
        MAGENTA.printGenericLn(recordList);
        try {
            final Map<String, Long> collect = recordList.stream()
                    .collect(Collectors.toMap(AlbumForSale::getName, AlbumForSale::getYearOfPurchase));
        } catch (IllegalStateException e) {
            RED.printGenericLn("This is expected. We have two elements of the same key. The runtime does not know how to solve these ambiguities -> %s", e);
        }
        MAGENTA.printGenericLn("We can't go back, so now we have to define a way to disambiguate this.");
        MAGENTA.printGenericLn("We do that with a merge function which is a BinaryOperator.");
        MAGENTA.printGenericLn("We'll consider the most recent purchase year.");
        final Map<String, Long> collect = recordList.stream()
                .collect(Collectors.toMap(AlbumForSale::getName, AlbumForSale::getYearOfPurchase, Math::max));
        MAGENTA.printGenericLn("We finally get our disambiguated map:");
        MAGENTA.printGenericLn(collect);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. If there are repeated keys, the map collection fails by default.");
        GREEN.printGenericLn("2. A merge strategy can be implemented.");
        GREEN.printGenericLn("3. The merge strategy is of type BinaryOperator, which is characterized by have the input and return parameters of the same type.");
        GREEN.printGenericLn("4. The later is how we distinguish between operators and functions..");
    }

    private static void exercise9() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 9. `++i` `i++` in a loop");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We are going to count the number of songs in \"Hercules and The Love Affair\" album.");
        GREEN.printGenericLn("There are 10 in the normal edition and we are two people counting!");

        int i;
        int j;
        for (i = 0, j = 0; j == i && i < 10; ++j, i++) {

            MAGENTA.printGenericLn("I count %d and my friend counts %d", i, j);
        }
        MAGENTA.printGenericLn("I counted %d and my friend counted %d", i, j);
        for (i = 0, j = 0; j == i && j < 10; ++j, i++) {

            MAGENTA.printGenericLn("I count %d and my friend counts %d", i, j);
        }
        MAGENTA.printGenericLn("I counted %d and my friend counted %d", i, j);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Although may look confusing, the point of this exercise is to show that ++ on the left side or on the right side, do not make a difference in an ordinary for loop.");
        GREEN.printGenericLn("2. When ++ is on the left, we sum first, then read and then return the result. This result goes in the loop.");
        GREEN.printGenericLn("3. When ++ is on the right, we read first, then sum and then return the result. This result goes in the loop.");
    }

    private static void exercise8() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 8. Boxing and the difference between primitives");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: The album \"Hercules and The Love Affair\" of the band of the same name was published on the 10th of March 2008.");
        GREEN.printGenericLn("We are going to use the numerology related to this album to explore boxing from primitive values");

        // Just a few warm up tests before we start
        // Note that boxing is strict in its conversion
        // Note that unboxing is just a strict as primitive inter conversion.
        double a = 100;
        long l = 2282787987934L;
        long s = 22;
        Double b = 1001d;
        Long d = 23434553334523434L;
        Integer e = 1312;
        Long f = 1L;
        Float g = 1.1f;
        Double h = 1.1;
        double o = h;
        double p = g;
        double q = f;
        double r = e;

        MAGENTA.printGenericLn("This album lasts for 46m 29s.");
        final Double doubleDuration1 = (46d + 29d / 60);
        final Double doubleDuration2 = (46d + 29 / 60);
        final Double doubleDuration3 = (46 + 29d / 60);
        MAGENTA.printGenericLn("Which in minutes can also be:");
        MAGENTA.printGenericLn("%s %s %s (minutes) in double", doubleDuration1, doubleDuration2, doubleDuration3);
        MAGENTA.printGenericLn("or");
        final Float floatDuration1 = (46f + 29f / 60);
        final Float floatDuration2 = (46f + 29 / 60);
        final Float floatDuration3 = (46 + 29f / 60);
        MAGENTA.printGenericLn("%s %s %s (minutes) in double", floatDuration1, floatDuration2, floatDuration3);
        final Integer yearInteger = 2008;
        final Long yearLong = 2008L;
        MAGENTA.printGenericLn("This album was published on the year %d and %d", yearInteger, yearLong);
        final Character c = 'H';
        final Character c1 = 72;
        final Byte byteNumber = 46;
        final Short shortNumber = 2008;
        MAGENTA.printGenericLn("The album starts with letter '%s' which is an %d in the integer form.", c, (int) c1);
        MAGENTA.printGenericLn("Since the duration is shorter than %d, we can register it in a Byte %d.", Byte.MAX_VALUE, byteNumber);
        MAGENTA.printGenericLn("Finally the published year can be registered in a two byte type like Short %d.", shortNumber);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. In Boxing, the only possible conversions are from int to Byte, Short, Character and Integer.");
        GREEN.printGenericLn("2. Long needs an L at the end of it.There is no automatic conversion.");
        GREEN.printGenericLn("3. Double and Float need D and F respectively. There is no automatic conversion.");
    }

    private static void exercise7() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 7. `jdeps` alternative `commands`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: Let's examine jdeps by looking at Song \"Cousins\" from Vampire Weekend");
        GREEN.printGenericLn("Please run mastery-4-3-modularity in order to fulfill this exercise.");
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. You can call jdeps with -cp -classpath or --class-path.");
        GREEN.printGenericLn("2. Classpath only works with unamed modules/automatic modules and their dependencies.");
        GREEN.printGenericLn("3. Classpath does not work for modules that depend on automatic modules.");
    }

    private static void exercise6() {
        BRIGHT_CYAN.printGenericLn("--- 6. Downcasting and Upcasting");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: Hercules and Love Affair is on tour and you are going to see them in the backstage!");
        GREEN.printGenericLn("Can you go on their trailer? Probably not ☹️. We'll look into the not case.");
        var tourTrailerHLA = new TourTrailer("Hercules and Love Affair");
        MAGENTA.printGenericLn("This is the band in the trailer: %s", tourTrailerHLA);
        var limoFriends = new Limousine(List.of("You", "Joan", "Edith", "Margaret", "Dorothy"));
        MAGENTA.printGenericLn("You and your friends %s are now in the limo!", limoFriends);
        final Transport transportHLA = tourTrailerHLA;
        final Transport transportFriends = limoFriends;
        MAGENTA.printGenericLn("The Transport for the Trailer is %s", transportHLA);
        MAGENTA.printGenericLn("The Transport for the Limousine is %s", transportFriends);
        // Inconvertible types; cannot cast 'org.jesperancinha.java11.mastery4dot3.transport.Limousine' to 'org.jesperancinha.java11.mastery4dot3.transport.TourTrailer'
        // final TourTrailer trailerFriends = (TourTrailer)limoFriends;
        try {
            final TourTrailer trailerFriends = (TourTrailer) transportFriends;
        } catch (ClassCastException e) {
            RED.printGenericLn("This is expected %s", e);
            RED.printGenericLn("There is no compilation error, because we are downcasting from transportFriends, which is a reference to a Transport interface");
            RED.printGenericLn("Transport interfaces can be Trailers but of course they can also be Limousines.");
            RED.printGenericLn("If the instance is a Limousine, then it cannot be a Trailer at the same time.");
        }
        final Trailer trailerHLA = tourTrailerHLA;
        MAGENTA.printGenericLn("Finally a tour trailer HLA is also just a trailer");
        MAGENTA.printGenericLn("The subclass TourTrailer is just a more specific case of Trailer");
        MAGENTA.printGenericLn("And so we have the Trailer as %s", trailerHLA);

        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. var declaration plays a smaller role in downcasting and upcasting, since the type is assigned on the right side.");
        GREEN.printGenericLn("2. Upcasting is automatic, when the subtype is known.");
        GREEN.printGenericLn("3. Casting in general has to be explicit if the subtype is unknown.");
        GREEN.printGenericLn("4. Compilation errors occurs when the subtype is known and doesn't match the type being cast to.");
        GREEN.printGenericLn("5. If it is possible to downcast, the compiler has no way to differentiate the actual instance being referenced to.");
        GREEN.printGenericLn("6. The later results in a ClassCastException, which is a RuntimeException because only during runtime will the actual cast be attempted.");
    }

    private static void exercise5() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 5. `Predicate` of types");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: Vampire Weekend had 2 wind by the Grammys for two of their albums.");
        GREEN.printGenericLn("We'll build some predicates based on this and see the small differences.");

        final Predicate<Album> predicateWithType = (Album a) -> {
            if (a.getAlbumName()
                    .toLowerCase()
                    .startsWith("Father Of The Bride".toLowerCase())) {
                return true;
            }
            return a.getAlbumName()
                    .toLowerCase()
                    .startsWith("Modern Vampires Of The City".toLowerCase());
        };

        final Predicate<Album> predicateWithTypeOnlyOnReference = (a) -> {
            if (a.getAlbumName()
                    .toLowerCase()
                    .startsWith("Father Of The Bride".toLowerCase())) {
                return true;
            }
            return a.getAlbumName()
                    .toLowerCase()
                    .startsWith("Modern Vampires Of The City".toLowerCase());
        };

        final Predicate predicateWithoutType = (a) -> {
            if (((Album) a).getAlbumName()
                    .toLowerCase()
                    .startsWith("Father Of The Bride".toLowerCase())) {
                return true;
            }
            return ((Album) a).getAlbumName()
                    .toLowerCase()
                    .startsWith("Modern Vampires Of The City".toLowerCase());
        };
        var fatherOfTheBride = new Album("Father of the Bride (Vinyl - Orange, Limited Edition)", "Vampire Weekend",
                List.of());
        var modernVampiresOfTheCity = new Album("Modern Vampires of The City", "Vampire Weekend", List.of());
        var contra = new Album("Contra", "Vampire Weekend", List.of());
        MAGENTA.printGenericLn("Albunm %s won the grammys -> %s", fatherOfTheBride, predicateWithType.test(fatherOfTheBride));
        // Unchecked call to 'test(T)' as a member of raw type 'java.util.function.Predicate'
        MAGENTA.printGenericLn("Album %s won the grammys -> %s", modernVampiresOfTheCity, predicateWithoutType.test(modernVampiresOfTheCity));
        MAGENTA.printGenericLn("Album %s won the grammys -> %s", contra, predicateWithTypeOnlyOnReference.test(contra));
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Predicate with types are checked and therefore the reference much be checked as well for type");
        GREEN.printGenericLn("2. Predicate without types are unchecked and unsafe and therefore the reference cannot be typed.");
        GREEN.printGenericLn("3. You don't have to define the type of the input parameter if you already have done so for the reference.");
        GREEN.printGenericLn("4. The previous rule works the same way as the diamond notation works.");
    }

    private static void exercise4() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 4. Valid modes in `RandomAccessFile`. Difference from using `append`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We are writing the lyrics to Contra");
        GREEN.printGenericLn("We will use alternative methods to do so and alternate");
        GREEN.printGenericLn("file will be located in /tmp/contra.txt");
        printRainbowLn('-');
        var allLines = List.of("https://www.songteksten.nl/songteksten/302818/vampire-weekend/i-think-ur-a-contra.html",
                "Never pick sides", "Never choose between two", "But I just wanted you", "I just wanted you",
                "Said never pick sides", "Never choose between two", "But I just wanted you", "I just wanted you",
                "I think you're a contra", "I think that you've lied", "Don't call me a contra", "Till you've tried");

        final Iterator<String> iterator = allLines.iterator();
        final String name = "/tmp/contra.txt";
        while (iterator.hasNext()) {
            try (var raf = new RandomAccessFile(name, "rw")) {
                raf.seek(raf.length());
                final String next = iterator.next();
                raf.writeUTF(next);
                raf.writeUTF("\n");
                MAGENTA.printGenericLn(next);
            } catch (FileNotFoundException e) {
                RED.printThrowableAndExit(e);
            } catch (IOException e) {
                RED.printThrowableAndExit(e);
            }

            try (var fos = new FileOutputStream(name, true)) {
                if (iterator.hasNext()) {
                    final String next = iterator.next();
                    fos.write(next.getBytes(StandardCharsets.UTF_8));
                    fos.write("\n".getBytes(StandardCharsets.UTF_8));
                    MAGENTA.printGenericLn(next);

                }
            } catch (FileNotFoundException e) {
                RED.printThrowableAndExit(e);
            } catch (IOException e) {
                RED.printThrowableAndExit(e);
            }
        }
        printRainbowLn('-');
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. With RandomAccessFile, we can use seek to get to a point in the file.");
        GREEN.printGenericLn("2. With RandomAccessFile, we know how many bytes exist in the file.");
        GREEN.printGenericLn("3. With RandomAccessFile, the position after the end of the file has an index number equal to the file size.");
        GREEN.printGenericLn("4. The index is based on an inclusive start index and an exclusive end index.");
        GREEN.printGenericLn("5. With FileOutputStream we can append data at the end of the file without the need for seek. The append option does this for us.");
    }

    private static void exercise3() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 3. Mutability Guidelines with focus on 6.6.");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: In January 2020, Vampire Weekend won the best Album of the Year at the Grammy's.");
        GREEN.printGenericLn("At the same time they have had already released a limited edition orange vinyl version of this album.");
        GREEN.printGenericLn("No doubt that with such great success, this limited will have its price inflated through the years.");
        GREEN.printGenericLn("You bought this record, and now, years later, a friend asks you if you can lend they your record.");
        GREEN.printGenericLn("You are very protective of such a music gem and so you decide to make a copy of it, and give lend that to your friend.");
        GREEN.printGenericLn("Your friend's intention turns out to be something else in the end. They was going to scratch it for you");
        printRainbowLn('-');
        var friend = new Frenemy("Frenemy");
        var orangeAlbum = new Album("Father of the Bride (Vinyl - Orange, Limited Edition)", "Vampire Weekend",
                List.of("I know the reason why you think you gotta leave".getBytes(StandardCharsets.UTF_8),
                        "We took a vow in summertime".getBytes(StandardCharsets.UTF_8)));
        MAGENTA.printGenericLn("This is the album you were about to lend:");
        MAGENTA.printGenericLn(orangeAlbum);
        MAGENTA.printGenericLn("If you had lend it to %s", friend);
        friend.lendAlbum(orangeAlbum);
        MAGENTA.printGenericLn("This would be the returned album:");
        MAGENTA.printGenericLn(orangeAlbum);
        printRainbowLn('-');
        MAGENTA.printGenericLn("But since you are pretty safe in what you do, you are going to lend:");
        var yourOrangeAlbum = new Album("Father of the Bride (Vinyl - Orange, Limited Edition)", "Vampire Weekend",
                List.of("I know the reason why you think you gotta leave".getBytes(StandardCharsets.UTF_8),
                        "We took a vow in summertime".getBytes(StandardCharsets.UTF_8)));
        final Album copy = yourOrangeAlbum.copy();
        friend.lendAlbum(copy);
        MAGENTA.printGenericLn("And so, although your friend did this to your copy:");
        MAGENTA.printGenericLn(copy);
        MAGENTA.printGenericLn("Your original is still there 😉!!");
        MAGENTA.printGenericLn(yourOrangeAlbum);
        printRainbowLn('-');
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Guideline 6-6 / MUTABLE-6: Treat passing input to untrusted object as output");
        GREEN.printGenericLn("2. More info: https://www.oracle.com/java/technologies/javase/seccodeguide.html");
    }

    private static void exercise2() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 2. Using `mapToObj`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: Oracular Spectacular reached interesting top positions world-wide.");
        GREEN.printGenericLn("Let's have a look at the math behind it");
        var peakPositionsPerCountry = Map.of("US", 38, "AUS", 6, "BEL", 10, "CAN", 24, "FRA", 22, "GER", 65, "IRL", 5,
                "NZ", 13, "SWI", 68, "UK", 8);
        MAGENTA.printGenericLn("This is their peak register on the charts on the  16th November 2020");
        MAGENTA.printGenericLn(peakPositionsPerCountry);
        printRainbowLn('-');
        // <R> R collect(Supplier<R> supplier,
        // ObjIntConsumer<R> accumulator,
        // BiConsumer<R, R> combiner);
        final List<Integer> list01 = peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i -> i)
                .collect(ArrayList::new, new ObjIntConsumer<ArrayList<Integer>>() {
                    @Override
                    public void accept(ArrayList<Integer> integers, int value) {
                        MAGENTA.printGenericLn("When our stream is sequential, we can see things nicely, but performance goes away:");
                        MAGENTA.printGenericLn("Adding value %d", value);
                        integers.add(value);
                    }
                }, ArrayList::addAll);
        printRainbowLn('-');
        final List<Integer> list02 = peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i -> i)
                .parallel()
                .collect(ArrayList::new, (integers, value) -> {
                    integers.add(value);
                    BRIGHT_MAGENTA.printGeneric(value);
                }, (integers, integers2) -> {
                    MAGENTA.printGeneric("I'm reaching this now, because I'm a parallel stream!");
                    MAGENTA.printGeneric(integers);
                    MAGENTA.printGeneric(integers2);
                    integers.addAll(integers2);
                });
        printRainbowLn('-');
        MAGENTA.printGenericLn("Sequential list result -> %s", list01);
        MAGENTA.printGenericLn("Sequential list result -> %s", list02);
        printRainbowLn('-');
        MAGENTA.printGenericLn("If we want to calculate the average this way and with high performance, we can!");
        final double avg = peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i -> i)
                .parallel()
                .collect(() -> new DoubleAccumulator(Double::sum, 0), new ObjIntConsumer<DoubleAccumulator>() {
                    @Override
                    public void accept(DoubleAccumulator atomicInteger, int value) {
                        atomicInteger.accumulate(value);
                    }
                }, new BiConsumer<DoubleAccumulator, DoubleAccumulator>() {
                    @Override
                    public void accept(DoubleAccumulator doubleAccumulator, DoubleAccumulator doubleAccumulator2) {
                        doubleAccumulator.accumulate(doubleAccumulator2.doubleValue());
                    }
                })
                .doubleValue() / peakPositionsPerCountry.values()
                .size();

        MAGENTA.printGenericLn("This is the result -> %f", avg);
        printRainbowLn('-');
        MAGENTA.printGenericLn("However, Number streams, already contain average methods. This is the reason why a collector doesn't make sense to have in a Number stream");
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .collect(Collectors.averagingDouble(i11 -> i11)));
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .collect(Collectors.averagingInt(i10 -> i10)));
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .collect(Collectors.averagingLong(i9 -> i9)));
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i8 -> i8)
                .mapToObj(i8 -> i8)
                .collect(Collectors.averagingLong(i8 -> i8)));
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i7 -> i7)
                .boxed()
                .collect(Collectors.averagingLong(i7 -> i7)));
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i6 -> i6)
                .average()
                .getAsDouble());
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i5 -> i5)
                .mapToDouble(i5 -> i5)
                .average()
                .getAsDouble());
        MAGENTA.printGenericLn("Oracle Spectacular reached an average peak of %f around the world", peakPositionsPerCountry.values()
                .stream()
                .mapToInt(i4 -> i4)
                .mapToLong(i4 -> i4)
                .average()
                .getAsDouble());
        printRainbowLn('-');
        MAGENTA.printGenericLn("Curiosity 1 (Forcing Doubles) ->  %f", DoubleStream.of(11.45, 12.43, 14.56)
                .mapToObj(i3 -> i3)
                .collect(Collectors.averagingDouble(i3 -> i3)));
        MAGENTA.printGenericLn("Curiosity 2 (Forcing Longs) ->  %f", DoubleStream.of(11.45, 12.43, 14.56)
                .mapToObj(i2 -> i2)
                .collect(Collectors.averagingLong(Double::longValue)));
        MAGENTA.printGenericLn("Curiosity 3 (Forcing Ints) ->  %f", DoubleStream.of(11.45, 12.43, 14.56)
                .mapToObj(i1 -> i1)
                .collect(Collectors.averagingInt(Double::intValue)));
        MAGENTA.printGenericLn("Curiosity 4 (no values) ->  %f", DoubleStream.of()
                .mapToObj(i -> i)
                .collect(Collectors.averagingInt(Double::intValue)));
        MAGENTA.printGenericLn("Note that the double average is more accurate because Long and Int have round up the decimals to unit.");
        printRainbowLn('-');
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Calculating average can be done in different ways.");
        GREEN.printGenericLn("2. All ways require the return value to double in the end unless we make our custom calculation.");
        GREEN.printGenericLn("3. Using collectors, the result in never an Optional and this is because that is the way collectors work.");
        GREEN.printGenericLn("4. Number streams do have collectors. We calculated avg using our own average implementation, but it will always be less efficient.");
        GREEN.printGenericLn("5. The collector of the Number streams are used to solve value accumulation issues. They are perfect for custom reduce operations.");
        GREEN.printGenericLn("6. The BiConsumer of a Number stream collector is called only during `parallel` stream operations. It is not called at all otherwise.");
        GREEN.printGenericLn("7. The `average` method of a Number stream is there to solve this problem. However, it returns an `OptionalDouble`. We then call getAsDouble to know the value.");
    }

    private static void exercise1() {
        printRainbowLn('=');
        BRIGHT_CYAN.printGenericLn("--- 1. Indexes in a `ResultSet`");
        printRainbowLn('=');
        GREEN.printGenericLn("Case: We are wondering what happened to MGMT and why we don't hear about them anymore.");
        GREEN.printGenericLn("On this first exercise we will investigate their triad of hits.");
        GREEN.printGenericLn("MGMT came into the Indie music scene in 2008 with their album Oracular Spectacular.");

        var songTimeToPretend = new Song("Time to pretend", "MGMT", LocalDate.of(2008, 3, 3));
        var songKids = new Song("Kids", "MGMT", LocalDate.of(2008, 10, 13));
        var songElectricFeel = new Song("Electric Feel", "MGMT", LocalDate.of(2008, 6, 23));

        var allSongs = List.of(songTimeToPretend, songKids, songElectricFeel);

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:h2:mem:", "sa", "");
        } catch (SQLException e) {
            RED.printThrowableAndExit(e);
        }
        PreparedStatement preparedStatementCreate = null;
        try {
            assert connection != null;
            preparedStatementCreate = connection.prepareStatement(
                    "CREATE TABLE Song (" + "   id INT AUTO_INCREMENT NOT NULL, \n" + "   SONG VARCHAR(50) NOT NULL, \n"
                            + "   BAND VARCHAR(50) NOT NULL, \n" + "   HITYEAR INT " + ");");
        } catch (SQLException e) {
            RED.printThrowableAndExit(e);
        }
        boolean executeCreation = false;
        try {
            assert preparedStatementCreate != null;
            executeCreation = preparedStatementCreate.execute();
        } catch (SQLException e) {
            RED.printThrowableAndExit(e);
        }
        if (executeCreation) {
            MAGENTA.printGeneric("Table Song is created!");
        }

        // It doesn't look like it, but this Connection is effectively final.
        Connection finalConnection = connection;
        allSongs.forEach(song -> {
            try {
                final PreparedStatement statement = finalConnection.prepareStatement(
                        "INSERT INTO Song (SONG, BAND, HITYEAR) VALUES(?,?,?);");
                statement.setString(1, song.getSong());
                statement.setString(2, song.getBand());
                statement.setLong(3, song.getHitLocalDate()
                        .getYear());
                if (statement.execute()) {
                    MAGENTA.printGeneric("Inserted song %s", song);
                }
            } catch (SQLException e) {
                RED.printThrowableAndExit(e);
            }

        });
        printRainbowLn('-');
        try {
            final Statement statement = connection.createStatement();
            final ResultSet resultSet = statement.executeQuery("SELECT SONG, BAND, HITYEAR from SONG;");
            while (resultSet.next()) {
                final String song = resultSet.getString("SONG");
                final String song1 = resultSet.getString(1);
                final String band = resultSet.getString("BAND");
                final String band2 = resultSet.getString(2);
                final Array bandArray = resultSet.getArray("BAND");
                final Array bandArray2 = resultSet.getArray(2);
                final Long hitYear = resultSet.getLong("HITYEAR");
                final Long hitYearLong3 = resultSet.getLong(3);
                final Integer hitYearInt = resultSet.getInt("HITYEAR");
                final Integer hitYearInt3 = resultSet.getInt(3);
                final BigDecimal hitYearBigDecimal = resultSet.getBigDecimal("HITYEAR");
                final BigDecimal hitYearBigDecimal3 = resultSet.getBigDecimal(3);
                final Float hitYearFloat = resultSet.getFloat("HITYEAR");
                final Float hitYearFloat3 = resultSet.getFloat(3);
                final Array hitYearArray = resultSet.getArray("HITYEAR");
                final Array hitYearArray3 = resultSet.getArray(3);
                MAGENTA.printGenericLn("resultSet.getString(\"SONG\"); -> %s", song);
                MAGENTA.printGenericLn("resultSet.getString(1); -> %s", song1);
                MAGENTA.printGenericLn("resultSet.getString(\"BAND\"); -> %s", band);
                MAGENTA.printGenericLn("resultSet.getString(2); -> %s", band2);
                MAGENTA.printGenericLn("resultSet.getArray(\"BAND\"); -> %s", bandArray);
                MAGENTA.printGenericLn("resultSet.getArray(2);-> %s", bandArray2);
                MAGENTA.printGenericLn("resultSet.getLong(\"HITYEAR\");-> %s", hitYear);
                MAGENTA.printGenericLn("resultSet.getLong(3); -> %s", hitYearLong3);
                MAGENTA.printGenericLn("resultSet.getInt(\"HITYEAR\");-> %s", hitYearInt);
                MAGENTA.printGenericLn("resultSet.getInt(3);-> %s", hitYearInt3);
                MAGENTA.printGenericLn("resultSet.getBigDecimal(\"HITYEAR\");-> %s", hitYearBigDecimal);
                MAGENTA.printGenericLn("resultSet.getBigDecimal(3); -> %s", hitYearBigDecimal3);
                MAGENTA.printGenericLn("resultSet.getFloat(\"HITYEAR\");-> %s", hitYearFloat);
                MAGENTA.printGenericLn("resultSet.getFloat(3); -> %s", hitYearFloat3);
                MAGENTA.printGenericLn("resultSet.getArray(\"HITYEAR\");-> %s", hitYearArray);
                MAGENTA.printGenericLn("resultSet.getArray(3); -> %s", hitYearArray3);
                printRainbowLn('-');
            }
        } catch (SQLException e) {
            RED.printThrowableAndExit(e);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            RED.printThrowableAndExit(e);
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. In Result sets, indexes are 1 based");
        GREEN.printGenericLn("2. Conversions happen automatically if they match");
        GREEN.printGenericLn("3. An Int if convertible to Integer, Long, Float, Double and Big Integer");
        GREEN.printGenericLn("4. We can even get a special java.sql.Array type, which  returns the data in an array form valid for all types");
    }

    private static void moduleEnd() {
        printUnicornsLn(100);
        GREEN.printGenericLn("Hope you enjoyed this mastery into Java 11 with some Indie/Pop flavor to it.");
        GREEN.printGenericLn("Please keep coming back as I'll be creating more mastery modules.");
        GREEN.printGenericLn("Thank you!");
        printUnicornsLn(100);
    }
}
