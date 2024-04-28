package groceryshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/DBMS";
        String username = "root";
        String password = "";

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

		// Create a statement
		try ( // Open a connection
			Connection con = DriverManager.getConnection(dbURL, username, password)) {
			// Create a statement
			@SuppressWarnings("unused")
            Statement state = con.createStatement();
			// Print connected message
			System.out.println("Connected to the database");
			// Close the connection
			database.setConnection(con);
		}
        } catch (Exception e) {e.printStackTrace();}
    }

    
	public static boolean checkLogin(String username, String password) {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection con = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

            return resultSet.next();

        } catch (SQLException e) {
            System.out.println("Error logging in: " + e.getMessage());
            return false;
        }
    }

	public static Connection getConnection() {
	    return database.getConnection();
	}

	private static Connection connection;

	public static void setConnection(Connection con) {
	    database.connection = con;
	}
}
