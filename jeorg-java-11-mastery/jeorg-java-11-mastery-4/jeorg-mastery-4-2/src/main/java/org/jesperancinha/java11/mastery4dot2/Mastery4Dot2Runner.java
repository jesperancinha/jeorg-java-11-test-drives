package org.jesperancinha.java11.mastery4dot2;

import org.jesperancinha.console.consolerizer.console.Consolerizer;
import org.jesperancinha.java11.mastery4dot2.band.EffectiveBandManager;
import org.jesperancinha.java11.mastery4dot2.band.GeneralBandManager;
import org.jesperancinha.java11.mastery4dot2.band.QuintetBandManager;
import org.jesperancinha.java11.mastery4dot2.concert.Band;
import org.jesperancinha.java11.mastery4dot2.concert.GenericBand;
import org.jesperancinha.java11.mastery4dot2.concert.QuintetBand;
import org.jesperancinha.java11.mastery4dot2.concert.Ticket;
import org.jesperancinha.java11.mastery4dot2.instrument.DrumException;
import org.jesperancinha.java11.mastery4dot2.instrument.Drums;
import org.jesperancinha.java11.mastery4dot2.instrument.DrumsIOException;
import org.jesperancinha.java11.mastery4dot2.record.Company;
import org.jesperancinha.java11.mastery4dot2.show.CristalBall;
import org.jesperancinha.java11.mastery4dot2.show.SuperCristalBall;
import org.jesperancinha.java11.mastery4dot2.songs.Compilation;
import org.jesperancinha.java11.mastery4dot2.styles.Indie;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Permission;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerGraphs.printUnicornsLn;
import static org.jesperancinha.java11.mastery4dot2.concert.Ticket.getTicketsLongNumbers;
import static org.jesperancinha.java11.mastery4dot2.concert.Ticket.getTicketsStringNumbers;

public class Mastery4Dot2Runner {
    private static boolean skipQuestions;

    public static void main(String[] args) {
        if (args.length > 0) {
            skipQuestions = "-skip".equals(args[0]);
        }
        Consolerizer.typingWaitGlobal = 0;
        Consolerizer.maxLineCharsGlobal = 200;
        BLUE.printGenericLn("==================== Master Module mastery-4-2 ====================");
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
        exercise19();

        moduleEnd();
    }

