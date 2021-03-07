package org.jesperancinha.java11.record.artist;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class RecordArtistRunner {
    public static void main(String[] args) {
        var recordMap = Map.of(
                "Cyr", "Madonna",
                "Disco", "Kylie Minogue",
                "Song Machine: Season One - Strange Timez", "Gorillaz",
                "Róisín Machine", "Cher",
                "Club Future Nostalgia", "Dua Lipa"
        );


        System.out.println("++++++++++++++++++++++++++ Map Operations ++++++++++++++++++++++++++");
        var mapOfRecords = new TreeMap<>(recordMap);
        var navigationMap = (Map<String, String>) mapOfRecords;
        System.out.println(navigationMap.values());
        String compute = navigationMap.compute("Cyr", (key, value) -> "Smashing Pumpkins");
        System.out.println(compute);
        System.out.println(navigationMap.values());
        String absent = navigationMap.computeIfAbsent(
                "Violet Bent Backwards over the Grass", s -> "Lana Del Rey");
        System.out.println(absent);
        System.out.println(navigationMap.values());
        String computeIfPresent = navigationMap.computeIfPresent("Róisín Machine", (s, s2) -> "Roisin Murphy");
        System.out.println(computeIfPresent);
        System.out.println(navigationMap.values());
        System.out.println(navigationMap.containsKey("Club Future Nostalgia"));
        System.out.println(navigationMap.entrySet());
        System.out.println(navigationMap.get("Cyr"));
        System.out.println(navigationMap.getOrDefault("Ray of Light", "Madonna"));
        System.out.println(navigationMap.isEmpty());
        System.out.println(navigationMap.keySet());
        String merge1 = navigationMap.merge("Brightest Blue", "Maroon 5", (s, s2) -> s2);
        System.out.println(merge1);
        String merge2 = navigationMap.merge("Brightest Blue", "Ellie Goulding", (s, s2) -> s2);
        System.out.println(merge2);
        System.out.println(navigationMap);
        System.out.println(navigationMap.containsValue("Madonna"));
        System.out.println(navigationMap.containsValue("Lana Del Rey"));
        System.out.println(navigationMap);
        System.out.println(navigationMap.put("Bigger Love", "John Legend"));
        System.out.println(navigationMap.putIfAbsent("Bigger Love", "Taylor Swift"));
        System.out.println(navigationMap.putIfAbsent("Bigger Love", "Taylor Swift"));
        System.out.println(navigationMap.entrySet());
        System.out.println(navigationMap.remove("Bigger Love"));
        System.out.println(navigationMap.remove("Bigger Love"));
        System.out.println(navigationMap);
        System.out.println(navigationMap.remove("Brightest Blue", "Madonna"));
        System.out.println(navigationMap);
        System.out.println(navigationMap.remove("Brightest Blue", "Ellie Goulding"));
        System.out.println(navigationMap);
        System.out.println(navigationMap.replace("Erotica", "Madonna"));
        System.out.println(navigationMap.replace("Disco", "Madonna"));
        System.out.println(navigationMap);
        System.out.println(navigationMap.replace("Disco", "Madonna", "Kylie Minogue"));
        System.out.println(navigationMap);
        System.out.println(navigationMap.size());
        navigationMap.forEach((s, s2) -> System.out.printf("Album: %s, Artist: %s\n", s, s2));

        System.out.println("++++++++++++++++++++++++++ SortedMap Operations ++++++++++++++++++++++++++");
        mapOfRecords = new TreeMap<>(recordMap);
        var navigationSortedMap = (SortedMap<String, String>) mapOfRecords;
        System.out.println(navigationSortedMap.comparator());
        System.out.println(navigationSortedMap.entrySet());
        System.out.println(navigationSortedMap.firstKey());
        System.out.println(navigationSortedMap.headMap("Disco"));
        System.out.println(navigationSortedMap.keySet());
        System.out.println(navigationSortedMap.lastKey());
        System.out.println(navigationSortedMap.subMap("Club Future Nostalgia", "Song Machine: Season One - Strange Timez"));
        System.out.println(navigationSortedMap.tailMap("Song Machine: Season One - Strange Timez"));
        System.out.println(navigationSortedMap.values());

        System.out.println("++++++++++++++++++++++++++ NavigableMap Operations ++++++++++++++++++++++++++");
        mapOfRecords = new TreeMap<>(recordMap);
        var navigationSortedNavigableMap = (NavigableMap<String, String>) mapOfRecords;
        System.out.println(navigationSortedNavigableMap.values());
        System.out.println(navigationSortedNavigableMap.ceilingEntry("Disco"));
        System.out.println(navigationSortedNavigableMap.ceilingKey("Disco"));
        System.out.println(navigationSortedNavigableMap.descendingKeySet());
        System.out.println(navigationSortedNavigableMap.descendingMap());
        System.out.println(navigationSortedNavigableMap.firstEntry());
        System.out.println(navigationSortedNavigableMap.floorEntry("Disco"));
        System.out.println(navigationSortedNavigableMap.floorKey("Disco"));
        System.out.println(navigationSortedNavigableMap.headMap("Disco", true));
        System.out.println(navigationSortedNavigableMap.headMap("Disco", false));
        System.out.println(navigationSortedNavigableMap.higherEntry("Disco"));
        System.out.println(navigationSortedNavigableMap.higherKey("Disco"));
        System.out.println(navigationSortedNavigableMap.lastEntry());
        System.out.println(navigationSortedNavigableMap.lowerEntry("Disco"));
        System.out.println(navigationSortedNavigableMap.lowerKey("Disco"));
        System.out.println(navigationSortedNavigableMap.navigableKeySet());
        System.out.println(navigationSortedNavigableMap.pollFirstEntry());
        System.out.println(navigationSortedNavigableMap.pollLastEntry());
        System.out.println(navigationSortedNavigableMap);
        System.out.println(navigationSortedNavigableMap.subMap("Cyr", true, "Song Machine: Season One - Strange Timez", true));
        System.out.println(navigationSortedNavigableMap.subMap("Cyr", false, "Song Machine: Season One - Strange Timez", false));
        System.out.println(navigationSortedNavigableMap.tailMap("Cyr", true));
        System.out.println(navigationSortedNavigableMap.tailMap("Cyr", false));

        System.out.println("++++++++++++++++++++++++++ TreeMap Operations ++++++++++++++++++++++++++");
        mapOfRecords = new TreeMap<>(recordMap);
        var navigationSortedTreeMap = (TreeMap<String, String>) mapOfRecords;
        System.out.println(navigationSortedTreeMap.values());
        System.out.println(navigationSortedTreeMap.ceilingEntry("Disco"));
        System.out.println(navigationSortedTreeMap.ceilingKey("Disco"));
        System.out.println(navigationSortedTreeMap.descendingKeySet());
        System.out.println(navigationSortedTreeMap.descendingMap());
        System.out.println(navigationSortedTreeMap.firstEntry());
        System.out.println(navigationSortedTreeMap.floorEntry("Disco"));
        System.out.println(navigationSortedTreeMap.floorKey("Disco"));
        System.out.println(navigationSortedTreeMap.headMap("Disco", true));
        System.out.println(navigationSortedTreeMap.headMap("Disco", false));
        System.out.println(navigationSortedTreeMap.higherEntry("Disco"));
        System.out.println(navigationSortedTreeMap.higherKey("Disco"));
        System.out.println(navigationSortedTreeMap.lastEntry());
        System.out.println(navigationSortedTreeMap.lowerEntry("Disco"));
        System.out.println(navigationSortedTreeMap.lowerKey("Disco"));
        System.out.println(navigationSortedTreeMap.navigableKeySet());
        System.out.println(navigationSortedTreeMap.pollFirstEntry());
        System.out.println(navigationSortedTreeMap.pollLastEntry());
        System.out.println(navigationSortedTreeMap);
        System.out.println(navigationSortedTreeMap.subMap("Cyr", true, "Song Machine: Season One - Strange Timez", true));
        System.out.println(navigationSortedTreeMap.subMap("Cyr", false, "Song Machine: Season One - Strange Timez", false));
        System.out.println(navigationSortedTreeMap.tailMap("Cyr", true));
        System.out.println(navigationSortedTreeMap.tailMap("Cyr", false));
    }
}
