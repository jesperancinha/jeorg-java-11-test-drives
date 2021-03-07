package org.jesperancinha.java11.catching.crows;

public class SickCrowException extends CrowException {

    @Override
    public String getMessage() {
        return "This crow is sick";
    }
}
