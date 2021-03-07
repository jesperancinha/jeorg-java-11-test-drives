package org.jesperancinha.java11.mastery3dot2;

import org.jesperancinha.console.consolerizer.console.Consolerizer;
import org.jesperancinha.java11.mastery3dot2.cafes.galao.Galao;
import org.jesperancinha.java11.mastery3dot2.cafes.garoto.Garoto;
import org.jesperancinha.java11.mastery3dot2.festival.Artist;
import org.jesperancinha.java11.mastery3dot2.marisco.Caranguejo;
import org.jesperancinha.java11.mastery3dot2.marisco.Lingueirao;
import org.jesperancinha.java11.mastery3dot2.mercado.Building;
import org.jesperancinha.java11.mastery3dot2.mercado.Construction;
import org.jesperancinha.java11.mastery3dot2.mercado.Market;
import org.jesperancinha.java11.mastery3dot2.museu.Ticket;
import org.jesperancinha.java11.mastery3dot2.pesca.Catch;
import org.jesperancinha.java11.mastery3dot2.pesca.CrateSize;
import org.jesperancinha.java11.mastery3dot2.pesca.Isca;
import org.jesperancinha.java11.mastery3dot2.pesca.Peixe;
import org.jesperancinha.java11.mastery3dot2.pesca.Pesca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerGraphs.printUnicornsLn;

public class Mastery3dot2Runner {
    public static void main(String[] args) {
        Consolerizer.typingWaitGlobal = 0;
        Consolerizer.maxLineCharsGlobal = 150;

        BLUE.printGenericLn("================== Master Module mastery-3-2 ==================");

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
        exercise19();
        exercise20();

        printUnicornsLn(90);
        GREEN.printGenericLn("Hope you enjoyed this mastery into Java 11 with the flavour, sounds, beauty and lights of Olhão City!");
        GREEN.printGenericLn("Please keep coming back as I'll be creating more mastery modules.");
        GREEN.printGenericLn("Thank you!");
        printUnicornsLn(90);
    }

