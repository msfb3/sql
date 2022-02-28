package de.breitling;

import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection =(Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/chinook", "root", "");

            System.out.println("Connection established.");
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM customer LIMIT 10");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + ""  + rs.getString("Company"));
            }
            connection.close();

        }catch (SQLException sqlEx) {
            System.out.println("Something went wrong while establishing the Connection " + sqlEx.getMessage());
        }

    }
}
