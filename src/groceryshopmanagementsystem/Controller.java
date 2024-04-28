/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package groceryshopmanagementsystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    

    @SuppressWarnings("unused")
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    

    @FXML
    private void goBack(ActionEvent event) throws IOException {
        Parent previousRoot = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(previousRoot);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void close(){
        System.exit(0);
    }
  

    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
}
