package org.jesperancinha.java11.crums.crum22;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum22 {

    private static class One {

        public List<Integer> getNumbers(Set<Integer> numberSet) {
            ORANGE.printGenericLn("List<Integer> getNumbers(Set<Integer> numberSet) called!");
            java.util.Random random = new java.util.Random();
            numberSet.add(random.nextInt());
            return numberSet.stream().mapToInt(Math::toIntExact).boxed().collect(Collectors.toList());
        }

    }

    private static class Two extends One {

        //'getNumbers(Set<String>)' in 'org.jesperancinha.java11.crums.crum22.Crum22.Two' clashes with 'getNumbers(Set<Integer>)'
        // in 'org.jesperancinha.java11.crums.crum22.Crum22.One';
        // both methods have same erasure, yet neither overrides the other
        // public List<Integer> getNumbers(Set<String> numberSet){
        public List<Integer> getNumbers(HashSet<Long> numberSet) {
            ORANGE.printGenericLn("List<Integer> getNumbers(HashSet<Long> numberSet) called!");
            final java.util.Random random = new java.util.Random();
            numberSet.add(random.nextLong());
            return numberSet.stream().mapToInt(Long::intValue).boxed().collect(Collectors.toList());
        }

        public List<Integer> getNumbers(Set<Integer> numberSet) {
            ORANGE.printGenericLn("List<Integer> getNumbers(Set<Integer> numberSet) called!");
            java.util.Random random = new java.util.Random();
            numberSet.add(random.nextInt());
            return new ArrayList<>(numberSet);
        }

        // 'getNumbers(Set<Integer>)' in 'org.jesperancinha.java11.crums.crum22.Crum22.Two'
        // clashes with 'getNumbers(Set<Integer>)' in 'org.jesperancinha.java11.crums.crum22.Crum22.One';
        // attempting to use incompatible return type
        // public List<String> getNumbers(Set<Integer> numberSet) {
        //     ORANGE.printGenericLn("List<Integer> getNumbers(Set<Integer> numberSet) called!");
        //     java.util.Random random = new java.util.Random();
        //     numberSet.add(random.nextInt());
        //     return new ArrayList<>(numberSet);
        // }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 22 - Overriding with type erasure");

        final Two two = new Two();
        final List<Integer> numbersTwoLong = two.getNumbers(new HashSet<Long>());
        final List<Integer> numbersTwoInt = two.getNumbers(new HashSet<Integer>());

        final One one = new One();
        final List<Integer> numbersOneInt = one.getNumbers(new HashSet<>());

        MAGENTA.printGenericLn("We can call two different methods on Two");
        MAGENTA.printGenericLn("Then we get:");
        YELLOW.printGenericLn(numbersTwoInt);
        MAGENTA.printGenericLn("And");
        YELLOW.printGenericLn(numbersTwoLong);
        MAGENTA.printGenericLn("In One, we can just call one method and yield:");
        MAGENTA.printGenericLn(numbersOneInt);

        GREEN.printGenericLn("Overloading happens in general if overriding is not possible");
        GREEN.printGenericLn("If type erasure is the same, neither overriding nor overloading is possible");
        GREEN.printGenericLn("Type erasure means that on development time, the types are defined, but during compile time, the types from generics are removed");
        GREEN.printGenericLn("If after removal, the types match (i.e. List<Long> != List<Integer> => List<> == List<>), then type erasure is the same and compilation cannot happen");
        GREEN.printGenericLn("Type erasure rule applies to both input parameters ads well to return parameters");
    }
}
