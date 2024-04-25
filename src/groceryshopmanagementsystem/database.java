package groceryshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database {

    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/your_database_name";
        String username = "your_username";
        String password = "your_password";

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

		// Create a statement
		try ( // Open a connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/GSMS","root","" )) {
			
			// Create a statement
			Statement state = con.createStatement();
			// Print connected message
			System.out.println("Connected to the database");
			// Close the connection
		}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




