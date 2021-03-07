package org.jesperancinha.java11.wanda.classes;

public class Show {

    private final String showName;

    private final byte episode;

    public Show(String showName, byte episode) {
        this.showName = showName;
        this.episode = episode;
    }

    public byte getEpisode() {
        return episode;
    }

    public String getShowName() {
        return showName;
    }

    public static class Host {

        private static String host = "There can be only one host";

        public Host(String host) {
            Host.host = host;
        }

        /**
         * Although this is also possible to do with public, the problem is that {@link Host} is not an enclosing class.
         * <p>
         * Since Host is a static class, it does not have an enclosing class.
         * To instantiate Guest however, we need the enclosing instance.
         * The way to do it is to create an instance anyways of Host and from there create our guest.
         */
        public class Guest {
            private final String guestName;

            public Guest(String guestName) {
                this.guestName = guestName;
            }

            public String getHost() {
                return Host.host;
            }

            public String getGuestName() {
                return guestName;
            }
        }
    }
}
