package org.jesperancinha.java11.mastery3dot1;

import org.jesperancinha.console.consolerizer.console.Consolerizer;
import org.jesperancinha.java11.mastery3dot1.concert.Concert;
import org.jesperancinha.java11.mastery3dot1.concert.LiveConcert;
import org.jesperancinha.java11.mastery3dot1.concert.SafeLiveConcert;
import org.jesperancinha.java11.mastery3dot1.concert.UnregulatedConcert;
import org.jesperancinha.java11.mastery3dot1.concert.VirtualConcert;
import org.jesperancinha.java11.mastery3dot1.furniture.Case;
import org.jesperancinha.java11.mastery3dot1.furniture.Container;
import org.jesperancinha.java11.mastery3dot1.furniture.RecordCase;
import org.jesperancinha.java11.mastery3dot1.items.Record;
import org.jesperancinha.java11.mastery3dot1.items.ShopItem;
import org.jesperancinha.java11.mastery3dot1.items.VinylRecord;
import org.jesperancinha.java11.mastery3dot1.songs.OriginalVlinder;
import org.jesperancinha.java11.mastery3dot1.songs.Vlinder;
import org.jesperancinha.java11.mastery3dot1.tickets.FinalTicket;
import org.jesperancinha.java11.mastery3dot1.tickets.PrivateTicket;
import org.jesperancinha.java11.mastery3dot1.tickets.UnsafeTicket;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printNewLine;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowTitleLn;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.printSameLine;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerGraphs.printUnicornsLn;

public class Mastery3Dot1Runner {
    public static void main(String[] args) throws InterruptedException {
        Consolerizer.typingWaitGlobal = 0;

        BLUE.printGenericLn("================== Master Module mastery-3-1 ==================");

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

        printUnicornsLn(100);
        GREEN.printGenericLn("Hope you enjoyed this mastery into Java 11 with a dutch flavour to it.");
        GREEN.printGenericLn("Please keep coming back as I'll be creating more mastery modules.");
        GREEN.printGenericLn("Thank you!");
        printUnicornsLn(100);
    }

    private static void exercise16() {
        BRIGHT_CYAN.printGenericLn("--- 16. Accessibility `@Override`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We hve different versions of `Verdronken Vlinder`.");
        GREEN.printGenericLn("How many ways can we get them?");
        var originalVlinder = new OriginalVlinder();
        originalVlinder.publicPoint();
        var vlinder = new Vlinder();
        vlinder.publicPoint();
        vlinder.playVlinder();

    }

    private static void exercise15() {
        BRIGHT_CYAN.printGenericLn("--- 15. `java.lang.OutOfMemoryError` and `Error` classes");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: A new top 20 NL Hits CD is Out! And everyone wants to buy it!");
        GREEN.printGenericLn("What will happen if too many people buy it?");
        BLUE.printGenericLn("Please wait...");
        BLUE.printGenericLn("...");
        var soldAlbums = new ArrayList<String>();
        try {
            for (; ; ) {
                final String transactionId = UUID.randomUUID().toString();
                soldAlbums.add(transactionId);
                printSameLine(transactionId);
                soldAlbums.addAll(soldAlbums);
            }
        } catch (Exception e) {
            printNewLine();
            RED.printGenericLn("This is an exception that should have not happened %s", e);
        } catch (Error e) {
            printNewLine();
            RED.printGenericLn("This is the expected error %s", e);
        }
        GREEN.printGenericLn("OutOfMemory is always an Error.");
        GREEN.printGenericLn("We can catch it!");
    }

    private static void exercise14() {
        BRIGHT_CYAN.printGenericLn("--- 14. Accessing `static` `interface` methods");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We received a record case and want to see its descriptions.");
        GREEN.printGenericLn("Do we need its instance?.");
        final RecordCase recordCase = new RecordCase(100);
        GREEN.printGenericLn("This is possible: recordCase.describeMe();");
        recordCase.describeMe();
        GREEN.printGenericLn("This is possible: ((Case)recordCase).describeMe();");
        ((Case) recordCase).describeMe();
        RED.printGenericLn("This is not possible: ((Container)recordCase).describeMe();");
        GREEN.printGenericLn("This is possible: Container.describeMe();");
        Container.describeMe();
        GREEN.printGenericLn("The point is that interface static methods cannot be called via an instance.");
        GREEN.printGenericLn("There is hardly any reason to call a static method from an instance anyways.");
        GREEN.printGenericLn("They can though, but only if they belong to ordinary classes and not interfaces.");
    }

