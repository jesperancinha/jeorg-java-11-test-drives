package org.jesperancinha.java11.crums.crum3;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum3 {

    private class A {
        public A createA() {
            return new A();
        }

    }

    private class B extends A {
        public B createB() {
            return new B();
        }
    }

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 3 - Subclasses and upper classes");
        final A a = new Crum3().new A();
        final B b = new Crum3().new B();

        MAGENTA.printGenericLn("We create A -> %s", a);
        MAGENTA.printGenericLn("We create B -> %s", b);

        A a1 = a.createA();
        B b1 = b.createB();

        MAGENTA.printGenericLn("We create A1 from A -> %s which ia instance of %s", a1, a1.getClass());
        MAGENTA.printGenericLn("We create B1 from B -> %s", b1);

        try {
            b1 = (B) a1;
        } catch (ClassCastException e) {
            RED.printGenericLn("We cannot assign B1 to A1 -> %s", e);
        }

        a1 = b1;

        MAGENTA.printGenericLn("We can however assign A1 to B1 -> %s", a1);

        GREEN.printGenericLn("The upper in the class in the hierarchy you are the broader are the instances your reference can be assigned to.");
        GREEN.printGenericLn("Also notice that we had to create an instance of Crum3 in order to create the first instances of A and B");
    }
}
