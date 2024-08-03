/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package groceryshopmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.PromptData;
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


import groceryshopmanagementsystem.ProductData;
import groceryshopmanagementsystem.CashierData;
import groceryshopmanagementsystem.getData;
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
    private TextField Manager_AddCashier_Lname_TextFeild;

    @FXML
    private Button Manager_AddProduct_Delete_btn;

    @FXML
    private TextField Manager_AddProduct_price_TextFeild;

    @FXML
    private TableView<ProductData> Manager_AddProduct_table;

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
    private TableColumn<CashierData, String> Manager_AddCashier_table_Fname;

    @FXML
    private TableColumn<CashierData, String> Manager_AddCashier_table_Password;

    @FXML
    private Label Manager_Dashbord_Dailyincome;

    @FXML
    private TextField Manager_AddProduct_Pid_TextFeild;

    @FXML
    private TextField Manager_Employee_search_TextFeild2;

    @FXML
    private TableColumn<CashierData, String> Manager_AddCashier_table_gender;

    @FXML
    private Button Manager_AddProduct_Update_btn;

    @FXML
    private AnchorPane Manager_Dashbord;

    @FXML
    private Button Manager_AddProduct_ADD_btn;

    @FXML
    private TableColumn<CashierData, String> Manager_AddCashier_table_Eid;

    @FXML
    private TextField Manager_AddCashier_Fname_TextFeild;

    @FXML
    private TextField Manager_AddCashier_password_TextFeild;

    @FXML
    private TextField Manager_AddCashier_Eid_TextFeild;

    @FXML
    private Button Manager_AddCashier_Update_btn;

    @FXML
    private TableColumn<ProductData, String> Manager_AddProduct_table_Bname;

    @FXML
    private TextField Manager_AddProduct_status_TextFeild;

    @FXML
    private TableColumn<ProductData, String> Manager_AddProduct_table_Pname;

    @FXML
    private TableColumn<ProductData, Double> Manager_AddProduct_table_price1;

    @FXML
    private TextField Manager_AddProduct_Pname_TextFeild;

    @FXML
    private TableColumn<ProductData, String> Manager_AddProduct_table_status;

    @FXML
    private TableColumn<CashierData, String> Manager_AddCashier_table_Lname;

    @FXML
    private AnchorPane Manager_AddCashier;

    @FXML
    private TableView<CashierData> Manager_AddCashier_table;

    @FXML
    private AnchorPane Manager_AddProduct;

    @FXML
    private TableColumn<ProductData, String> Manager_AddProduct_table_Pid;

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

            displayUsername();
        }
        else if (event.getSource() == Manager_AddCashier_btn) {
            Manager_Dashbord.setVisible(false);
            Manager_AddCashier.setVisible (true);
            Manager_AddProduct.setVisible(false);

            CashiersShowData();
            displayUsername();
            CashiersSearch();
        }
        else if (event.getSource() == Manager_AddProduct_btn) {
            Manager_Dashbord.setVisible(false);
            Manager_AddCashier.setVisible (false);
            Manager_AddProduct.setVisible(true);

            addProductsShowData();
            displayUsername();
            addProductsSearch();
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





    
//Database 
    private Connection connect;
    private ResultSet result;
    private PreparedStatement prepare;
    private Statement statement;

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

                    getData.userName = ManagerLogin_Username_textField.getText();

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
        } catch (Exception e) {e.printStackTrace();}
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
                    Parent root = FXMLLoader.load(getClass().getResource("Cashier.fxml"));
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
        } catch (Exception e) {e.printStackTrace();}
    }

//Manager Add Product

//
    public void displayUsername(){
        Manager_userName.setText(getData.userName);
    }

