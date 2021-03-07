package org.jesperancinha.java11.wwjdt.safari;

import static org.jesperancinha.java11.wwjdt.safari.Distances.fromFlagBoshieloToHelderberg;
import static org.jesperancinha.java11.wwjdt.safari.Distances.fromGaboroneToMaputo;
import static org.jesperancinha.java11.wwjdt.safari.Distances.fromHelderbergToPretoria;
import static org.jesperancinha.java11.wwjdt.safari.Distances.fromMaputoToFlagBoshielo;
import static org.jesperancinha.java11.wwjdt.safari.Distances.fromPretoriaToGaborone;

public class SafariRunner {
    public static void main(String[] args) {
        System.out.println("***************** Double");
        double d1 = fromHelderbergToPretoria();
        double d2 = fromPretoriaToGaborone();
        double d3 = fromGaboroneToMaputo();
        double d4 = fromMaputoToFlagBoshielo();
        double d5 = fromFlagBoshieloToHelderberg();
        System.out.println(StoryLine
                .getStory(d1,
                        d2,
                        d3,
                        d4,
                        d5));
        System.out.println("***************** Int");
        int i1 = (int) d1;
        int i2 = (int) d2;
        int i3 = (int) d3;
        int i4 = (int) d4;
        int i5 = (int) d5;
        System.out.println(StoryLine
                .getStory(i1,
                        i2,
                        i3,
                        i4,
                        i5));
        System.out.println("***************** Long");
        long l1 = i1;
        long l2 = i2;
        long l3 = i3;
        long l4 = i4;
        long l5 = i5;
        System.out.println(StoryLine
                .getStory(
                        l1,
                        l2,
                        l3,
                        l4,
                        l5));
        System.out.println("***************** Char");
        char c1 = (char) i1;
        char c2 = (char) i2;
        char c3 = (char) i3;
        char c4 = (char) i4;
        char c5 = (char) i5;
        System.out.println(StoryLine
                .getStory(
                        c1,
                        c2,
                        c3,
                        c4,
                        c5));

        System.out.println("***************** Char to int");
        int i1b = c1;
        int i2b = c2;
        int i3b = c3;
        int i4b = c4;
        int i5b = c5;
        System.out.println(StoryLine
                .getStory(
                        i1b,
                        i2b,
                        i3b,
                        i4b,
                        i5b));

        System.out.println("***************** Short");
        short s1 = (short) i1;
        short s2 = (short) i2;
        short s3 = (short) i3;
        short s4 = (short) i4;
        short s5 = (short) i5;
        System.out.println(StoryLine
                .getStory(
                        s1,
                        s2,
                        s3,
                        s4,
                        s5));
        System.out.println("***************** Short to Int");
        int i1c = s1;
        int i2c = s2;
        int i3c = s3;
        int i4c = s4;
        int i5c = s5;
        System.out.println(StoryLine
                .getStory(
                        i1c,
                        i2c,
                        i3c,
                        i4c,
                        i5c));

        System.out.println("***************** Short to Char");
        char c1a = (char) s1;
        char c2a = (char) s2;
        char c3a = (char) s3;
        char c4a = (char) s4;
        char c5a = (char) s5;
        System.out.println(StoryLine
                .getStory(
                        c1a,
                        c2a,
                        c3a,
                        c4a,
                        c5a));
        System.out.println("***************** Char to Short");
        short s1b = (short) c1;
        short s2b = (short) c2;
        short s3b = (short) c3;
        short s4b = (short) c4;
        short s5b = (short) c5;
        System.out.println(StoryLine
                .getStory(
                        c1a,
                        c2a,
                        c3a,
                        c4a,
                        c5a));
    }
}
