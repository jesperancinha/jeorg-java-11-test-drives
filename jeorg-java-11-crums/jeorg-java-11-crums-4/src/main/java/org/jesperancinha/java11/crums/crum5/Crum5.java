package org.jesperancinha.java11.crums.crum5;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum5 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 5 - Exception handling");
        Crum5 crum5 = new Crum5();
        try {
            try {
                crum5.method1();
            } catch (CustomException e) {
                // Please comment the try catch to see the effect.
                try {
                    // Unhandled exception: org.jesperancinha.java11.crums.crum35.CustomException
                    crum5.method1();
                } catch (CustomException customException) {
                    RED.printGeneric("This is expected. Please comment this try catch to see the effect -> %s", e);
                }
            } finally {
                crum5.method2();
            }
        } catch (NullPointerException e) {
            RED.printGeneric("This is expected. We are throwing a NullPointerException -> %s", e);
        }

        BLUE.printGenericLn(" Crum35 crum35 = new Crum35();\n" + "        try {\n" + "            crum35.method1();\n"
                + "        } catch (CustomException e) {\n"
                + "            // Please comment the try catch to see the effect.\n" + "            try {\n"
                + "                // Unhandled exception: org.jesperancinha.java11.crums.crum35.CustomException\n"
                + "                crum35.method1();\n" + "            } catch (CustomException customException) {\n"
                + "                customException.printStackTrace();\n" + "            }\n" + "        } finally {\n"
                + "            crum35.method2();\n" + "        }");

        GREEN.printGenericLn("In this case, there isn't much to do than to exercise our eyes");
        GREEN.printGenericLn("In the catch of this try/cath, there is another exception being thrown that is not easy to spot.");
    }

    public void method1() throws CustomException {
        throw new CustomException();
    }

    public void method2() throws RuntimeException {
        throw new NullPointerException();
    }
}