    private static void exercise20() {
        BRIGHT_CYAN.printGenericLn("--- 20. `Files.copy` and symbolic links");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We'll create symbolic links to files we create.");
        GREEN.printGenericLn("In this case, a world wide known description of the fantastic City of Olhão.");
        var fishersWorld = "/tmp/fishers-world.txt";
        try (var fos = new FileOutputStream(fishersWorld)) {
            var oos = new ObjectOutputStream(fos);
            oos.writeObject("Olhão da Restauração. Cidade cubista");
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        var fishersLink = "/tmp/fishers-link.txt";
        var fishersLink2 = "/tmp/fishers-link2.txt";
        try {
            Files.createLink(Paths.get(fishersLink), Paths.get(fishersWorld));
            Files.copy(Paths.get(fishersLink), Paths.get(fishersLink2));
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        GREEN.printGenericLn("Check your file system and look at the results. Change the files via the command line.");
        GREEN.printGenericLn("Notice that chaging %s will also affect the contents of %s.", fishersWorld, fishersLink);
        GREEN.printGenericLn("Also notice that %s is a text file", fishersLink2);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. A copy of a symlink results in the copuy of the file it is linked to.");
        GREEN.printGenericLn("2. The symlink itself does not get copied.");
    }

    private static void exercise19() {
        BRIGHT_CYAN.printGenericLn("--- 19. `Supplier` and `get`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We are going to visit the worldwide known \"Chalé Dr. João Lúcio\"");
        GREEN.printGenericLn("Of course that, in order to visit it, we need someone to give a ticket to go insinde.");
        BRIGHT_CYAN.printGenericLn("Clerk - Good afternoon sir, how can I help you?");
        YELLOW.printGenericLn("Client - One ticket please!");
        var ticketSupplier = new Supplier<Ticket>() {
            @Override
            public Ticket get() {
                return new Ticket("Client");
            }
        };
        final Supplier<Ticket> ticketSupplier1 = () -> new Ticket("Copy");
        BRIGHT_CYAN.printGenericLn("CK - Here you go!");
        BRIGHT_CYAN.printGenericLn("CK - This is your ticket %s", ticketSupplier.get());
        BRIGHT_CYAN.printGenericLn("CK - And this is a copy! Enjoy your visit! %s", ticketSupplier1.get());
        YELLOW.printGenericLn("CL - Thank you so much!");
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Suppliers return a value without the need of parameters");
        GREEN.printGenericLn("2. var isn't very convenient to use also with Suppliers because of the code");
        GREEN.printGenericLn("3. var also works though");
    }

    private static void exercise18() {
        BRIGHT_CYAN.printGenericLn("--- 18. `StringBuilder` and `setLength`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: During a bird-watch, we see a species called: `Slender-billed Gull`");
        GREEN.printGenericLn("In our report however, we can only put a word with 7 characters.");
        GREEN.printGenericLn("We might be able to save this situation by using setLength");
        final StringBuilder sb = new StringBuilder("Slender-billed Gull");
        MAGENTA.printGenericLn("This is our current word -> %s ", sb);
        sb.setLength(7);
        MAGENTA.printGenericLn("This is our changed word -> %s ", sb);
        sb.append("-billed Gull");
        MAGENTA.printGenericLn("But hey, now we can put way more characters and now we reinstate the rest -> %s ", sb);
        sb.setLength(30);
        MAGENTA.printGenericLn("And we can also make this a bigger string -> %s ", sb);
        sb.append(".");
        MAGENTA.printGenericLn("If the size is changed to more than what already is, the actual word doesn't change size -> %s ", sb);
        GREEN.printGenericLn("Take-aways");
        GREEN.printGenericLn("1. setLength can decrease a String size inside StrinbBuilder");
        GREEN.printGenericLn("2. setLength can may increase the size of the String, but nothing happnes if it surpasses original size");
    }

    private static void exercise17() {
        BRIGHT_CYAN.printGenericLn("--- 17. `noneMatch` vs `anyMatch`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We are now in `Quinta de Marim` in Olhão.");
        GREEN.printGenericLn("We are birdwatching and trying to distinguish the bird species");
        GREEN.printGenericLn("How can we match them?");
        var allBirdsSeen = List.of(
                "Purple Swamphen", "Little Bittern",
                "Purple Heron", "Collared Pratincole",
                "Audouin’s Gull", "Greater Flamingo");
        MAGENTA.printGenericLn("We see all of these birds-> %s", allBirdsSeen);
        MAGENTA.printGenericLn("Did we see any `Eurasian Spoonbill`? -> %s", allBirdsSeen.stream().anyMatch("Eurasian Spoonbill"::equals));
        MAGENTA.printGenericLn("So none of them matched right? -> %s", allBirdsSeen.stream().noneMatch("Eurasian Spoonbill"::equals));
        MAGENTA.printGenericLn("How about the `Little Bittern`? -> %s", allBirdsSeen.stream().anyMatch("Little Bittern"::equals));
        MAGENTA.printGenericLn("Do all of them match this? -> %s", allBirdsSeen.stream().allMatch("Little Bittern"::equals));
        GREEN.printGenericLn("Take-aways");
        GREEN.printGenericLn("1. allMatch, noneMatch, anyMatch and in general Match operations, return a boolean");
    }

    private static void exercise16() {
        BRIGHT_CYAN.printGenericLn("--- 16. Serializing arrays and Lists");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Sometimes we register a fish catch in a List.");
        GREEN.printGenericLn("Other times we register this info in an array");
        GREEN.printGenericLn("Do we know how serialize this data so that the fisher knows how too find the records of their catch?");
        var fishCatch = createRandomFishList(2);
        var fishArray = fishCatch.toArray(new Peixe[0]);
        var pesca = new Pesca(fishCatch, fishArray);
        BLUE.printGenericLn("The fisher catches %s", pesca);
        try (final var fos = new FileOutputStream("/tmp/fishersCatch.obj")) {
            var oos = new ObjectOutputStream(fos);
            oos.writeObject(pesca);
        } catch (IOException e) {
            RED.printGenericLn("Ooops! This is wrong -> %s. Please check your system", e);
            System.exit(1);
        }
        try (var fis = new FileInputStream("/tmp/fishersCatch.obj")) {
            var ois = new ObjectInputStream(fis);
            Pesca o = (Pesca) ois.readObject();
            MAGENTA.printGenericLn("We got the data! And the fisher catched %s", o);

        } catch (IOException | ClassNotFoundException e) {
            RED.printGenericLn("Ooops! This is wrong -> %s. Please check your system", e);
            System.exit(1);
        }
        GREEN.printGenericLn("Take-aways");
        GREEN.printGenericLn("1. We don't need a serialVersionUID. It can work without it");
        GREEN.printGenericLn("2. However not strictly necessary, a serialVersionUID identifies the version of the object");
        GREEN.printGenericLn("3. All serialized objects need to be serializable");
        GREEN.printGenericLn("4. This also includes all elements of the array or of a list");
        GREEN.printGenericLn("5. The `transient` keyword makes sure that elements aren't going to be serializable.");
        GREEN.printGenericLn("6. This would happen for non serializable members with no transient -> java.io.NotSerializableException\n" +
                "\torg.jesperancinha.java11.mastery3dot2.pesca.Isca\n" +
                "\tjava.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1185)\n" +
                "\tjava.base/java.io.ObjectOutputStream.writeArray(ObjectOutputStream.java:1379)\n" +
                "\tjava.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1175)\n" +
                "\tjava.base/java.io.ObjectOutputStream.defaultWriteFields(ObjectOutputStream.java:1553)\n" +
                "\tjava.base/java.io.ObjectOutputStream.writeSerialData(ObjectOutputStream.java:1510)\n" +
                "\tjava.base/java.io.ObjectOutputStream.writeOrdinaryObject(ObjectOutputStream.java:1433)\n" +
                "\tjava.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1179)\n" +
                "\tjava.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:349)\n" +
                "\torg.jesperancinha.java11.mastery3dot2.Mastery3dot2Runner.main(Mastery3dot2Runner.java:82).");
    }

    private static void exercise15() {
        BRIGHT_CYAN.printGenericLn("--- 15. `sorted`, `Comparable` and `ClassCastException`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: During the sorting of the fish bait, one fisher dropped some real fishes");
        GREEN.printGenericLn("Now we are going to organize this. Will this work?");
        GREEN.printGenericLn("First we organize the current baits");
        var nBaits = 5;
        var allBaits = createBaitFishList(nBaits);
        var organizedBaits = allBaits
                .stream().sorted().collect(Collectors.toList());
        MAGENTA.printGenericLn("We get -> %s ", organizedBaits);
        var allBaitObjects = new ArrayList<Catch>(organizedBaits);
        var oneFish = createRandomFishList(1);
        allBaitObjects.addAll(oneFish);
        try {
            var reOrganizedBaits = allBaitObjects
                    .stream().sorted().collect(Collectors.toList());
        } catch (ClassCastException e) {
            RED.printGenericLn("As we expected, we cannot run a default comparator if it is not defined in the objects of a list");
            RED.printGenericLn("The fisher has to wash all of their baits -> %s", e);
        }
        GREEN.printGenericLn("Take-aways");
        GREEN.printGenericLn("1. We can provide a comparator to the sorted intermediate operation of sorted");
        GREEN.printGenericLn("2. Alternatively we can use Comparable in the type definition itself");
        GREEN.printGenericLn("3. All objects need to be Comparable, if we want sorted without parameters to work");
        GREEN.printGenericLn("4. During a sorted operation, without parameters, there will be a ClassClassException thrown, if at least one element is not Comparable");
    }

    private static void exercise14() {
        BRIGHT_CYAN.printGenericLn("--- 14. `Consumer` in `for` loops");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: A bunch of cats is eating left over fish from the fishermen");
        var nFishes = 5;
        var allCatch = createRandomFishList(nFishes);
        final Consumer<Peixe> cat = peixe -> ORANGE.printGenericLn("Cat eats %s", peixe);
        var varCat = new Consumer<Peixe>() {
            @Override
            public void accept(Peixe peixe) {
                ORANGE.printGenericLn("Var Cat eats %s", peixe);
            }
        };
        allCatch.forEach(cat);
        allCatch.forEach(varCat);
        GREEN.printGenericLn("Take-aways");
        GREEN.printGenericLn("1. For loops use consumers");
        GREEN.printGenericLn("2. Consumer receive parameters and consume them. No value is returned");
        GREEN.printGenericLn("3. var declared consumers need to specify type (of course)");
        GREEN.printGenericLn("4. traditionally declared consumers can use diamond notation and lambdas");
    }

    private static void exercise13() {
        BRIGHT_CYAN.printGenericLn("--- 13. `thenComparing`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We receive a whole lot of fish by DocaPesca");
        GREEN.printGenericLn("We have to tag all of them, sort them by size and then sort them by species.");
        GREEN.printGenericLn("This is the ideal case to use the `thenCompare` method.");
        var nFishes = 10;
        var allCatch = createRandomFishList(nFishes);
        YELLOW.printGenericLn("These are all our catches: %s\nLet's organize them!", allCatch);
        Comparator<Peixe> comparator = Comparator.comparing(o -> o.commonName);
        Comparator<Peixe> peixeComparator = comparator.thenComparing(o -> o.size);
        var organizedCatch = allCatch
                .stream().sorted(peixeComparator).collect(Collectors.toList());
        YELLOW.printGenericLn("This is our organized catch -> %s", organizedCatch);
        MAGENTA.printGenericLn("Finally we can put our fishes in the matching boxes in a mutch faster way!.");
        organizedCatch.forEach(peixe -> {
            CrateSize[] values = CrateSize.values();
            for (CrateSize crateSize : values) {
                if (peixe.size >= crateSize.getMin() && peixe.size < crateSize.getMax()) {
                    peixe.crateSize = crateSize;
                    break;
                }
            }
        });
        MAGENTA.printGenericLn(organizedCatch);
        GREEN.printGenericLn("Take-aways");
        GREEN.printGenericLn("1. thenCompare works cumulatively");
        GREEN.printGenericLn("2. thenCompare sections each comparison in separate groups");
    }

    private static List<Isca> createBaitFishList(int nFishes) {
        var fishCommonNames = new String[]{
                "Carapau", "Sardinha",
                "Peixe Espada", "Robalo", "Xaputa", "Peixe Raia",
                "Bezugo", "Dourada", "Atúm", "Bacalhau", "Xarroco"};
        return IntStream
                .range(0, nFishes)
                .mapToObj(i -> new Isca(fishCommonNames[(int) (Math.random() * fishCommonNames.length)], (int) (Math.random() * 30)))
                .collect(Collectors.toList());
    }

    private static List<Peixe> createRandomFishList(int nFishes) {
        var fishCommonNames = new String[]{
                "Carapau", "Sardinha",
                "Peixe Espada", "Robalo", "Xaputa", "Peixe Raia",
                "Bezugo", "Dourada", "Atúm", "Bacalhau", "Xarroco"};
        return IntStream
                .range(0, nFishes)
                .mapToObj(i -> new Peixe(fishCommonNames[(int) (Math.random() * fishCommonNames.length)], (int) (Math.random() * 30)))
                .collect(Collectors.toList());
    }

    private static void exercise12() {
        BRIGHT_CYAN.printGenericLn("--- 12. `ExceptionInInitializerError`");
        printRainbowLn("==");
        try {
            new Lingueirao();
        } catch (ExceptionInInitializerError e) {
            RED.printGenericLn("Note we can't catch the Linguerão due to an Error coming from a static initialization -> %s", e);
        }
        try {
            Lingueirao.fishLingueirao();
        } catch (NoClassDefFoundError e) {
            RED.printGenericLn("Notice that there is no class definition found. This makes sense. We actually have no class since initializing  has failed! -> %s", e);
        }
        YELLOW.printGenericLn("Essentially Lingueirão has gone into the oblivion because of the bird. 🦅");
        YELLOW.printGenericLn("What about this Caranguejo? 🦀");
        try {
            new Caranguejo();
        } catch (RuntimeException e) {
            RED.printGenericLn("In this case, an exception is thrown during an instance initialization. The Exception is thrown as is -> %s", e);
        }
        try {
            Caranguejo.fishCaranguejo();
        } catch (RuntimeException e) {
            RED.printGenericLn("The same when calling the fishing factory method -> %s", e);
        }
        GREEN.printGenericLn("Take-aways:");
        GREEN.printGenericLn("1. Static initialization can fail, but don't stop a program from running.");
        GREEN.printGenericLn("2. SI fail results in and initialization failure.");
        GREEN.printGenericLn("3. SI failure results in the absence of a class definition.");
        GREEN.printGenericLn("4. Instance initialization failure does not present any unusual behaviour.");
        GREEN.printGenericLn("5. We can try/catch any throwable that compatible with the originating throwable.");
    }

    private static void exercise11() {
        BRIGHT_CYAN.printGenericLn("--- 11. Package protected constructors");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We are ordering a coffee in Olhão.");
        GREEN.printGenericLn("In good portuguese tradition we ask for a short coffee by calling it one \"garoto\".");
        GREEN.printGenericLn("If we want our coffee to be served in a tall glass cup with lots of milk on it, we call it one \"galão'\".");
        GREEN.printGenericLn("In our case we will try to order one \"Galão\" that is also a \"Garoto\".");
        GREEN.printGenericLn("Can we do it?");
        var garoto = Garoto.create();
        MAGENTA.printGenericLn("For a starters we can create one %s", garoto);
        var galao = Galao.create();
        MAGENTA.printGenericLn("We can also create one create one %s", galao);
        GREEN.printGenericLn("The point here is that if classes have package protected constructors, and belong to different packages, they can never be sub-classes of eacht other");
        GREEN.printGenericLn("This makes this:");
        GREEN.printGenericLn("        var garoto =new Garoto();");
        GREEN.printGenericLn("and this:");
        GREEN.printGenericLn("        var galao = new Galao();");
        GREEN.printGenericLn("an unaccomplishable possibility.");
    }

    private static void exercise10() {
        BRIGHT_CYAN.printGenericLn("--- 10. local `DateFormat` and `Locale`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: What is the day of the City of Olhão and on which year did it occur?");
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        Locale locale = new Locale.Builder().setLanguage("pt").build();
        YELLOW.printGenericLn(dateTimeInstance.format(new Date(-92, Calendar.JUNE, 16)));
        YELLOW.printGenericLn(locale);
        GREEN.printGenericLn("The point here is that Locale and DateFormat are independent.");
        GREEN.printGenericLn("They can, however be bound together:");
        for (int i = 0; i < 4; i++) {
            DateFormat dateTimeInstance2 = DateFormat.getDateTimeInstance(i, 1, locale);
            YELLOW.printGenericLn("DateFormat.getDateTimeInstance(i,%d, locale) -> %s", i, dateTimeInstance2.format(new Date(-92, Calendar.JUNE, 16)));
        }
        for (int i = 0; i < 4; i++) {
            DateFormat dateTimeInstance2 = DateFormat.getDateTimeInstance(0, i, locale);
            YELLOW.printGenericLn("DateFormat.getDateTimeInstance(0,%d, locale) -> %s", i, dateTimeInstance2.format(new Date(-92, Calendar.JUNE, 16)));
        }
        GREEN.printGenericLn("We can change to different pre-defined styles");
    }

    private static void exercise9() {
        BRIGHT_CYAN.printGenericLn("--- 9. `RandomAccessFile` and `writeUTF`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We want to cook \"Bacalhau à Brás\"");
        GREEN.printGenericLn("We went to the market and bought some pieces of raw, dried and salted cod fish");
        GREEN.printGenericLn("The rest of the ingredients are at home");
        GREEN.printGenericLn("We get home and read our recipe again:");
        try (var raf = new RandomAccessFile("/tmp/bacalhau.a.bras.txt", "rw")) {
            YELLOW.printGenericLn(raf.readLine());
            long filePointer = raf.getFilePointer();
            YELLOW.printGenericLn(raf.readLine());
            raf.writeUTF("I'm corrupting the recipe\n");
            raf.seek(filePointer);
            String line;
            while ((line = raf.readLine()) != null) {
                YELLOW.printGenericLn(line);
            }
            ORANGE.printGenericLn("Wait! I forgot something!");
            raf.seek(filePointer);
            while ((line = raf.readLine()) != null) {
                YELLOW.printGenericLn(line);
            }
        } catch (IOException e) {
            RED.printGenericLn("Ooops! This shouldn't have happened! Check your runtime -> %s", e);
        }
        GREEN.printGenericLn("RandomAccessFile uses different interfaces than FileInputStream.");
        GREEN.printGenericLn("But they are all Closeable.");
        GREEN.printGenericLn("In RandomAccessFile a pointer is used that can be saved to go back and forth in the same file.");
    }

    private static void exercise8() {
        BRIGHT_CYAN.printGenericLn("--- 8. A case for `final` `var` in a `for` loop");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Let's get some veggies.");
        GREEN.printGenericLn("We'll go to the supermarket and get some final vegetables.");
        GREEN.printGenericLn("We'll do this according to our shopping list.");
        var vegetableToShopList = List.of("Tomatoes", "Potatoes", "Kale", "Lettuse", "1Kg Kidney Beans");
        for (final var vegetable : vegetableToShopList) {
            // This is not possible because var is marked as final
            // vegetable = "wow";
            YELLOW.printGenericLn(vegetable);
        }
        for (var vegetable : vegetableToShopList) {
            vegetable += " with fungus";
            YELLOW.printGenericLn(vegetable);
        }
        GREEN.printGenericLn("We can use the word final in combination with var to mark it effectively final");
        GREEN.printGenericLn("Vars are effectively final until they suffer some change.");
        GREEN.printGenericLn("A final before, makes that change impossible.");
        GREEN.printGenericLn("final, as a parameter, will not work becaue var isn't supposed to be used as a parameter type");
        GREEN.printGenericLn("Simple reason that we must remember. var needs to know its types. As a parameter, there is no way it can know that.");
    }

    private static void exercise7() {
        BRIGHT_CYAN.printGenericLn("--- 7. Base modules and the rest");
        printRainbowLn("==");
        BLUE.printGenericLn("Expected output:\n%s", "Cataplana dish is being served...\n" +
                "cataplana.jar -> java.base\n" +
                "   org.jesperancinha.console.consolerizer             -> java.io                                            java.base\n" +
                "   org.jesperancinha.console.consolerizer             -> java.lang                                          java.base\n" +
                "   org.jesperancinha.console.consolerizer             -> java.lang.invoke                                   java.base\n" +
                "   org.jesperancinha.console.consolerizer             -> java.util                                          java.base\n" +
                "   org.jesperancinha.console.consolerizer             -> java.util.function                                 java.base\n" +
                "   org.jesperancinha.console.consolerizer             -> java.util.stream                                   java.base\n" +
                "   org.jesperancinha.java11.mastery3dot2               -> java.lang                                          java.base\n" +
                "   org.jesperancinha.java11.mastery3dot2               -> org.jesperancinha.console.consolerizer             cataplana.jar");
        GREEN.printGenericLn("Please check module %s for more info...", "mastery-3-2-modularity");
    }

    private static void exercise6() {
        BRIGHT_CYAN.printGenericLn("--- 6. `Deque` and `offerLast`, and other methods.");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: There is a list of clients waiting and the fish seller is registering everything");
        GREEN.printGenericLn("As we ask for the fish request, it goes to a Deque in order to be processed");
        GREEN.printGenericLn("What can happen?");
        var dequeQueue = new LinkedBlockingDeque<String>(5);
        dequeQueue.add("500gg Sardines");
        dequeQueue.add("1Kg Codfish");
        dequeQueue.add("800g Swordfish");
        dequeQueue.add("2Kg Octopus");
        dequeQueue.add("10Kg Clams");
        try {
            dequeQueue.add("5Kg Cockles");
        } catch (IllegalStateException e) {
            RED.printGenericLn("Note that capacity limit does not show in ArrayDeque, because ArrayDeque grow automatically -> %s", e);
        }
        boolean offer = dequeQueue.offer("4Kg Gambas");
        MAGENTA.printGenericLn("This Deque has now reached its limit of %d elemenst", dequeQueue.size());
        MAGENTA.printGenericLn("With offer, it's essentially giving an offer to the Deque. %s", offer);
        boolean offer2 = dequeQueue.offerFirst("4Kg Shrimps");
        MAGENTA.printGenericLn("With offerFirst, It's the same. %s", offer2);
        MAGENTA.printGenericLn(offer2);
        boolean offer3 = dequeQueue.offerLast("2Kg Oysters");
        MAGENTA.printGenericLn("With offerLast, It's also the same. %s", offer3);
        MAGENTA.printGenericLn(dequeQueue);
        GREEN.printGenericLn("Deque is a collection");
        GREEN.printGenericLn("It's a circular collection and there are lots of implementations.");
        GREEN.printGenericLn("ArrayDeque -> Not Thread-Safe and automatically expands");
        GREEN.printGenericLn("LinkedBlockingDeque -> Thread-Safe and fixed capacity");
        GREEN.printGenericLn("Only on fixed capacity Deque's can we explore the full capacity of offer functions");
    }

    private static void exercise5() {
        BRIGHT_CYAN.printGenericLn("--- 5. `final` in `try` with resources");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We wanted to cook codfish (Bacalhau).");
        GREEN.printGenericLn("But we made a mistake when creating the input stream!");
        GREEN.printGenericLn("I think we can't change this, but let's see what happens!");
        try (var fis = Mastery3dot2Runner.class.getResourceAsStream("/castanhas.assadas.txt")) {
            // Unfortunately this is not possible!
            // variables created in a try clause are always immplicitly final
            // fis = Mastery3dot2Runner.class.getResourceAsStream("./bacalhau.assado.txt")
            MAGENTA.printGenericLn(new String(fis.readAllBytes()));
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        GREEN.printGenericLn("A try clause always creates implicitly final variables");
    }

    private static void exercise4() {
        BRIGHT_CYAN.printGenericLn("--- 4. Static method inheritance and overriding");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We have a stroll around the market and finally we come across some displays");
        GREEN.printGenericLn("There we can see how Space's are built across the city.");
        var construction = new Construction("Cement");
        var building = new Building(5f, 26f, 11.5f, "bricks");
        var market = new Market(5f, 26f, 11.5f, "bricks");
        Construction.getInfo();
        Building.getInfo();
        Market.getInfo();
        YELLOW.printGenericLn(construction.getCurrentInfo());
        YELLOW.printGenericLn(((Construction) building).getCurrentInfo());
        YELLOW.printGenericLn(((Construction) market).getCurrentInfo());
        Construction.getInfo();
        Construction.getInfo();
        Construction.getInfo();
        GREEN.printGenericLn("Important takes from this exercise:");
        GREEN.printGenericLn("1. static methods are not really overriden. They are however shadowed by another");
        GREEN.printGenericLn("2. by upcasting, we can call other static  methods");
        GREEN.printGenericLn("3. Instance methods can be overriden");
        GREEN.printGenericLn("4. Upcasting will only call the resulting instance method");
    }

    private static void exercise3() {
        BRIGHT_CYAN.printGenericLn("--- 3. Sorting Immutable `List`'s");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We finally got the listings of the \"Festival do Marisco 2019\"");
        GREEN.printGenericLn("We want to keep these listings safe, will anyone be able to change them?");
        var artist1 = new Artist("Matias Damásio e Aurea", LocalDate.of(2019, 8, 9));
        var artist2 = new Artist("HMB", LocalDate.of(2019, 8, 10));
        var artist3 = new Artist("Killer Queen", LocalDate.of(2019, 8, 11));
        var artist4 = new Artist("Paula Fenandes", LocalDate.of(2019, 8, 12));
        var artist5 = new Artist("Ludmilla", LocalDate.of(2019, 8, 13));
        var artist6 = new Artist("Resistência", LocalDate.of(2019, 8, 14));
        var allArtists = List.of(artist1, artist2, artist3, artist4, artist5, artist6);
        try {
            allArtists.sort(Artist::compare);
        } catch (UnsupportedOperationException e) {
            RED.printGenericLn("We are attempting to change a well established list.");
            RED.printGenericLn("allArtists.sort(Artist::compare); -> This list is marked as immutable. We get this error: %s", e);
        }
        try {
            List.copyOf(allArtists).sort(Artist::compare);
        } catch (UnsupportedOperationException e) {
            RED.printGenericLn("Making a copy of immutable also doesn't work");
            RED.printGenericLn("List.copyOf(allArtists).sort(Artist::compare); -> This list is marked as immutable. We get this error: %s", e);
        }
        try {
            new ArrayList<>(allArtists).sort(Artist::compare);
            GREEN.printGenericLn("new ArrayList<>(allArtists).sort(Artist::compare); -> This is probably the only way to get a changed list and make modifications on it.");
            GREEN.printGenericLn("We just create a new ArrayList from the immutable list in order to get a mutable list.");
        } catch (UnsupportedOperationException e) {
            RED.printGenericLn("Ooops... This should not have happened. Please check your runtime: %s", e);
        }
        GREEN.printGenericLn("Immutability principles are very common and traverse the whole JDK.");
        GREEN.printGenericLn("When working with collections it is important to understand when to we get immutables and when do we get mutables");
    }

    private static void exercise2() {
        BRIGHT_CYAN.printGenericLn("--- 2. Multi-dimensional arrays and ways to create them");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We are staying at a 5 star hotel in Olhão");
        GREEN.printGenericLn("The hotel serves us a 2X2 portion of cooked oysters plate.");
        GREEN.printGenericLn("It also serves 2X2 worldwide known raw oyster plate.");
        GREEN.printGenericLn("The mussels come fresh uit the fisher's net.");
        GREEN.printGenericLn("We are buying them as they come along.");
        GREEN.printGenericLn("Good for us, good for the fisher's and good for the economy.");
        GREEN.printGenericLn("In how many ways can we serve these plates?");

        var cookedOysters1 = new String[][]{{"CookedOyster", "CookedOyster"}, {"CookedOyster", "CookedOyster"}};
        final String[][] cookedOysters2 = {{"CookedOyster", "CookedOyster"}, {"CookedOyster", "CookedOyster"}};
        final String[][] cookedOysters3 = new String[2][2];
        cookedOysters3[0][0] = "CookedOyster";
        cookedOysters3[0][1] = "CookedOyster";
        cookedOysters3[1][0] = "CookedOyster";
        cookedOysters3[1][1] = "CookedOyster";
        final String[][] cookedOysters4 = {{"CookedOyster", "CookedOyster"}, {"CookedOyster", "CookedOyster"}};
        final String[][] cookedOysters5 = {{"CookedOyster", "CookedOyster"}, {"CookedOyster", "CookedOyster"}};
        final String[][] rawOysters = new String[2][2];
        rawOysters[0][0] = "RawOyster";
        rawOysters[0][1] = "RawOyster";
        rawOysters[1][0] = "RawOyster";
        rawOysters[1][1] = "RawOyster";
        final String[][] mussels = new String[2][];
        mussels[0] = new String[2];
        mussels[1] = new String[3];
        mussels[0][0] = "CookedMussel";
        mussels[0][1] = "CookedMussel";
        mussels[1][0] = "CookedMussel";
        mussels[1][1] = "CookedMussel";
        mussels[1][2] = "CookedMussel";
        BLUE.printGenericLn("var cookedOysters1 = new String[][]{{\"CookedOyster\", \"CookedOyster\"}, {\"CookedOyster\", \"CookedOyster\"}}; -> %s", cookedOysters1, "");
        BLUE.printGenericLn("final String[][] cookedOysters2 = {{\"CookedOyster\", \"CookedOyster\"}, {\"CookedOyster\", \"CookedOyster\"}}; -> %s", (Object[]) cookedOysters2);
        BLUE.printGenericLn("final String[][] cookedOysters3 = new String[2][2]; -> %s", (Object[]) cookedOysters3);
        BLUE.printGenericLn("final String[] cookedOysters4 [] = {{\"CookedOyster\", \"CookedOyster\"}, {\"CookedOyster\", \"CookedOyster\"}};", (Object[]) cookedOysters4);
        BLUE.printGenericLn("final String cookedOysters5 [][] = {{\"CookedOyster\", \"CookedOyster\"}, {\"CookedOyster\", \"CookedOyster\"}};", (Object[]) cookedOysters5);
        BLUE.printGenericLn("final String [][] rawOysters = new String[2][2];", (Object[]) rawOysters);
        BLUE.printGenericLn("final String [] mussels [] = new String[2][];", (Object[]) mussels);
        GREEN.printGenericLn("Big takeouts here for something seemingly simple:");
        GREEN.printGenericLn("1. All arrays must have at least one dimension");
        GREEN.printGenericLn("2. The first dimension MUST have a defined size upon initialization");
        GREEN.printGenericLn("3. var needs to know its type. Therefore an array declared with var can only be created with new");
        GREEN.printGenericLn("4. Different positions of a multidimensional array may have different array sizes in sub-dimensions");
        GREEN.printGenericLn("6. The rectangular brackets my follow a C++ or a Java notation. In other workds, brackets can be declared just before or just after the variable name with no particular restrictions on how many in the left or the right side");
    }

    private static void exercise1() {
        BRIGHT_CYAN.printGenericLn("--- 1. Serialization and polymorphism");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We are taking info from the \"Mercado de Olhão\"");
        GREEN.printGenericLn("When try to get the information from the registration website,");
        GREEN.printGenericLn("we cannot find the most common material!");
        GREEN.printGenericLn("Let's see how we register and then get the data.");
        var mercadoDeOlhao = new Market(5f, 26f, 11.5f, "bricks");
        MAGENTA.printGenericLn("We register our data in %s", mercadoDeOlhao);
        MAGENTA.printGenericLn("We register our data in %s", ((Building) mercadoDeOlhao).toString());
        MAGENTA.printGenericLn("We register our data in %s", ((Construction) mercadoDeOlhao).toString());
        BLUE.printGenericLn("Sending data to file system...");
        var fileName = "/tmp/mastery3.3.obj";
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(mercadoDeOlhao);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        BLUE.printGenericLn("Data Sent!");
        BLUE.printGenericLn("Retrieving data from file system...");
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            var newMarket = (Market) objectInputStream.readObject();
            MAGENTA.printGenericLn("We read our data back from the file system and it is %s", newMarket);
        } catch (IOException | ClassNotFoundException e) {
            RED.printThrowableAndExit(e);
        }
        GREEN.printGenericLn("The takeout here, is that the non-serializable class, does not participate in the serializing process.");
        GREEN.printGenericLn("Although its constructor is called, no instance members are set.");
        GREEN.printGenericLn("The compiler needs the empty constructors only to know that the runtime can build these instances without parameters.");
        GREEN.printGenericLn("The constructors themselves are not called in the serializable instances.");
    }
}