//
    public void addProductsAdd(){
        String insertProduct = "INSERT INTO product"
        +" (ProductId,ProductName,BrandName,Price,Status)"
        +"VALUES(?,?,?,?,?)";
        connect = database.connectdb();
        try {
            if (Manager_AddProduct_Pid_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_Pname_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_status_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_price_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_Bname_TextFeild.getText().isEmpty() ) {
                showErrorAlert("Error Message","Please fill blank fields");}
            else{
                String check = "SELECT ProductId FROM product WHERE ProductId = '"
                        +Manager_AddProduct_Pid_TextFeild.getText()+"'";
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                if (result.next()) {
                    showErrorAlert("Error Message","Product Name: "+ Manager_AddProduct_Pname_TextFeild.getText() + " was already exist!" );
                }else{
                    prepare = connect.prepareStatement(insertProduct);

                    prepare.setString(1, Manager_AddProduct_Pid_TextFeild.getText());
                    prepare.setString(2, Manager_AddProduct_Pname_TextFeild.getText());
                    prepare.setString(3, Manager_AddProduct_Bname_TextFeild.getText());
                    prepare.setString(4, Manager_AddProduct_price_TextFeild.getText());
                    prepare.setString(5, Manager_AddProduct_status_TextFeild.getText());

                    prepare.executeUpdate();

                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();

                    addProductsShowData();
                    addProductsClear();

                }

            }
        } catch (Exception e) {e.printStackTrace();}
    }

//
    public void addProductsDelete(){
        String deleteProduct = "DELETE FROM product WHERE ProductId = '"+Manager_AddProduct_Pid_TextFeild.getText()+"'";
        connect = database.connectdb();
        try {
            if (Manager_AddProduct_Pid_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_Pname_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_status_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_price_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_Bname_TextFeild.getText().isEmpty() ) {
                showErrorAlert("Error Message","Please fill blank fields");}
            else{
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE ProductId: "+Manager_AddProduct_Pid_TextFeild.getText() + " ?");
                
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK)){
                    prepare = connect.prepareStatement(deleteProduct);
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                        
                    addProductsShowData();
                    addProductsClear();
                }else return;
            }
        } catch (Exception e) {e.printStackTrace();}
    } 

//
public void addPorductsUpdate(){ 
    String updateProduct = "UPDATE product SET BrandName = '"
    +Manager_AddProduct_Bname_TextFeild.getText()+"',ProductName = '"
    +Manager_AddProduct_Pname_TextFeild.getText()+"',status = '"
    +Manager_AddProduct_status_TextFeild.getText()+"',Price = '"
    +Manager_AddProduct_price_TextFeild.getText()+"'WHERE ProductId = '"
    +Manager_AddProduct_Pid_TextFeild.getText()+"'";

    connect = database.connectdb();

    try {
        if (Manager_AddProduct_Pid_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_Pname_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_status_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_price_TextFeild.getText().isEmpty() 
            || Manager_AddProduct_Bname_TextFeild.getText().isEmpty() ) {
            showErrorAlert("Error Message","Please fill blank fields");}
            else{
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE ProductId: "+Manager_AddProduct_Pid_TextFeild.getText() + " ?");
                
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(updateProduct);
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    addProductsShowData();
                    addProductsClear();
                }else return;
            }
    } catch (Exception e) {e.printStackTrace();}
}

//
    public void addProductsClear(){
        Manager_AddProduct_Pid_TextFeild.setText("");
        Manager_AddProduct_Pname_TextFeild.setText("");
        Manager_AddProduct_Bname_TextFeild.setText("");
        Manager_AddProduct_status_TextFeild.setText("");
        Manager_AddProduct_price_TextFeild.setText("");
    }

//
    public ObservableList<ProductData> addPorductListData(){
        ObservableList<ProductData> prodList = FXCollections.observableArrayList();
        String sql = "select * From product";
        connect = database.connectdb();
        try {
            ProductData prod;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()) {
                prod = new ProductData(result.getString("ProductId")
                ,result.getString("ProductName")
                ,result.getString("BrandName")
                ,result.getDouble("Price")
                ,result.getInt("Status"));
                prodList.add(prod);
            }
        } catch (Exception e) {e.printStackTrace();}
        return prodList;
    }

    
    private ObservableList<ProductData> addProductsList;
//
    public void addProductsShowData(){
        addProductsList = addPorductListData();

        Manager_AddProduct_table_Pid.setCellValueFactory(new PropertyValueFactory<>("ProductId"));
        Manager_AddProduct_table_Bname.setCellValueFactory(new PropertyValueFactory<>("BrandName"));
        Manager_AddProduct_table_Pname.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        Manager_AddProduct_table_status.setCellValueFactory(new PropertyValueFactory<>("Status"));
        Manager_AddProduct_table_price1.setCellValueFactory(new PropertyValueFactory<>("Price"));
        
        Manager_AddProduct_table.setItems(addProductsList);
    }
