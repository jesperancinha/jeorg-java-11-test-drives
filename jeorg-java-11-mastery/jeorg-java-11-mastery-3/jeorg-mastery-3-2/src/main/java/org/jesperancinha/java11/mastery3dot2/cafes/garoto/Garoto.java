package org.jesperancinha.java11.mastery3dot2.cafes.garoto;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

// There is no default constructor available in
// 'org.jesperancinha.java11.mastery3dot2.cafes.galao.Galao'
public class Garoto
//        extends Galao
{

    private final static String definition = "https://pt.wikipedia.org/wiki/Garoto_(caf%C3%A9)\nGaroto é uma bebida à base de café, muito comum em cafeterias portuguesas. Trata-se de uma combinação de uma dose de café forte com uma pequena quantidade de leite. Deve ser servido quente em uma xícara de café.[1]";

    // There is no default constructor available in
    // 'org.jesperancinha.java11.mastery3dot2.cafes.galao.Galao'
    Garoto() {
        YELLOW.printGenericLn("Garoto is served!");

        // 'Galao()' is not public in 'org.jesperancinha.java11.mastery3dot2.cafes.galao.Galao'.
        // Cannot be accessed from outside package
        // super();

    }

    public static Garoto create() {
        return new Garoto();
    }

    @Override
    public String toString() {
        return "Garoto{" +
                "definition='" + definition + '\'' +
                '}';
    }
}
