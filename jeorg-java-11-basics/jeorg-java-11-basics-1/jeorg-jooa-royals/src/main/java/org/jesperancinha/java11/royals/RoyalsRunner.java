package org.jesperancinha.java11.royals;

import org.jesperancinha.java11.civilian.Civilian;
import org.jesperancinha.java11.people.People;
import org.jesperancinha.java11.people.ReallyCommonPeople;

public class RoyalsRunner {
    public static void main(String[] args) {
        var civilian = new Civilian();
        var person = new People();
        var reallyCommonPeople = new ReallyCommonPeople();
        var princess = new Princess();
        var queen = new Queen();

        System.out.println("A queen can wave, which is a protected action, show the martians and do whatever princesses do. A Queen cannot specifically make furniture. It is a private method");
        queen.waveToPublic();
        queen.showTheMartians();
        queen.doWhateverPrincessesDo();

        System.out.println("A princess can do pretty much what a queen can do. Notice that we can call its protected method too and wave.");
        princess.waveToPublic();
        princess.showTheMartians();
        princess.doWhateverPrincessesDo();

        System.out.println("Common people do what common people do and show the martians. Notice that we can call package protected or aka default scoped method indirectly via the public method wrapping it");
        reallyCommonPeople.onlyCommonPeople();
        reallyCommonPeople.showTheMartians();

        System.out.println("A person can only show the martians. Note that although we can show the martians, we cannot create them");
        person.showTheMartians();

        System.out.println("A Civilian also can only show the martians");
        civilian.showTheMartians();

        System.out.println("BONUS Exercise: Find the Lyric!");
    }
}
