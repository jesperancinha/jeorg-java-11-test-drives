package org.jesperancinha.java11.crums.crum15;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.MAGENTA;

public class Crum15 {

    private int a;

    // Variable 'a' is already defined in the scope
    // private static int a;

    private static int b;

    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 15 - Coexistence of instance and static members");
        MAGENTA.printGenericLn("Note that we could not create a static member named a");
        final Crum15 crum15 = new Crum15();
        MAGENTA.printGenericLn("This is because we already have an instance member named  a=%s", crum15.a);
        MAGENTA.printGenericLn("And so  we have to name our static variable something else such as b=%s", b);

        MAGENTA.printGenericLn("The same is valid for methods:");
        MAGENTA.printGenericLn("This is because we already have an instance member named  a=%s", crum15.getA());
        MAGENTA.printGenericLn("And so  we have to name our static variable something else such as b=%s", crum15.getB());
        MAGENTA.printGenericLn("And so  we have to name our static variable something else such as b=%s", getB());

        GREEN.printGenericLn("Variable initialization is mandatory in local scopes");
        GREEN.printGenericLn("For instance and static scopes, we do not need to initialize them");
        GREEN.printGenericLn("Variables of the same name cannot coexist on the same class even if they are instance and static members");
        GREEN.printGenericLn("We always need to pay attention that static cannot access instance, but instance can access static");
    }

    public int getA() {
        return a;
    }

    public static int getB() {
        return b;
    }

    // 'getB()' is already defined in 'org.jesperancinha.java11.crums.crum15.Crum15'
    // public int getB() {
    //     return b;
    // }
}
