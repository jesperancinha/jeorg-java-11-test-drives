package org.jesperancinha.java11.jooa.roast;

public class Roast {

    private final String roastName;

    private final String roastee;

    public Roast(String roastName, String roastee) {
        this.roastName = roastName;
        this.roastee = roastee;
    }

    private void start() {
        System.out.printf("Starting %s\n", roastName);
        System.out.printf("With Roast Master %s\n", RoastMaster.roastMasterName);
    }

    private void stop() {
        System.out.printf("Stopping %s\n", roastName);
    }

    /**
     * The RoastMaster class is unaware of the surrounding class.
     * It's static!
     */
    public static class RoastMaster {

        private static String roastMasterName = null;

        public RoastMaster(String roastMasterName) {
            this.roastMasterName = roastMasterName;
        }

        @Override
        public String toString() {
            return roastMasterName;
        }

        public void mastery() {
            System.out.printf("Master %s is doing mastery things now...\n", roastMasterName);
        }

    }

    /**
     * The Roaster class is aware of the surrounding class
     * It's not static!
     */
    public class Roaster {

        private final String roaster;

        public Roaster(String roaster) {
            this.roaster = roaster;
        }

        public void roast() {
            System.out.printf("%s roasted %s on the %s with roast master %s\n", this.roaster, roastee, roastName, RoastMaster.roastMasterName);
        }

    }

    public static void startTheRoast() {
        var roast = new Roast("Comedy Central Roast of Rob Lowe", "Rob Lowe");
        var roaster1 = roast.new Roaster("Peyton Manning");
        var roaster2 = roast.new Roaster("Rob Riggle");
        var roaster3 = roast.new Roaster("Pete Davidson");
        var roaster4 = roast.new Roaster("Ann Coulter");
        var roaster5 = roast.new Roaster("Jimmy Carr");
        var roaster6 = roast.new Roaster("Jeffrey Ross");
        var roaster7 = roast.new Roaster("Nikki Glaser");
        var roaster8 = roast.new Roaster("Ralph Macchio");
        var roaster9 = roast.new Roaster("Jewel Kilcher");
        var roaster10 = roast.new Roaster("David Spade");
        var roastMaster = new Roast.RoastMaster("David Spade");

        roast.start();
        roaster1.roast();
        roaster2.roast();
        roaster3.roast();
        roaster4.roast();
        roaster5.roast();
        roaster6.roast();
        roaster7.roast();
        roaster8.roast();
        roaster9.roast();
        roaster10.roast();
        roastMaster.mastery();
        roast.stop();

    }
}
