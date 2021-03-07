package org.jesperancinha.java11.mastery2dot2;

import org.jesperancinha.console.consolerizer.console.Consolerizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.compare;
import static java.util.Arrays.mismatch;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowLn;
import static org.jesperancinha.console.consolerizer.console.Consolerizer.printRainbowTitleLn;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BRIGHT_CYAN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;
import static org.jesperancinha.console.consolerizer.console.ConsolerizerGraphs.printUnicornsLn;

public class Master2Dot2Runner {
    public static void main(String[] args) {

        Consolerizer.typingWaitGlobal = 0;

        BLUE.printGenericLn("================== Master Module mastery-2-2 ==================");

        printRainbowTitleLn("1. Serializing `FileOutputStream` and `FileInputStream`");
        printRainbowLn("==");
        YELLOW.printGeneric("### Creating Apollo 13 Mission but missing a few details\n");
        String fileName = "/tmp/destination";
        try (var fileOutputStream = new FileOutputStream(fileName);
             var objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            var missionData = new MissionData();
            missionData.destination = "The Moon";
            missionData.origin = "Earth";
            missionData.mission = "Apollo 13";
            objectOutputStream.writeObject(missionData);
            GREEN.printGenericLn("File has been created on this location -> %s", fileName);
            GREEN.printGenericLn("Data -> %s", missionData);
            GREEN.printGenericLn("Please run module %s to realize that default fields are read with Java default values and not the assigned ones,\nif they are not part of the serialized data", "mastery-2-2-deserializer");
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }

        printRainbowTitleLn("2. `compare` and `mismatch` in arrays");
        printRainbowLn("==");
        YELLOW.printGenericLn("### We compare two arrays defining the crew and test mismatch and compare");
        var astronauts1 = new String[]{"James A. Lovell", "John L. Swigert, Jr.", "Fred W. Haise, Jr."};
        var astronauts2 = new String[]{"Jim Lovell", "Jack Swigert", "Fred Haise"};
        var astronauts3 = new String[]{"James A. Lovell", "Jack Swigert", "Fred W. Haise, Jr."};
        BRIGHT_CYAN.printGenericLn("comparing %s with %s -> result is: %s", astronauts1, astronauts2, compare(astronauts1, astronauts2));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", astronauts1[0], astronauts2[0], astronauts1[0].compareTo(astronauts2[0]));
        BRIGHT_CYAN.printGenericLn("comparing %s with %s -> result is: %s", astronauts1, astronauts3, compare(astronauts1, astronauts3));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", astronauts1[1], astronauts3[1], astronauts1[1].compareTo(astronauts3[1]));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", astronauts3[1], astronauts1[1], astronauts3[1].compareTo(astronauts1[1]));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", astronauts1[2], astronauts3[2], astronauts1[2].compareTo(astronauts3[2]));
        BRIGHT_CYAN.printGenericLn("comparing %s with %s -> result is: %s", astronauts2, astronauts3, compare(astronauts2, astronauts3));
        YELLOW.printGenericLn("### We mismatch two arrays defining the crew and test mismatch and compare");
        BRIGHT_CYAN.printGenericLn("mismatching %s with %s -> result is: %s", astronauts1, astronauts2, mismatch(astronauts1, astronauts2));
        GREEN.printGenericLn("mismatching %s with %s -> result is: %s", astronauts1[0], astronauts2[0], astronauts1[0].compareTo(astronauts2[0]));
        BRIGHT_CYAN.printGenericLn("mismatching %s with %s -> result is: %s", astronauts1, astronauts3, mismatch(astronauts1, astronauts3));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", astronauts1[1], astronauts3[1], astronauts1[1].compareTo(astronauts3[1]));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", astronauts3[1], astronauts1[1], astronauts3[1].compareTo(astronauts1[1]));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", astronauts1[2], astronauts3[2], astronauts1[2].compareTo(astronauts3[2]));
        BRIGHT_CYAN.printGenericLn("mismatching %s with %s -> result is: %s", astronauts2, astronauts3, mismatch(astronauts2, astronauts3));
        YELLOW.printGenericLn("### Note that comparing is different with integers");
        var badCounting = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 1};
        var goodCounting = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        var badCounting2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11};
        var badCounting2AndShort = new int[]{1, 2, 3};
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", badCounting, goodCounting, compare(badCounting, goodCounting));
        GREEN.printGenericLn("mismatching %s with %s -> result is: %s", badCounting, goodCounting, Arrays.mismatch(badCounting, goodCounting));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", badCounting2, goodCounting, compare(badCounting2, goodCounting));
        GREEN.printGenericLn("comparing %s with %s -> result is: %s", badCounting2AndShort, goodCounting, compare(badCounting2AndShort, goodCounting));

        printRainbowTitleLn("3. TYPE_USE and TYPE_PARAMETER");
        printRainbowLn("==");
        YELLOW.printGenericLn("### A TYPE_USE case");
        BLUE.printGenericLn("@Rocket String rocket1 = \"Saturn V\";");
        @Rocket String rocket1 = "Saturn V";
        BLUE.printGenericLn("var rocket2 = (@Rocket String) \"Saturn V\";");
        var rocket2 = (@Rocket String) "Saturn V";
        BLUE.printGenericLn("Function<Integer, String> f = ( @Rocket Integer val ) -> Integer.toHexString(val);");
        Function<Integer, String> f = (@Rocket Integer val) -> Integer.toHexString(val);
        YELLOW.printGenericLn("### A TYPE_PARAMETER case");
        var missionModified = new MissionDataTyped<String>();
        BLUE.printGenericLn("var missionModified = new MissionDataTyped<String>();");
        YELLOW.printGenericLn("### Not that TYPE_PARAMETER is a part of TYPE_USE. If you have TYPE_USE, you don't need TYPE_PARAMETER");

        printRainbowTitleLn("4. Switch valid numeric types and their limits");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Permitted Values");
        YELLOW.printGenericLn("### short");
        GREEN.printGenericLn("%s <= byte <= %s", Byte.MIN_VALUE, Byte.MAX_VALUE);
        YELLOW.printGenericLn("### byte");
        GREEN.printGenericLn("%s <= short <= %s", Short.MIN_VALUE, Short.MAX_VALUE);
        YELLOW.printGenericLn("### int");
        GREEN.printGenericLn("%s <= short <= %s", Integer.MIN_VALUE, Integer.MAX_VALUE);
        YELLOW.printGenericLn("### char");
        GREEN.printGenericLn("%d <= char <= %d", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        GREEN.printGenericLn("%c <= char <= %c", Character.MIN_VALUE, Character.MAX_VALUE);
        RED.printGenericLn("### Not permitted Values");
        RED.printGenericLn("### bool");
        RED.printGenericLn("%s <= bool <= %s", Boolean.FALSE, Boolean.TRUE);
        RED.printGenericLn("### long");
        RED.printGenericLn("%s <= long <= %s", Long.MIN_VALUE, Long.MAX_VALUE);
        RED.printGenericLn("### float");
        RED.printGenericLn("%s <= float <= %s", Float.MIN_VALUE, Float.MAX_VALUE);
        RED.printGenericLn("### double");
        RED.printGenericLn("%s <= double <= %s", Double.MIN_VALUE, Double.MAX_VALUE);

        printRainbowTitleLn("5. Float value declaration");
        printRainbowLn("==");
        YELLOW.printGenericLn("### We try to assign an absolute number");
        float fNumber = 1000;
        BLUE.printGenericLn(fNumber);
        YELLOW.printGenericLn("### We try to assign a number with decimals. Think that by default they are double");
        fNumber = 100.12345f;
        BLUE.printGenericLn(fNumber);
        YELLOW.printGenericLn("### With a double, we do not need to cast");
        double dNumber = 100.45677;
        BLUE.printGenericLn(dNumber);

        printRainbowTitleLn("6. Conflicting exports in modularization");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Check the module definitions of this module");

        printRainbowTitleLn("7. Multi interface inheritance");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Check the two interfaces. There is a subclass which overrides the superclass method. This is Ok");
        BLUE.printGenericLn("public interface BriefingTrajectory {\n" +
                "    String getOriginLocation();\n" +
                "    String getDestinationLocation();\n" +
                "}");
        YELLOW.printGenericLn("### And this is the sub interface");
        BLUE.printGenericLn("public interface MissionBriefingControl extends BriefingDate, BriefingTrajectory {\n" +
                "    String getDestinationLocation();\n" +
                "    String getDestinationLocation(MissionData missionData);\n" +
                "    LocalDateTime getBriefingDate();\n" +
                "    String getOriginLocation();\n" +
                "}");

        printRainbowTitleLn("8. `Function`'s and `ToFunction`'s");
        printRainbowLn("==");
        ToDoubleFunction<String> toDoubleFunction = a -> {
            if (a.equals("SATCAT")) {
                return 4371;
            }
            return -1;
        };
        DoubleFunction<String> doubleFunction = a -> {
            if (a == 4371) {
                return "SATCAT";
            }
            return null;
        };
        YELLOW.printGenericLn("### A ToDoubleFunction uses an Object parameter, but always returns a primitve");
        YELLOW.printGenericLn("### The name is self-exlanatory. To<>Function's always return a primitive type");
        GREEN.printGenericLn(toDoubleFunction.applyAsDouble("SATCAT"));
        GREEN.printGenericLn(toDoubleFunction.applyAsDouble("AAAAAA"));
        YELLOW.printGenericLn("### A DoubleFunction uses an double parameter, but always returns an object");
        YELLOW.printGenericLn("### The name is self-exlanatory. <>Function's always receive a primitive type");
        GREEN.printGenericLn(doubleFunction.apply(4371));
        GREEN.printGenericLn(doubleFunction.apply(2222));

        printRainbowTitleLn("9. `--add-exports` and `--add-reads` in modularization");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Check module mastery-2-2-modularity for an example in action");

        printRainbowTitleLn("10. Security guidelines");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Check https://www.oracle.com/java/technologies/javase/seccodeguide.html for more info on java security");

        printRainbowTitleLn("11. Project Jigsaw");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Check http://cr.openjdk.java.net/~mr/jigsaw/ea/module-summary.html for more info on java.base");

        printRainbowTitleLn("12. `AutoCloseable`close method and exception handling");
        printRainbowLn("==");
        YELLOW.printGenericLn("### AutoCloseable interface and exception handling");
        var rocketInfoFile = "/tmp/rocket-info.txt";
        try (FileOutputStream fos = new FileOutputStream(rocketInfoFile)) {
            fos.write("2,949,136".getBytes());
            throw new NullPointerException("See? I can throw NullPointerException whenever I want!");
        } catch (IOException | NullPointerException e) {
            RED.printGenericLn("%s", e);
        }
        FileInputStream fisOut = null;
        try (FileInputStream fis = new FileInputStream(rocketInfoFile)) {
            byte[] bytes = fis.readAllBytes();
            GREEN.printGenericLn(new String(bytes));
            fisOut = fis;
        } catch (IOException e) {
            RED.printGenericLn("%s", e);
        }
        try {
            fisOut.close();
            YELLOW.printGenericLn("### We re-close the FileInputStream, but note that, that one also throws IOException.");
        } catch (IOException e) {
            RED.printGenericLn("%s", e);
        }

        printRainbowTitleLn("13. `Files` list and walk");
        printRainbowLn("==");
        YELLOW.printGenericLn("### In the following sequence of examples we'll see how to list and now not to list files");
        Stream<Path> allFiles1;
        try {
            ORANGE.printGenericLn("### Stream<Path> allFiles1 = Files.list(Paths.get(\"/**/rocket*.txt\")); -> should fail!");
            ORANGE.printGenericLn("### It may throw an InvalidPathException which is a RuntimeException. This depends on your FileSystems");
            allFiles1 = Files.list(Paths.get("/**/rocket*.txt"));
        } catch (IOException e) {
            YELLOW.printGenericLn("### It is also safer to assume that if something goes on reading, it will throw a IOException, instead of possibly the NoSuchFileException");
            RED.printGenericLn("%s", e);
            try {
                allFiles1 = Files.list(Paths.get("/tmp"));
                GREEN.printGenericLn("These are the files with list: %s", allFiles1.collect(Collectors.toList()));
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        // Cannot resolve method 'find(java.nio.file.Path)'
        // allFiles1 = Files.find(Paths.get("/tmp/rocket-info.txt"));
        try {
            allFiles1 = Files.find(Paths.get("/tmp/rocket-info.txt"), 0, (p, a)
                    -> p.endsWith("rocket-info.txt") && a.isRegularFile());
            GREEN.printGenericLn("These are the files with find: %s", allFiles1.collect(Collectors.toList()));
        } catch (IOException e) {
            RED.printGenericLn("%s", e);
        }
        // Cannot resolve method 'walk(java.nio.file.Path, java.lang.String)'
        // allFiles1= Files.walk(Paths.get("/tmp/rocket-info.txt"), "test.txt");
        try {
            allFiles1 = Files.walk(Paths.get("/tmp/rocket-info.txt"), 0);
            GREEN.printGenericLn("These are the files with walk: %s", allFiles1.collect(Collectors.toList()));
        } catch (IOException e) {
            RED.printGenericLn("%s", e);
        }

        printRainbowTitleLn("14. Reading sub-paths `Path.subpath`");
        printRainbowLn("==");
        YELLOW.printGenericLn("### A few things to remember:");
        YELLOW.printGenericLn("### 1. The root is never element 0");
        YELLOW.printGenericLn("### 2. First index is inclusive, last index is exclusive (just like almost every index in Java");
        YELLOW.printGenericLn("### 3. Individual paths do not start or end with path separator");
        var lunarPath = new File("/tmp/controller/lunar");
        var orbitPath = new File("/tmp/controller/orbit");
        var launcherPath = new File("/tmp/controller/launcher");
        lunarPath.mkdirs();
        orbitPath.mkdirs();
        launcherPath.mkdirs();
        var pathLunar = Paths.get("/tmp/controller/lunar");
        var pathOrbit = Paths.get("/tmp/controller/orbit");
        var pathLauncher = Paths.get("/tmp/controller/launcher");
        ORANGE.printGenericLn("A subpath 0 to 1 of %s is %s", pathLunar, pathLunar.subpath(0, 1));
        ORANGE.printGenericLn("A subpath 0 to 2 of %s is %s", pathLunar, pathLunar.subpath(0, 2));
        ORANGE.printGenericLn("Path 0 of %s is %s", pathLunar, pathLunar.getName(0));
        ORANGE.printGenericLn("Root of %s is %s", pathLunar, pathLunar.getRoot());
        ORANGE.printGenericLn("A subpath 0 to 3 of %s is %s", pathOrbit, pathOrbit.subpath(0, 3));
        ORANGE.printGenericLn("A subpath 1 to 3 of %s is %s", pathLauncher, pathLauncher.subpath(1, 3));

        printRainbowTitleLn("15. Prepared statement different types `BLOB` and `CLOB`.");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Multiple runs of the same query is better performed with `PreparedStatement`");
        YELLOW.printGenericLn("### Performance can be hindered if only one query is run per `PreparedStatement`");
        try {
            Connection conn = DriverManager.
                    getConnection("jdbc:h2:mem:", "sa", "");
            GREEN.printGenericLn("Connection: %s / %s", conn.getMetaData().getDatabaseProductName(), conn.getCatalog());
            GREEN.printGenericLn("Current auto-commit setting: %s", conn.getAutoCommit());
            PreparedStatement preparedStatement = conn.prepareStatement("select 1 as value from dual");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ORANGE.printGenericLn(resultSet.getString("value"));
                ORANGE.printGenericLn(resultSet.getString(1));
            }
            var resourceAsStream = Master2Dot2Runner.class.getResourceAsStream("/master.2.2.JPG");
            PreparedStatement createBlogs = conn.
                    prepareStatement("CREATE TABLE Blog (ID INTEGER PRIMARY KEY AUTO_INCREMENT,\n" +
                            "TEXT CLOB,\n" +
                            "IMAGE BLOB);");
            GREEN.printGenericLn(createBlogs);
            createBlogs.execute();
            Blob blob = conn.createBlob();
            blob.setBytes(1, resourceAsStream.readAllBytes());
            java.sql.Clob clob = conn.createClob();
            clob.setString(1, "This is a big big blog");
            PreparedStatement insertBlog = conn.
                    prepareStatement("INSERT INTO Blog(\n" +
                            "TEXT,\n" +
                            "IMAGE) VALUES (?,?)");
            insertBlog.setClob(1, clob);
            insertBlog.setBlob(2, blob);
            GREEN.printGenericLn(insertBlog);
            insertBlog.execute();
            PreparedStatement selectBlog = conn.prepareStatement("select ID, TEXT, IMAGE from Blog");
            ResultSet resultSet2 = selectBlog.executeQuery();
            while (resultSet2.next()) {
                ORANGE.printGenericLn(resultSet2.getString(1));
                ORANGE.printGenericLn(new String(resultSet2.getClob(2).getAsciiStream().readAllBytes()));
                byte[] bytes = resultSet2.getBlob(3).getBinaryStream().readAllBytes();
                try (FileOutputStream fos = new FileOutputStream("/tmp/master.2.2.JPG")) {
                    fos.write(bytes);
                }
                ORANGE.printGenericLn("Check /tmp/master.2.2.JPG. The contents of %s..., have been copied there!", new String(bytes).substring(0, 10));
            }
            conn.close();
        } catch (Exception e) {
            RED.printThrowableAndExit(e);
        }

        printRainbowTitleLn("16. Non-deterministic nature of findAny.");
        printRainbowLn("==");
        YELLOW.printGenericLn("### findAny of Java streams is non deterministic");
        YELLOW.printGenericLn("### It may give the feeling that the cause of it are parallel streams");
        YELLOW.printGenericLn("### We pick a list of the actors of Apollo 13");
        var actors = List.of("Tom Hanks", "Bill Paxton", "Kevin Bacon", "Gary Sinise");
        BLUE.printGenericLn("This is the list: %s", "var actors = List.of(\"Tom Hanks\", \"Bill Paxton\",\"Kevin Bacon\",\"Gary Sinise\");");
        BLUE.printGenericLn("We select one with findAny and a parallel stream:\n %s", "        var actorParallel = actors. parallelStream()\n" +
                "                .findAny().orElse(null);");
        var actorParallel = actors.parallelStream()
                .findAny().orElse(null);
        ORANGE.printGenericLn("We've found actor %s. Note that if you run this several times, you'll still get %s. However you would not be able to determine that before-hand right?", actorParallel, actorParallel);
        BLUE.printGenericLn("We select one with findAny and a sequential stream:\n %s", "        var actorParallel2 = actors.stream()\n" +
                "                .findAny().orElse(null);");
        var actorParallel2 = actors.stream()
                .findAny().orElse(null);
        ORANGE.printGenericLn("Now we get %s. Run again and you'll still get %s. However, this wasn't possible to determine was it?", actorParallel2, actorParallel2);

        printRainbowTitleLn("17. Loops and Labels");
        printRainbowLn("==");
        YELLOW.printGenericLn("### Loops and Labels cannot be broken or continued for outside flow control statements such as while, do, for and if");
        YELLOW.printGenericLn("### Break and continue alone do work, but only within a loop");
        var i = 0;
        SPACE:
        while (i++ < 2) {
            var j = 0;
            ORBIT:
            while (j++ < 10) {
                var k = 0;
                MOON:
                while (k++ < 10) {
                    ACCIDENT:
                    RED.printGenericLn("This will never break");
                    if (k == 5) {
                        ORANGE.printGenericLn("We leave the countdown with i=%d, j=%d, k=%d", i, j, k);
                        DODO:
                        do {
                            GREEN.printGenericLn("The next text won't print");
                            if (true)
                                break DODO;
                            GREEN.printGenericLn("The next text won't print");
                        } while (false);
                        break ORBIT;
                        // Undefined label: 'ACCIDENT'
                        // break ACCIDENT;
                    }
                }
            }
        }

        printRainbowTitleLn("18. Overriding `CharSequence`");
        printRainbowLn("==");
        YELLOW.printGenericLn("### How do we override a CharSequence for different classes?");
        YELLOW.printGenericLn("### Here are some examples");
        class Moon {
            public <T extends CharSequence> Collection<String> translateData(Collection<T> list) {
                BLUE.printGenericLn("We now print the moon with -> public <T extends CharSequence> Collection<String> translateData(Collection<T> list)");
                return new ArrayList<>();
            }

            public <T extends String> Collection<String> translateData(List<T> list) {
                BLUE.printGenericLn("We now print the moon with -> public <T extends String> Collection<String> translateData(List<T> list)");
                return new ArrayList<>();
            }
        }
        class MoonBase extends Moon {
            public <T extends CharSequence> Collection<String> translateData(Collection<T> list) {
                BLUE.printGenericLn("We now print the moon-base with -> public <T extends CharSequence> Collection<String> translateData(Collection<T> list)");
                return super.translateData(list);
            }

            public <T extends String> Collection<String> translateData(List<T> list) {
                BLUE.printGenericLn("We now print the moon-base with -> public <T extends String> Collection<String> translateData(List<T> list)");
                return super.translateData(list);
            }
        }
        var moonBase = new MoonBase();
        // Cannot resolve method 'transform(java.util.ArrayList<java.lang.Long>)'
        // moonBase.transform(new ArrayList<Long>());
        moonBase.translateData(new ArrayList<>());
        moonBase.translateData((Collection) new Vector<>());
        printUnicornsLn(100);
    }
}
