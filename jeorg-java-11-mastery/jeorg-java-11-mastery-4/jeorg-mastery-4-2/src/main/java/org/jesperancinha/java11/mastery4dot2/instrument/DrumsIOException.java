package org.jesperancinha.java11.mastery4dot2.instrument;

public class DrumsIOException extends Exception {
    @Override
    public String getMessage() {
        return "Drums failed closing!";
    }
}
