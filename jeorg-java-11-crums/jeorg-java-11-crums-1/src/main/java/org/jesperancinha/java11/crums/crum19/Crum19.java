package org.jesperancinha.java11.crums.crum19;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum19 {
    public static void main(String[] args) throws NoSuchMethodException {
        BLUE.printGenericTitleLn("Crum 19 - Uncommon annotations and common annotations");

        final var mysteryDiamondAnnotations = Arrays.stream(MysteryDiamonds.class.getAnnotations()).map(Annotation::toString).collect(Collectors.joining(","));
        ConsolerizerComposer.out(" ").magenta("This is the collected values for the annotations of the MysteryDiamond. It should be empty:").blue("💎 %s", mysteryDiamondAnnotations).toConsoleLn();

        final var sdkMysteryDiamond = Arrays.stream(SdkMysteryDiamonds.class.getAnnotations()).map(Annotation::toString).collect(Collectors.joining(","));
        MAGENTA.printGenericLn("This is the collected values for the annotations of the SdkMysteryDiamond. It should also be empty: %s", sdkMysteryDiamond);

        final var toString = SdkMysteryDiamonds.class.getMethod("toString");
        final var toStringAnnotations = Arrays.stream(toString.getAnnotations()).map(Annotation::toString).collect(Collectors.joining(","));
        MAGENTA.printGenericLn("Even the Override on the method should now see no annotations: %s", toStringAnnotations);

        final var sdkRealDiamond = Arrays.stream(SdkRealDiamond.class.getAnnotations()).map(Annotation::toString).collect(Collectors.joining(","));
        ConsolerizerComposer.out(" ").magenta("This is the collected values for the annotations of the SdkRealDiamond. It should have two annotations:").blue("💎 %s", sdkRealDiamond).toConsoleLn();

        final var sdkRealDiamondImpl = Arrays.stream(SdkRealDiamondImpl.class.getAnnotations()).map(Annotation::toString).collect(Collectors.joining(","));
        MAGENTA.printGenericLn("This is the collected values for the annotations of the SdkRealDiamond. It should also be empty  purely because there are no annotations on a class level: %s", sdkRealDiamondImpl);

        final var varagSafeMethod = SdkRealDiamondImpl.class.getMethod("varagSafeMethod", List[].class);
        final var varagSafeMethodAnnotations = Arrays.stream(varagSafeMethod.getAnnotations()).map(Annotation::toString).collect(Collectors.joining(","));

        ConsolerizerComposer.out(" ").magenta("The check on the method varagSafeMethod should now on annotation. Do remember that Override is removed:").blue("%s", varagSafeMethodAnnotations).toConsoleLn();
    }
}
