package org.jesperancinha.java11.mastery4dot2.record;

import java.time.LocalDateTime;

public class Company {

    private String company;

    public Company(String company) {
        this.company = company;
    }

    public class Music {
        private String music;
        private String artist;
        private LocalDateTime localDateTime;

        public Music(final String music, final String artist, final LocalDateTime localDateTime) {
            this.music = music;
            this.artist = artist;
            this.localDateTime = localDateTime;
        }

        public String getTheMusic() {
            return String.format("%s released single %s from %s on the %s", Company.this.company, this.music, this.artist, this.localDateTime);
        }
    }
}
