package org.jesperancinha.java11.mastery4dot3.record;

import java.util.ArrayList;

public class AnimalCollectiveList extends ArrayList<String> {

    public boolean add(String s) {
        return super.add(s);
    }

    // 'add(E)' in 'java.util.ArrayList' clashes with 'add(Object)' in 'org.jesperancinha.java11.mastery4dot3.record.AnimalCollectiveList';
    // both methods have same erasure, yet neither overrides the other
    // public boolean add(Object s) {
    //     return false;
    // }

    @Override
    public String toString() {
        return super.toString();
    }
}
