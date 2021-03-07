package org.jesperancinha.java11.mastery1dot1.runner.annotations;

@SuppressWarnings("unchecked")
public class BedrockSuppressWarnings {

    @SuppressWarnings("removalp")
    private int b;

    @SuppressWarnings("unchecked")
    public BedrockSuppressWarnings() {

    }

    @Override
    @SuppressWarnings("deprecation")
    public String toString() {
        return super.toString();
    }

    @SuppressWarnings("deprecation")
    public void annotationTesting(
            @SuppressWarnings("removal")
            final String sring,
            @SuppressWarnings("unchecked")
            final int integer) {

        @SuppressWarnings("removal")
        int b;

    }
}