    private static void exercise13() {
        BRIGHT_CYAN.printGenericLn("--- 13. How to guarantee Immutability - [Java Security Guidelines](https://www.oracle.com/java/technologies/javase/seccodeguide.html)");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Someone is trying to get into Trix in Antwerp to watch a Gers Pardoel show");
        GREEN.printGenericLn("However, the show on the ticket is from a missed show in Villa Thallia in Rotterdam which took  place 8 days ago.");
        GREEN.printGenericLn("Can we mutate any of the three tickets we have for the past show?");
        var ticketUnsafe = new UnsafeTicket(new Date(2019, 10, 9, 19, 30), "Villa Thalia - Rotterdam", "Gers Pardoel");
        var ticketFinal = new FinalTicket(new Date(2019, 10, 9, 19, 30), "Villa Thalia - Rotterdam", "Gers Pardoel");
        var ticketPrivate = PrivateTicket.createTicket(new Date(2019, 10, 9, 19, 30), "Villa Thalia - Rotterdam", "Gers Pardoel");
        GREEN.printGenericLn("Current Tickets");
        MAGENTA.printGenericLn("Unsafe Ticket -> %s", ticketUnsafe);
        MAGENTA.printGenericLn("Final Ticket -> %s", ticketFinal);
        MAGENTA.printGenericLn("Private Ticket -> %s", ticketPrivate);
        final Date dateUnsafe = ticketUnsafe.getDate();
        dateUnsafe.setDate(17);
        final Date dateFinal = ticketFinal.getDate();
        dateFinal.setDate(17);
        final Date datePrivate = ticketPrivate.getDate();
        datePrivate.setTime(17);
        GREEN.printGenericLn("New Tickets");
        MAGENTA.printGenericLn("Unsafe Ticket -> %s", ticketUnsafe);
        MAGENTA.printGenericLn("Final Ticket -> %s", ticketFinal);
        MAGENTA.printGenericLn("Private Ticket -> %s", ticketPrivate);
        GREEN.printGenericLn("These tickets actually cannot be changed to anything convincing.");
        GREEN.printGenericLn("However, one of the is not entirely immutable. We were able to change the date though.");
        GREEN.printGenericLn("Both the Final Ticket and Private Ticket are immutable. This is because they cannot be changed in any normal execution flow.");
    }

    private static void exercise12() {
        BRIGHT_CYAN.printGenericLn("--- 12. `Stream` count types");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We have the complete collection of `Diggy Dex` records.");
        GREEN.printGenericLn("We will now count them");
        final String[] allAlbums = {"Verhalen vanuit de Sofa", "Mayonaise voor de ziel", "Lange nachten, korte dagen", "Do it yourself", "Golven", "Karavaan"};
        var count = Arrays.stream(allAlbums).count();
        MAGENTA.printGenericLn("Diggy Dex has published %d albums!", count);
        MAGENTA.printGenericLn("The type of this count is long.");
        long countConvert = count;
        MAGENTA.printGenericLn("From long: %d", countConvert);
        GREEN.printGenericLn("Stream counts are always long.");
    }

