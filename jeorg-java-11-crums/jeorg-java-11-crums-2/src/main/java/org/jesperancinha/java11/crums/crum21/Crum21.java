package org.jesperancinha.java11.crums.crum21;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.ORANGE;

public class Crum21 {

    private class A {

        int a;

        public A(int a) {
            ORANGE.printGenericLn("Created A");
            this.a = a;
        }

        @Override
        public String toString() {
            return "A{" + "a=" + a + '}';
        }
    }

    private class B extends A {
        long a;

        public B(long a) {
            super((int) a);
            ORANGE.printGenericLn("Created B");
            this.a = a;
        }

        @Override
        public String toString() {
            return "B{" + "a=" + a + '}';
        }
    }

    private class Flying {
        public A getA() {
            return new A(888);
        }
    }

    private class Bird extends Flying {

        @Override
        public B getA() {
            return new B(999);
        }
    }

    private class Plane extends Flying {

        @Override
        public A getA() {
            return new A(111);
        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 21 - Overriding return types");

        MAGENTA.printGenericLn("Revising again the overriding capabilities of Java");

        final Crum21 crum21 = new Crum21();
        final Bird bird = crum21.new Bird();
        final Plane plane = crum21.new Plane();
        final Flying flying = crum21.new Flying();

        final B b = bird.getA();
        final A a = plane.getA();
        final A a1 = flying.getA();

        MAGENTA.printGenericLn("We create a B from bird -> %s", b);
        MAGENTA.printGenericLn("We create an A from plane -> %s", a);
        MAGENTA.printGenericLn("We create an A from flying -> %s", a1);

        GREEN.printGenericLn("The principle is that the return type, if an an object, it must be of the same type or a subtype of the overriden type.");
        GREEN.printGenericLn("Overriding happens with the same type of parameters.");
        GREEN.printGenericLn("Always take into consideration the type erasure operation of java to determine if overriding of certain method is legal.");
    }
}
