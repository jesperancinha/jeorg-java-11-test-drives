package org.jesperancinha.java11.inner.outer;

import org.jesperancinha.java11.inner.outer.canada.Dates;
import org.jesperancinha.java11.inner.outer.canada.PublicDates;

public class InnerOuterRunner {
    public static void main(String[] args) {

        SledgeHammer sledgeHammer = new SledgeHammer();
        SledgeHammer.FruitCake fruitCage = sledgeHammer.getFruitCake();

        System.out.println("//// Analysing our anonymous class of FruitCake");

        System.out.println(fruitCage);
        System.out.printf("Instance of  SledgeHammer.FruitCake? %s\n", fruitCage instanceof SledgeHammer.FruitCake);
        System.out.println(fruitCage.bake());
        System.out.println(fruitCage.getClass().getTypeName());

        var dates = new Dates();
        System.out.printf("//// Outside the package we cannot access number 1 hit dates %s\n", dates);

        var canadaDates = new CanadaDates();
        System.out.printf("//// However with a subclass we can access the protected member for Canada %s\n", canadaDates.getCanadaDate());

        // This doesn't work because we are outside the package and so only the subclass itself can access the protected member.
        // System.out.printf("However with a subclass we can access the protected member %s",canadaDates.canadaDate );

        var publicDates = new PublicDates();
        System.out.printf("//// Also, if we use a helper class within the package with a public method we can also access the date %s\n", publicDates.getProtectedDate());

        System.out.println("//// Creating CanadaDates using this");
        var dates2 = new CanadaDates("I kicked the habit");
        System.out.println(dates2.value);
        System.out.println("//// Creating CanadaDates using super");
        var dates3 = new CanadaDates("Shed my skin", " - This is the new stuff");
        System.out.println(dates3.value);

        System.out.println("//// Effectively final used in inner anonymous classes");
        sledgeHammer.letsTestInnerEffectivelyFinal();
    }
}
