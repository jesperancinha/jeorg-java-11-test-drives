package org.jesperancinha.java11.conversions;

/**
 * Remember that we can convert from short to char and vice versa only through the use of constants.
 * <p>
 * The char range the same as of a unsigned 16-bit integer -> 0 to 65535
 * The short range is the same as a signed 16-bit integer -> -32768 to 32767
 * <p>
 * Since the windows don't match, a cast is always necessary in case of variables because the compiler doesn't know their value
 * A constant on the other hand is an immutable and predictable value.
 * This is the reason why casting isn't necessary when converting the max number of short to integer. It is 32767 and that fits in the short range.
 */
public class ConversionRunner {
    public static void main(String[] args) {
        char c = (char) Short.MIN_VALUE;
        char c1 = Short.MAX_VALUE;
        char c2 = (char) -1;

        System.out.printf("These are our char values for our c's: c=%s, c1%s, c3=%s", c, c1, c2);
        System.out.printf("These are our int values for our c's: c=%d, c1%d, c3=%d", c, c1, c2);
    }
}
