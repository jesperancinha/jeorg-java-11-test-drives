package org.jesperancinha.java11.crums.crum38;

import org.jesperancinha.console.consolerizer.console.ConsolerizerComposer;

import java.sql.Connection;
import java.sql.DriverManager;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

/**
 * Remember that autocommit is always true by default
 * In this case we are loading the driver, which we don't need to.
 */
public class Crum38 {
    public static void main(String[] args) {
        try {
            BLUE.printGenericTitleLn("Crum 38 - Working with databases. We can also load the driver");
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.
                    getConnection("jdbc:h2:mem:", "sa", "");
            ConsolerizerComposer.out(" ")
                    .magenta("Connection data: Product Name ->")
                    .orange("%s", conn.getMetaData().getDatabaseProductName())
                    .magenta(", Catalogue Name ->")
                    .orange("%s", conn.getCatalog())
                    .toConsoleLn();
            ConsolerizerComposer.out(" ")
                    .magenta("Auto-Commit setting:")
                    .orange(conn.getAutoCommit())
                    .toConsoleLn();
            conn.close();
        } catch (Exception e) {
            RED.printThrowableAndExit(e);
        }
    }
}