    private static void exercise11() throws InterruptedException {
        BRIGHT_CYAN.printGenericLn("--- 11. Thread safe `Object` s");
        printRainbowLn("==");

        var liveConcert = new LiveConcert(50);
        var safeLiveConcert = new SafeLiveConcert(50);
        var unregulatedConcert = new UnregulatedConcert(50);
        var virtualConcert = new VirtualConcert(50);
        ExecutorService executorService1 = call100ThreadsOnConcert(liveConcert);
        ExecutorService executorService2 = call100ThreadsOnConcert(safeLiveConcert);
        ExecutorService executorService3 = call100ThreadsOnConcert(unregulatedConcert);
        ExecutorService executorService4 = call100ThreadsOnConcert(virtualConcert);
        executorService1.shutdown();
        executorService2.shutdown();
        executorService3.shutdown();
        executorService4.shutdown();
        executorService1.awaitTermination(10, TimeUnit.SECONDS);
        executorService2.awaitTermination(10, TimeUnit.SECONDS);
        executorService3.awaitTermination(10, TimeUnit.SECONDS);
        executorService4.awaitTermination(10, TimeUnit.SECONDS);
        GREEN.printGenericLn("Please wait while concert goers go inside the arenas...");
        ORANGE.printGenericLn("Live concert has %d goers", liveConcert.getCurrentCount());
        ORANGE.printGenericLn("Safe live concert has %d goers", safeLiveConcert.getCurrentCount());
        ORANGE.printGenericLn("Unregulated live concert has %d goers", unregulatedConcert.getCurrentCount());
        ORANGE.printGenericLn("Virtual live concert has %d goers", safeLiveConcert.getCurrentCount());
        GREEN.printGenericLn("All thread safe concert arenas should have only 50 concert goes.");
        GREEN.printGenericLn("We can also say that thread safe object allow changes to happen but in a controlled manner where one thread does not influece the others result.");
        GREEN.printGenericLn("In our case, more concert goers got in the  non thread-safe spaces.");
    }

    private static void exercise10() {
        BRIGHT_CYAN.printGenericLn("--- 10. Passing variables by value and not returning in `Stream`");
        printRainbowLn("==");
        GREEN.printGenericLn("Let's create a list of the band \"De Jeugd van Tegenwoordig\"");
        final String[] band = {"Willie Wartaal", "Vieze Fur", "Faberyayo", "Bas Bron"};
        MAGENTA.printGenericLn("The array is %10s", (Object[]) band);
        MAGENTA.printGenericLn("This is the band: %s", Arrays.toString(band));
        var bandList = java.util.Arrays.stream(band).collect(Collectors.toList());
        MAGENTA.printGenericLn("This is the band  list : %s", bandList);
        bandList.forEach(member -> member.concat("(realName)"));
        MAGENTA.printGenericLn("The band didn't change! %s", bandList);
        var realNameList = new LinkedList<>(List.of("Olivier Mitshel Locadia", "Alfred Tratlehner", "Pepijn Lanen", "Bas Bron"));
        List<String> completeBand = bandList.stream().map(member -> member.concat("(").concat(realNameList.remove()).concat(")")).collect(Collectors.toList());
        MAGENTA.printGenericLn("We finally got all the names!! 😉 %s", completeBand);
        GREEN.printGenericLn("For loops do not affect elements directly. They may only affect their contents...");
    }

    private static void exercise9() {
        BRIGHT_CYAN.printGenericLn("--- 9. Declaring a `String` array.");
        printRainbowLn("==");
        GREEN.printGenericLn("We'll just list the band \"De Jeugd van Tegenwoordig\"");
        final String[] band = {"Willie Wartaal", "Vieze Fur", "Faberyayo", "Bas Bron"};
        BLUE.printGenericLn("final String[]  band = {\"Willie Wartaal\", \"Vieze Fur\", \"Faberyayo\", \"Bas Bron\"};");
        MAGENTA.printGenericLn("This is the band: %s", String.join(",", band));
    }

    private static void exercise8() {
        BRIGHT_CYAN.printGenericLn("--- 8. Initialization of invisible `primitive` members");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Our shop has grown a lot and we need a brand new bookcase!");
        GREEN.printGenericLn("Let's create one!");

        var recordCase = new RecordCase(100);
        MAGENTA.printGenericLn("Case details -> %s", recordCase);
        recordCase.printStuff();
        GREEN.printGenericLn("Take notice on the member calling before creation.");
        GREEN.printGenericLn("Which methods are actually called and why?");
        GREEN.printGenericLn("Generally speaking, only after `super`, are the instance variable members initialized.");
    }

