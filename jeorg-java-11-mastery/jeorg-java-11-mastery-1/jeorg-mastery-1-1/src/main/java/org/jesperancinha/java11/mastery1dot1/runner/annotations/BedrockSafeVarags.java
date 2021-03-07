package org.jesperancinha.java11.mastery1dot1.runner.annotations;

import java.util.List;

// @SafeVarargs
public class BedrockSafeVarags {

    @SafeVarargs
    public BedrockSafeVarags(
//            @SafeVarargs
            int b, String... c) {

    }

    @SafeVarargs
    public final String getAString(final List... a) {
        return a.toString();
    }

}
