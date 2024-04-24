/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package groceryshopmanagementsystem;

/**
 *
 * @author isuru
 */
public class Database {

    public static Connection connectDb() {

try{
Class.forName("com.mysql.jdbc.Driver");

Connection connect = DriverManager.getConnection(string, prprts);
}catch (Exception e) {e.printStackTrace (); }

}
    
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
