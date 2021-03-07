package org.jesperancinha.java11.crums.crum25;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum25 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 25 - Using try with resources");

        MAGENTA.printGenericLn("There are many ways to use a try with resources");
        MAGENTA.printGenericLn("Please check the code in order to understand.");
        try (var fos = new FileOutputStream("/tmp/tmp.txt")) {

        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }

        try (final FileOutputStream fos = new FileOutputStream("/tmp/tmp.txt")) {

        } catch (FileNotFoundException e) {
            RED.printThrowableAndExit(e);
        } catch (IOException e) {
            RED.printThrowableAndExit(e);
        }

        BLUE.printGenericLn("        // FileOutputStream fos;\n" + "        // Unknown class: 'fos'\n"
                + "        // try(fos = new FileOutputStream(\"tmp.txt\")){\n" + "        // \n"
                + "        // } catch (FileNotFoundException e) {\n" + "        //     RED.printThrowableAndExit(e);n"
                + "        // } catch (IOException e) {\n" + "        //     RED.printThrowableAndExit(e);n" + "        // }");

        // FileOutputStream fos;
        // Unknown class: 'fos'
        // try(fos = new FileOutputStream("tmp.txt")){
        //
        // } catch (FileNotFoundException e) {
        //     RED.printThrowableAndExit(e);
        // } catch (IOException e) {
        //     RED.printThrowableAndExit(e);
        // }

        GREEN.printGenericLn("An important rule to know is that try with resources needs to know the reference type");
        GREEN.printGenericLn("It can be done with a var or with the traditional way of type referencing");

    }
}
