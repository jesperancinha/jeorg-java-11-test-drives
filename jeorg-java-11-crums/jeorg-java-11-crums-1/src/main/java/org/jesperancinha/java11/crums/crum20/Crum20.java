package org.jesperancinha.java11.crums.crum20;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;

import java.sql.DriverManager;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum20 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 20 - Working with databases");
        try {
            final var conn = DriverManager.
                    getConnection("jdbc:h2:mem:", "sa", "");
            ConsolerizerComposer.out(" ")
                    .magenta("Connection data: Product Name ->")
                    .orange("%s", conn.getMetaData().getDatabaseProductName())
                    .magenta(", Catalogue Name ->")
                    .orange("%s", conn.getCatalog())
                    .toConsoleLn();
            ConsolerizerComposer.out(" ")
                    .magenta("Auto-Commit setting:")
                    .orange("" + conn.getAutoCommit())
                    .toConsoleLn();
            conn.close();
        } catch (Exception e) {
            RED.printThrowableAndExit(e);
        }
    }
}
