package org.jesperancinha.java11.mastery4dot1.supreme;

public class SupremeCourt {

    private final Case courtCase;

    public SupremeCourt(String courtCase) {
        this.courtCase = new Case(courtCase);
    }

    public class Case {
        private final String courtCase;

        public Case(String courtCase) {
            this.courtCase = courtCase;
        }
    }

    public String getCourtCaseDescription() {
        return courtCase.courtCase;
    }
}