    private static void exercise7() {
        BRIGHT_CYAN.printGenericLn("--- 7. Type of elements in a diamond notation declared `ArrayList` assigned to `var`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We've created a list of elements but didn't gave it a type with diamond notation!");
        GREEN.printGenericLn("We can't sell these at our shop this way, but what is their type?");
        YELLOW.printGenericLn(" var itemsWithNoName = new ArrayList<>();\n" +
                "        itemsWithNoName.add(\"Diggy Dex Ft. Eva De Roovere\");\n" +
                "        itemsWithNoName.add(\"Slaap Lekker (Fantastig Toch)\");\n" +
                "        itemsWithNoName.add(2009);\n" +
                "        itemsWithNoName.add(\"Hip Hop\");");
        var itemsWithNoName = new ArrayList<>();
        itemsWithNoName.add("Diggy Dex Ft. Eva De Roovere");
        itemsWithNoName.add("Slaap Lekker (Fantastig Toch)");
        itemsWithNoName.add(2009);
        itemsWithNoName.add("Hip Hop");
        Object singers = itemsWithNoName.get(0);
        YELLOW.printGenericLn("        Object singers = itemsWithNoName.get(0);\n");
        MAGENTA.printGenericLn("This is the type of this list, %s", itemsWithNoName.getClass());
        MAGENTA.printGenericLn("And these are the types of its contents, %s", itemsWithNoName.getClass());
        MAGENTA.printGenericLn("We can only list the singers, %s, `Object`'s", singers);
        GREEN.printGenericLn("The point is, just like in any List, the type is important when retrieving the items.");
        GREEN.printGenericLn("Although diamond notation is handy in the old syntax, with the use of `var` it becomes rather obsolete and leads to confusing code.");
    }

    private static void exercise6() {
        BRIGHT_CYAN.printGenericLn("--- 6. How `getRoot()` exhibits the root `Path`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We placed our files somewhere, but how do we call the root?");
        YELLOW.printGenericLn("Path.of(\"/tmp\").getRoot()");
        MAGENTA.printGenericLn(Path.of("/tmp").getRoot());
        GREEN.printGenericLn("That's it! Slashes are part of root, not of individual paths");
    }

    private static void exercise5() {
        BRIGHT_CYAN.printGenericLn("--- 5. How `null` is interpreted in overloading");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We receive different shop items.");
        GREEN.printGenericLn("Now we want to check their state.");
        GREEN.printGenericLn("In our shop there are many automated ways of checking the state of items, but we generally just call the `checkItem` procedure.");
        GREEN.printGenericLn("We receive a copy of the album \"De stilte voorbij\" by pop-band \"Abel\", but the store manager has found different ways to check it's authenticity.");
        GREEN.printGenericLn("Let's see how he does it:");

        var record = new VinylRecord("2742984738947894790942370470", "De stilte voorbij", "2000", "[PIAS] Holland", "Normal");
        MAGENTA.printGenericLn("This is our record. It's a vinyl! %s", record);
        MAGENTA.printGenericLn("We'll call `checkItem` in different ways!");
        MAGENTA.printGenericLn("Shop.checkItem(record);");
        Shop.checkItem(record);
        MAGENTA.printGenericLn("Shop.checkItem((Record) record);");
        Shop.checkItem((Record) record);
        MAGENTA.printGenericLn("Shop.checkItem((ShopItem) record);");
        Shop.checkItem((ShopItem) record);
        MAGENTA.printGenericLn("Finally we make a machine a start the `checkItem` procedure without a record");
        Shop.checkItem(null);
        GREEN.printGenericLn("Never forget that a call with null will search for the most specific overloading!");
    }

