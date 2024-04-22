/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package groceryshopmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 *
 * @author isuru
 */
public class Controller implements Initializable {
    
    //index
    @FXML
    private Button Home_Manager_btn;

    @FXML
    private Button Home_Cashier_btn;


    //Cashier
    @FXML
    private PasswordField CashierLogin_password_textField;

    @FXML
    private Button CashierLogin_Login_btn;

    @FXML
    private TextField CashierLogin_Username_textField;

    //Manager
    @FXML
    private Button ManagerLogin_Login_btn;

    @FXML
    private TextField ManagerLogin_Username_textField;

    @FXML
    private Button close_btn;

    @FXML
    private Button back_btn;

    @FXML
    private PasswordField ManagerLogin_password_textField;
    
    public void close(){
        System.exit(0);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
