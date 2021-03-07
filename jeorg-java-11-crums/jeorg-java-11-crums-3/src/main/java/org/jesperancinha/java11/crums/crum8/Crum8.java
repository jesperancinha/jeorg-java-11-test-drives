package org.jesperancinha.java11.crums.crum8;

import java.nio.file.Path;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum8 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 8 - Relativizing Paths");
        var path1 = Path.of("/tmp/file1");
        var path2 = Path.of("/tmp/file2");

        MAGENTA.printGenericLn("We can relativize path1 with path 2 and get this result:");
        ORANGE.printGenericLn(path1.relativize(path2));
        MAGENTA.printGenericLn("The other way around:");
        ORANGE.printGenericLn(path2.relativize(path1));

        MAGENTA.printGenericLn("What if one of the paths is just a file name without a root path?");

        var path3 = Path.of("filename3");
        try {
            ORANGE.printGenericLn(path1.relativize(path3));
            ORANGE.printGenericLn(path3.relativize(path1));
        } catch (IllegalArgumentException e) {
            RED.printGenericLn("This is expected! Relativizing a filename with a filename with a path does not make sense -> %s", e);
        }

        MAGENTA.printGenericLn("We can also resolve but in this case, since we are actually building and not referencing one path with the other, no exception occurs in any of the previous four cases");
        ORANGE.printGenericLn(path1.resolve(path2));
        ORANGE.printGenericLn(path2.resolve(path1));
        ORANGE.printGenericLn(path1.resolve(path3));
        ORANGE.printGenericLn(path3.resolve(path1));

        GREEN.printGenericLn("Relativize is a reference point from A to B");
        GREEN.printGenericLn("Resolve is also a sort of reference point from A to B, but the resolution results in B itself with a full path");
        GREEN.printGenericLn("Resolves always considers all elements of the path to have a directory form and if it needs to append, it will append the full name");

    }
}
