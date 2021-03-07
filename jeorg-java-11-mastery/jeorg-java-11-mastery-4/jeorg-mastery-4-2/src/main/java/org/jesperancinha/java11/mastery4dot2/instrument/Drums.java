package org.jesperancinha.java11.mastery4dot2.instrument;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public final class Drums implements AutoCloseable {

    public Drums() {
        GREEN.printGenericLn("🥁 ¡Drums created! 🥁");
    }

    public final void playDrum() {
        GREEN.printGeneric("Playing drums");
    }

    public final void playWrongDrum() throws DrumException {
        RED.printGenericLn("Oh no! I think I hit the wrong drum!");
        throw new DrumException();
    }

    @Override
    public final void close() throws DrumsIOException {
        GREEN.printGeneric("Keep playing and let the rhythm guide you! João Esperancinha");
        throw new DrumsIOException();
    }
}
