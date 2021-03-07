package org.jesperancinha.java11.crums.crum8;

import org.h2.jdbc.JdbcSQLDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.BLUE;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.GREEN;
import static org.jesperancinha.console.consolerizer.common.ConsolerizerColor.RED;

public class Crum8 {
    public static void main(String[] args) {
        BLUE.printGenericTitleLn("Crum 8 - Falling out of indexes in prepared statements");

        final String query = "Select  * from PAINTING where AUTHOR = ?";

        try (final Connection connection = DriverManager.getConnection("jdbc:h2:mem:", "sa", "")) {
            final PreparedStatement preparedStatement = connection.prepareStatement(
                    "CREATE TABLE PAINTING (" + "ID INT AUTO_INCREMENT, AUTHOR VARCHAR(500))");
            preparedStatement.executeUpdate();
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(0, "Favourite Author");

        } catch (JdbcSQLDataException e) {
            RED.printGenericLn("The specific exception is a JdbcSQLDataException which is also a SQLException. Note that Data is not in the name of the base class");
            RED.printGenericLn("Index 0 and bellow will not work. Prepared statements only work with 1 based indexes -> %s", e);
        } catch (SQLException throwables) {
            RED.printThrowableAndExit(throwables);
        }
        GREEN.printGenericLn("Generally speaking we get a SQLException if something goes wrong with the database");
        GREEN.printGenericLn("In our specific case the most specific Exception we get is a JdbcSQLDataException");
    }
}
