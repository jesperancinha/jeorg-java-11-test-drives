package org.jesperancinha.java11.mastery3dot1.songs;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Vlinder extends RawVlinder {
    @Override
    public void playVlinder() {
        ORANGE.printGenericLn("Maaike Ouboter sang a cover version of `Verdronken Vlinder in dutch TV show `De Dereld Draait Door`");
    }

    @Override
    public void publicPoint() {
        RED.printGenericLn("In this case you can just call the public method. Note that the abstraction is package protected.");
        RED.printGenericLn("This means that it is the strictest next to `private`");
        RED.printGenericLn("So we can implement it with `protected` and `public` only.");
    }

    // 'playVlinder()' in 'org.jesperancinha.java11.mastery3dot1.songs.Vlinder' clashes with 'playVlinder()' in 'org.jesperancinha.java11.mastery3dot1.songs.RawVlinder';
    // attempting to assign weaker access privileges ('private'); was 'packageLocal'
    // @Override
    // private void playVlinder() {
    //     ORANGE.printGenericLn("The original version of `Verdronken vlinder` came about in 1967 as a B-Side recording of Boudewijn de Groot's single `Onder ons`");
    // }
}
