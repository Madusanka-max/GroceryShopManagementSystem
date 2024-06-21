/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package groceryshopmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import groceryshopmanagementsystem.GroceryShopManagementSystem.MouseEventHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.Node;


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
    
    //Going to ManagerLogin
    @FXML
    private void goToManagerLogin(ActionEvent event) {
        // Handle navigation to manager login screen
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ManagerLogin.fxml"));
            Parent root = loader.load();
            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Going to CashierLogin
    @FXML
    private void goToCashierLogin(ActionEvent event) {
        // Handle navigation to cashier login screen
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CashierLogin.fxml"));
            Parent root = loader.load();
            // Get the stage from the event source
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Database 

    private Connection connect;
    private ResultSet result;
    private PreparedStatement prepare;
    //Manager Login Database
    public void managerlogin(){
        String managerData = "SELECT * FROM manager WHERE username=? and Password=?";
        connect = database.connectdb();
        try {
            //check textfilds are empty or not
            if (ManagerLogin_Username_textField.getText().isEmpty() || ManagerLogin_password_textField.getText().isEmpty()) {
                showErrorAlert("Error Message","Please Fill all Fields");
            }else{
                prepare = connect.prepareStatement(managerData);
                prepare.setString(1, ManagerLogin_Username_textField.getText());
                prepare.setString(2, ManagerLogin_password_textField.getText());
                result = prepare.executeQuery();
                if (result.next()) {
                    showErrorAlert("Success Message","Successfully Login!");
                    ManagerLogin_Login_btn.getScene().getWindow().hide();
                    // Handle navigation to cashier Dashbord screen
                    Parent root = FXMLLoader.load(getClass().getResource("Manager.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene (root);
                    stage.setScene(scene);
                    stage.show();
                }else{
                    showErrorAlert("Error Message","Wrong Username or Password");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Cashier Login Database 
    public void Cashierlogin(){
        String cashierData = "SELECT * FROM cashier WHERE username=? and Password=?";
        connect = database.connectdb();

        try {
            //check textfilds are empty or not
            if (CashierLogin_Username_textField.getText().isEmpty() || CashierLogin_password_textField.getText().isEmpty()) {
                showErrorAlert("Error Message","Please Fill all Fields");
            }else{
                prepare = connect.prepareStatement(cashierData);
                prepare.setString(1, CashierLogin_Username_textField.getText());
                prepare.setString(2, CashierLogin_password_textField.getText());
                result = prepare.executeQuery();
                if (result.next()) {
                    showErrorAlert("Success Message","Successfully Login!");
                    // HIDE CashierLogin Login WINDOW
                    CashierLogin_Login_btn.getScene().getWindow().hide();
                    // Handle navigation to cashier Dashbord screen
                    Parent root = FXMLLoader.load(getClass().getResource("CashierDasbord.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene (root);
                    stage.setScene(scene);
                    stage.show();
                }else{
                    showErrorAlert("Error Message","Wrong Username or Password");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Alert method
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
    //GoingBack Button method 
    @FXML
    private void goBack(ActionEvent event) throws IOException {
        Parent previousRoot = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(previousRoot);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    //Close Button method
    @FXML
    public void close(){
        System.exit(0);
    }
  



    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
}
