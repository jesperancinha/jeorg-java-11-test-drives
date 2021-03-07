package org.jesperancinha.java11.mastery4dot1.supreme;

public class SupremeCourtArchive {
    private final Case courtCase;

    public SupremeCourtArchive(String courtCase) {
        this.courtCase = new Case(courtCase);
    }

    public String getCourtCaseDescription() {
        // return courtCase.courtCase;
        return "!!!CLASSIFIED!!!";
    }
}
