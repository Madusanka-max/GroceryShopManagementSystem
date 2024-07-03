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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;
import java.io.IOException;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

//import groceryshopmanagementsystem.MouseEventHandler;



/**
 *
 * @author isuru
 */
public class Controller implements Initializable {
    
    //index ----------------------------------------------------------------------------------------

    @FXML
    private Button Home_Manager_btn;

    @FXML
    private Button Home_Cashier_btn;


    //Cashier login --------------------------------------------------------------------------------

    @FXML
    private PasswordField CashierLogin_password_textField;

    @FXML
    private Button CashierLogin_Login_btn;

    @FXML
    private TextField CashierLogin_Username_textField;

    //Manager login -------------------------------------------------------------------------------

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

    //Cashier --------------------------------------------------------------------------------------
    
     @FXML
    private Label Cashier_total_label;

    @FXML
    private TableColumn<?, ?> Cashier_table_Quantity;

    @FXML
    private TableColumn<?, ?> Cashier_table_Pname;

    @FXML
    private Button Cashier_Clear_btn;

    @FXML
    private Label Cashier_userName;

    @FXML
    private AnchorPane Cashier_Purchase;

    @FXML
    private Button Cashier_ADD_btn;

    @FXML
    private TableColumn<?, ?> Cashier_table_Price;

    @FXML
    private TableView<?> Cashier_table;

    @FXML
    private Button Cashier_Delete_btn;

    @FXML
    private TextField Cashier_Quantity_TextFeild;

    @FXML
    private TextField Cashier_Pid_TextFeild;

    @FXML
    private Button Cashier_Purchase_btn;

    @FXML
    private TableColumn<?, ?> Cashier_table_Bid;

    //Manager -----------------------------------------------------------------------------------

    @FXML
    private TableColumn<?, ?> Manager_AddProduct_table_Date;

    @FXML
    private TextField Manager_AddCashier_Lname_TextFeild;

    @FXML
    private Button Manager_AddProduct_Delete_btn;

    @FXML
    private TextField Manager_AddProduct_price_TextFeild;

    @FXML
    private TableView<?> Manager_AddProduct_table;

    @FXML
    private Label Manager_Dashbord_Monthlyincome;

    @FXML
    private Button Manager_AddProduct_Clear_btn;

    @FXML
    private Button Manager_Dashbord_btn;

    @FXML
    private TextField Manager_Product_search_TextFeild1;

    @FXML
    private Button Manager_AddCashier_Clear_btn;

    @FXML
    private TableColumn<?, ?> Manager_AddCashier_table_Fname;

    @FXML
    private Label Manager_Dashbord_Dailyincome;

    @FXML
    private TextField Manager_AddProduct_Pid_TextFeild;

    @FXML
    private TextField Manager_Employee_search_TextFeild2;

    @FXML
    private TableColumn<?, ?> Manager_AddCashier_table_gender;

    @FXML
    private TableColumn<?, ?> Manager_AddCashier_table_Date;

    @FXML
    private Button Manager_AddProduct_Update_btn;

    @FXML
    private AnchorPane Manager_Dashbord;

    @FXML
    private Button Manager_AddProduct_ADD_btn;

    @FXML
    private TableColumn<?, ?> Manager_AddCashier_table_Eid;

    @FXML
    private TextField Manager_AddCashier_Fname_TextFeild;

    @FXML
    private TextField Manager_AddCashier_password_TextFeild;

    @FXML
    private TextField Manager_AddCashier_Eid_TextFeild;

    @FXML
    private Button Manager_AddCashier_Update_btn;

    @FXML
    private TableColumn<?, ?> Manager_AddProduct_table_Bname;

    @FXML
    private TextField Manager_AddProduct_status_TextFeild;

    @FXML
    private TableColumn<?, ?> Manager_AddProduct_table_Pname;

    @FXML
    private TableColumn<?, ?> Manager_AddProduct_table_price1;

    @FXML
    private TextField Manager_AddProduct_Pname_TextFeild;

