package org.jesperancinha.java11.crums.crum10;

import java.util.Arrays;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum10 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 10 - compare and mismatch in arrays");

        final int[] a = new int[]{1, 4, 5, 6};
        final int[] b = new int[]{1, 2, 5, 6, 7, 8};
        final int[] c = new int[]{1};
        final int[] d = new int[]{1, 4, 5, 6, 8, 10};
        final int[] e = new int[]{1, 4, 5, 8, 8, 10};

        MAGENTA.printGenericLn("The result of comparing a with b should be 1 => %d", Arrays.compare(a, b));
        MAGENTA.printGenericLn("The result of comparing a with c should be 3 => %d", Arrays.compare(a, c));
        MAGENTA.printGenericLn("The result of comparing a with d should be -2 => %d", Arrays.compare(a, d));
        MAGENTA.printGenericLn("The result of comparing a with e should be -1 => %d", Arrays.compare(a, e));

        MAGENTA.printGenericLn("The result of mismatching a with b should be 1 => %d", Arrays.mismatch(a, b));
        MAGENTA.printGenericLn("The result of mismatching a with c should be 1 => %d", Arrays.mismatch(a, c));
        MAGENTA.printGenericLn("The result of mismatching a with d should be 4 => %d", Arrays.mismatch(a, d));
        MAGENTA.printGenericLn("The result of mismatching a with e should be 3 => %d", Arrays.mismatch(a, e));

        GREEN.printGenericLn("Rules to make comparison aren't too simple");
        GREEN.printGenericLn("Best  way to describe is, if all prefixes match, then the return value is the difference between the first size and the second size.");
        GREEN.printGenericLn("If one element differs, then the return value is the compareTo result of the two integers.");
        GREEN.printGenericLn("Mismatch returns the insertion point of the first element where a mismatch occurs.");
        GREEN.printGenericLn("If all prefixes match, then it returns the size of the smallest array.");
    }
}