    private static void exercise4() {
        BRIGHT_CYAN.printGenericLn("--- 4. `@Override` in `equals`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We want to buy a record of Maaike Ouboter");
        GREEN.printGenericLn("We made a selection of an article we really want to buy.");
        MAGENTA.printGenericLn("Customer -> Good morning, do you have Maaike Ouboter album \"Vanaf nu is het van jou?\"");
        MAGENTA.printGenericLn("Clerk -> Yes I do, let me check...");
        var albumsInStore = List.of(
                new ShopItem("2742984738947894790942370470", "Vanaf nu is het van jou", "2018", "Sony Music Entertainment", "Normal"),
                new ShopItem("2394720347320943290482084328", "Vanaf nu is het van jou", "2018", "Sony Music Entertainment", "Special"),
                new ShopItem("9839043805934789054378573895", "En hoe het dan ook weer dag wordt", "2015", "Sony Music Entertainment", "Normal")
        );
        MAGENTA.printGenericLn("Clerk -> So that album was published in %s, by %s, one moment...", "2018", "Sony Music Entertainment");
        List<ShopItem> itemsInStore = albumsInStore.stream().filter(shopItem -> shopItem.equals(new ShopItem("", "Vanaf nu is het van jou", "2018", "Sony Music Entertainment", "Normal")))
                .collect(Collectors.toList());
        MAGENTA.printGenericLn("Clerk -> We seem to have two of those, do you know exactly the one you want?\n%s", itemsInStore);
        MAGENTA.printGenericLn("Customer -> Yes, I want the special super special please");
        MAGENTA.printGenericLn("Clerk -> Yes, let me check if we have it... %b. We don't sorry. Do you have another selection?", itemsInStore.contains(new ShopItem("", "Vanaf nu is het van jou", "2018", "Sony Music Entertainment", "SuperSpecial")));
        MAGENTA.printGenericLn("Customer -> Yes, I want the special edition please");
        MAGENTA.printGenericLn("Clerk -> Yes, let me check if we have it... %b. Yes! We do! Great! 😉", itemsInStore.contains(new ShopItem("", "Vanaf nu is het van jou", "2018", "Sony Music Entertainment", "Special")));
        GREEN.printGenericLn("Important take out here is that `@Override` must be done with `Object` and equals can of course be overloaded.");
    }

    private static void exercise3() {
        BRIGHT_CYAN.printGenericLn("--- 3. `Files.newDirectoryStream` Listings and the `glob` pattern");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We saved a part of Abel's Lyrics somewhere, for our social study work, but we don't know where the file is.");
        GREEN.printGenericLn("We took the lyrics from https://www.musixmatch.com/lyrics/Abel/Onderweg,");
        GREEN.printGenericLn("but now we have no access to the internet and we have to deliver our work in 2 hours! Help!");
        GREEN.printGenericLn("In this exercise we will find Abel's lyrics in our tmp folder. We hope the system hasn't deleted it yet...");
        MAGENTA.printGenericLn("We will try to find our file in /tmp. Remember to run ./prepare.sh. Check Readme.md for more details:");

        try {
            var temporaryFolder = Paths.get("/tmp");
            var glob1 = "*.{gif,jpeg,jpg,bmp}";
            GREEN.printGenericLn("If we use a glob filter of %s we get:", glob1);
            DirectoryStream<Path> ds1 = Files.newDirectoryStream(temporaryFolder, glob1);
            Spliterator<Path> spliterator1 = ds1.spliterator();
            if (spliterator1.tryAdvance(text4 -> YELLOW.printGenericLn(text4))) {
                spliterator1.forEachRemaining(text -> YELLOW.printGenericLn(text));
            } else {
                RED.printGenericLn("No file found!");
            }
            var glob2 = "*.{txt}";
            GREEN.printGenericLn("This was the wrong extension! If we use a glob filter of %s we get:", glob2);
            DirectoryStream<Path> ds2 = Files.newDirectoryStream(temporaryFolder, glob2);
            Spliterator<Path> spliterator2 = ds2.spliterator();
            if (spliterator2.tryAdvance(text3 -> YELLOW.printGenericLn(text3))) {
                spliterator2.forEachRemaining(text -> YELLOW.printGenericLn(text));
            } else {
                RED.printGenericLn("No file found!");
                RED.printGenericLn("We have to stop the lesson here because the test file isn't in /tmp folder. Please check Readme.md about running ./prepare.sh. If you still have issues try copying manually.");
                System.exit(1);
            }
            final String glob3 = "[ebal][ebal][ebal][ebal].[rwegonde][rwegonde][rwegonde][rwegonde][rwegonde][rwegonde][rwegonde][rwegonde].{txt}";
            GREEN.printGenericLn("But this may lead to a lot of them! If we use a glob filter of %s we get:", glob3);
            DirectoryStream<Path> ds3 = Files.newDirectoryStream(temporaryFolder, glob3);
            Spliterator<Path> spliterator3 = ds3.spliterator();
            if (spliterator3.tryAdvance(text2 -> YELLOW.printGenericLn(text2))) {
                spliterator3.forEachRemaining(text -> YELLOW.printGenericLn(text));
            } else {
                RED.printGenericLn("No file found!");
                RED.printGenericLn("We have to stop the lesson here because the test file isn't in /tmp folder. Please check Readme.md about running ./prepare.sh. If you still have issues try copying manually.");
                System.exit(1);
            }
            final String glob4 = "abel.onderweg.?";
            GREEN.printGenericLn("But this may still lead to a lot of them! If we use a glob filter of %s we get:", glob4);
            DirectoryStream<Path> ds4 = Files.newDirectoryStream(temporaryFolder, glob4);
            Spliterator<Path> spliterator4 = ds4.spliterator();
            if (spliterator4.tryAdvance(text1 -> YELLOW.printGenericLn(text1))) {
                spliterator4.forEachRemaining(text -> YELLOW.printGenericLn(text));
            } else {
                RED.printGenericLn("No file found!");
                RED.printGenericLn("We have to stop the lesson here because the test file isn't in /tmp folder. Please check Readme.md about running ./prepare.sh. If you still have issues try copying manually.");
                System.exit(1);
            }
            final String glob5 = "abel.onderweg.{txt}";
            GREEN.printGenericLn("But this is not even our file!! If we use a glob filter of %s we get:", glob5);
            DirectoryStream<Path> ds5 = Files.newDirectoryStream(temporaryFolder, glob5);
            Spliterator<Path> spliterator5 = ds5.spliterator();
            if (!spliterator5.tryAdvance(file -> {
                try (var fis = new FileInputStream(file.toFile())) {
                    BLUE.printGenericLn(new String(fis.readAllBytes(), Charset.defaultCharset()));
                } catch (IOException e) {
                    RED.printGenericLn("This was not supposed to have happened! %s", e);
                    System.exit(1);
                }
                YELLOW.printGenericLn(file);
                printRainbowTitleLn("We finally found it!");
            })) {
                RED.printGenericLn("No file found!");
                RED.printGenericLn("We have to stop the lesson here because the test file isn't in /tmp folder. Please check Readme.md about running ./prepare.sh. If you still have issues try copying manually.");
                System.exit(1);
            }
        } catch (IOException e) {
            RED.printGenericLn("This was not supposed to have happened! %s", e);
            System.exit(1);
        }
    }

