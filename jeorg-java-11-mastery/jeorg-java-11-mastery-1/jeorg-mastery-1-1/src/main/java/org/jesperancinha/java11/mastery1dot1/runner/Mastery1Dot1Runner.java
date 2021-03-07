package org.jesperancinha.java11.mastery1dot1.runner;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Mastery1Dot1Runner {
    public static void main(String[] args) throws InterruptedException {

        // 5. An array does not grow automatically
        var flinstones = new String[5];
        flinstones[0] = "Fred Flinstone";
        flinstones[1] = "Wilma Flinstone";
        flinstones[2] = "Pebbles Flinstone";
        flinstones[3] = "Dino";
        flinstones[4] = "Baby Puss";
        System.out.printf("The Flinstones: %s\n", String.join(", ", flinstones));
        // 6. An array has a member instance variable containing the length of the current array
        System.out.printf("Size is %d\n", flinstones.length);
        // 7. We can a clone of the values. A copy only happens in an array of constants or primitive types.
        // For all objects, the copy is a copy of the references. This means that both arrays end up referring the same object.
        System.out.printf("A clone would be %s\n", String.join(", ", flinstones.clone()));

        List<String> rubbles = Arrays.asList(
                "Barney Rubble",
                "Betty Rubble",
                "Bamm-Bamm Rubble",
                "Hoppy");
        System.out.printf("The Rubbles %s\n", rubbles);
        // 6. An array has a member instance variable containing the length of the current array list
        System.out.printf("Size is %d\n", rubbles.size());

        int capacity = 10;
        // 19. Remember that capacity hasn't any practical logical effect
        // However a fixed capacity means that performance isn't degraded up until the capacity is full
        // The auto growth feature of ArrayLists has a performance cost.
        // So speed will be the only difference.
        List<String> theGruesomes = new ArrayList<>(capacity);
        theGruesomes.add("Weirdly Gruesome ");
        theGruesomes.add(0, "Creepella Gruesome");
        theGruesomes.add(0, "Goblin \"Gobby\" Gruesome");
        theGruesomes.add(0, "Uncle Ghastly");
        theGruesomes.add(0, "Occy");
        theGruesomes.add(0, "Schneider");
        theGruesomes.add(0, "Schneider");
        // 6. An array has a member instance variable containing the length of the current array list
        System.out.printf("The Gruesomes %s\n", theGruesomes);
        System.out.printf("Size is %d. The difference is that up until %d elements, no resizing will occur \n", theGruesomes.size(), capacity);

        var flinstone = flinstones[0];
        // 8. No matter how much you go around this, a String cannot be changed
        // Strings are final and that is the reason they cannot be extended.
        // A string gathers two unique properties. Immutability and final
        System.out.printf("This is %s\n", flinstone);

        var flinstone1 = flinstones[1];

        // 9. Since a String is immutable, this also means that it cannot be reassigned.
        // A re-assignable String reference will always be re=assignable to a new String.
        // No String changes are allowed.
        // This means that change to a String can never happen in reality.
        // We can only re-assign it and therefore make a seemingly String change instead.
        System.out.printf("This is %s\n", flinstone1);

        // 10. This is a static member method of interface Habitat.
        Habitat.yabadabadu();
        // 10. This is a static member variable of interface Habitat.
        // Both static methods and variables of interfaces are public, static and final
        String city0 = Habitat.CITY_0;
        System.out.println(city0);

        City.createCaracter();
        City.RockHouse rockHouse = new City.RockHouse();
        rockHouse.testInitialization();

        // 15. You may not like this about Java.
        // While Java restricts the usage of variable names to non-keywords,
        // there is no such rule about naming variable with Type names.
        // Variable naming takes precedence over type static methods
        String String = "Fred Flinstone";
        System.out.println("%%%%%% Look at this. Fred Flinstone is a String! %%%%%%");
        System.out.println(String);
        System.out.println(String.length());
        System.out.println(String.getClass());
        List<String> Integer = rubbles;
        System.out.println("%%%%%% Look at this. The Rubbles are an Integer ! %%%%%%");
        System.out.println(Integer);
        System.out.println(Integer.getClass());
        // 15. On this case we cannot invoke parseInt because we have created a variable called Integer
        // System.out.println(Integer.parseInt());

        final City city = new City();
        city.neighbourhoodWatch("Dino", flinstones);

        //  20. Remember the key differences between a thread-safe and atomic enabled Map and the regular one.
        // HashMap -> Does not support atomic operations and will fail on concurrent changes during an iteration. It is not thread-safe.
        // ConcurrentHashMap -> Support atomic operations and does not fail on concurrent changes. It is thread-safe.
        var theHatrocks1 = createTheHatrocks(new ConcurrentHashMap<>() {
            @Override
            public String putIfAbsent(String key, String value) {
                for (int i = 0; i < 100000000; i++) {
                    super.putIfAbsent(key, value);
                }
                return super.putIfAbsent(key, value);
            }
        });

        var theHatrocks2 = createTheHatrocks(new HashMap<>() {
            @Override
            public String putIfAbsent(String key, String value) {
                for (int i = 0; i < 1000000000; i++) {
                    super.putIfAbsent(key, value);
                }
                return super.putIfAbsent(key, value);
            }
        });

        theHatrocks1.forEach((s, s2) -> theHatrocks1.remove("Jethro Hatrock"));
        System.out.println(theHatrocks1);
        try {
            theHatrocks2.forEach((s, s2) -> theHatrocks2.remove("Jethro Hatrock"));
            System.out.println(theHatrocks2);
        } catch (ConcurrentModificationException e) {
            System.err.println("See? It's not thread-safe. It also takes longer to fill up during a ramp up.");
        }
    }

    private static Map<String, String> createTheHatrocks(Map<String, String> theHatRocks) throws InterruptedException {

        var executorConcurrent = Executors.newFixedThreadPool(6);
        LocalDateTime localDateTime = LocalDateTime.now();
        executorConcurrent.submit(() -> theHatRocks.putIfAbsent("Jethro Hatrock", "The Hatrocks"));
        executorConcurrent.submit(() -> theHatRocks.putIfAbsent("Gravella Hatrock", "The Hatrocks"));
        executorConcurrent.submit(() -> theHatRocks.putIfAbsent("Zack Hatrock", "The Hatrocks"));
        executorConcurrent.submit(() -> theHatRocks.putIfAbsent("Slab Hatrock", "The Hatrocks"));
        executorConcurrent.submit(() -> theHatRocks.putIfAbsent("Granny Hatrock", "The Hatrocks"));
        executorConcurrent.submit(() -> theHatRocks.putIfAbsent("Benji Hatrock", "The Hatrocks"));
        executorConcurrent.submit(() -> theHatRocks.putIfAbsent("Percy", "The Hatrocks"));
        executorConcurrent.shutdown();
        executorConcurrent.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println(theHatRocks);
        System.out.printf("Filling Map of type %s completed in %d seconds\n", theHatRocks.getClass().getClasses()[0], localDateTime.until(LocalDateTime.now(), ChronoUnit.SECONDS));
        return theHatRocks;
    }
}