    @FXML
    private TableColumn<?, ?> Manager_AddProduct_table_status;

    @FXML
    private TableColumn<?, ?> Manager_AddCashier_table_Lname;

    @FXML
    private AnchorPane Manager_AddCashier;

    @FXML
    private TableView<?> Manager_AddCashier_table;

    @FXML
    private AnchorPane Manager_AddProduct;

    @FXML
    private TableColumn<?, ?> Manager_AddProduct_table_Pid;

    @FXML
    private Button Manager_AddCashier_btn;

    @FXML
    private Button Manager_AddProduct_btn;

    @FXML
    private Label Manager_userName;

    @FXML
    private Label Manager_Dashbord_Cashier_Num;

    @FXML
    private Button Manager_AddCashier_Delete_btn;

    @FXML
    private Button Manager_AddCashier_ADD_btn;

    @FXML
    private TextField Manager_AddCashier_gender_TextFeild;

    @FXML
    private TextField Manager_AddProduct_Bname_TextFeild;


    
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

//Manager switch Form
    public void switchForm (ActionEvent event) {
        if (event.getSource() == Manager_Dashbord_btn) {
            Manager_Dashbord.setVisible(true);
            Manager_AddCashier.setVisible (false);
            Manager_AddProduct.setVisible(false);

            Manager_Dashbord_btn.setStyle("-fx-background-color:linear-gradient (to top right, #ff0000, #e7b0b0)");
            Manager_AddCashier_btn.setStyle("-fx-background-color:transparent");
            Manager_AddProduct_btn.setStyle("-fx-background-color:transparent");
        }else if (event.getSource() == Manager_AddCashier_btn) {
            Manager_Dashbord.setVisible(false);
            Manager_AddCashier.setVisible (true);
            Manager_AddProduct.setVisible(false);

            Manager_Dashbord_btn.setStyle("-fx-background-color:transparent");
            Manager_AddCashier_btn.setStyle("-fx-background-color:linear-gradient (to top right, #ff0000, #e7b0b0)");
            Manager_AddProduct_btn.setStyle("-fx-background-color:transparent");
        }
        else if (event.getSource() == Manager_AddProduct_btn) {
            Manager_Dashbord.setVisible(false);
            Manager_AddCashier.setVisible (false);
            Manager_AddProduct.setVisible(true);

            Manager_Dashbord_btn.setStyle("-fx-background-color:transparent");
            Manager_AddCashier_btn.setStyle("-fx-background-color:transparent");
            Manager_AddProduct.setStyle("-fx-background-color:linear-gradient (to top right, #ff0000, #e7b0b0)");
        }
    }
    
//Manager 


    
//Database 

    private Connection connect;
    private ResultSet result;
    private PreparedStatement prepare;
    private double X=0;
    private double Y=0;

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

                    //drage
                    root.setOnMousePressed((MouseEvent event) ->{
                        X= event.getSceneX();
                        Y= event.getSceneY();
                    });
                    root.setOnMouseDragged ((MouseEvent event) ->{
                        stage.setX (event.getScreenX() - X);
                        stage.setY(event.getScreenY () - Y);
                        stage.setOpacity(.8);
                    });
                    root. setOnMouseReleased ( (MouseEvent event) ->{
                        stage.setOpacity(1);
                    });
                    stage.initStyle(StageStyle. TRANSPARENT) ;

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

                    //drage
                    root.setOnMousePressed((MouseEvent event) ->{
                        X= event.getSceneX();
                        Y= event.getSceneY();
                    });
                    root.setOnMouseDragged ((MouseEvent event) ->{
                        stage.setX (event.getScreenX() - X);
                        stage.setY(event.getScreenY () - Y);
                        stage.setOpacity(.8);
                    });
                    root. setOnMouseReleased ( (MouseEvent event) ->{
                        stage.setOpacity(1);
                    });
                    stage.initStyle(StageStyle. TRANSPARENT) ;

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
