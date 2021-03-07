package org.jesperancinha.java11.mastery2dot1;

import org.jesperancinha.console.consolerizer.console.Consolerizer;
import org.jesperancinha.java11.mastery2dot1.animals.Animal;
import org.jesperancinha.java11.mastery2dot1.animals.Bird;
import org.jesperancinha.java11.mastery2dot1.animals.BirdCharacter;
import org.jesperancinha.java11.mastery2dot1.animals.CatCharacter;
import org.jesperancinha.java11.mastery2dot1.animals.DuckCharacter;
import org.jesperancinha.java11.mastery2dot1.animals.Feline;
import org.jesperancinha.java11.mastery2dot1.animals.FluteService;
import org.jesperancinha.java11.mastery2dot1.animals.GrandFatherCharacter;
import org.jesperancinha.java11.mastery2dot1.animals.OboeService;
import org.jesperancinha.java11.mastery2dot1.animals.Wolf;
import org.jesperancinha.java11.mastery2dot1.animals.WolfCharacter;
import org.jesperancinha.java11.mastery2dot1.animals.WolfCharacter.Food;
import org.jesperancinha.java11.mastery2dot1.ost.manager.FileManager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Mastery2Dot1Runner {
    public static void main(String[] args) throws Exception {
        Consolerizer.typingWaitGlobal = 0;
        // 1. Interface Inheritance
        printRainbowLn("==");
        YELLOW.printGeneric("### 1. Creating wolf. Interface cannot access everything\n");
        Animal wolf = new WolfCharacter("The Wolf");
        wolf.saySomething();
        GREEN.printGeneric("The wolf name is: %s. Of course now we use down casting\n", ((Wolf) wolf).name);
        // 2. Comparing with `thenComparing`
        printRainbowLn("==");
        YELLOW.printGeneric("### 2. Creating Bird. Interface cannot access everything\n");
        Animal bird = new BirdCharacter("Sasha");
        var list = List.of(wolf, bird);
        Comparator<Animal> comparator = Comparator.comparing(Animal::getName);
        Stream<Animal> animalStream = list.stream().sorted(comparator.thenComparing(Animal::found));
        GREEN.printGeneric("%s\n", list.toString());
        GREEN.printGeneric("The wolf name is: %s. Of course now we use down casting\n", ((Wolf) wolf).name);
        GREEN.printGeneric("The bird name is: %s. Of course now we use down casting\n", ((BirdCharacter) bird).name);
        GREEN.printGeneric("The new collection should be reordered: %s\n", animalStream.collect(Collectors.toList()));

        // 3. AccessController and Permissions
        printRainbowLn("==");
        YELLOW.printGeneric("### 3. We will save our OST in /tmp/ost.txt.\n");
        YELLOW.printGeneric("### After running there should be just one TEST text written on that file.\n");
        var filenameManager = new FileManager();
        filenameManager.testFile();

        // 4. Marking with `markSupported`s
        printRainbowLn("==");
        YELLOW.printGenericLn("### 4. Checking how marking works with a BufferedReader");
        YELLOW.printGenericLn("### Don't forget that readAhead is an optimization parameter");
        YELLOW.printGenericLn("### It has no logic influence");
        try (Reader r = new BufferedReader(
                new FileReader(
                        new File(Mastery2Dot1Runner
                                .class.getResource("/lyrics.txt").toURI())))) {
            BRIGHT_CYAN.printGenericLn("The Reader class does not support mark %s", new Reader() {
                @Override
                public int read(char[] cbuf, int off, int len) throws IOException {
                    return 0;
                }

                @Override
                public void close() throws IOException {

                }
            }.markSupported());
            BLUE.printGenericLn("The BufferedReader class does support mark %s", r.markSupported());
            if (r.markSupported()) {
                BufferedReader in = (BufferedReader) r;
                GREEN.printGenericLn(in.readLine());
                in.mark(5);
                BLUE.printGenericLn(in.readLine());
                GREEN.printGenericLn(in.readLine());
                in.reset();
                BLUE.printGenericLn(in.readLine());
                in.reset();
                BLUE.printGenericLn(in.readLine());
                GREEN.printGenericLn(in.readLine());
                GREEN.printGenericLn(in.readLine());
                GREEN.printGenericLn(in.readLine());
                GREEN.printGenericLn(in.readLine());
                GREEN.printGenericLn(in.readLine());
                in.reset();
                BLUE.printGenericLn(in.readLine());
            } else {
                RED.printGenericLn("Mark Not Supported");
            }
        } catch (IOException | URISyntaxException e) {
            RED.printThrowableAndExit(e);
        }

        // 5. `StringBuilder` vs `StringBuffer`
        printRainbowLn("==");
        YELLOW.printGenericLn("### 5. StringBuilder and StringBuffer have the same methods but their implementations are different.");
        YELLOW.printGenericLn("### StringBuilder and StringBuffer do not have a trim() method like String does!.");

        var sBuilder = new StringBuilder();
        sBuilder.ensureCapacity(10);
        sBuilder.append(true);
        sBuilder.append("Okay, um, hmm, in that case, the part of the Grandfather will be played by, huh, a bassoon...\n");
        sBuilder.reverse();
        sBuilder.setLength(20);
        GREEN.printGenericLn(sBuilder.toString());
        sBuilder.trimToSize();
        GREEN.printGenericLn(sBuilder.toString());

        var sBuffer = new StringBuffer();
        sBuffer.ensureCapacity(10);
        sBuffer.append(true);
        sBuffer.append("Okay, um, hmm, in that case, the part of the Grandfather will be played by, huh, a bassoon...\n");
        sBuffer.reverse();
        sBuffer.setLength(20);
        GREEN.printGenericLn(sBuffer.toString());
        sBuffer.trimToSize();
        GREEN.printGenericLn(sBuffer.toString());

        // 6. Super constructors
        printRainbowLn("==");
        YELLOW.printGenericLn("### 6. When you develop a subclass, its constructors must know which super constructor to call");
        YELLOW.printGenericLn("### If none is available, then the default, zero argument constructor is called");
        YELLOW.printGenericLn("### One or more are available, then the subclass constructor must determine which constructor to use using super");
        YELLOW.printGenericLn("### One or more constructors are implemented and none default is available, then the default is no longer available");

        var birdCharacter = new BirdCharacter("Sasha");
        GREEN.printGenericLn(birdCharacter.getName());
        GREEN.printGenericLn(birdCharacter.getInstrument());

        // 7. Abstraction: Interfaces vs Classes
        printRainbowLn("==");
        YELLOW.printGenericLn("### 7. Know a few things about Interfaces");
        YELLOW.printGenericLn("### All methods without a body are implicitly abstract and public");
        YELLOW.printGenericLn("### public and abstract are redundant for these implicit properties");
        GREEN.printGenericLn(wolf.getName());
        GREEN.printGenericLn(wolf.getInstrument());

        // 8. Stream filters
        printRainbowLn("==");
        YELLOW.printGenericLn("### 8. A parallel stream can change to be a sequential stream");
        YELLOW.printGenericLn("### BaseStream.sequential() vs BaseStream.parallel");
        YELLOW.printGenericLn("### Also in partitionBy the way to distinguish is using Boolean");
        var duck = new DuckCharacter("Bruce");
        var cat = new CatCharacter("Louis");

        var streamOfCharacters1 = Stream.of(wolf, cat, bird, duck);
        var streamFull1 = streamOfCharacters1.filter(animal -> animal instanceof Bird);
        streamFull1.forEach(text2 -> GREEN.printGenericLn(text2));
        var streamOfCharacters2 = Stream.of(wolf, cat, bird, duck);
        var streamFull2 = streamOfCharacters2.parallel()
                .filter(animal -> !(animal instanceof Wolf))
                .filter(animal -> !(animal instanceof Feline))
                .sequential();
        streamFull2.forEach(text1 -> GREEN.printGenericLn(text1));
        var streamOfCharacters3 = Stream.of(wolf, cat, bird, duck);
        Map<Boolean, List<Animal>> partitionMap = streamOfCharacters3.collect(Collectors.partitioningBy(animal -> animal instanceof Bird));
        var streamFull3 = partitionMap.get(Boolean.TRUE).stream();
        streamFull3.forEach(text -> GREEN.printGenericLn(text));

        // 9. Question mark in Mappings (left vs right)
        printRainbowLn("==");
        YELLOW.printGenericLn("### 9. You do not need to know the type on the left operand of an assignment operation");
        YELLOW.printGenericLn("### You also cannot use diamond notation. You can use question marks as placeholders");
        YELLOW.printGenericLn("### Question marks are not allowed on the right");
        YELLOW.printGenericLn("### On a practical note it seems to be because a question mark is a wildcard");
        YELLOW.printGenericLn("### Wildcards do not make sense during creation.");
        YELLOW.printGenericLn("### Diamond notation always knows that its type is defined on the left ");

        Map<String, List<Animal>> mapOfAnimals1 = new HashMap<String, List<Animal>>();
        Map<String, List<Animal>> mapOfAnimals2 = new HashMap<>();
        Map<?, List<Animal>> mapOfAnimals3 = new HashMap<>();
        Map<?, List<?>> mapOfAnimals4 = new HashMap<>();
        Map<?, ?> mapOfAnimals5 = new HashMap<>();
        var mapOfAnimals6 = new HashMap<>();
        var mapOfAnimals7 = new HashMap<Animal, List<Animal>>();

        BLUE.printGenericLn("Map<String, List<Animal>> mapOfAnimals1 = new HashMap<String, List<Animal>>(); -> %s", mapOfAnimals1.getClass());
        BLUE.printGenericLn("Map<String, List<Animal>> mapOfAnimals2= new HashMap<>();", mapOfAnimals2.getClass());
        BLUE.printGenericLn("Map<?, List<Animal>> mapOfAnimals3 = new HashMap<>(); -> %s", mapOfAnimals3.getClass());
        BLUE.printGenericLn("Map<?, List<?>> mapOfAnimals4 = new HashMap<>(); -> %s", mapOfAnimals4.getClass());
        BLUE.printGenericLn("Map<?,?> mapOfAnimals5 = new HashMap<>(); -> %s", mapOfAnimals5.getClass());
        BLUE.printGenericLn("var mapOfAnimals6 = new HashMap<>(); -> %s", mapOfAnimals6.getClass());
        BLUE.printGenericLn("var mapOfAnimals7 = new HashMap<Animal, List<Animal>>(); -> %s", mapOfAnimals7.getClass());

        // 10. provider() in modularity
        printRainbowLn("==");
        YELLOW.printGenericLn("### 10. Key things to remember:");
        YELLOW.printGenericLn("### There is no implements in module!");
        YELLOW.printGenericLn("### provides is always followed by with");
        YELLOW.printGenericLn("### using a service requires you to use it in the module definition");
        YELLOW.printGenericLn("### to be able to implement a service outside the source module you need requires");
        YELLOW.printGenericLn("### You can provide an implementation statically or with an instance");
        YELLOW.printGenericLn("### Flute service is static");
        YELLOW.printGenericLn("### Oboe service is an instance");

        ServiceLoader<FluteService> loader = ServiceLoader.load(FluteService.class);
        FluteService fluteService = loader.findFirst().orElseThrow(() -> new Exception("Fail!"));
        fluteService.play();
        ServiceLoader<OboeService> loader2 = ServiceLoader.load(OboeService.class);
        OboeService oboeService = loader2.findFirst().orElseThrow(() -> new Exception("Fail!"));
        oboeService.play();

        // 11. `IndexOutOfBoundsException`
        printRainbowLn("==");
        YELLOW.printGenericLn("### 11. ArrayIndexOutOfBoundsException is not thrown by a charAt.");
        YELLOW.printGenericLn("### IndexOutOfBoundsException is  thrown by a charAt.");
        YELLOW.printGenericLn("### StringIndexOutOfBoundsException may be thrown by a charAt (It is implementation dependent).");

        var testString = "Can't make it? Oh. Huh.";
        try {
            testString.charAt(10000);
        } catch (IndexOutOfBoundsException e) {
            GREEN.printGenericLn("If parameter of charAt surpasses the length of the String, it results in: %s", e.getClass());
        }

        // 12. `allMatch` in stream
        printRainbowLn("==");
        YELLOW.printGenericLn("### 12. allMatch means that one doesn't match, it will return false, otherwise true");
        YELLOW.printGenericLn("### It is prone to fail fast, given that the false condition determines when the filtering stops");
        YELLOW.printGenericLn("### This operation depends opn how many cores your machine is running on");

        AtomicInteger atomicInteger = new AtomicInteger();
        var streamOfCharacters = Stream.of(wolf, cat, bird, duck);
        var allMatchesForA = streamOfCharacters.allMatch(
                character -> {
                    atomicInteger.incrementAndGet();
                    GREEN.printGenericLn(character);
                    return character.getName().contains("o");
                });
        GREEN.printGenericLn("We have iterated %d times! This is unpredictable", atomicInteger.get());
        GREEN.printGenericLn("Has the condition matched? %s", allMatchesForA);

        // 10. provider() in modularity
        printRainbowLn("==");
        YELLOW.printGenericLn("### 10. Double providers in modularity");
        ServiceLoader<FluteService> loader2Times = ServiceLoader.load(FluteService.class);
        Iterator<FluteService> iterator = loader.iterator();
        FluteService fluteServiceOne = iterator.next();
        FluteService fluteServiceTwo = iterator.next();
        fluteServiceOne.play();
        fluteServiceTwo.play();

        // 14. One line assignment operations
        printRainbowLn("==");
        YELLOW.printGenericLn("### 14. One liner operators and different assignments");
        int a = 10;
        int b = 20;
        boolean c = a == b;
        boolean d = a != b;
        int f = a = b;
        BLUE.printGenericLn("        int a = 10; => %d\n" +
                "        int b = 20; => %d \n" +
                "        boolean c = a == b; => %s\n" +
                "        boolean d = a != b; => %s\n" +
                "        int f = a = b; => %d", a, b, c, d, f);

        // 15. Method calling and inner class instantiation
        printRainbowLn("==");
        YELLOW.printGenericLn("### 15. Static imports are also possible for static inner classes");
        var food = new Food();
        BLUE.printGenericLn("var food  = new Food();");

        // 16. `null` role in collection copies
        printRainbowLn("==");
        YELLOW.printGenericLn("### 16. Copies of null values from Arrays to immutable Lists  always fail");
        YELLOW.printGenericLn("### Copies of null values from Arrays always to Unmodifiable lists don't fail");
        YELLOW.printGenericLn("### Unmodifiable means you have a reference that doesn't allow you to modify the list");
        YELLOW.printGenericLn("### Although if you have the reference to the original List, then you can change it that way");
        YELLOW.printGenericLn("### Immutable means you cannot modify the list");
        var animals = new Animal[]{wolf, duck, null, bird, null, cat};
        try {
            var listOfAnimals = List.of(animals);
        } catch (NullPointerException e) {
            RED.printGenericLn("%s was thrown on trying to copy the array into an immutableList -> var listOfAnimals = List.of(animals);", e);
        }
        try {
            List<Animal> animalList = List.of(wolf, duck, null, bird, null, cat);
        } catch (NullPointerException e) {
            RED.printGenericLn("%s was thrown on trying to create an immutable list directly -> List<Animal> animalList = List.of(wolf, duck, null, bird, null, cat);", e);
        }

        List<Animal> animalList = Arrays.asList(wolf, duck, null, bird, null, cat);

        var listOfAnimalsViaCollectionSync = Collections.synchronizedList(animalList);
        var listOfAnimalsViaCollectionUnmod = Collections.unmodifiableList(animalList);
        GREEN.printGenericLn(listOfAnimalsViaCollectionSync);
        GREEN.printGenericLn(listOfAnimalsViaCollectionUnmod);

        // 17. `String`'s `isBlank`
        printRainbowLn("==");
        YELLOW.printGenericLn("### 17. Test is String is blank");
        var blankSimple = "";
        var blankComplicated = "      ";
        GREEN.printGenericLn("blankSimple is blank? %s, blankComplicated is blank? %s", blankSimple.isBlank(), blankComplicated.isBlank());

        // 18. Flow control ans specification of Exceptions
        printRainbowLn("==");
        YELLOW.printGenericLn("### 18. Always use control flow in detriment to Exceptions");

        // 19. Constructor rules vs Method rules in overriding
        printRainbowLn("==");
        YELLOW.printGenericLn("### 19. Constructor exception implementation rules are inversely proportional to method return parameter implementation rules");
        var grandFather = new GrandFatherCharacter("The Grandfather");
        GREEN.printGenericLn(grandFather.getName());
        GREEN.printGenericLn(grandFather.name);
        GREEN.printGenericLn(grandFather.found());

        // 20. Simple `File` creation with `FileWriter`
        printRainbowLn("==");
        YELLOW.printGenericLn("### 20. FileWriter always creates a file");
        var file = new FileWriter("/tmp/wolfdata.txt");
        file.close();
        GREEN.printGenericLn("Check your %s folder", file.toString());

        // 21. Overriding with generics
        printRainbowLn("==");
        YELLOW.printGenericLn("### 21. Golden rule of Overriding methods is that the return value is always of a sub-class or the same as of the overridden one");
        abstract class Multiplexer {
            abstract <T> Collection<T> toList(Collection<T> list);

            abstract <T> Collection<T> toSet(Collection<T> list);
        }
        class CharacterDeduplicator extends Multiplexer {
            public <T> List<T> toList(Collection<T> list) {
                return new ArrayList<>(list);
            }

            ;

            public <V> Set<V> toSet(Collection<V> list) {
                return new HashSet<>(list);
            }

            ;
        }
        var dedup = new CharacterDeduplicator();
        var characterComplete = List.of(wolf, cat, bird, bird, duck, grandFather);
        var characterSet = dedup.toSet(characterComplete);
        GREEN.printGenericLn(characterComplete);
        GREEN.printGenericLn(characterSet);
        var characterReComplete = dedup.toList(characterSet);
        characterReComplete.add(duck);
        GREEN.printGenericLn(characterReComplete);

        // 22. `var` in `for` loops
        printRainbowLn("==");
        YELLOW.printGenericLn("### 22. var can be used in for just like int");
        printRainbowLn("-");
        for (int i = 0; i < 10; i++) {
            GREEN.printGeneric(i);
        }
        printRainbowLn("-");
        for (var i = 0; i < 10; i++) {
            GREEN.printGeneric(i);
        }
        printRainbowLn("-");

        // 23. relativize of `Path`
        printRainbowLn("==");
        YELLOW.printGenericLn("### 23. relativize will fail if paths have a different sort");
        var p1 = Path.of("wolf");
        var p2 = Path.of("/tmp/wolf");
        try {
            p1.relativize(p2);
        } catch (java.lang.IllegalArgumentException e) {
            RED.printGenericLn("%s -> Process failed for p1=%s and p2=%s", e, p1, p2);
        }
        p2 = Path.of("tmp");
        GREEN.printGenericLn("Process didn't fail for p1=%s and p2=%s and the result for p2.relativize(p1) is: %s", p1, p2, p2.relativize(p1));

        p2 = Path.of("/tmp/wolf");
        p1 = Path.of("/tmp/wolf/2");
        GREEN.printGenericLn("Process didn't fail for p1=%s and p2=%s and the result for p2.relativize(p1) is: %s", p1, p2, p2.relativize(p1));

        // 24. Creating methods in inner anonymous classes
        printRainbowLn("==");
        YELLOW.printGenericLn("### 24. If we create an anonymous class and therein we crate methods,those methods are onle reachable via reflection or inside the instance itself");
        var wolfFood = new Food() {
            public void giveMeApples() {
                GREEN.printGeneric("You did this? You just cannot reach this method without reflection and so The Wolf gets no apples!");
            }
        };
        Method giveMeApples = wolfFood.getClass().getMethod("giveMeApples");
        giveMeApples.invoke(wolfFood);
    }
}