//
    public void addProductsSelect () {
        ProductData prod = Manager_AddProduct_table.getSelectionModel ().getSelectedItem();
        int num = Manager_AddProduct_table.getSelectionModel ().getSelectedIndex();
        if((num-1) <- 1) {
            return;
        }
        Manager_AddProduct_Pid_TextFeild.setText (prod.getProductId());
        Manager_AddProduct_Bname_TextFeild.setText(prod.getBrandName());
        Manager_AddProduct_Pname_TextFeild.setText(prod.getProductName()) ;
        Manager_AddProduct_price_TextFeild.setText(String.valueOf(prod.getPrice()));
        Manager_AddProduct_status_TextFeild.setText(String.valueOf(prod.getStatus()));
        }

//
public void addProductsSearch() {
    FilteredList<ProductData> filter = new FilteredList<>(addProductsList, e -> true);

    Manager_Product_search_TextFeild1.textProperty().addListener((observable, oldValue, newValue) -> {
        filter.setPredicate(predicateProductData -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }
            String searchKey = newValue.toLowerCase();

            if (String.valueOf(predicateProductData.getProductId()).toLowerCase().contains(searchKey)) {
                return true;
            } else if (predicateProductData.getBrandName().toLowerCase().contains(searchKey)) {
                return true;
            } else if (String.valueOf(predicateProductData.getStatus()).contains(searchKey)) {
                return true;
            } else if (predicateProductData.getProductName().toLowerCase().contains(searchKey)) {
                return true;
            } else if (String.valueOf(predicateProductData.getPrice()).toLowerCase().contains(searchKey)) {
                return true;
            } else {
                return false;
            }
        });
    });

    SortedList<ProductData> sortList = new SortedList<>(filter);
    sortList.comparatorProperty().bind(Manager_AddProduct_table.comparatorProperty());
    Manager_AddProduct_table.setItems(sortList);
}


// Manager add cashier

//
    public void CashiersAdd(){
        String insertCashier = "INSERT INTO cashier"
        +" (userName,Password,Lname,Gender,Fname)"
        +"VALUES(?,?,?,?,?)";
        connect = database.connectdb();
        try {
            if (Manager_AddCashier_Eid_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_Fname_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_gender_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_password_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_Lname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message","Please fill blank fields");}
            else{
                String check = "SELECT userName FROM cashier WHERE userName = '"
                        +Manager_AddProduct_Pid_TextFeild.getText()+"'";
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                if (result.next()) {
                    showErrorAlert("Error Message","userName: "+ Manager_AddCashier_Eid_TextFeild.getText() + " was already exist!" );
                }else{
                    prepare = connect.prepareStatement(insertCashier);

                    prepare.setString(1, Manager_AddCashier_Eid_TextFeild.getText());
                    prepare.setString(2, Manager_AddCashier_Fname_TextFeild.getText());
                    prepare.setString(3, Manager_AddCashier_gender_TextFeild.getText());
                    prepare.setString(4, Manager_AddCashier_password_TextFeild.getText());
                    prepare.setString(5, Manager_AddCashier_Lname_TextFeild.getText());

                    prepare.executeUpdate();

                    Alert alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Added!");
                    alert.showAndWait();

                    CashiersShowData();
                    CashiersClear();

                }

            }
        } catch (Exception e) {e.printStackTrace();}
    }

//
    public void CashiersDelete(){
        String deleteCashier = "DELETE FROM cashier WHERE userName = '"+Manager_AddCashier_Eid_TextFeild.getText()+"'";
        connect = database.connectdb();
        try {
            if (Manager_AddCashier_Eid_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_Fname_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_gender_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_password_TextFeild.getText().isEmpty() 
            || Manager_AddCashier_Lname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message","Please fill blank fields");}
            else{
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE Cashier: "+Manager_AddCashier_Eid_TextFeild.getText() + " ?");
                
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK)){
                    prepare = connect.prepareStatement(deleteCashier);
                    prepare.executeUpdate();
                    
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();
                        
                    CashiersShowData();
                    CashiersClear();
                }else return;
            }
        } catch (Exception e) {e.printStackTrace();}
    } 

