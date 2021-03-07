package org.jesperancinha.java11.catching.crows;

public class SuperSickCrowExcetion extends SickCrowException {

    @Override
    public String getMessage() {
        return "This crow needs to go to the emergency room!";
    }
}
