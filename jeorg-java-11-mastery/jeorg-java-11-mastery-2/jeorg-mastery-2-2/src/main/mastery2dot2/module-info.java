module $mastery22$ {
    // 6. Conflicting exports in modularization
    // Duplicate 'exports': org.jesperancinha.java11.mastery2dot2
    // exports org.jesperancinha.java11.mastery2dot2;
    exports org.jesperancinha.java11.mastery2dot2 to org.jesperancinha.java11.master2dot2.module;
    requires transitive org.assertj.core;
    requires consolerizer;
    requires java.sql;
}