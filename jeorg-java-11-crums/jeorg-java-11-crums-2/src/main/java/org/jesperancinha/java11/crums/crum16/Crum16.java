package org.jesperancinha.java11.crums.crum16;

import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.relation.Role;
import javax.management.relation.RoleList;
import javax.management.relation.RoleStatus;
import javax.management.relation.RoleUnresolved;
import javax.management.relation.RoleUnresolvedList;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum16 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 16 - Using Lists on a Map");

        MAGENTA.printGenericLn("AbstractList, AbstractSequentialList, ArrayList, AttributeList, CopyOnWriteArrayList, LinkedList, RoleList, RoleUnresolvedList, Stack, Vector");

        final List<String> colors1 = List.of("blue", "rose", "red", "blue");
        final ArrayList<String> colors2 = new ArrayList<>(colors1);
        final AbstractList<String> colors3 = new ArrayList<>(colors1);
        final AbstractSequentialList<String> colors4 = new LinkedList<>(colors1);
        final AttributeList colors5 = new AttributeList(List.of(new Attribute("round", "blue")));
        colors5.add(new Attribute("square", "red"));
        final CopyOnWriteArrayList<String> colors6 = new CopyOnWriteArrayList<>(colors1);
        final LinkedList<String> colors7 = new LinkedList<>(colors1);
        final RoleList colors8 = new RoleList();
        colors8.add(new Role("blue", List.of()));
        final RoleUnresolvedList colors9 = new RoleUnresolvedList();
        colors9.add(new RoleUnresolved("green", List.of(), RoleStatus.NO_ROLE_WITH_NAME));
        final Stack<String> colors10 = new Stack<>();
        colors10.push("rose");
        colors10.push("yellow");
        final Vector<String> colors11 = new Vector<>(colors1);

        final Map<String, List<String>> flowers1 = new HashMap<>();
        final Map<String, ArrayList<String>> flowers2 = new HashMap<>();
        final Map<String, AbstractList<String>> flowers3 = new HashMap<>();
        final Map<String, AbstractSequentialList<String>> flowers4 = new HashMap<>();
        final Map<String, AttributeList> flowers5 = new HashMap<>();
        final Map<String, CopyOnWriteArrayList<String>> flowers6 = new HashMap<>();
        final Map<String, LinkedList<String>> flowers7 = new HashMap<>();
        final Map<String, RoleList> flowers8 = new HashMap<>();
        final Map<String, RoleUnresolvedList> flowers9 = new HashMap<>();
        final Map<String, Stack<String>> flowers10 = new HashMap<>();
        final Map<String, Vector<String>> flowers11 = new HashMap<>();

        flowers1.put("roses", colors1);

        // Required type:
        // ArrayList
        // <String>
        // Provided:
        // List
        // <String>
        // flowers2.put("violets",colors1);
        flowers2.put("violets", colors2);
        flowers3.put("gazania", colors2);
        flowers3.put("hippeastrum", colors3);
        flowers4.put("windflower", colors4);
        flowers5.put("flaming", colors5);
        flowers6.put("snapdragon", colors6);
        flowers7.put("masterwort", colors7);
        flowers8.put("cornflower", colors8);
        flowers9.put("monarda", colors9);
        flowers10.put("campanula", colors10);
        flowers11.put("saxifragas", colors11);

        MAGENTA.printGenericLn("We can see a lot of different representations of map and Lists within:");
        MAGENTA.printGenericLn(flowers1);
        MAGENTA.printGenericLn(flowers2);
        MAGENTA.printGenericLn(flowers3);
        MAGENTA.printGenericLn(flowers4);
        MAGENTA.printGenericLn(flowers5);
        MAGENTA.printGenericLn(flowers6);
        MAGENTA.printGenericLn(flowers7);
        MAGENTA.printGenericLn(flowers8);
        MAGENTA.printGenericLn(flowers9);
        MAGENTA.printGenericLn(flowers10);
        MAGENTA.printGenericLn(flowers11);

        GREEN.printGenericLn("When defining maps and lists, our types must be the same or subtypes");
        GREEN.printGenericLn("Diamond notation cannot be enclosed. This means that this new HashMap<String, List<>> is illegal");
    }

}