    private static void exercise2() {
        BRIGHT_CYAN.printGenericLn("--- 2. Labels and `break` in loops");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: You are a fan of \"De Jeugd van Tegenwoordig\" and you just keep buying their records.");
        GREEN.printGenericLn("You have a shelf with three rows where your records are organized by most favourite too less favourite album.");
        GREEN.printGenericLn("However, you bought a bunch of repeated records and because of your mood wings,");
        GREEN.printGenericLn("You don't even know anymore which one is your favourite and which one is not.");
        GREEN.printGenericLn("So now you have 2 records on the top shelf, 4 on the second one and 10 at the bottom!");
        GREEN.printGenericLn("But \"De Jeugd van Tegenwoordig\" only edited 8 albums!");
        GREEN.printGenericLn("We will use old fashioned for loops to figure out this mess.");
        GREEN.printGenericLn("On our example we just want to check how many iteration our for loops will perform.");
        GREEN.printGenericLn("Our criteria is:");
        GREEN.printGenericLn("1. For loop will break once a repetition is found");
        GREEN.printGenericLn("2. The Atomic Integer counts the number of repetitions found");
        GREEN.printGenericLn("3. Keep in mind that there might be more repetitions in one particular iteration, but those are not counted");
        GREEN.printGenericLn("4. Remember that the for loop will break and will skip the rest of the albums on that iteration");
        GREEN.printGenericLn("5. No repetitions will be counted on the same shelf");
        GREEN.printGenericLn("6. I know its difficult but that's the point 😊");
        GREEN.printGenericLn("Your goal is to guess how many iterations will the atomic number count");
        var albumList = List.of("Parels voor de zwijnen", "De Machine", "De lachende derde", "“Ja, Natúúrlijk!”", "X - Viering van het super decennium", "Manon", "Luek", "Anders (Different)");
        var random = new Random();
        int numberOfAlbums = albumList.size();
        class RandomizerDWVT {
            public List<String> getAlbums(int n) {
                return IntStream.range(0, n).map(i -> random.nextInt(numberOfAlbums))
                        .mapToObj(albumList::get).collect(Collectors.toList());
            }

        }
        var dwtRandomizer = new RandomizerDWVT();
        GREEN.printGenericLn("These are your randomized shelves:");
        int nShelf1 = 2;
        var shelf1 = dwtRandomizer.getAlbums(nShelf1);
        GREEN.printGenericLn("Shelf 1 -> %s", shelf1);
        int nShelf2 = 4;
        var shelf2 = dwtRandomizer.getAlbums(nShelf2);
        GREEN.printGenericLn("Shelf 2 -> %s", shelf2);
        int nShelf3 = 10;
        var shelf3 = dwtRandomizer.getAlbums(nShelf3);
        GREEN.printGenericLn("Shelf 3 -> %s", shelf3);
        GREEN.printGenericLn("Please guess how many repetitions will this method find ->", shelf3);
        var scanner = new Scanner(System.in);
        var repetitions = scanner.nextInt();
        var atomicInteger = new AtomicInteger();
        SHELF1:
        for (int i = 0; i < nShelf1; i++) {
            SHELF2:
            for (int j = 0; j < nShelf2; j++) {
                if (shelf1.get(i).equals(shelf2.get(j))) {
                    atomicInteger.incrementAndGet();
                    break;
                }
                SHELF3:
                for (int k = 0; k < nShelf3; k++) {
                    if (shelf3.get(k).equals(shelf2.get(j)) || shelf3.get(k).equals(shelf1.get(i))) {
                        atomicInteger.incrementAndGet();
                        break;
                    }
                }
            }
        }
        if (repetitions == atomicInteger.get()) {
            GREEN.printGenericLn("You made it champ!! There are indeed %d repetitions found! 🥇", atomicInteger.get());
        } else {
            RED.printGenericLn("You failed this time, but try again. %d repetitions were found. Your participation awards you with a medal of courage! 🎖", atomicInteger.get());
        }
        GREEN.printGenericLn("1. https://nl.wikipedia.org/wiki/De_Jeugd_van_Tegenwoordig_(rapgroep)");
        GREEN.printGenericLn("2. https://www.youtube.com/watch?v=cNMXSKfWfLQ");

    }

    private static void exercise1() {
        BRIGHT_CYAN.printGenericLn("--- 1. `Integer` Mathematical Bases `parseInt`");
        printRainbowLn("==");
        GREEN.printGenericLn("According to NPO(https://www.nporadio2.nl/song/3230/grote-mannen-worden-klein),  Diggy Dex single, \"Grote Mannen Worden Klein\" was releases in 2014");
        GREEN.printGenericLn("Let's see different ways to visualize this:");
        var debutGroteMannen = "2014";
        GREEN.printGenericLn("*** Integer.parseInt(%s)", debutGroteMannen);
        YELLOW.printGenericLn("The single was \"Grote Mannen Worden Klein\" was released, in Decimal, in the year %d", Integer.parseInt(debutGroteMannen, 10));
        var binaryValue = Integer.toBinaryString(2014);
        GREEN.printGenericLn("*** Integer.parseInt(%s, 2)", binaryValue);
        YELLOW.printGenericLn("The single was \"Grote Mannen Worden Klein\" was released, in Binary, in the year %d", Integer.parseInt(binaryValue, 2));
        GREEN.printGenericLn("References");
        GREEN.printGenericLn("1. https://www.nporadio2.nl/song/3230/grote-mannen-worden-klein");
        GREEN.printGenericLn("2. https://www.last.fm/music/Diggy+Dex/_/Grote+Mannen+Worden+Klein");
        GREEN.printGenericLn("3. https://www.metrolyrics.com/grote-mannen-worden-klein-lyrics-diggy-dex.html");
    }

    private static ExecutorService call100ThreadsOnConcert(Concert concert) {
        int nThreads = 200;
        ExecutorService executorService = Executors.newFixedThreadPool(nThreads);
        for (int i = 0; i < nThreads; i++) {
            executorService.submit((Callable<Object>) concert::addConcertGoer);
        }
        return executorService;
    }
}
