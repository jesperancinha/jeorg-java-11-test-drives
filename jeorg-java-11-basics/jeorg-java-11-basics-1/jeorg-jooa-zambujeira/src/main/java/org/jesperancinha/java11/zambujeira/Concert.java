package org.jesperancinha.java11.zambujeira;

import java.time.LocalDate;

public class Concert {

    /**
     * Shadow will occur for every class that contains a member with the same name and type.
     */
    private final String concertName;

    public Concert(String concertName) {
        this.concertName = concertName;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "concertName='" + concertName + '\'' +
                '}';
    }

    public void start() {
        System.out.printf("Concert %s has started \n", concertName);
    }

    public void stop() {
        System.out.printf("Concert %s has stopped \n", concertName);
    }

    class Act {
        private final String artistName;

        private final LocalDate localDate;

        /**
         * Shadowing occurs
         */
        private final String concertName;

        Act(String artistName, LocalDate localDate, String concertName) {
            this.artistName = artistName;
            this.localDate = localDate;
            this.concertName = concertName;
        }

        @Override
        public String toString() {
            return "Act{" +
                    "artistName='" + artistName + '\'' +
                    ", localDate=" + localDate +
                    ", concertName='" + concertName + '\'' +
                    '}';
        }

        public void startAct() {
            System.out.printf("Artist %s has started playing at %s in festival %s\n", artistName, localDate.toString(), this.concertName);
        }

        public void stopAct() {
            System.out.printf("Artist %s has stopped playing at %s in festival %s\n", artistName, localDate.toString(), this.concertName);

        }
    }

    class FestivalAct extends Act {
        private final String artistName;

        private final LocalDate localDate;

        FestivalAct(String artistName, LocalDate localDate) {
            super(artistName, localDate, concertName);
            this.artistName = artistName;
            this.localDate = localDate;
        }

        @Override
        public String toString() {
            return "RealAct{" +
                    "artistName='" + artistName + '\'' +
                    ", localDate=" + localDate +
                    '}';
        }

        public void startAct() {
            System.out.printf("Artist %s has started playing at %s in festival %s\n", artistName, localDate.toString(), concertName);
        }

        public void stopAct() {
            System.out.printf("Artist %s has stopped playing at %s in festival %s\n", artistName, localDate.toString(), concertName);

        }
    }

    public static void startTheFestival() {
        final var concert = new Concert("MEO Sudoeste 2021");

        var artist1 = concert.new Act("Major Lazer", LocalDate.of(2021, 8, 5), "Zambujeira do mar 2021");
        var artist2 = concert.new FestivalAct("Bad Bunny", LocalDate.of(2021, 8, 4));
        var artist3 = concert.new FestivalAct("Meduza", LocalDate.of(2021, 8, 5));
        var artist4 = concert.new FestivalAct("Profjam", LocalDate.of(2021, 8, 4));
        var artist5 = concert.new FestivalAct("Bispo", LocalDate.of(2021, 8, 7));
        var artist6 = concert.new FestivalAct("Deejay Telio", LocalDate.of(2021, 8, 5));
        var artist7 = concert.new FestivalAct("Melim", LocalDate.of(2021, 8, 6));
        var artist8 = concert.new FestivalAct("Timmy Trumpet", LocalDate.of(2021, 8, 7));
        var artist9 = concert.new FestivalAct("Ozuna", LocalDate.of(2021, 8, 6));

        concert.start();

        artist2.startAct();
        artist2.stopAct();
        artist4.startAct();
        artist4.stopAct();
        artist1.startAct();
        artist1.stopAct();
        artist3.startAct();
        artist3.stopAct();
        artist6.startAct();
        artist6.stopAct();
        artist7.startAct();
        artist7.stopAct();
        artist9.startAct();
        artist9.stopAct();
        artist8.startAct();
        artist8.stopAct();
        artist5.startAct();
        artist5.stopAct();

        concert.stop();

    }
}
