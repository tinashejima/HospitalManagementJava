package hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class conn {

    Connection connection;
    Statement statement;

    public conn() {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://172.17.0.2:3306/hospital_management_system";
            String user = "root";
            String pass = "root";

            connection = DriverManager.getConnection(url, user, pass);

            if (connection != null) {
                statement = connection.createStatement();
                System.out.println("Successfully connected to the database.");
            } else {
                System.out.println("Failed to connect to the database.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

