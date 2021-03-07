package org.jesperancinha.java11.mastery3dot2.cafes.galao;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.YELLOW;

public class Galao {

    private final static String definition = "https://pt.wikipedia.org/wiki/Gal%C3%A3o_(caf%C3%A9)\nGalão é uma bebida quente de Portugal feita de café expresso e espuma de leite. Ao todo semelhante à meia de leite, vem num copo alto com cerca de 1/4 do café, 3/4 espuma de leite, ao contrário do Garoto (café), mais pequeno, que é servido em uma demitasse / espresso pequena xícara de porcelana. Quando a proporção é de 1:1 é chamada de \"meia de leite\" (metade do leite) e vem numa chávena grande. Pode ser considerado como uma cortado (café), mas com uma quantidade muito maior de leite, as proporções são mais perto de um café com leite.[1]";

    Galao() {
        YELLOW.printGenericLn("Galão is served!");
    }

    public static Galao create() {
        return new Galao();
    }

    @Override
    public String toString() {
        return "Galao{" +
                "definition='" + definition + '\'' +
                '}';
    }
}
