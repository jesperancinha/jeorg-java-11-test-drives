package org.jesperancinha.java11.crums.crum6;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum6 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 6 - groupingBy");

        var teaBags = Arrays.asList(
                new TeaBag("Black", 100),
                new TeaBag("Rooibos", 30),
                new TeaBag("Rooibos", 160),
                new TeaBag("Lime", 24)
        );

        MAGENTA.printGenericLn("We have this tea collection with respective price associated");

        MAGENTA.printGenericLn(teaBags);

        final Map<String, List<TeaBag>> collect = teaBags.parallelStream()
                .collect(Collectors.groupingBy(TeaBag::getDesignation));

        ORANGE.printGenericLn(collect);
        MAGENTA.printGenericLn("We can see that we have two Rooibos teas");

        GREEN.printGenericLn("It may sound not very intuitive, but grouping by can be very simple and just have the grouping parameter on it");

    }
}