    private static void exercise19() {
        BRIGHT_CYAN.printGenericLn("--- 19. `try-with-resources` `open` and `close` methods.");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We are at the end of our mastery module");
        GREEN.printGenericLn("If you noticed, drums are a part of almost all spanish music");
        GREEN.printGenericLn("We'll play one as a closeable instrument. Enjoy!");

        var drum = new Drums();
        try (drum) {
            drum.playDrum();
            drum.playWrongDrum();
        } catch (DrumException | DrumsIOException e) {
            RED.printGenericLn("It's all good! We failed to play, closing failed and this is expected -> %s", e);
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. We can use try-with-resources even after we've created our autocloseable instance");
        GREEN.printGenericLn("2. A suppressed exception occurs when closing fails");
        GREEN.printGenericLn("3. The suppressed exception is the closing exception when one is thrown in the try block");
        GREEN.printGenericLn("4. The main exception is the one thrown during the try scope");
        GREEN.printGenericLn("5. If no exception is thrown during the try block, no suppressed exception is thrown");
    }

    private static void exercise18() {
        BRIGHT_CYAN.printGenericLn("--- 18. `Arrays` `binarySearch`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We have compiled a list of of all Lori Meyers albums we know");
        GREEN.printGenericLn("Lori Meyers started in 1998. You are now in possession of a lot of their records.");
        GREEN.printGenericLn("Now you want to organize them!.");
        final String[] albums = {"Viaje de estudios", "Hostal Pimodán",
                "Hostal Pimodán (reedición)", "Cronolánea",
                "Viaje de estudios (reedición)", "Cuando el destino nos alcance",
                "Impronta"};
        int foundIndex = Arrays.binarySearch(albums, "D");
        MAGENTA.printGenericLn("Our record collection is:\n%s", Arrays.stream(albums).collect(Collectors.toList()));
        MAGENTA.printGenericLn("Our insertion point results in %d. This result makes no sense, purely because our array isn't sorted", foundIndex);
        Arrays.sort(albums);
        MAGENTA.printGenericLn("After sorting, our record collection is:\n%s", Arrays.stream(albums).collect(Collectors.toList()));
        foundIndex = Arrays.binarySearch(albums, "D");
        MAGENTA.printGenericLn("Once sorted, we finally have insertion point %d. This is correct", foundIndex);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. In order to make binarySearch for Arrays, we have to sort them first");
        GREEN.printGenericLn("2. Sorting arrays and therefore being able to perform a faster and more accurate binary search isn't specific to Java");
        GREEN.printGenericLn("3. The insertion point is an index. It is describe as a negative number");
    }

    private static void exercise17() {
        BRIGHT_CYAN.printGenericLn("--- 17. `writeUTF` and where it is possible with `BufferedWriter` and `FileOutputWriter`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: In the year 2000, spanish singer, Monica Naranjo, came into the music scene with her hit \"Sobreviviré\"");
        GREEN.printGenericLn("Given the raw energy of the lyrics of the songs and its meaning, \"Sobreviviré\" became an anthem of those who fight to be understood and accepted");
        GREEN.printGenericLn("In the video, Monica Naranjo depics just that.");
        GREEN.printGenericLn("We want to copy these lyrics from the source to new files.");
        GREEN.printGenericLn("We will do this in two ways. One with a BufferedWriter and the other with a FileOutputStream.");
        String source = null;
        try (var fis = new FileInputStream("/tmp/monica_naranjo_lyrics.txt")) {
            source = new String(fis.readAllBytes(), Charset.defaultCharset());
        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        MAGENTA.printGenericLn("We just read the lyrics");
        BRIGHT_MAGENTA.printGenericLn(source);
        MAGENTA.printGenericLn("We will now write this to file in UTF(Unicode Transformation Format) %s", "/tmp/mn1.txt");
        try (var fos = new FileOutputStream("/tmp/mn1.txt")) {
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeUTF(source);
            oos.flush();
        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        readFile("/tmp/mn1.txt");
        try (var bw = new BufferedWriter(new FileWriter("/tmp/mn2.txt", Charset.defaultCharset()))) {
            bw.write('U');
            bw.write('T');
            bw.write('F');
            bw.write('-');
            bw.write(source);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        readFile("/tmp/mn2.txt");
        try (var fos = new FileOutputStream("/tmp/mn3.txt")) {
            final OutputStreamWriter osw = new OutputStreamWriter(fos, Charset.defaultCharset().name());
            osw.write(source);
            osw.flush();
        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
        GREEN.printGenericLn("Take-away");
        readFile("/tmp/mn3.txt");
        GREEN.printGenericLn("1. We can specify UTF with FileWriter, OutputStreamWriter and with ObjectOutputStream");
        GREEN.printGenericLn("2. It is not mandatory to specify UTF with Writers. CharSet is optional");
        GREEN.printGenericLn("3. In the OutputStream we have methods that can write in UTF directly (writeUTF)");
    }

    private static void readFile(String resultFilename) {
        try (var fis = new FileInputStream(resultFilename)) {
            MAGENTA.printGenericLn("We just read this from file %s", resultFilename);
            final String s = new String(fis.readAllBytes(), Charset.defaultCharset());
            BRIGHT_MAGENTA.printGenericLn(s);
        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }
    }

    private static void exercise16() {
        BRIGHT_CYAN.printGenericLn("--- 16. NavigableMap and `pollLastEntry` and `pollFirstEntry`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: \"Supersubmarina\" is a band from Spain.");
        GREEN.printGenericLn("In 2008 and 2009, they've edited their first two EP(Extended Play)s");
        GREEN.printGenericLn("You'll show these vinyls to your friends");
        GREEN.printGenericLn("And then you will lend them");
        final String[] cientoCero = {"Cientocero", "Elástica galáctica", "No es así", "Cientocero (english)", "Cientocero (maqueta)"};
        final String[] supersubmarina = {"Supersubmarina", "Ana", "Supersubmarina", "OCB"};
        final NavigableMap<String, List<String>> albums = new TreeMap<>() {{
            put("Cientocero", Arrays.stream(cientoCero).collect(Collectors.toList()));
            put("Supersubmarina", Arrays.stream(supersubmarina).collect(Collectors.toList()));
        }};
        MAGENTA.printGenericLn("Ciento cero is %s", String.join(",", cientoCero));
        MAGENTA.printGenericLn("Supersubmarina is %s", String.join(",", supersubmarina));
        BLUE.printGenericLn("Let's tail this from %s:", "Cientocero");
        MAGENTA.printGenericLn("%s", albums.tailMap("Cientocero"));
        BLUE.printGenericLn("And now from %s:", "Supersubmarina");
        MAGENTA.printGenericLn("%s", albums.tailMap("Supersubmarina"));
        BLUE.printGenericLn("Let's head this from %s:", "Cientocero");
        MAGENTA.printGenericLn("%s", albums.headMap("Cientocero"));
        BLUE.printGenericLn("And now from %s:", "Supersubmarina");
        MAGENTA.printGenericLn("%s", albums.headMap("Supersubmarina"));
        final Map.Entry<String, List<String>> firstLending = albums.pollFirstEntry();
        MAGENTA.printGenericLn("We just took out the first album: %s", firstLending);
        MAGENTA.printGenericLn("So the our album collection looks like this: %s", albums);
        final Map.Entry<String, List<String>> lastLending = albums.pollLastEntry();
        MAGENTA.printGenericLn("We just took out the last album: %s", lastLending);
        MAGENTA.printGenericLn("So the our album collection should be empty now: %s", albums);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Navigable maps are very simple");
        GREEN.printGenericLn("2. Important methods are pollFirstEntry, pollLastEntry, tailMap and headMaps");
        GREEN.printGenericLn("3. Head is exclusive, whiile tail is inclusive");
    }

    private static void exercise15() {
        BRIGHT_CYAN.printGenericLn("--- 15. Iterating through a `CopyOnWriteArrayList` and the `UnsupportedOperationException`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Someone is compiling songs of the band Dorian for you.");
        GREEN.printGenericLn("Your other half is waiting impatiently for the mix result.");
        GREEN.printGenericLn("You keep getting a list, always updated, but you have to read it at the same time its being filled.");
        GREEN.printGenericLn("It's hard to keep up, and so you decide to make multiple reads.");
        final String[] songs = {
                "Buenas Intenciones",
                "Duele",
                "La Tormenta de Arena",
                "Los Amigos que Perdí",
                "El Futuro no es de Nadie",
                "Vicios y Defectos",
                "Tristeza",
                "A Cualquier Otra parte",
                "Te Echamos de Menos (Undo Remix)",
                "Horas Bajas (Undo Remix)", "El Temblor (Lovo Remix)", "Verte Amanecer"};
        MAGENTA.printGenericLn("This is our possible list:");
        ORANGE.printGenericLn("%s", String.join(",", songs));
        final Compilation compilation = new Compilation();

        final var songSet = Arrays.stream(songs).collect(Collectors.toCollection(ConcurrentSkipListSet::new));
        final ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(() -> {
            try {
                while (songSet.size() > 0) {
                    final String s = songSet.pollFirst();
                    compilation.addSong(s);
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                RED.printThrowableAndExit(e);
            }

        });
        executorService.submit(() -> {
            try {
                while (songSet.size() > 0) {
                    final Iterator<String> iterator = compilation.iterator();
                    while (iterator.hasNext()) {
                        MAGENTA.printGenericLn("Got song %s", iterator.next());
                        Thread.sleep(500);
                    }
                    BRIGHT_MAGENTA.printGenericLn("One Iteration done!");
                }
                final Iterator<String> iterator = compilation.iterator();
                while (iterator.hasNext()) {
                    MAGENTA.printGenericLn("Got song %s", iterator.next());
                    Thread.sleep(500);
                }
                BRIGHT_MAGENTA.printGenericLn("Last iteration done!");
            } catch (InterruptedException e) {
                RED.printThrowableAndExit(e);
            }
        });
        executorService.shutdown();
        try {
            executorService.awaitTermination(15, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            RED.printThrowableAndExit(e);
        }
        final Iterator<String> iterator = compilation.iterator();
        MAGENTA.printGenericLn("No exception has occurred and everything went well.");
        BLUE.printGenericLn("Can we change the list with this iterator though?");
        try {
            iterator.remove();
        } catch (UnsupportedOperationException e) {
            RED.printGenericLn("We cannot! And this is because this iterator is working with an array that is allowed to be copied and discarded -> %s", e);
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. CopyOnWriteArrayList make a copy on every write operation");
        GREEN.printGenericLn("2. This way, there will be no concurrent type of exception thrown");
        GREEN.printGenericLn("3. The iterator of this type of List's does not support modifications");
    }

    private static void exercise14() {
        BRIGHT_CYAN.printGenericLn("--- 14. Static and instance initialization of final `members`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We know that the band Dorian is mostly classified as being an Indie pop group.");
        GREEN.printGenericLn("We'll create its registry and see the many different ways we can initialize final values.");
        GREEN.printGenericLn("Have a look in the code. All these fields are mandatory and cannot change because they are final");
        var dorian = new Indie("Dorian");
        MAGENTA.printGenericLn("This is our band %s", dorian);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. All final fields have to be initialized");
        GREEN.printGenericLn("2. There is no difference in this mandatory action between static and instance members");
        GREEN.printGenericLn("3. Members can be initialized using accolades");
        GREEN.printGenericLn("4. There isn't a lot of reasons to use accolades this way. Just know that they work");
    }

    private static void exercise13() {
        BRIGHT_CYAN.printGenericLn("--- 13. `Float.POSITIVE_INFINITY` vs `Float.NEGATIVE_INFINITY`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Vetusta Morla publish in 2020 its fith studio album entitled \"Mismo Sitio Distinto Lugar - Canciones dentro de canciones\".");
        GREEN.printGenericLn("They came up with this original concept of songs within songs.");
        GREEN.printGenericLn("When you find a song within a song you are really up to infinity.");
        GREEN.printGenericLn("We can represent the infinity of songs Vetusta Morla can make by using Float and Double.");
        var songs = Float.POSITIVE_INFINITY;
        var nosongs = Float.NEGATIVE_INFINITY;
        ORANGE.printGenericLn(songs);
        ORANGE.printGenericLn(nosongs);
        BLUE.printGenericLn("But how can we generate infinite songs?");
        var infiniteSongs = 1 / 0.0f;
        var noSongsToInfinity = -1 / 0.0f;
        ORANGE.printGenericLn(infiniteSongs);
        ORANGE.printGenericLn(noSongsToInfinity);
        BLUE.printGenericLn("Can we use double for this?");
        var songsDouble = Double.POSITIVE_INFINITY;
        var nosongsDouble = Double.NEGATIVE_INFINITY;
        ORANGE.printGenericLn(songsDouble);
        ORANGE.printGenericLn(nosongsDouble);
        BLUE.printGenericLn("But how can we generate double infinite songs?");
        var infiniteSongsDouble = 1 / 0.0;
        var noSongsToInfinityDouble = -1 / 0.0;
        ORANGE.printGenericLn(infiniteSongsDouble);
        ORANGE.printGenericLn(noSongsToInfinityDouble);
        BLUE.printGenericLn("Sounds good, but how about that overflow Exception?");
        try {
            var notWithLongs = 1 / 0L;
        } catch (ArithmeticException e) {
            RED.printGenericLn("Nope, no Longs allowed! -> %s", e);
        }
        BLUE.printGenericLn("Ok... and ints?");
        try {
            var notWithIntegers = 1 / 0;
        } catch (ArithmeticException e) {
            RED.printGenericLn("Nope, no ints either! -> %s", e);
        }
        BLUE.printGenericLn("Shorts?");
        try {
            var notWithShorts = 1 / (short) 0;
        } catch (ArithmeticException e) {
            RED.printGenericLn("Shorts also won't do! -> %s", e);
        }
        BLUE.printGenericLn("Then I guess Byte won't also work?");
        try {
            var notWithBytes = 1 / (byte) 0;
        } catch (ArithmeticException e) {
            RED.printGenericLn("Bingo! -> %s", e);
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. There infinity representations for Float and Double calculations");
        GREEN.printGenericLn("2. Numbers without decimals cannot make a division by zero");
        GREEN.printGenericLn("3. Division by zero with Float and Double are akin to ∞ (infinity) in math.");
    }

    private static void exercise12() {
        BRIGHT_CYAN.printGenericLn("--- 12. Immutability with Guidelines 7 and 6");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We just made a much safer Cristal Ball for Alaska to use.");
        GREEN.printGenericLn("Let's give it a try!.");
        SuperCristalBall superBolaDeCristal = null;
        try {
            superBolaDeCristal = SuperCristalBall.createCristalBall(
                    "Alaska",
                    new Date(86, Calendar.OCTOBER, 6),
                    new Band(
                            List.of(
                                    "Alaska",
                                    "Nacho Canut",
                                    "Ana Curra",
                                    "Eduardo Benavente",
                                    "Carlos Berlanga"
                            ), "Alaska y los Pegamoides"));
        } catch (NoSuchProviderException e) {
            RED.printThrowableAndExit(e);
        } catch (NoSuchAlgorithmException e) {
            RED.printThrowableAndExit(e);
        }
        MAGENTA.printGenericLn("This is our new and improved cristal ball:\n%s", superBolaDeCristal);
        BLUE.printGenericLn("Note that we've made this Cristal Ball so safe that it now obeys guidelines 6 and 7!");
        BLUE.printGenericLn("Therefore, for this module, there isn't much to test.");
        BLUE.printGenericLn("Please follow the code for a better understandinf of what's happening and namely have a look at the comments.");
        BLUE.printGenericLn("Of course read the guidelines here -> https://www.oracle.com/java/technologies/javase/seccodeguide.html");
        // Guideline 7-2 / OBJECT-2: Prevent the unauthorized construction of sensitive classes
        SecurityManager setSecurityManager = new SecurityManager() {
            @Override
            public void checkExit(int status) {
                throw new RuntimeException("Ahha! Not today you are not!");
            }

            @Override
            public void checkPermission(Permission perm) {
            }
        };
        System.setSecurityManager(setSecurityManager);

        try {
            assert superBolaDeCristal != null;
            // Guideline 7-2 / OBJECT-2: Prevent the unauthorized construction of sensitive classes
            superBolaDeCristal.leaveEarth();
        } catch (RuntimeException e) {
            RED.printGenericLn("The reason why this exception is thrown is that our SecurityManager doesn't let us exit with an error:\n%s\nIt's magic!", e);
        }
        System.setSecurityManager(null);

        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. We've made a few tests here, but this module will not be able to cover all of guidelines 6 and 7");
        GREEN.printGenericLn("2. Guideline 6 is about protecting Mutability");
        GREEN.printGenericLn("3. Guideline 7 is about protecting Object construction");
        GREEN.printGenericLn("4. Some guidelines may fuse with each other");
        GREEN.printGenericLn("5. Some are much more important than others");
        GREEN.printGenericLn("6. Guideline 7-1 / OBJECT-1: Avoid exposing constructors of sensitive classes");
        GREEN.printGenericLn("7. Guideline 7-2 / OBJECT-2: Prevent the unauthorized construction of sensitive classes");
        GREEN.printGenericLn("8. Guideline 7-4 / OBJECT-4: Prevent constructors from calling methods that can be overridden");
        GREEN.printGenericLn("9. Guideline 7-5 / OBJECT-5: Defend against cloning of non-final classes");
    }

    private static void exercise11() {
        BRIGHT_CYAN.printGenericLn("--- 11. Method overloading and overriding with `extends`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Some of us like music \"Rosario Flores\" style, others prefer something more edgy like \"Dorian\".");
        GREEN.printGenericLn("We now have to manage the upcoming dates and for that we have created just one BandManager abstraction");
        GREEN.printGenericLn("Further we have implemented 3 different ways to override and other two to overload the BandManager method.");
        GREEN.printGenericLn("We'll put these methods to the test for different times of music history.");
        var band = new Band(List.of(
                "Santi Balmes",
                "Julián Saldarriaga",
                "Jordi Roig",
                "Joan Ramón Planell",
                "Oriol Bonet"), "Love of Lesbian");
        var quintetBand = new QuintetBand(
                List.of(
                        "Alaska",
                        "Nacho Canut",
                        "Ana Curra",
                        "Eduardo Benavente",
                        "Carlos Berlanga"
                ), "Alaska y los Pegamoides");
        var genericBand = new GenericBand(
                6, List.of(
                "Pucho",
                "David \"el Indio\"",
                "Álvaro B. Baglietto",
                "Jorge González",
                "Guillermo Galván",
                "Juanma Latorre"
        ), "Vetusta Morla");
        var paulinaRubio = new GenericBand(1, List.of("Paulina Rubio"), "Paulina Rubio");
        var rosarioFlores = new GenericBand(1, List.of("Rosario Flores"), "Rosario Flores");
        MAGENTA.printGenericLn("These are our bands:\n%s\n%s\n%s\n%s\n%s", band, quintetBand, genericBand, paulinaRubio, rosarioFlores);
        var effectiveBandManager = new EffectiveBandManager();
        var generalBandManager = new GeneralBandManager();
        var quintetBandManager = new QuintetBandManager();
        final Map<Band, Temporal> upcomingDates = effectiveBandManager.getUpcomingDates(band, LocalDateTime.now());
        final Map<GenericBand, LocalDateTime> upcomingDates1 = generalBandManager.getUpcomingDates(genericBand, LocalDateTime.now());
        final Map<QuintetBand, LocalDate> upcomingDates2 = quintetBandManager.getUpcomingDates(quintetBand, LocalDate.now());
        MAGENTA.printGenericLn("The first maps are now ready:\n%s\n%s\n%s", upcomingDates, upcomingDates1, upcomingDates2);
        upcomingDates1.put(paulinaRubio, LocalDateTime.now());
        upcomingDates1.put(rosarioFlores, LocalDateTime.now());
        MAGENTA.printGenericLn("Adding two more artists to this new concert we get:\n%s", upcomingDates1);
        final Map<GenericBand, LocalDateTime> upcomingDates3 = generalBandManager.getUpcomingDates((Band) genericBand, LocalDateTime.now());
        final Map<QuintetBand, LocalDate> upcomingDates4 = quintetBandManager.getUpcomingDates((Band) quintetBand, LocalDate.now());
        BRIGHT_MAGENTA.printGenericLn("Had we used the overriden methods we would have gotten:\n%s\nand\n%s", upcomingDates3, upcomingDates4);
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Overloading and overriding with extends obeys some specific rules");
        GREEN.printGenericLn("2. The base type is the parameter you have to use in order to override");
        GREEN.printGenericLn("3. Subclass types of the declared base parameter always results in overloading");
        GREEN.printGenericLn("4. The return parameters may be subclass types");
        GREEN.printGenericLn("5. Since they have to be subclasses or the same, the type cannot be erased when overriding");
    }

    private static void exercise10() {
        BRIGHT_CYAN.printGenericLn("--- 10. Evaluation order of conditional operators");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Pepe is a manager that loves going to concerts.");
        GREEN.printGenericLn("In your team, you know that he is crazy about \"Vetusta Morla\".");
        GREEN.printGenericLn("However, sometimes, Pepe forgets to say to the team that is off.");
        GREEN.printGenericLn("Not only that, but at the same time that \"Vetusta Morla\" is playing, \"Sidonie\" is also playing in the same week.");
        GREEN.printGenericLn("If any of this is true, then we know that Pepe will be off the whole November of 2011.");
        GREEN.printGenericLn("We'll check this:");
        var month = 11;
        var year = 2011;
        if (pepeIsOffOn(year, month, 24) || pepeIsOffOn(year, month, 25)) {
            MAGENTA.printGenericLn("Pepe won't be coming to work this november!");
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Logic operators such as || and && can short circuit in Java");
        GREEN.printGenericLn("2. Short circuiting does not imply the evaluation of all operands");
        GREEN.printGenericLn("3. Since they are evaluated left to right and considering mathematical precedence, the runtime knows when further evaluation is not needed");
        GREEN.printGenericLn("4. When not all operands are evaluated, we call this  a short-circuit");
    }

    private static boolean pepeIsOffOn(int year, int month, int day) {
        var concertVetustaDate = LocalDateTime.of(2011, 11, 25, 0, 0);
        var concertSidonieDate = LocalDateTime.of(2011, 11, 24, 0, 0);
        if (concertVetustaDate.getYear() == year &&
                concertVetustaDate.getMonthValue() == month &&
                concertVetustaDate.getDayOfMonth() == day) {
            MAGENTA.printGenericLn("Pepe is going to see Vetusta Morla on the %s", concertVetustaDate);
            return true;
        }
        if (concertVetustaDate.getYear() == year &&
                concertSidonieDate.getMonthValue() == month &&
                concertSidonieDate.getDayOfMonth() == day) {
            MAGENTA.printGenericLn("Pepe is going to see Sidonie on the %s", concertSidonieDate);
            return true;
        }
        return false;
    }

    private static void exercise9() {
        BRIGHT_CYAN.printGenericLn("--- 9. Why use `putIfAbsent`?");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Someone in your group of friends suggested to go to the next concert of Paulina Rubio.");
        GREEN.printGenericLn("Unfortunatelly you cannot go.");
        GREEN.printGenericLn("However your friends, Paco, Lori, Nere, Cristina, Viktor, Carlos and Andrea, are really excited to go!");
        GREEN.printGenericLn("We need to distribute the tickets as fast as possible and store them in a map.");
        GREEN.printGenericLn("The best ticket is the front row one, so in spite of being best friends, they will struggle to get the best one first!");
        ORANGE.printGenericLn("Ticket office is open!");
        var ticketFrontRow = new Ticket("Paulina Rubio", "Valdemoro - Madrid - España", "ES1028562319",
                LocalDateTime.of(2010, 5, 8, 0, 0));
        var ticketRowTwo = new Ticket("Paulina Rubio", "Valdemoro - Madrid - España", "ES0384518495",
                LocalDateTime.of(2010, 5, 8, 0, 0));
        var ticketRowThree = new Ticket("Paulina Rubio", "Valdemoro - Madrid - España", "ES0174538594",
                LocalDateTime.of(2010, 5, 8, 0, 0));
        var ticketRowFour = new Ticket("Paulina Rubio", "Valdemoro - Madrid - España", "ES3287451065",
                LocalDateTime.of(2010, 5, 8, 0, 0));
        var ticketRowFive = new Ticket("Paulina Rubio", "Valdemoro - Madrid - España", "ES0102956473",
                LocalDateTime.of(2010, 5, 8, 0, 0));
        var ticketRowSix = new Ticket("Paulina Rubio", "Valdemoro - Madrid - España", "ES6674993217",
                LocalDateTime.of(2010, 5, 8, 0, 0));
        var ticketRowSeven = new Ticket("Paulina Rubio", "Valdemoro - Madrid - España", "ES9928465748",
                LocalDateTime.of(2010, 5, 8, 0, 0));
        var precedenceTickets = List.of(ticketFrontRow,
                ticketRowTwo, ticketRowThree, ticketRowFour, ticketRowFive, ticketRowSix, ticketRowSeven);
        ExecutorService executorService = Executors.newFixedThreadPool(7);
        final var ticketMap = new ConcurrentHashMap<Ticket, String>();
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap, "Paco"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap, "Lori"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap, "Nere"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap, "Cristina"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap, "Viktor"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap, "Carlos"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap, "Andrea"));
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            RED.printThrowableAndExit(e);
        }
        MAGENTA.printGenericLn("The result is \n%s", ticketMap.entrySet().stream().map(Object::toString).collect(Collectors.joining("\n")));
        GREEN.printGenericLn("We would get the same result if we had used putIfAbsent:");
        final var ticketMap2 = new ConcurrentHashMap<Ticket, String>();
        executorService = Executors.newFixedThreadPool(7);
        executorService.submit(tryAssignToNoLog(precedenceTickets, ticketMap2, "Paco"));
        executorService.submit(tryAssignToNoLog(precedenceTickets, ticketMap2, "Lori"));
        executorService.submit(tryAssignToNoLog(precedenceTickets, ticketMap2, "Nere"));
        executorService.submit(tryAssignToNoLog(precedenceTickets, ticketMap2, "Cristina"));
        executorService.submit(tryAssignToNoLog(precedenceTickets, ticketMap2, "Viktor"));
        executorService.submit(tryAssignToNoLog(precedenceTickets, ticketMap2, "Carlos"));
        executorService.submit(tryAssignToNoLog(precedenceTickets, ticketMap2, "Andrea"));
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            RED.printThrowableAndExit(e);
        }
        MAGENTA.printGenericLn("The new result is \n%s", ticketMap.entrySet().stream().map(Object::toString).collect(Collectors.joining("\n")));
        GREEN.printGenericLn("These operations will not fail for non-thread safe maps:");
        final var ticketMap3 = new HashMap<Ticket, String>();
        executorService = Executors.newFixedThreadPool(7);
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap3, "Paco"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap3, "Lori"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap3, "Nere"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap3, "Cristina"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap3, "Viktor"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap3, "Carlos"));
        executorService.submit(tryAssignTo(precedenceTickets, ticketMap3, "Andrea"));
        executorService.shutdown();
        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            RED.printThrowableAndExit(e);
        }
        MAGENTA.printGenericLn("The new result is also what we are looking for:\n%s", ticketMap.entrySet().stream().map(Object::toString).collect(Collectors.joining("\n")));
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. In order to add to a hashmap in a concurrent way, we should use an atomic operation.");
        GREEN.printGenericLn("2. putIfAbsent performs a check if exists and add then if not, it puts an element into the map in an atomic way.");
        GREEN.printGenericLn("3. This, also works in a non-thread safe map.");
        GREEN.printGenericLn("4. For that we do not have to combine our operation with a ConcurrentHashMap which is thread safe.");
    }

    private static Runnable tryAssignToNoLog(List<Ticket> precedenceTickets, Map<Ticket, String> ticketMap, String winner) {
        return () -> {
            for (var nextTicket : precedenceTickets) {
                final String computeIfAbsent = ticketMap.putIfAbsent(nextTicket, winner);
                if (Objects.equals(computeIfAbsent, winner)) {
                    break;
                }
            }
        };
    }

    private static Runnable tryAssignTo(List<Ticket> precedenceTickets, Map<Ticket, String> ticketMap, String winner) {
        return () -> {
            for (var nextTicket : precedenceTickets) {
                final String computeIfAbsent = ticketMap.computeIfAbsent(nextTicket, ticket -> {
                    ORANGE.printGenericLn("Assigning ticket %s to %s", ticket, winner);
                    return winner;
                });
                if (Objects.equals(computeIfAbsent, winner)) {
                    break;
                }
            }
        };
    }

    private static void exercise8() {
        BRIGHT_CYAN.printGenericLn("--- 8. Overwriting with `FileOutputStream`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: \"Sueño su boca\" was the first big hit of Raúl Cuenca in Spain.");
        GREEN.printGenericLn("In the year 2000, this hit was being played all across spanish speaking countries and the rest of the latin world.");
        GREEN.printGenericLn("You want to save the lyrics and made it through to copying them to one friend");
        GREEN.printGenericLn("Now you you are making the second copy you make a mistake and only copy a bit of it to the same destination file.");
        GREEN.printGenericLn("Will there be a change?.");
        try (
                var fis = new FileInputStream("/tmp/raul_lyrics.txt");
                var fos = new FileOutputStream("/tmp/raul_lyrics2.txt");
        ) {
            byte[] buffer = new byte[2048];
            int bytes;
            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
                YELLOW.printGenericLn(new String(buffer).trim());
            }
        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        } catch (Exception e) {
            RED.printThrowableAndExit(e);
        }
        BLUE.printGenericLn("Check your file contents in the file system: /tmp/raul_lyrics2.txt.");
        BLUE.printGenericLn("Press ENTER twice to continue...");
        if (!skipQuestions) {
            try {
                System.in.read();
            } catch (IOException e) {
                RED.printThrowableAndExit(e);
            }
        }
        try (
                var fis = new FileInputStream("/tmp/raul_lyrics.txt");
                var fos = new FileOutputStream("/tmp/raul_lyrics2.txt");
        ) {
            byte[] buffer = new byte[100];
            int bytes;
            bytes = fis.read(buffer);
            fos.write(buffer, 0, bytes);
            YELLOW.printGenericLn(new String(buffer).trim());
        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        } catch (Exception e) {
            RED.printThrowableAndExit(e);
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. By default, FileOutputStream is configured to have the appendMode to false.");
        GREEN.printGenericLn("2. If appendMode is disable, the file gets overwritten.");
        GREEN.printGenericLn("3. Overwriting a file means that the file is written all over again.");
        GREEN.printGenericLn("4. When we start again, we remove all original data.");
    }

    private static void exercise7() {
        BRIGHT_CYAN.printGenericLn("--- 7. Immutability standards and using `LocalDate` and `LocalDateTime`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Alaska started a show in 1984 based on the writings of Dolores Rico Oliver called \"La bola de cristal\".");
        GREEN.printGenericLn("\"La bola de cristal\", if yo haven't guessed already means \"The cristal ball\"");
        GREEN.printGenericLn("Cristal balls are always portrayed the same way");
        GREEN.printGenericLn("They are magic and they give information about the past, the present and the future.");
        GREEN.printGenericLn("Each cristal ball is also unique, but how do cristal balls make sure they are not tampered with?");
        GREEN.printGenericLn("In other words, what makes cristal balls immutable?");
        GREEN.printGenericLn("For our case we are just interested on the first 5 requirements for security guidelines 6 on Mutable classes: https://www.oracle.com/java/technologies/javase/seccodeguide.html");
        CristalBall bolaDeCristal = null;
        try {
            bolaDeCristal = CristalBall.createCristalBall(
                    "Alaska",
                    new Date(86, Calendar.OCTOBER, 6),
                    new Band(
                            List.of(
                                    "Alaska",
                                    "Nacho Canut",
                                    "Ana Curra",
                                    "Eduardo Benavente",
                                    "Carlos Berlanga"
                            ), "Alaska y los Pegamoides"));
        } catch (NoSuchProviderException e) {
            RED.printThrowableAndExit(e);
        } catch (NoSuchAlgorithmException e) {
            RED.printThrowableAndExit(e);
        }
        MAGENTA.printGenericLn("This is the Cristal Ball of Episode I\n%s", bolaDeCristal);
        MAGENTA.printGenericLn("We can get the from the available ones\n%s", CristalBall.getHost(bolaDeCristal));
        MAGENTA.printGenericLn("We can get it from the available ones\n%s", CristalBall.getCristalBall(bolaDeCristal.getPriv()));
        BRIGHT_CYAN.printGenericLn("We can also comment it out:");
        bolaDeCristal.setComment("Me encanta este show! Super guay!!");
        MAGENTA.printGenericLn("And then we get a comment on our Cristal Ball\n%s", bolaDeCristal);
        BRIGHT_CYAN.printGenericLn("And if we check if this is immutable:");
        Date date = bolaDeCristal.getDate();
        Date dateSafeCopy = bolaDeCristal.getDateSafeCopy();
        LocalDate localDate = bolaDeCristal.getLocalDate();
        LocalDateTime localDateTime = bolaDeCristal.getLocalDateTime();
        Band band = bolaDeCristal.getBand();
        String host = bolaDeCristal.getHost();
        MAGENTA.printGenericLn("We get that\n%s had a band:\n%s\nand the pilot show aired on spanish television on the:%s\n%s\n%s\n%s ", host, band, date, dateSafeCopy, localDate, localDateTime);
        BRIGHT_CYAN.printGenericLn("Let's tamper that and see if we can change it!");
        date.setYear(200);
        dateSafeCopy.setTime(200);
        band.capacity = 1000;
        BRIGHT_CYAN.printGenericLn("Note that LocalDate and LocalDateTime are already immutable");
        BRIGHT_CYAN.printGenericLn("We did change the date objects and the capacity.");
        BRIGHT_CYAN.printGenericLn("From the outside we get the impression that we changed our original cristal ball:");
        MAGENTA.printGenericLn("We get that\n%s had a band:\n%s\nand the pilot show aired on spanish television on the:%s\n%s\n%s\n%s ", host, band, date, dateSafeCopy, localDate, localDateTime);
        BRIGHT_CYAN.printGenericLn("But from the inside we see that nothing has changed:");
        date = bolaDeCristal.getDate();
        dateSafeCopy = bolaDeCristal.getDateSafeCopy();
        localDate = bolaDeCristal.getLocalDate();
        localDateTime = bolaDeCristal.getLocalDateTime();
        band = bolaDeCristal.getBand();
        host = bolaDeCristal.getHost();
        MAGENTA.printGenericLn("We get that\n%s had a band:\n%s\nand the pilot show aired on spanish television on the:%s\n%s\n%s\n%s ", host, band, date, dateSafeCopy, localDate, localDateTime);
        BRIGHT_CYAN.printGenericLn("If we make a copy of it, we can use our method. Remember that we made a copy method to make a copy easy and follow the secuirty guidelines:");
        try {
            MAGENTA.printGenericLn("This is our copy:\n%s", bolaDeCristal.copy());
        } catch (NoSuchProviderException e) {
            RED.printThrowableAndExit(e);
        } catch (NoSuchAlgorithmException e) {
            RED.printThrowableAndExit(e);
        }
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. We followed the Java Security Guidelines for Mutability from point 1 to 5, which are the most common");
        GREEN.printGenericLn("1.1 Guideline 6-1 / MUTABLE-1: Prefer immutability for value types");
        GREEN.printGenericLn("1.2 Guideline 6-2 / MUTABLE-2: Create copies of mutable output values");
        GREEN.printGenericLn("1.3 Guideline 6-3 / MUTABLE-3: Create safe copies of mutable and subclassable input values");
        GREEN.printGenericLn("1.4 Guideline 6-4 / MUTABLE-4: Support copy functionality for a mutable class");
        GREEN.printGenericLn("1.5 Guideline 6-5 / MUTABLE-5: Do not trust identity equality when overridable on input reference objects");
    }

    private static void exercise6() {
        BRIGHT_CYAN.printGenericLn("--- 6. Bypassing overloading methods with different return types");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We want to go one of the \"La casa azul\" concerts.");
        GREEN.printGenericLn("Time is running out to book them, we don't know to which one we can go to.");
        GREEN.printGenericLn("So we decide to buy a bunch of them.");
        var ticket1 = new Ticket("La casa azul", "El Ejido, " +
                "ES", "ES23424ES23432", LocalDateTime.of(2019, 4, 27, 0, 0, 0));
        var ticket2 = new Ticket("La casa azul", "El Ejido, " +
                "ES", 123232341342312L, LocalDateTime.of(2019, 4, 27, 0, 0, 0));
        var ticket3 = new Ticket("La casa azul", "Seville, " +
                "ES", 193874567394857L, LocalDateTime.of(2019, 6, 29, 0, 0, 0));
        MAGENTA.printGenericLn("Our first ticket is -> %s", ticket1);
        MAGENTA.printGenericLn("Our second ticket is -> %s", ticket2);
        MAGENTA.printGenericLn("Our third ticket is -> %s", ticket3);
        MAGENTA.printGenericLn("We have all the tickets for \"La casa azul\":\n%s", getTicketsStringNumbers("La casa azul"));
        MAGENTA.printGenericLn("Some of them are just numbers:\n%s", getTicketsLongNumbers("La casa azul"));
        BRIGHT_CYAN.printGenericLn("We realize that we can only go to the latest one!");
        BRIGHT_CYAN.printGenericLn("Let's unregister te last two tickets");
        var ticket1U = Ticket.unregisterTicket("ES23424ES23432");
        var ticket2U = Ticket.unregisterTicket(123232341342312L);
        assert ticket1.equals(ticket1U);
        assert ticket2.equals(ticket2U);
        MAGENTA.printGenericLn("We've unregistered tickets\n%s\nand\n%s", ticket1U, ticket2U);
        final var allTicketsLaCasaAzul = getTicketsStringNumbers("La casa azul");
        MAGENTA.printGenericLn("We finally should only have one ticket in our reservation:\n%s", allTicketsLaCasaAzul);
        final var ticketNumber = allTicketsLaCasaAzul.get(0);
        final var finalTicket = Ticket.getTicket(ticketNumber);
        MAGENTA.printGenericLn("Hurrah! We are going to %s to watch %s with ticket %s on the %s", finalTicket.getVenue(), finalTicket.getBandName(), finalTicket.getTicketNumber(), finalTicket.getLocalDateTime());
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Methods can be overloaded if their parameters are different both in number and in types");
        GREEN.printGenericLn("2. The compiler cannot tell two methods apart if they differ only in their return type");
        GREEN.printGenericLn("3. This makes sense because if you call a method and do not assign its return value, you also would not be able to tell which method should be called would you?");
        GREEN.printGenericLn("4. By the previous point we can also infer that parameter naming will not play a role in overloading since we don't call methods via their parameters name in Java... Not yet at least 😊");
    }

    private static void exercise5() {
        BRIGHT_CYAN.printGenericLn("--- 5. Hiding and shadowing instance members");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: \"Love of Lesbian\" was founded in 1997.");
        GREEN.printGenericLn("Alaska actually started in a band called \"Alaska y los Pegamoides\" in 1979.");
        GREEN.printGenericLn("\"Vetusta Morla\" is another band which started in 1998.");
        GREEN.printGenericLn("We are going to register them and understand the concept of shadouwing of instance members.");
        var band = new Band(List.of(
                "Santi Balmes",
                "Julián Saldarriaga",
                "Jordi Roig",
                "Joan Ramón Planell",
                "Oriol Bonet"), "Love of Lesbian");
        var quintetBand = new QuintetBand(
                List.of(
                        "Alaska",
                        "Nacho Canut",
                        "Ana Curra",
                        "Eduardo Benavente",
                        "Carlos Berlanga"
                ), "Alaska y los Pegamoides");
        var genericBand = new GenericBand(
                6, List.of(
                "Pucho",
                "David \"el Indio\"",
                "Álvaro B. Baglietto",
                "Jorge González",
                "Guillermo Galván",
                "Juanma Latorre"
        ), "Vetusta Morla");
        MAGENTA.printGenericLn("This is band #1 -> %s", band);
        MAGENTA.printGenericLn("This is band #2 -> %s", quintetBand);
        MAGENTA.printGenericLn("This is band #3 -> %s", genericBand);
        GREEN.printGenericLn("We notice a few things that may sound odd.");
        GREEN.printGenericLn("1. Capacity is different for the subclasses of Band.");
        GREEN.printGenericLn("2. Capacity didn't limit the number of allowed members.");
        MAGENTA.printGenericLn("Band #1 has %d members", band.capacity);
        MAGENTA.printGenericLn("Band #2 has %d members", ((Band) quintetBand).capacity);
        MAGENTA.printGenericLn("Band #3 has %d members", ((Band) genericBand).capacity);
        GREEN.printGenericLn("Well, we know that for the last two bands this is not true. This is why we have our common getters.");
        MAGENTA.printGenericLn("Band #1 has %d members", band.getCapacity());
        MAGENTA.printGenericLn("Band #2 has %d members", quintetBand.getCapacity());
        MAGENTA.printGenericLn("Band #3 has %d members", genericBand.getCapacity());
        GREEN.printGenericLn("This is true, but do methods get overriden?");
        MAGENTA.printGenericLn("Band #1 has %d members", band.getCapacity());
        MAGENTA.printGenericLn("Band #2 has %d members", ((Band) quintetBand).getCapacity());
        MAGENTA.printGenericLn("Band #3 has %d members", ((Band) genericBand).getCapacity());
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Shadowing involves covering another variable. There is no limitation on how this can be done");
        GREEN.printGenericLn("2. The overshadowing member will also overshadow the scope");
        GREEN.printGenericLn("3. Methods do get overridden regardless of @Override");
        GREEN.printGenericLn("4. Capacity in an ArrayList only means that the initial capacity of the Array is fixed.");
        GREEN.printGenericLn("5. An ArrayList will change size automatically. Capacity is just used in performance and memory usage fine tuning.");
    }

    private static void exercise4() {
        BRIGHT_CYAN.printGenericLn("--- 4. The `java.desktop` module");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: We want an app that lets us surf the web for short stories about Spanish music");
        GREEN.printGenericLn("We'll make our first prototype using the \"Bandido\". A famous spanish album from \"Miguel Bosé\" containing famous anthem \"Amante bandido\"");
        GREEN.printGenericLn("We'll use this as the name of our module: amante.bandido");
        GREEN.printGenericLn("Please find this module in the sources for mastery-4-3-swing and run it.");
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Java SWING libraries, although part of the JDK, they are not part of the java.base module.");
        GREEN.printGenericLn("2. Because they are not part of the java.base module, they have to be required.");
        GREEN.printGenericLn("3. To require them, you need to require the java.desktop module. Example:");
        GREEN.printGenericLn("module amante.bandido {\n" +
                "    requires java.desktop;\n" +
                "    requires consolerizer;\n" +
                "}");
    }

    private static void exercise3() {
        BRIGHT_CYAN.printGenericLn("--- 3. The body of `switch`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: \"¿A quién le importa?\" is a single from 1984 sung by Alaska and Dinamara, and edited by Nacho Canut and Carlos Berlanga.");
        GREEN.printGenericLn("There have been a lot of switches in styles up until present for this song. Several covers.");
        GREEN.printGenericLn("The reason why this song is so popular is because later in the 80's, it found great recognition in marginalized groups.");
        GREEN.printGenericLn("Most importantly the LGBT community from spanish speaking countries.");
        GREEN.printGenericLn("The song gained such momentum in that community, that it is now celebrated in the same way as \"I will survive\" from Gloria Gaynor is.");
        GREEN.printGenericLn("It mainly has to do with the rebelious theme of the song in which it is said:");
        GREEN.printGenericLn("\"Who cares as to what to I do? Who cares as to what do I say? I am like this, I will always be like this and I will never change.\"");

        var i = 1984;
        MAGENTA.printGenericLn("In year %d version %s was released.", i, getYearMusic(i));
        i = 2002;
        MAGENTA.printGenericLn("In year %d version %s was released.", i, getYearMusic(i));
        i = 2011;
        MAGENTA.printGenericLn("In year %d version %s was released.", i, getYearMusic(i));
        i = 2017;
        var m = 6;
        MAGENTA.printGenericLn("In year %d and month %d version %s was released.", i, m, getYearMonthMusic(i, m));
        m = 12;
        MAGENTA.printGenericLn("In year %d and month %d version %s was released.", i, m, getYearMonthMusic(i, m));
        i = 2020;
        m = 6;
        MAGENTA.printGenericLn("In year %d and month %d version %s was released.", i, m, getYearMonthMusic(i, m));
        m = 7;
        MAGENTA.printGenericLn("In year %d and month %d version %s was released.", i, m, getYearMonthMusic(i, m));

        GREEN.printGenericLn("Curiosities about switch and other accolades:");

        BLUE.printGenericLn("        int k =0;\n" +
                "        for (; k < 100; k++) ;\n" +
                "        while(k < 100);\n" +
                "        do {} while (k<100);\n" +
                "        // Do while without a body is illegal\n" +
                "        // do while (k<100);\n" +
                "        // Switches without a body are illegal\n" +
                "        // switch(i);");
        int k = 0;
        for (; k < 100; k++) ;
        while (k < 100) ;
        do {
        } while (k < 100);
        // Do while without a body is illegal
        // do while (k<100);
        // Switches without a body are illegal
        // switch(i);k
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Switches must have a body!");
        GREEN.printGenericLn("2. Switches only accept int, short, long, byte, char, their boxed counterparts, Short, Long, Byte, Character, and String and enums as parameters.");
        GREEN.printGenericLn("3. do while is akin to a switch in the sense that it also cannot be done without a body.");
        GREEN.printGenericLn("4. for and while can be done without a body.");
    }

    /**
     * -   [RUBÍ 2020, entrada completa a quien le importa](https://www.youtube.com/watch?v=aNMdaRbX_-k)
     * -   [Rosa López · A quién le importa - 2020](https://www.youtube.com/watch?v=NxlfzjWX2Z4)
     * -   [A QUIÉN LE IMPORTA - Grupal | Gala 7 | OT 2017](https://www.youtube.com/watch?v=hoH6OXQpmQY)
     * -   [Himno World Pride Madrid 2017 - A quien le importa 2017](https://www.lasexta.com/especiales/world-pride-madrid/orgullo-lgtbi/a-quien-le-importa-asi-suena-el-himno-oficial-del-world-pride-madrid-2017_201706285953f2d20cf2a25c00ab7737.html)
     * -   [Fangoria - A quien le importa 2011](https://www.youtube.com/watch?v=XX_hWpPnd3I)
     * -   [Thalia - A Quien Le Importa - Video Oficial 2002](https://www.youtube.com/watch?v=s0MG5mdwweU)
     * -   [Alaska y Dinarama A Quién Le Importa (1984)](https://www.youtube.com/watch?v=N2L7cRsUA0E)
     *
     * @param y Year of the song inception
     * @param m Month of the song inception
     * @return
     */
    private static String getYearMonthMusic(int y, int m) {
        switch (y) {
            case 2002:
                return "Thalia - A Quien Le Importa - Video Oficial 2002 - https://www.youtube.com/watch?v=s0MG5mdwweU";
            // Unreachable statement
            // break;
            case 2011:
                return "Fangoria - A quien le importa 2011 - https://www.youtube.com/watch?v=XX_hWpPnd3I";
            case 2017:
                switch (m) {
                    case 12:
                        return "A QUIÉN LE IMPORTA - Grupal | Gala 7 | OT 2017 - https://www.youtube.com/watch?v=hoH6OXQpmQY";
                    case 6:
                    default:
                        return "Himno World Pride Madrid 2017 - A quien le importa 2017\nhttps://www.lasexta.com/especiales/world-pride-madrid/orgullo-lgtbi/a-quien-le-importa-asi-suena-el-himno-oficial-del-world-pride-madrid-2017_201706285953f2d20cf2a25c00ab7737.html";
                }
            case 2020:
                switch (m) {
                    case 6:
                        return "Rosa López · A quién le importa - 2020 - https://www.youtube.com/watch?v=NxlfzjWX2Z4";
                    case 7:
                    default:
                        return "Camila Sodi - RUBÍ 2020, entrada completa a quien le importa - https://www.youtube.com/watch?v=aNMdaRbX_-k";

                }
            case 1984:
                // Unreachable statement
                // break;
            default:
                return "Alaska y Dinarama A Quién Le Importa (1984) - https://www.youtube.com/watch?v=N2L7cRsUA0E";
        }
    }

    private static String getYearMusic(int y) {
        return getYearMonthMusic(y, 0);
    }

    private static void exercise2() {
        BRIGHT_CYAN.printGenericLn("--- 2. Different ways to use `this`");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: In 1981, Hispavox edited and published single \"Juntos\" by Paloma San Basilio");
        GREEN.printGenericLn("Since then, this song has been sung and remixed by different artists.");
        GREEN.printGenericLn("We will register this event and see how can we use `this`.");

        var company = new Company("Hispavox");
        var music = company.new Music("Juntos", "Paloma San Basilio",
                LocalDateTime.of(1981, 1, 1, 0, 0, 0));
        // 'org.jesperancinha.java11.mastery4dot2.record.Company' is not an enclosing class
        // Company.this
        BLUE.printGenericLn("The only reason why %s works is because %s is an enclosing class of %s.", "Company.this.company", "Company", "Music");
        MAGENTA.printGenericLn(music.getTheMusic());
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. `this` is more commonly used within a class to refer to the instance members");
        GREEN.printGenericLn("2. It cannot be used for static members");
        GREEN.printGenericLn("3. Although less common, we can use this to refer to the instance members of an enclosing class");
        GREEN.printGenericLn("4. Even though it looks like a static accessor, it is an instance member accessor");
    }

