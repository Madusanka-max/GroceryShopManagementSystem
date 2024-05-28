package groceryshopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;

public class database {
        // Establish database connection
        public static Connection connectdb() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/gsms","root","");
                return connect;
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
        }    
}

