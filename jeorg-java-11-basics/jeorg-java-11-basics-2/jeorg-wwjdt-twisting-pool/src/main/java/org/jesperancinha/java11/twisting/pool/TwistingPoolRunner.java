package org.jesperancinha.java11.twisting.pool;

public class TwistingPoolRunner {
    public static void main(String[] args) {
        String holiday = "holiday".intern();
        String holiday2 = "holiday".intern();

        if (holiday == holiday2) {
            System.out.printf("Strings %s and %s match! Notice that your compiler is probably saying that intern() is redundant! Let's see with no intern\n", holiday, holiday2);
        }

        holiday = "holiday";
        holiday2 = "holiday";

        if (holiday == holiday2) {
            System.out.printf("Strings %s and %s match! Assigning a constant has the same effect. They get interned automatically!\n", holiday, holiday2);
        }

        holiday = new String("holiday");
        holiday2 = new String("holiday");

        if (holiday != holiday2) {
            System.out.printf("Strings %s do not match %s!\nWhen String refers to objects(i.e. new String(...)), the comparison uses references instead of constants.\nThis results in a typical object reference comparison\n", holiday, holiday2);
        }

        String twisting = "You got me twisting by the pool\n";

        String repeat = twisting.repeat(4);

        System.out.printf("%d times:\n%s", 4, repeat);

        String euroBeat1 = "Dance to the Euro beat";
        String euroBeat2 = "dance to the euro beat";

        System.out.printf("Although we write differently, if we say \"%s\" or if we say \"%s\", isn't that the same? %s(0 means they are the same)\n", euroBeat1, euroBeat2, euroBeat1.compareToIgnoreCase(euroBeat2));
        System.out.printf("Although we write differently, if we say \"%s\" or if we say \"%s\", isn't that the same? %s(true means they are the same)\n", euroBeat1, euroBeat2, euroBeat1.equalsIgnoreCase(euroBeat2));
        System.out.printf("Although we write differently, if we say \"%s\" or if we say \"%s\", isn't that the same? %s(anything different than 0 just means how distant the first String is from the second String)\n", euroBeat1, euroBeat2, euroBeat1.compareTo(euroBeat2));
    }
}
