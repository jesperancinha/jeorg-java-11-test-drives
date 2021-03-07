package org.jesperancinha.java11.wanda.classes;

import org.jesperancinha.java11.wanda.classes.Show.Host;

/**
 * Note that when assigning 15 to a byte, it gets casted directly into a byte.
 * We cannot pass 15 directly into the method though.
 */
public class WandaRunner {
    public static void main(String[] args) {
        var show = new Show("The Wanda Sykes Show", (byte) 15);

        var host = new Host("Wanda Sykes");
        var guest1 = host.new Guest("Wesley Snipes");
        var guest2 = host.new Guest("Nick Cannon");
        var guest3 = host.new Guest("Gina Gershon");
        var guest4 = host.new Guest("Greg Giraldo");

        System.out.printf("Guest %s is being hosting by %s but we can't get the show's name\n", guest1.getGuestName(), guest1.getHost());
        System.out.printf("Guest %s is being hosting by %s but we can't get the show's name\n", guest2.getGuestName(), guest2.getHost());
        System.out.printf("Guest %s is being hosting by %s but we can't get the show's name\n", guest3.getGuestName(), guest3.getHost());
        System.out.printf("Guest %s is being hosting by %s but we can't get the show's name\n", guest4.getGuestName(), guest4.getHost());

        System.out.printf("Luckily our opening record shows that the show is %s, episode %d\n", show.getShowName(), show.getEpisode());
    }
}