    private static void exercise1() {
        BRIGHT_CYAN.printGenericLn("--- 1. Primitives Revised");
        printRainbowLn("==");
        GREEN.printGenericLn("Case: Music group Fangoria was created in 1989.");
        GREEN.printGenericLn("The name of the group was inspired by the love the group members, Alaska and Nacho Canut have for the magazine of the same name");
        GREEN.printGenericLn("We'll have a look at numbers related to that magazine and explore java primitive types with it");
        printRainbowLn("###");
        final byte issnLeft = 0164;
        BRIGHT_CYAN.printGenericLn("Byte - one byte - 2^8");
        BRIGHT_CYAN.printGenericLn("Range from %s to %s", Byte.MIN_VALUE, Byte.MAX_VALUE);
        MAGENTA.printGenericLn("If we look at the left side of the issn, we a small number.");
        MAGENTA.printGenericLn("164, is however, too big for the maximum allowed value for a byte.");
        MAGENTA.printGenericLn("In this case, we can use its octed representation, which in turn is a smaller number than a 164.");
        MAGENTA.printGenericLn("Octet radix numbers are represented with a 0 as a prefix.");
        MAGENTA.printGenericLn("This is our number as we would read it in decimal: %s", Integer.toString(issnLeft, 10));
        MAGENTA.printGenericLn("And this is what we want: %s", Integer.toString(issnLeft, 8));
        BRIGHT_MAGENTA.printGenericLn("Note that we are able to pass a byte in the toString of Integer, just because the range of Integer covers the byte range");
        BRIGHT_MAGENTA.printGenericLn("Also, bear in mind that primitive numbers without decimals are interpreted as integers. except for byte and short");
        printRainbowLn("###");
        short lossesPerIssue = 20000;
        BRIGHT_CYAN.printGenericLn("Short two bytes - 2^16");
        BRIGHT_CYAN.printGenericLn("Range from %s to %s", Short.MIN_VALUE, Short.MAX_VALUE);
        MAGENTA.printGenericLn("In early beginnings, Fangoria magazine wasn't selling that much.");
        MAGENTA.printGenericLn("The losses amounted to USD$20000 per issue");
        MAGENTA.printGenericLn("We cannot put this number in a byte. It just falls out of range");
        MAGENTA.printGenericLn("If we use a short though, we can safely accomodate it");
        MAGENTA.printGenericLn("This is our number as we would read it in decimal: %s", Integer.toString(lossesPerIssue, 10));
        MAGENTA.printGenericLn("Just for fun, we can look at its octal representation: %s", Integer.toString(lossesPerIssue, 8));
        MAGENTA.printGenericLn("Which if we use that in the code we get: %s", 047040);
        BRIGHT_MAGENTA.printGenericLn("Note that shor, just as byte, is often overlooked because it's just not common enough");
        BRIGHT_MAGENTA.printGenericLn("However, the benefits of using primitives like these two for small numbers can represent an advantage");
        printRainbowLn("###");
        int oclc = 4618144;
        BRIGHT_CYAN.printGenericLn("Integer four bytes - 2^32");
        BRIGHT_CYAN.printGenericLn("Range from %s to %s", Integer.MIN_VALUE, Integer.MAX_VALUE);
        MAGENTA.printGenericLn("As reported by wikipedia, the OCLC is the Ohio College Library Center number.");
        MAGENTA.printGenericLn("We want to register this reference number for the publishing of issue 7 of Fangoria Magazine.");
        MAGENTA.printGenericLn("For this, we cannot use Short anymore. It falls out of the range needed.");
        MAGENTA.printGenericLn("We'll try with Integer.");
        MAGENTA.printGenericLn("This is our number as we would read it in decimal: %s", Integer.toString(oclc, 10));
        MAGENTA.printGenericLn("Just for fun, we can look at its octal representation: %s", Integer.toString(oclc, 8));
        MAGENTA.printGenericLn("Which if we use that in the code we get: %s", 021473640);
        BRIGHT_MAGENTA.printGenericLn("Important to note is again, how integer is always the type pointed out by the compiler");
        BRIGHT_MAGENTA.printGenericLn("Especially if you look the octals, they are interpreted as int.");
        BRIGHT_MAGENTA.printGenericLn("They only get converted when they match the range.");
        printRainbowLn("###");
        long firstPublicationMs = 283_996_800_000L;
        BRIGHT_CYAN.printGenericLn("Long eight bytes - 2^64");
        BRIGHT_CYAN.printGenericLn("Range from %s to %s", Long.MIN_VALUE, Long.MAX_VALUE);
        MAGENTA.printGenericLn("The first publication of Fangoria happened on a specific date.");
        MAGENTA.printGenericLn("We found the number in milliseconds.");
        MAGENTA.printGenericLn("If we convert that to some epoch representation, we then convert from %d to %s", firstPublicationMs, LocalDateTime.ofInstant(Instant.ofEpochMilli(firstPublicationMs), ZoneId.systemDefault()));
        MAGENTA.printGenericLn("This is our number as we would read it in decimal: %s", Long.toString(firstPublicationMs, 10));
        MAGENTA.printGenericLn("Just for fun, we can look at its octal representation: %s", Long.toString(firstPublicationMs, 8));
        MAGENTA.printGenericLn("Which if we use that in the code we get: %s", 04103741642000L);
        BRIGHT_MAGENTA.printGenericLn("You probably noticed that we are using L to specify that it is a long.");
        BRIGHT_MAGENTA.printGenericLn("The compiler needs to know what do we actually mean if the number falls out of the integer range.");
        BRIGHT_MAGENTA.printGenericLn("If it falls out of the range of Integer and we want it to be long, we specify that with an appended L or l.");
        printRainbowLn("###");
        float firstPublicationMs2 = 283_996_800_000L;
        BRIGHT_CYAN.printGenericLn("Float 4 bytes - 2^32");
        BRIGHT_CYAN.printGenericLn("Range from %s to %s with a min normal %s", Float.MIN_VALUE, Float.MAX_VALUE, Float.MIN_NORMAL);
        BRIGHT_CYAN.printGenericLn("It stores up 6 to 7 significant numbers");
        MAGENTA.printGenericLn("Before continuing in this section you probably noticed a strange conversion.");
        MAGENTA.printGenericLn("A long to a float? Well that can happen simply because a long fits in a float range.");
        MAGENTA.printGenericLn("And although float occupies less amount of bytes (4) than long (8), its implementation allows this to happen.");
        MAGENTA.printGenericLn("This means that even with a float, the rule that it fits, is accepted is still valid.");
        MAGENTA.printGenericLn("The only difference is that we need to specify L if its bigger than an int.");
        MAGENTA.printGenericLn("If we convert that to some epoch representation from a float, we then convert from %f to %s", firstPublicationMs2, LocalDateTime.ofInstant(Instant.ofEpochMilli((long) firstPublicationMs2), ZoneId.systemDefault()));
        BRIGHT_MAGENTA.printGenericLn("Notice that we had to upcast it to long. This is because the compiler does not understand that we are converting to a type with a lower range. Although the number fits, type float does not fit in the long range.");
        float parallelUniversePublications1 = (3_000_000f * 12 * 30 * 10);
        MAGENTA.printGenericLn("Let's imagine that 10 universes are working together.");
        MAGENTA.printGenericLn("The same thing happens in all of those 10 universes to our magazine.");
        MAGENTA.printGenericLn("The website gets 3 million visits per month");
        MAGENTA.printGenericLn("And we are calculating what would have happened if during the course of 30 years of existence, the numbers would have kept stable");
        MAGENTA.printGenericLn("In the end we get all of these hits: %s", parallelUniversePublications1);
        BRIGHT_MAGENTA.printGenericLn("Did you notice the f? f, means float. Without the f, the calculation would result in a numeric overflow warning from the compiler");
        BRIGHT_MAGENTA.printGenericLn("Since one of the elements is now a float, the compiler will check if the result fits within the float range.");
        BRIGHT_MAGENTA.printGenericLn("During runtime, well get a float as a result.");
        printRainbowLn("###");
        double parallelUniversePublications2 = (3_000_000d * 12 * 30 * 1e+200);
        double parallelUniversePublications3 = (3_000_000d * 12 * 30 * 1e+300);
        BRIGHT_CYAN.printGenericLn("Float 4 bytes - 2^32");
        BRIGHT_CYAN.printGenericLn("Range from %s to %s with a min normal %s", Double.MIN_VALUE, Double.MAX_VALUE, Double.MIN_NORMAL);
        MAGENTA.printGenericLn("In the same way with Float, we can make a calculation if we have %s universes", 1e+200);
        BRIGHT_MAGENTA.printGenericLn("Notice the d. Now we specify that the number is a double.");
        MAGENTA.printGenericLn("If the number is too big, we'll get a different lind of mathematical notation.");
        MAGENTA.printGenericLn("If we try with %s universes", parallelUniversePublications3);
        MAGENTA.printGenericLn("A very high number is also considered a number, but Double specifies it as %s", parallelUniversePublications3);
        BRIGHT_CYAN.printGenericLn("Reminder: double values are 64 bit floating point numbers with a precision of 15 to 16 significant number digits.");
        BRIGHT_CYAN.printGenericLn("Doubles range from\n%s to %s in normal values", Double.MIN_NORMAL, Double.MAX_VALUE);
        BRIGHT_CYAN.printGenericLn("Doubles can also be: %s and be %f or %f", Double.MIN_VALUE, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);
        BRIGHT_CYAN.printGenericLn(parallelUniversePublications1);
        BRIGHT_CYAN.printGenericLn(parallelUniversePublications2);
        BRIGHT_CYAN.printGenericLn(parallelUniversePublications3);
        printRainbowLn("###");
        GREEN.printGenericLn("Curiosities about primitive types:");
        double maxTest = 3.40282353482789473289473289477899659000892042934820984928423804e+38;
        float maxTest2 = 3.40282353482789473289473289477899659000892042934820984928423804e+38f;
        float maxTest3 = 3.4028235e+38f;
        double maxTest4 = 3.4028235e+38;
        double maxTest5 = 3.4028235111112222233333444444555555666666777788889999111122222e+38;
        double maxTest6 = 1.79769313486231572234324324324e+308;
        MAGENTA.printGenericLn("double maxTest = 3.40282353482789473289473289477899659000892042934820984928423804e+38:");
        BRIGHT_MAGENTA.printGenericLn("%f", maxTest);
        MAGENTA.printGenericLn("float maxTest2 = 3.40282353482789473289473289477899659000892042934820984928423804e+38f:");
        BRIGHT_MAGENTA.printGenericLn("%f", maxTest2);
        MAGENTA.printGenericLn("float maxTest3 = 3.40282353482789473289473289477899659000892042934820984928423804e+38f:");
        BRIGHT_MAGENTA.printGenericLn("%f", maxTest3);
        MAGENTA.printGenericLn("double maxTest4 = 3.4028235e+38:");
        BRIGHT_MAGENTA.printGenericLn("%f", maxTest4);
        MAGENTA.printGenericLn("double maxTest5 = 3.4028235111112222233333444444555555666666777788889999111122222e+38:");
        BRIGHT_MAGENTA.printGenericLn("%f", maxTest5);
        MAGENTA.printGenericLn("double maxTest5 = 3.4028235111112222233333444444555555666666777788889999111122222e+38");
        BRIGHT_MAGENTA.printGenericLn("%s", Double.toString(maxTest5));
        MAGENTA.printGenericLn("Float.MAX_VALUE:");
        BRIGHT_MAGENTA.printGenericLn("%f", Float.MAX_VALUE);
        MAGENTA.printGenericLn("Double.MAX_VALUE:");
        BRIGHT_MAGENTA.printGenericLn("%f", Double.MAX_VALUE);
        MAGENTA.printGenericLn("double maxTest6 = 1.79769313486231572234324324324e+308;");
        BRIGHT_MAGENTA.printGenericLn("%f", maxTest6);
        MAGENTA.printGenericLn("Double.toString(Double.MAX_VALUE):");
        BRIGHT_MAGENTA.printGenericLn("%s", Double.toString(Double.MAX_VALUE));
        GREEN.printGenericLn("Take-away");
        GREEN.printGenericLn("1. Primitive type conversion rules and ranges are not simple");
        GREEN.printGenericLn("2. A number without decimal is considered an integer and automatically converted to a lower range if it fits it, but only on instantiation assignment.");
        GREEN.printGenericLn("3. A value with a coma is considered a double. An f will specify that it is a float");
        GREEN.printGenericLn("4. d is needed when making calculations that result in very large numbers");
        GREEN.printGenericLn("5. d is also needed if our number without decimals results to be higher than long");
        GREEN.printGenericLn("6. f is also needed if our number without decimals results to be higher than long");
        GREEN.printGenericLn("7. f can take in any integer or long");
        GREEN.printGenericLn("8. d can take in any integer or long or float");
        GREEN.printGenericLn("9. Octals may not have digits higher than 8 otherwise the 0 before the number rule won't work!");
        double a;
        long b = 123;
        a = b;
        float c;
        c = b;
        long d = 123412341234L;
        c = 1.2f;
        a = c;
        a = 4.5;
        // Overflows
        a = 1233112213L * 12312232223L * 2;
        // Correct
        a = 1233112213d * 12312232223L * 2;
    }

    private static void moduleEnd() {
        printUnicornsLn(100);
        GREEN.printGenericLn("Hope you enjoyed this mastery into Java 11 with some Spanish Indie/Pop flavor to it.");
        GREEN.printGenericLn("Please keep coming back as I'll be creating more mastery modules.");
        GREEN.printGenericLn("Thank you!");
        printUnicornsLn(100);
    }
}
