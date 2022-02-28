package de.breitling;

import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection =(Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/chinook", "root", "");

            System.out.println("Connection established.");

        }catch (SQLException sqlEx) {
            System.out.println("Something went wrong while establishing the Connection " + sqlEx.getMessage());
        }

    }
}
