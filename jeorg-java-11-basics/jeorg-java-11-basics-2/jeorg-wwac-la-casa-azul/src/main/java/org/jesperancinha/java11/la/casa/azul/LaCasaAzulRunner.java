package org.jesperancinha.java11.la.casa.azul;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class LaCasaAzulRunner {
    public static void main(String[] args) {
        var band = "La Casa Azul";

        System.out.println("////////////////////// HashMap //////////////////////");
        var hashMapCasaAzul = new HashMap<String, List<String>>() {{
            put("2004", List.of("Superguay"));
            put("2005", List.of("Como un fan"));
            put("2006", List.of("El sol no brilará nunca más"));
            put("2007", List.of("La revolución sexual"));
            put("2008", List.of("Esta noche solo cantan para mí"));
            put("2009", List.of("La nueva Yma Sumac"));
            put("2010", List.of("Todas tus amigas"));
            put("2012", List.of("La Polinesia Meridional", "La Fiesta Universal"));
            put("2018", List.of("A T A R A X I A", "Nunca Nadie Pudo Volar"));
            put("2019", List.of("El Final del Amor Eterno", "El Momento", "Ivy Mike"));
        }};

        hashMapCasaAzul.entrySet().iterator().forEachRemaining(
                stringListEntry -> System.out.printf("In %s, the band %s release singles: %s\n",
                        stringListEntry.getKey(), band, String.join(", ", stringListEntry.getValue())));

        System.out.println("////////////////////// Hashtable //////////////////////");
        var hashtable = new Hashtable<String, List<String>>() {{
            put("2004", List.of("Superguay"));
            put("2005", List.of("Como un fan"));
            put("2006", List.of("El sol no brilará nunca más"));
            put("2007", List.of("La revolución sexual"));
            put("2008", List.of("Esta noche solo cantan para mí"));
            put("2009", List.of("La nueva Yma Sumac"));
            put("2010", List.of("Todas tus amigas"));
            put("2012", List.of("La Polinesia Meridional", "La Fiesta Universal"));
            put("2018", List.of("A T A R A X I A", "Nunca Nadie Pudo Volar"));
            put("2019", List.of("El Final del Amor Eterno", "El Momento", "Ivy Mike"));
        }};

        hashtable.entrySet().iterator().forEachRemaining(
                stringListEntry -> System.out.printf("In %s, the band %s release singles: %s\n",
                        stringListEntry.getKey(), band, String.join(", ", stringListEntry.getValue())));

        System.out.println("////////////////////// LinkedHashMap //////////////////////");
        var linkedHashMap = new LinkedHashMap<String, List<String>>() {{
            put("2005", List.of("Como un fan"));
            put("2004", List.of("Superguay"));
            put("2006", List.of("El sol no brilará nunca más"));
            put("2007", List.of("La revolución sexual"));
            put("2008", List.of("Esta noche solo cantan para mí"));
            put("2009", List.of("La nueva Yma Sumac"));
            put("2010", List.of("Todas tus amigas"));
            put("2012", List.of("La Polinesia Meridional", "La Fiesta Universal"));
            put("2018", List.of("A T A R A X I A", "Nunca Nadie Pudo Volar"));
            put("2019", List.of("El Final del Amor Eterno", "El Momento", "Ivy Mike"));
        }};

        linkedHashMap.entrySet().iterator().forEachRemaining(
                stringListEntry -> System.out.printf("In %s, the band %s release singles: %s\n",
                        stringListEntry.getKey(), band, String.join(", ", stringListEntry.getValue())));

        System.out.println("////////////////////// TreeMap //////////////////////");
        var treeMap = new TreeMap<String, List<String>>() {{
            put("2005", List.of("Como un fan"));
            put("2004", List.of("Superguay"));
            put("2006", List.of("El sol no brilará nunca más"));
            put("2007", List.of("La revolución sexual"));
            put("2008", List.of("Esta noche solo cantan para mí"));
            put("2009", List.of("La nueva Yma Sumac"));
            put("2010", List.of("Todas tus amigas"));
            put("2012", List.of("La Polinesia Meridional", "La Fiesta Universal"));
            put("2018", List.of("A T A R A X I A", "Nunca Nadie Pudo Volar"));
            put("2019", List.of("El Final del Amor Eterno", "El Momento", "Ivy Mike"));
        }};

        treeMap.entrySet().iterator().forEachRemaining(
                stringListEntry -> System.out.printf("In %s, the band %s release singles: %s\n",
                        stringListEntry.getKey(), band, String.join(", ", stringListEntry.getValue())));
    }
}
