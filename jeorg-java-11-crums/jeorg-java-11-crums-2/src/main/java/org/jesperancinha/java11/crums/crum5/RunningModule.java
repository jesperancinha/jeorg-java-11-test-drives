package org.jesperancinha.java11.crums.crum5;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;
import static org.jesperancinha.java11.crums.crum5.Type.B;

interface ISubTypeA {
    Type getA();

    Type getCloneA() throws Exception;
}

enum SubTypeA implements ISubTypeA {
    AA,
    AB;

    private final Type A = Type.A;

    public Type getA() {
        return A;
    }

    public Type getCloneA() {
        try {
            return (Type) clone();
        } catch (CloneNotSupportedException e) {
            RED.printGenericLn("An enum is not cloneable. Remember that these are static values -> %s", e);
        }
        return null;
    }
}

enum Type {
    A,
    B,
    C,
    D
}

class RunningModule {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 5 - Using enums");

        final Type a = Type.A;
        final Type b = B;

        MAGENTA.printGenericLn("We create reference for type A -> %s", a);
        MAGENTA.printGenericLn("Then the reference for type B -> %s", b);

        MAGENTA.printGenericLn("We can also create types which contain others");
        MAGENTA.printGenericLn("We create a SubTypeA -> %s", SubTypeA.AA);
        MAGENTA.printGenericLn("We can also create another SubTypeA -> %s", SubTypeA.AB);
        MAGENTA.printGenericLn("We know that any SubTypeA contains a reference to a static A member -> %s", SubTypeA.AB.getA());
        MAGENTA.printGenericLn("Using an interface we get the same -> %s", ((ISubTypeA) (SubTypeA.AB)).getA());

        MAGENTA.printGenericLn("We can also use instances to access types in the same way -> %s", new RunningModule().getType());

        GREEN.printGenericLn("What we see is that enums are full of surprised");
        GREEN.printGenericLn("An enum is final and cannot be extended");
        final Type cloneA = SubTypeA.AB.getCloneA();
        GREEN.printGenericLn("We can also not clone it");
        GREEN.printGenericLn("Note that static imports work, however, if they are not present, we have to use he main enum type to start to reference our enum value");
    }

    public Type getType() {
        final Type a = Type.A;
        return a;
    }
}
