package org.jesperancinha.java11.crums.crum12;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Crum12 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 12 - StringBuilder capacity and limitation");

        var sb1 = new StringBuilder(10);

        var sb2 = new StringBuilder(50);

        var sb3 = new StringBuilder(100);
        MAGENTA.printGenericLn("Before assigning:");
        MAGENTA.printGenericLn("These are the lyrics using sb1 -> %s", sb1);
        MAGENTA.printGenericLn(sb1.length());
        MAGENTA.printGenericLn(sb1.capacity());
        MAGENTA.printGenericLn("These are the lyrics using sb2 -> %s", sb2);
        MAGENTA.printGenericLn(sb2.length());
        MAGENTA.printGenericLn(sb2.capacity());
        MAGENTA.printGenericLn("These are the lyrics using sb3 -> %s", sb3);
        MAGENTA.printGenericLn(sb3.length());
        MAGENTA.printGenericLn(sb3.capacity());

        MAGENTA.printGenericLn("https://www.lyrics.com/lyric/5234990/Romeo");
        sb1.append("You Keep on giving me the Hold up\nYou know I wish you'd make your mind up");
        sb2.append("You Keep on giving me the Hold up\nYou know I wish you'd make your mind up");
        sb3.append("You Keep on giving me the Hold up\nYou know I wish you'd make your mind up");

        MAGENTA.printGenericLn("After  assigning:");
        MAGENTA.printGenericLn("These are the lyrics using sb1 -> %s", sb1);
        MAGENTA.printGenericLn(sb1.length());
        MAGENTA.printGenericLn(sb1.capacity());
        MAGENTA.printGenericLn("These are the lyrics using sb2 -> %s", sb2);
        MAGENTA.printGenericLn(sb2.length());
        MAGENTA.printGenericLn(sb2.capacity());
        MAGENTA.printGenericLn("These are the lyrics using sb3 -> %s", sb3);
        MAGENTA.printGenericLn(sb3.length());
        MAGENTA.printGenericLn(sb3.capacity());

        MAGENTA.printGenericLn("Now we want to make sure that our built string only holds 100 characters");

        sb1.setLength(50);
        sb2.setLength(50);
        sb3.setLength(50);

        YELLOW.printGenericLn("This works in all 3 cases:\n%s\n%s\n%s", sb1, sb2, sb3);
        YELLOW.printGenericLn("With the new capacities:  \n%d\n%d\n%d", sb1.capacity(), sb2.capacity(), sb3.capacity());

        sb1.ensureCapacity(80);
        sb2.ensureCapacity(100);
        sb2.ensureCapacity(150);
        MAGENTA.printGenericLn("If we ensure other capacities:");
        YELLOW.printGenericLn("With the new capacities: \n%d\n%d\n%d", sb1.capacity(), sb2.capacity(), sb3.capacity());
        MAGENTA.printGenericLn("See that sb2 went from 102 to 206? Ensuring capacity can lead to exponentially increase capacity");
        MAGENTA.printGenericLn("We ensure 100 but it had 102, so it will calculate a new one = 102 * 2 + 2 = 206");

        MAGENTA.printGenericLn("We can add the rest later:");

        sb1.append("you'd make your mind up");
        sb2.append("you'd make your mind up");
        sb3.append("you'd make your mind up");

        YELLOW.printGenericLn("This works in all 3 cases:\n%s\n%s\n%s", sb1, sb2, sb3);
        YELLOW.printGenericLn("With the new capacities:  \n%d\n%d\n%d", sb1.capacity(), sb2.capacity(), sb3.capacity());

        MAGENTA.printGenericLn("Finally we make capacities negative.");
        sb1.ensureCapacity(-1);
        sb2.ensureCapacity(-1);
        sb3.ensureCapacity(-1);
        MAGENTA.printGenericLn("No Error! But also no change:");
        YELLOW.printGenericLn("With the new capacities:  \n%d\n%d\n%d", sb1.capacity(), sb2.capacity(), sb3.capacity());
        MAGENTA.printGenericLn("How about a negative length?");
        try {
            sb1.setLength(-1);
            sb2.setLength(-1);
            sb3.setLength(-1);
        } catch (StringIndexOutOfBoundsException e) {
            RED.printGenericLn("As you can see, this is not possible.");
            RED.printGenericLn("And this makes sense because there is a check for length in the 'setLength' method.");
            RED.printGenericLn("Either way, always recommended to catch this exception with an IndexOutOfBoundsException -> %s", e);
        }
        GREEN.printGenericLn("Capacity is an optimization measure in place to build strings");
        GREEN.printGenericLn("There is no practical effect except when performance tests are done");
        GREEN.printGenericLn("Capacity increases by 2x capacity factor + 2. If this is not enough to hold the new string, the new capacity is the length of the new String");

        GREEN.printGenericLn("'setLength' can truncate the build, but no changes in capacity happen if it does. Expansion will of course change capacity as usual");
    }
}