//
public void CashiersUpdate(){ 
    String updateCashier = "UPDATE cashier SET Password = '"
    +Manager_AddCashier_password_TextFeild.getText()+"',Lname = '"
    +Manager_AddCashier_Lname_TextFeild.getText()+"',Fname = '"
    +Manager_AddCashier_Fname_TextFeild.getText()+"',Gender = '"
    +Manager_AddCashier_gender_TextFeild.getText()+"'WHERE userName = '"
    +Manager_AddProduct_Pid_TextFeild.getText()+"'";

    connect = database.connectdb();

    try {
        if (Manager_AddCashier_Eid_TextFeild.getText().isEmpty() 
        || Manager_AddCashier_Fname_TextFeild.getText().isEmpty() 
        || Manager_AddCashier_gender_TextFeild.getText().isEmpty() 
        || Manager_AddCashier_password_TextFeild.getText().isEmpty() 
        || Manager_AddCashier_Lname_TextFeild.getText().isEmpty()) {
            showErrorAlert("Error Message","Please fill blank fields");}
            else{
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE ProductId: "+Manager_AddCashier_Eid_TextFeild.getText() + " ?");
                
                Optional<ButtonType> option = alert.showAndWait();
                if(option.get().equals(ButtonType.OK)){
                    statement = connect.createStatement();
                    statement.executeUpdate(updateCashier);
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    CashiersShowData();
                    CashiersClear();
                }else return;
            }
    } catch (Exception e) {e.printStackTrace();}
}

//
    public void CashiersClear(){
        Manager_AddCashier_Eid_TextFeild.setText("");
        Manager_AddCashier_Fname_TextFeild.setText(""); 
        Manager_AddCashier_gender_TextFeild.setText(""); 
        Manager_AddCashier_password_TextFeild.setText(""); 
        Manager_AddCashier_Lname_TextFeild.setText("");
    }

//
    public ObservableList<CashierData> CashierListData(){
        ObservableList<CashierData> CData = FXCollections.observableArrayList();
        String sql = "select * From cashier";
        connect = database.connectdb();
        try {
            CashierData CashierD;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()) {
                CashierD = new CashierData(result.getString("Password")
                ,result.getString("Lname")
                ,result.getString("Fname")
                ,result.getString("userName")
                ,result.getString("Gender"));
                CData.add(CashierD);
            }
        } catch (Exception e) {e.printStackTrace();}
        return CData;
    }

    private ObservableList<CashierData> CashierList;
//
    public void CashiersShowData(){
        CashierList = CashierListData();

        Manager_AddCashier_table_Eid.setCellValueFactory(new PropertyValueFactory<>("userName"));
        Manager_AddCashier_table_Fname.setCellValueFactory(new PropertyValueFactory<>("Fname"));
        Manager_AddCashier_table_Lname.setCellValueFactory(new PropertyValueFactory<>("Lname"));
        Manager_AddCashier_table_gender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        
        Manager_AddCashier_table.setItems(CashierList);
    }
//
    public void CashiersSelect () {
        CashierData CData = Manager_AddCashier_table.getSelectionModel().getSelectedItem();
        int num = Manager_AddCashier_table.getSelectionModel ().getSelectedIndex();
        if((num-1) <- 1) {
            return;
        }
        Manager_AddCashier_Eid_TextFeild.setText (CData.userName());
        Manager_AddCashier_Fname_TextFeild.setText(CData.Fname());
        Manager_AddCashier_gender_TextFeild.setText(CData.Gender()) ;
        Manager_AddCashier_password_TextFeild.setText(String.valueOf(CData.Password()));
        Manager_AddCashier_Lname_TextFeild.setText(String.valueOf(CData.Lname()));
        }

//
public void CashiersSearch() {
    FilteredList<CashierData> filter = new FilteredList<>(CashierList, e -> true);

    Manager_Employee_search_TextFeild2.textProperty().addListener((observable, oldValue, newValue) -> {
        filter.setPredicate(predicateCashieData -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }
            String searchKey = newValue.toLowerCase();

            if (String.valueOf(predicateCashieData.userName()).toLowerCase().contains(searchKey)) {
                return true;
            } else if (predicateCashieData.Fname().toLowerCase().contains(searchKey)) {
                return true;
            } else if (predicateCashieData.Gender().toLowerCase().contains(searchKey)) {
                return true;
            } else if (predicateCashieData.Lname().toLowerCase().contains(searchKey)) {
                return true;
            } else {
                return false;
            }
        });
    });

    SortedList<CashierData> sortList = new SortedList<>(filter);
    sortList.comparatorProperty().bind(Manager_AddCashier_table.comparatorProperty());
    Manager_AddCashier_table.setItems(sortList);
}

//Cashier add bill

public void displayCashierId(){
    Cashier_userName.setText(getData.userName);

}


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    
}
