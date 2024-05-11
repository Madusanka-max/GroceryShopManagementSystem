package groceryshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database {
    
    

        // Establish database connection
        public static Connection connectdb() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/DBMS","root","");
                return connect;
            } catch (Exception e) {
                e.printStackTrace();
            }

        return null;
        }

    // Check login credentials for manager
    public static boolean checkManagerLogin(String username, String password) {
        String query = "SELECT * FROM manager WHERE username = ? AND password = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error logging in: " + e.getMessage());
            return false;
        }
    }

    // Check login credentials for cashier
    public static boolean checkCashierLogin(String username, String password) {
        String query = "SELECT * FROM cashier WHERE username = ? AND password = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            System.out.println("Error logging in: " + e.getMessage());
            return false;
        }
    }

    // Close database connection
    public static void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Database connection closed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

