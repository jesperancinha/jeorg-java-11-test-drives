package org.jesperancinha.java11.crums.crum35;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum35 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 35 - trimming and stripping Strings");

        var stringA = "    I did all my best to smile    ";
        var stringB = "    ";
        var stringC = "I'm only happy when it rains    ";
        var stringD = "    I only smile in the dark";
        char c = '\u001A';

        var stringE = c + "I'm only happy when its complicated" + c;

        MAGENTA.printGenericLn("from: https://genius.com/This-mortal-coil-song-to-the-siren-lyrics");
        MAGENTA.printGenericLn("from: https://genius.com/Garbage-only-happy-when-it-rains-lyrics");
        MAGENTA.printGenericLn("from: https://www.journaldev.com/33291/java-string-trim-method-examples#:~:text=String%20trim");
        MAGENTA.printGenericLn("We are presented the following strings:");
        ORANGE.printGenericLn(stringA);
        ORANGE.printGenericLn(stringB);
        ORANGE.printGenericLn(stringC);
        ORANGE.printGenericLn(stringD);
        ORANGE.printGenericLn(stringE);

        MAGENTA.printGenericLn("This is what happens with a trim:");
        ORANGE.printGenericLn("%s, %d", stringA.trim(), stringA.trim()
                .length());
        ORANGE.printGenericLn("%s, %d", stringB.trim(), stringB.trim()
                .length());
        ORANGE.printGenericLn("%s, %d", stringC.trim(), stringC.trim()
                .length());
        ORANGE.printGenericLn("%s, %d", stringD.trim(), stringD.trim()
                .length());
        ORANGE.printGenericLn("%s, %d", stringE.trim(), stringE.trim()
                .length());

        MAGENTA.printGenericLn("This is what happens with a strip:");
        ORANGE.printGenericLn("%s, %d", stringA.strip(), stringA.strip()
                .length());
        ORANGE.printGenericLn("%s, %d", stringB.strip(), stringB.strip()
                .length());
        ORANGE.printGenericLn("%s, %d", stringC.strip(), stringC.strip()
                .length());
        ORANGE.printGenericLn("%s, %d", stringD.strip(), stringD.strip()
                .length());
        ORANGE.printGenericLn("%s, %d", stringE.strip(), stringE.strip()
                .length());

        MAGENTA.printGenericLn("We can also just strip left:");
        ORANGE.printGenericLn("%s, %d", stringA.stripLeading(), stringA.stripLeading()
                .length());
        ORANGE.printGenericLn("%s, %d", stringB.stripLeading(), stringB.stripLeading()
                .length());
        ORANGE.printGenericLn("%s, %d", stringC.stripLeading(), stringC.stripLeading()
                .length());
        ORANGE.printGenericLn("%s, %d", stringD.stripLeading(), stringD.stripLeading()
                .length());
        ORANGE.printGenericLn("%s, %d", stringE.stripLeading(), stringE.stripLeading()
                .length());

        MAGENTA.printGenericLn("Or strip right:");
        ORANGE.printGenericLn("%s, %d", stringA.stripTrailing(), stringA.stripTrailing()
                .length());
        ORANGE.printGenericLn("%s, %d", stringB.stripTrailing(), stringB.stripTrailing()
                .length());
        ORANGE.printGenericLn("%s, %d", stringC.stripTrailing(), stringC.stripTrailing()
                .length());
        ORANGE.printGenericLn("%s, %d", stringD.stripTrailing(), stringD.stripTrailing()
                .length());
        ORANGE.printGenericLn("%s, %d", stringE.stripTrailing(), stringE.stripTrailing()
                .length());

        GREEN.printGenericLn("Trim looks to do the same as strip, but there is a subtle difference");
        GREEN.printGenericLn("Trim removes all characters under '\\u001A'");
        GREEN.printGenericLn("Strip removes all characters under the UTF standard.");
        GREEN.printGenericLn("Strip also uses the Character.isWhiteSpace(codepoint) method");
        GREEN.printGenericLn("It must follow these rules:");
        GREEN.printGenericLn("It is a Unicode space character (SPACE_SEPARATOR, LINE_SEPARATOR, or PARAGRAPH_SEPARATOR) but is not also a non-breaking space ('\\u00A0', '\\u2007', '\\u202F').\n"
                + "It is '\\t', U+0009 HORIZONTAL TABULATION.\n" + "It is '\\n', U+000A LINE FEED.\n"
                + "It is '\\u000B', U+000B VERTICAL TABULATION.\n" + "It is '\\f', U+000C FORM FEED.\n"
                + "It is '\\r', U+000D CARRIAGE RETURN.\n" + "It is '\\u001C', U+001C FILE SEPARATOR.\n"
                + "It is '\\u001D', U+001D GROUP SEPARATOR.\n" + "It is '\\u001E', U+001E RECORD SEPARATOR.\n"
                + "It is '\\u001F', U+001F UNIT SEPARATOR.");
    }
}
