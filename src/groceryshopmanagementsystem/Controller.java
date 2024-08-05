/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package groceryshopmanagementsystem;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashMap;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Spliterator;

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
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.web.PromptData;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.KeyEvent;
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

    // index
    // ----------------------------------------------------------------------------------------

    @FXML
    private Button Home_Manager_btn;

    @FXML
    private Button Home_Cashier_btn;

    // Cashier login
    // --------------------------------------------------------------------------------

    @FXML
    private PasswordField CashierLogin_password_textField;

    @FXML
    private Button CashierLogin_Login_btn;

    @FXML
    private TextField CashierLogin_Username_textField;

    // Manager login
    // -------------------------------------------------------------------------------

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

    // Cashier
    // --------------------------------------------------------------------------------------

    @FXML
    private AreaChart<String, Integer> dashboardChart;

    @FXML
    private AnchorPane Cashier_Purchase1;

    @FXML
    private Label Cashier_total_label;

    @FXML
    private TableColumn<billData, Integer> Cashier_table_Quantity;

    @FXML
    private TableColumn<billData, String> Cashier_table_Pname;

    @FXML
    private Button Cashier_Print_btn;

    @FXML
    private Label Cashier_userName;

    @FXML
    private AnchorPane Cashier_Purchase;

    @FXML
    private Button Cashier_ADD_btn;

    @FXML
    private TableColumn<billData, Double> Cashier_table_Price;

    @FXML
    private TableView<billData> Cashier_table;

    @FXML
    private Button Cashier_Delete_btn;

    @FXML
    private TextField Cashier_Quantity_TextFeild;

    @FXML
    private TextField Cashier_Pid_TextFeild;

    @FXML
    private Button Cashier_Purchase_btn;

    @FXML
    private TableColumn<billData, String> Cashier_table_Bid;

    // Manager
    // -----------------------------------------------------------------------------------

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

    // Going to ManagerLogin
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

    // Going to CashierLogin
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
            displayCashierId();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Manager switch Form
    public void switchForm(ActionEvent event) {
        if (event.getSource() == Manager_Dashbord_btn) {
            Manager_Dashbord.setVisible(true);
            Manager_AddCashier.setVisible(false);
            Manager_AddProduct.setVisible(false);

            dashboardDisplayChart();
            dashboardTotalIncome();
            dashboardDisplayIncomeToday();
            dashboardDisplayActiveEmployees();
            displayUsername();
        } else if (event.getSource() == Manager_AddCashier_btn) {
            Manager_Dashbord.setVisible(false);
            Manager_AddCashier.setVisible(true);
            Manager_AddProduct.setVisible(false);

            CashiersShowData();
            displayUsername();
            CashiersSearch();
        } else if (event.getSource() == Manager_AddProduct_btn) {
            Manager_Dashbord.setVisible(false);
            Manager_AddCashier.setVisible(false);
            Manager_AddProduct.setVisible(true);

            addProductsShowData();
            displayUsername();
            addProductsSearch();
        }
    }

    // Cashier switch Form
    public void CashierswitchForm(ActionEvent event) {
        if (event.getSource() == Cashier_Purchase_btn) {

            Cashier_Purchase.setVisible(true);

            displayCashierId();
        }
    }

    // Alert error method
    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Display information alerts
    private void showInformationAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // GoingBack Button method
    @FXML
    private void goBack(ActionEvent event) throws IOException {
        Parent previousRoot = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(previousRoot);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Close Button method
    @FXML
    public void close() {
        System.exit(0);
    }

    // Database
    private Connection connect;
    private ResultSet result;
    private PreparedStatement prepare;
    private Statement statement;

    private double X = 0;
    private double Y = 0;

    // Manager Login Database
    public void managerlogin() {
        String managerData = "SELECT * FROM manager WHERE username=? and Password=?";
        connect = database.connectdb();
        try {
            // check textfilds are empty or not
            if (ManagerLogin_Username_textField.getText().isEmpty()
                    || ManagerLogin_password_textField.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please Fill all Fields");
            } else {
                prepare = connect.prepareStatement(managerData);
                prepare.setString(1, ManagerLogin_Username_textField.getText());
                prepare.setString(2, ManagerLogin_password_textField.getText());
                result = prepare.executeQuery();
                if (result.next()) {

                    getData.userName = ManagerLogin_Username_textField.getText();

                    showInformationAlert("Success Message", "Successfully Login!");
                    ManagerLogin_Login_btn.getScene().getWindow().hide();
                    // Handle navigation to cashier Dashbord screen
                    Parent root = FXMLLoader.load(getClass().getResource("Manager.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);

                    // drage
                    root.setOnMousePressed((MouseEvent event) -> {
                        X = event.getSceneX();
                        Y = event.getSceneY();
                    });
                    root.setOnMouseDragged((MouseEvent event) -> {
                        stage.setX(event.getScreenX() - X);
                        stage.setY(event.getScreenY() - Y);
                        stage.setOpacity(.8);
                    });
                    root.setOnMouseReleased((MouseEvent event) -> {
                        stage.setOpacity(1);
                    });
                    stage.initStyle(StageStyle.TRANSPARENT);

                    stage.setScene(scene);
                    stage.show();

                } else {
                    showErrorAlert("Error Message", "Wrong Username or Password");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Cashier Login Database
    public void Cashierlogin() {
        String cashierData = "SELECT * FROM cashier WHERE username=? and Password=?";
        connect = database.connectdb();

        try {
            // check textfilds are empty or not
            if (CashierLogin_Username_textField.getText().isEmpty()
                    || CashierLogin_password_textField.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please Fill all Fields");
            } else {
                prepare = connect.prepareStatement(cashierData);
                prepare.setString(1, CashierLogin_Username_textField.getText());
                prepare.setString(2, CashierLogin_password_textField.getText());
                result = prepare.executeQuery();
                if (result.next()) {

                    getData.CId = CashierLogin_Username_textField.getText();

                    showInformationAlert("Success Message", "Successfully Login!");
                    // HIDE CashierLogin Login WINDOW
                    CashierLogin_Login_btn.getScene().getWindow().hide();
                    // Handle navigation to cashier Dashbord screen
                    Parent root = FXMLLoader.load(getClass().getResource("Cashier.fxml"));
                    Stage stage = new Stage();
                    Scene scene = new Scene(root);

                    // drage
                    root.setOnMousePressed((MouseEvent event) -> {
                        X = event.getSceneX();
                        Y = event.getSceneY();
                    });
                    root.setOnMouseDragged((MouseEvent event) -> {
                        stage.setX(event.getScreenX() - X);
                        stage.setY(event.getScreenY() - Y);
                        stage.setOpacity(.8);
                    });
                    root.setOnMouseReleased((MouseEvent event) -> {
                        stage.setOpacity(1);
                    });
                    stage.initStyle(StageStyle.TRANSPARENT);

                    stage.setScene(scene);
                    stage.show();
                } else {
                    showErrorAlert("Error Message", "Wrong Username or Password");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Manager Dashbord

    //
    public void dashboardDisplayActiveEmployees() {

        String sql = "SELECT COUNT(id) FROM cashier";
        connect = database.connectdb();
        int countE = 0;

        try {
            statement = connect.createStatement();
            result = statement.executeQuery(sql);

            if (result.next()) {
                countE = result.getInt("COUNT(id)");
            }
            Manager_Dashbord_Cashier_Num.setText(String.valueOf(countE));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //
    public void dashboardDisplayIncomeToday() {
        Date date = new Date();
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        String sql = "SELECT SUM(total) FROM customerreceipt WHERE date = '" + sqlDate + "'";

        double sumT = 0;

        connect = database.connectdb();

        try {
            statement = connect.createStatement();
            result = statement.executeQuery(sql);

            if (result.next()) {
                sumT = result.getDouble("SUM(total)");
            }
            Manager_Dashbord_Dailyincome.setText(String.valueOf(sumT));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to display a chart on the dashboard
    public void dashboardDisplayChart() {
        dashboardChart.getData().clear();
        String sql = "SELECT date,SUM(total) FROM customerreceipt GROUP BY date ORDER BY TIMESTAMp(date) ASC LIMIT 9";

        connect = database.connectdb();

        try {
            XYChart.Series chart = new XYChart.Series();

            statement = connect.createStatement();
            result = statement.executeQuery(sql);

            while (result.next()) {
                chart.getData().add(new XYChart.Data(result.getString(1), result.getInt(2)));
            }
            dashboardChart.getData().add(chart);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    public void dashboardTotalIncome() {
        String sql = "SELECT SUM(total) FROM customerreceipt";
        double sumTI = 0;

        connect = database.connectdb();
        try {

            statement = connect.createStatement();
            result = statement.executeQuery(sql);

            if (result.next()) {
                sumTI = result.getDouble("SUM(total)");
            }
            Manager_Dashbord_Monthlyincome.setText(String.valueOf(sumTI));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //
    public void displayUsername() {
        Manager_userName.setText(getData.userName);
    }

    // Manager Add Product

    // add a new product to the database
    public void addProductsAdd() {
        String insertProduct = "INSERT INTO product"
                + " (ProductId,ProductName,BrandName,Price,Status)"
                + "VALUES(?,?,?,?,?)";
        connect = database.connectdb();
        try {
            if (Manager_AddProduct_Pid_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_Pname_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_status_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_price_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_Bname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please fill blank fields");
            } else {
                String check = "SELECT ProductId FROM product WHERE ProductId = '"
                        + Manager_AddProduct_Pid_TextFeild.getText() + "'";
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                if (result.next()) {
                    showErrorAlert("Error Message",
                            "Product Name: " + Manager_AddProduct_Pname_TextFeild.getText() + " was already exist!");
                } else {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    public void addProductsDelete() {
        String deleteProduct = "DELETE FROM product WHERE ProductId = '" + Manager_AddProduct_Pid_TextFeild.getText()
                + "'";
        connect = database.connectdb();
        try {
            if (Manager_AddProduct_Pid_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_Pname_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_status_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_price_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_Bname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please fill blank fields");
            } else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE ProductId: "
                        + Manager_AddProduct_Pid_TextFeild.getText() + " ?");

                Optional<ButtonType> option = alert.showAndWait();
                if (option.get().equals(ButtonType.OK)) {
                    prepare = connect.prepareStatement(deleteProduct);
                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();

                    addProductsShowData();
                    addProductsClear();
                } else
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    public void addPorductsUpdate() {
        String updateProduct = "UPDATE product SET BrandName = '"
                + Manager_AddProduct_Bname_TextFeild.getText() + "',ProductName = '"
                + Manager_AddProduct_Pname_TextFeild.getText() + "',status = '"
                + Manager_AddProduct_status_TextFeild.getText() + "',Price = '"
                + Manager_AddProduct_price_TextFeild.getText() + "'WHERE ProductId = '"
                + Manager_AddProduct_Pid_TextFeild.getText() + "'";

        connect = database.connectdb();

        try {
            if (Manager_AddProduct_Pid_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_Pname_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_status_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_price_TextFeild.getText().isEmpty()
                    || Manager_AddProduct_Bname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please fill blank fields");
            } else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE ProductId: "
                        + Manager_AddProduct_Pid_TextFeild.getText() + " ?");

                Optional<ButtonType> option = alert.showAndWait();
                if (option.get().equals(ButtonType.OK)) {
                    statement = connect.createStatement();
                    statement.executeUpdate(updateProduct);
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Updated!");
                    alert.showAndWait();

                    addProductsShowData();
                    addProductsClear();
                } else
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    public void addProductsClear() {
        Manager_AddProduct_Pid_TextFeild.setText("");
        Manager_AddProduct_Pname_TextFeild.setText("");
        Manager_AddProduct_Bname_TextFeild.setText("");
        Manager_AddProduct_status_TextFeild.setText("");
        Manager_AddProduct_price_TextFeild.setText("");
    }

    //
    public ObservableList<ProductData> addPorductListData() {
        ObservableList<ProductData> prodList = FXCollections.observableArrayList();
        String sql = "select * From product";
        connect = database.connectdb();
        try {
            ProductData prod;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()) {
                prod = new ProductData(result.getString("ProductId"), result.getString("ProductName"),
                        result.getString("BrandName"), result.getDouble("Price"), result.getInt("Status"));
                prodList.add(prod);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prodList;
    }

    private ObservableList<ProductData> addProductsList;

    //
    public void addProductsShowData() {
        addProductsList = addPorductListData();

        Manager_AddProduct_table_Pid.setCellValueFactory(new PropertyValueFactory<>("ProductId"));
        Manager_AddProduct_table_Bname.setCellValueFactory(new PropertyValueFactory<>("BrandName"));
        Manager_AddProduct_table_Pname.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
        Manager_AddProduct_table_status.setCellValueFactory(new PropertyValueFactory<>("Status"));
        Manager_AddProduct_table_price1.setCellValueFactory(new PropertyValueFactory<>("Price"));

        Manager_AddProduct_table.setItems(addProductsList);
    }

    //
    public void addProductsSelect() {
        ProductData prod = Manager_AddProduct_table.getSelectionModel().getSelectedItem();
        int num = Manager_AddProduct_table.getSelectionModel().getSelectedIndex();
        if ((num - 1) < -1) {
            return;
        }
        Manager_AddProduct_Pid_TextFeild.setText(prod.getProductId());
        Manager_AddProduct_Bname_TextFeild.setText(prod.getBrandName());
        Manager_AddProduct_Pname_TextFeild.setText(prod.getProductName());
        Manager_AddProduct_price_TextFeild.setText(String.valueOf(prod.getPrice()));
        Manager_AddProduct_status_TextFeild.setText(String.valueOf(prod.getStatus()));
    }

    //
    // public void addProductsSearch() {
    // FilteredList<ProductData> filter = new FilteredList<>(addProductsList, e ->
    // true);

    // Manager_Product_search_TextFeild1.textProperty().addListener((observable,
    // oldValue, newValue) -> {
    // filter.setPredicate(predicateProductData -> {
    // if (newValue == null || newValue.isEmpty()) {
    // return true;
    // }
    // String searchKey = newValue.toLowerCase();

    // if
    // (String.valueOf(predicateProductData.getProductId()).toLowerCase().contains(searchKey))
    // {
    // return true;
    // } else if
    // (predicateProductData.getBrandName().toLowerCase().contains(searchKey)) {
    // return true;
    // } else if
    // (String.valueOf(predicateProductData.getStatus()).toLowerCase().contains(searchKey))
    // {
    // return true;
    // } else if
    // (predicateProductData.getProductName().toLowerCase().contains(searchKey)) {
    // return true;
    // } else if
    // (String.valueOf(predicateProductData.getPrice()).toLowerCase().contains(searchKey))
    // {
    // return true;
    // } else {
    // return false;
    // }
    // });
    // });

    // SortedList<ProductData> sortedData = new SortedList<>(filter);
    // sortedData.comparatorProperty().bind(Manager_AddProduct_table.comparatorProperty());

    // Manager_AddProduct_table.setItems(sortedData);
    // }

    public void addProductsSearch() {
        FilteredList<ProductData> filter = new FilteredList<>(addProductsList, e -> true);

        Manager_Product_search_TextFeild1.addEventHandler(KeyEvent.KEY_TYPED, event -> {
            String searchKey = Manager_Product_search_TextFeild1.getText().toLowerCase();

            filter.setPredicate(predicateProductData -> {
                if (searchKey == null || searchKey.isEmpty()) {
                    return true;
                }

                if (predicateProductData.getProductId().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateProductData.getBrandName().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (String.valueOf(predicateProductData.getStatus()).toLowerCase().contains(searchKey)) {
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

        SortedList<ProductData> sortedData = new SortedList<>(filter);
        sortedData.comparatorProperty().bind(Manager_AddProduct_table.comparatorProperty());

        Manager_AddProduct_table.setItems(sortedData);
    }

    // Manager add cashier
    //
    public void CashiersAdd() {
        String insertCashier = "INSERT INTO cashier"
                + " (userName,Password,Lname,Fname,Gender)"
                + "VALUES(?,?,?,?,?)";
        connect = database.connectdb();
        try {
            if (Manager_AddCashier_Eid_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_Fname_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_gender_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_password_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_Lname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please fill blank fields");
            } else {
                String check = "SELECT userName FROM cashier WHERE userName = '"
                        + Manager_AddProduct_Pid_TextFeild.getText() + "'";
                statement = connect.createStatement();
                result = statement.executeQuery(check);
                if (result.next()) {
                    showErrorAlert("Error Message",
                            "userName: " + Manager_AddCashier_Eid_TextFeild.getText() + " was already exist!");
                } else {
                    prepare = connect.prepareStatement(insertCashier);

                    prepare.setString(1, Manager_AddCashier_Eid_TextFeild.getText());
                    prepare.setString(2, Manager_AddCashier_password_TextFeild.getText());
                    prepare.setString(3, Manager_AddCashier_Lname_TextFeild.getText());
                    prepare.setString(4, Manager_AddCashier_Fname_TextFeild.getText());
                    prepare.setString(5, Manager_AddCashier_gender_TextFeild.getText());

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    public void CashiersDelete() {
        String deleteCashier = "DELETE FROM cashier WHERE userName = '" + Manager_AddCashier_Eid_TextFeild.getText()
                + "'";
        connect = database.connectdb();
        try {
            if (Manager_AddCashier_Eid_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_Fname_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_gender_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_password_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_Lname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please fill blank fields");
            } else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to DELETE Cashier: "
                        + Manager_AddCashier_Eid_TextFeild.getText() + " ?");

                Optional<ButtonType> option = alert.showAndWait();
                if (option.get().equals(ButtonType.OK)) {
                    prepare = connect.prepareStatement(deleteCashier);
                    prepare.executeUpdate();

                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Deleted!");
                    alert.showAndWait();

                    CashiersShowData();
                    CashiersClear();
                } else
                    return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //
    // public void CashiersUpdate() {
    // String updateCashier = "UPDATE cashier SET Password = '"
    // + Manager_AddCashier_password_TextFeild.getText() + "',Lname = '"
    // + Manager_AddCashier_Lname_TextFeild.getText() + "',Fname = '"
    // + Manager_AddCashier_Fname_TextFeild.getText() + "',Gender = '"
    // + Manager_AddCashier_gender_TextFeild.getText() + "'WHERE userName = '"
    // + Manager_AddProduct_Pid_TextFeild.getText() + "'";

    // connect = database.connectdb();

    // try {
    // if (Manager_AddCashier_Eid_TextFeild.getText().isEmpty()
    // || Manager_AddCashier_Fname_TextFeild.getText().isEmpty()
    // || Manager_AddCashier_gender_TextFeild.getText().isEmpty()
    // || Manager_AddCashier_password_TextFeild.getText().isEmpty()
    // || Manager_AddCashier_Lname_TextFeild.getText().isEmpty()) {
    // showErrorAlert("Error Message", "Please fill blank fields");
    // } else {
    // Alert alert = new Alert(AlertType.CONFIRMATION);
    // alert.setTitle("Confirmation Message");
    // alert.setHeaderText(null);
    // alert.setContentText("Are you sure you want to UPDATE ProductId: "
    // + Manager_AddCashier_Eid_TextFeild.getText() + " ?");

    // Optional<ButtonType> option = alert.showAndWait();
    // if (option.get().equals(ButtonType.OK)) {
    // statement = connect.createStatement();
    // statement.executeUpdate(updateCashier);
    // alert = new Alert(AlertType.INFORMATION);
    // alert.setTitle("Information Message");
    // alert.setHeaderText(null);
    // alert.setContentText("Successfully Updated!");
    // alert.showAndWait();

    // CashiersShowData();
    // CashiersClear();
    // } else
    // return;
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    //
    public void CashiersUpdate() {
        String updateCashier = "UPDATE cashier SET Password = ?, Lname = ?, Fname = ?, Gender = ? WHERE userName = ?";

        connect = database.connectdb();

        try {
            if (Manager_AddCashier_Eid_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_Fname_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_gender_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_password_TextFeild.getText().isEmpty()
                    || Manager_AddCashier_Lname_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please fill blank fields");
            } else {
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Confirmation Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure you want to UPDATE userName: "
                        + Manager_AddCashier_Eid_TextFeild.getText() + " ?");

                Optional<ButtonType> option = alert.showAndWait();
                if (option.get().equals(ButtonType.OK)) {
                    PreparedStatement pstmt = connect.prepareStatement(updateCashier);
                    pstmt.setString(1, Manager_AddCashier_password_TextFeild.getText());
                    pstmt.setString(2, Manager_AddCashier_Lname_TextFeild.getText());
                    pstmt.setString(3, Manager_AddCashier_Fname_TextFeild.getText());
                    pstmt.setString(4, Manager_AddCashier_gender_TextFeild.getText());
                    pstmt.setString(5, Manager_AddCashier_Eid_TextFeild.getText());

                    int rowsAffected = pstmt.executeUpdate();
                    if (rowsAffected > 0) {
                        alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("Information Message");
                        alert.setHeaderText(null);
                        alert.setContentText("Successfully Updated!");
                        alert.showAndWait();
                    } else {
                        showErrorAlert("Error Message", "Update failed. Please check the userName.");
                    }

                    CashiersShowData();
                    CashiersClear();
                } else {
                    return;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //
    public void CashiersClear() {
        Manager_AddCashier_Eid_TextFeild.setText("");
        Manager_AddCashier_Fname_TextFeild.setText("");
        Manager_AddCashier_gender_TextFeild.setText("");
        Manager_AddCashier_password_TextFeild.setText("");
        Manager_AddCashier_Lname_TextFeild.setText("");
    }

    //
    public ObservableList<CashierData> CashierListData() {
        ObservableList<CashierData> CData = FXCollections.observableArrayList();
        String sql = "select * From cashier";
        connect = database.connectdb();
        try {
            CashierData CashierD;
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();
            while (result.next()) {
                CashierD = new CashierData(result.getString("userName"), result.getString("password"),
                        result.getString("Lname"), result.getString("Fname"), result.getString("Gender"));
                CData.add(CashierD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return CData;
    }

    private ObservableList<CashierData> CashierList;

    //
    public void CashiersShowData() {
        CashierList = CashierListData();

        Manager_AddCashier_table_Eid.setCellValueFactory(new PropertyValueFactory<>("userName"));
        Manager_AddCashier_table_Password.setCellValueFactory(new PropertyValueFactory<>("password"));
        Manager_AddCashier_table_Lname.setCellValueFactory(new PropertyValueFactory<>("Lname"));
        Manager_AddCashier_table_Fname.setCellValueFactory(new PropertyValueFactory<>("Fname"));
        Manager_AddCashier_table_gender.setCellValueFactory(new PropertyValueFactory<>("Gender"));

        Manager_AddCashier_table.setItems(CashierList);
    }

    //
    public void CashiersSelect() {
        CashierData CData = Manager_AddCashier_table.getSelectionModel().getSelectedItem();
        int num = Manager_AddCashier_table.getSelectionModel().getSelectedIndex();
        if ((num - 1) < -1) {
            return;
        }
        Manager_AddCashier_Eid_TextFeild.setText(CData.getUserName());
        Manager_AddCashier_Fname_TextFeild.setText(CData.getFname());
        Manager_AddCashier_gender_TextFeild.setText(CData.getGender());
        Manager_AddCashier_password_TextFeild.setText(CData.getPassword());
        Manager_AddCashier_Lname_TextFeild.setText(CData.getLname());
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

                if (String.valueOf(predicateCashieData.getUserName()).toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateCashieData.getFname().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateCashieData.getGender().toLowerCase().contains(searchKey)) {
                    return true;
                } else if (predicateCashieData.getFname().toLowerCase().contains(searchKey)) {
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

    // Cashier add

    //
    public void displayCashierId() {
        Cashier_userName.setText(getData.CId);

    }

    // Cashier-related fields
    private int customerId;
    private double price = 0;
    private double totalPrice = 0;
    private double totalP = 0;
    private String pName;
    private String bName;
    private int currentQuantity;
    private int getProductQuantity;

    // Add a purchase to the bill
    public void purchaseAdd() {
        purchaseCustomerId();
        purchaseGetPrice();
        purchaseGetPName();
        purchaseGetBName();
        purchaseGetStatus();

        String checkProductId = "SELECT * FROM product WHERE ProductId = ?";
        String insertProdBills = "INSERT INTO bills (customerId, brandName, productName, quantity, price, date) VALUES (?,?,?,?,?,?)";
        String insertProd = "INSERT INTO bill (customerId, brandName, productName, quantity, price, date) VALUES (?,?,?,?,?,?)";
        String updateProductQuantity = "UPDATE product SET Status = ? WHERE ProductId = ?";

        connect = database.connectdb();

        try {
            Date date = new Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            prepare = connect.prepareStatement(checkProductId);
            prepare.setString(1, Cashier_Pid_TextFeild.getText());
            result = prepare.executeQuery();

            if (!result.next()) {
                showErrorAlert("Error Message", "Product ID: " + Cashier_Pid_TextFeild.getText() + " does not exist!");
            } else if (Cashier_Pid_TextFeild.getText().isEmpty() || Cashier_Quantity_TextFeild.getText().isEmpty()) {
                showErrorAlert("Error Message", "Please fill blank fields");
            } else {

                

                String Quantity = Cashier_Quantity_TextFeild.getText();
                prepare = connect.prepareStatement(insertProd);
                prepare.setInt(1, customerId);
                prepare.setString(2, bName);
                prepare.setString(3, pName);
                prepare.setInt(4, Integer.parseInt(Quantity));

                totalPrice = Integer.parseInt(Quantity) * price;
                prepare.setDouble(5, totalPrice);
                prepare.setDate(6, sqlDate);

                prepare.executeUpdate();

                // Also insert into bills table
                prepare = connect.prepareStatement(insertProdBills);
                prepare.setInt(1, customerId);
                prepare.setString(2, bName);
                prepare.setString(3, pName);
                prepare.setInt(4, Integer.parseInt(Quantity));
                prepare.setDouble(5, totalPrice);
                prepare.setDate(6, sqlDate);

                prepare.executeUpdate();

                if (currentQuantity < Integer.parseInt(Quantity)) {
                    showErrorAlert("Error Message",
                            "Insufficient stock for product ID: " + Cashier_Pid_TextFeild.getText());
                    return;
                }

                // Update the product quantity in the database
                int newQuantity = currentQuantity - Integer.parseInt(Quantity);
                prepare = connect.prepareStatement(updateProductQuantity);
                prepare.setInt(1, newQuantity);
                prepare.setString(2, Cashier_Pid_TextFeild.getText());

                prepare.executeUpdate();

                purchaseDisplayTotal();
                purchaseShowListData();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get the price of the product based on the product ID
    public void purchaseGetPrice() {
        String gPrice = "SELECT price FROM product WHERE ProductID = ?";
        connect = database.connectdb();

        try {
            prepare = connect.prepareStatement(gPrice);
            prepare.setString(1, Cashier_Pid_TextFeild.getText());
            result = prepare.executeQuery();

            if (result.next()) {
                price = result.getDouble("price");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get the product name based on the product ID
    public void purchaseGetPName() {
        String pNameQuery = "SELECT ProductName FROM product WHERE ProductID = ?";
        connect = database.connectdb();

        try {
            prepare = connect.prepareStatement(pNameQuery);
            prepare.setString(1, Cashier_Pid_TextFeild.getText());
            result = prepare.executeQuery();

            if (result.next()) {
                pName = result.getString("ProductName");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get the brand name based on the product ID
    public void purchaseGetBName() {
        String bNameQuery = "SELECT BrandName FROM product WHERE ProductID = ?";
        connect = database.connectdb();

        try {
            prepare = connect.prepareStatement(bNameQuery);
            prepare.setString(1, Cashier_Pid_TextFeild.getText());
            result = prepare.executeQuery();

            if (result.next()) {
                bName = result.getString("BrandName");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get the Status based on the product ID
    public void purchaseGetStatus() {
        String StatusQuery = "SELECT Status FROM product WHERE ProductID = ?";
        connect = database.connectdb();

        try {
            prepare = connect.prepareStatement(StatusQuery);
            prepare.setString(1, Cashier_Pid_TextFeild.getText());
            result = prepare.executeQuery();

            if (result.next()) {
                currentQuantity = result.getInt("Status");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fetch the list of bills for the current customer
    public ObservableList<billData> purchaseListData() {
        purchaseCustomerId();
        ObservableList<billData> billList = FXCollections.observableArrayList();
        String sql = "SELECT * FROM bill WHERE customerId = ?";
        connect = database.connectdb();

        try {
            prepare = connect.prepareStatement(sql);
            prepare.setInt(1, customerId);
            result = prepare.executeQuery();

            while (result.next()) {
                billData billD = new billData(result.getInt("customerId"), result.getString("brandName"),
                        result.getString("productName"), result.getInt("quantity"), result.getDouble("price"),
                        result.getDate("date"));
                billList.add(billD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return billList;
    }

    // Display the list of bills in the table
    public void purchaseShowListData() {
        ObservableList<billData> purchaseList = purchaseListData();

        Cashier_table_Bid.setCellValueFactory(new PropertyValueFactory<>("brandName"));
        Cashier_table_Pname.setCellValueFactory(new PropertyValueFactory<>("productName"));
        Cashier_table_Quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        Cashier_table_Price.setCellValueFactory(new PropertyValueFactory<>("price"));

        Cashier_table.setItems(purchaseList);
    }

    // // Fetch the list of bills for the current customer
    // public ObservableList<billData> purchaseListData() {
    // purchaseCustomerId();
    // ObservableList<billData> billList = FXCollections.observableArrayList();
    // String sql = "SELECT * FROM bill WHERE customerId = ?";
    // connect = database.connectdb();

    // try {
    // prepare = connect.prepareStatement(sql);
    // prepare.setInt(1, customerId);
    // result = prepare.executeQuery();

    // while (result.next()) {
    // billData billD = new billData(result.getInt("customerId"),
    // result.getString("brandName"),
    // result.getString("productName"), result.getInt("quantity"),
    // result.getDouble("price"),
    // result.getDate("date"));
    // billList.add(billD);
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // return billList;
    // }

    // // Display the list of bills in the table
    // public void purchaseShowListData() {
    // ObservableList<billData> purchaseList = purchaseListData();

    // Cashier_table_Bid.setCellValueFactory(new
    // PropertyValueFactory<>("brandName"));
    // Cashier_table_Pname.setCellValueFactory(new
    // PropertyValueFactory<>("productName"));
    // Cashier_table_Quantity.setCellValueFactory(new
    // PropertyValueFactory<>("quantity"));
    // Cashier_table_Price.setCellValueFactory(new PropertyValueFactory<>("price"));

    // Cashier_table.setItems(purchaseList);
    // }

    // Get the next customer ID
    public void purchaseCustomerId() {
        String cusIdQuery = "SELECT customerId FROM bill";
        connect = database.connectdb();

        try {
            prepare = connect.prepareStatement(cusIdQuery);
            result = prepare.executeQuery();

            if (result.next()) {
                customerId = result.getInt("customerId");
            }
            int checkNum = 1;

            String checkCustomerIdQuery = "SELECT customerId FROM customerreceipt";
            statement = connect.createStatement();
            result = statement.executeQuery(checkCustomerIdQuery);

            while (result.next()) {
                checkNum = result.getInt("customerId");
            }

            if (customerId == 1 || checkNum == customerId) {
                customerId += 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Reset the purchase
    public void purchaseReset() {
        purchaseCustomerId();
        String resetDataQuery = "DELETE FROM bill WHERE customerId = ?";
        connect = database.connectdb();

        try {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to reset? The Product List including to reset");

            Optional<ButtonType> option = alert.showAndWait();
            if (option.get() == ButtonType.OK) {
                prepare = connect.prepareStatement(resetDataQuery);
                prepare.setInt(1, customerId);
                prepare.executeUpdate();

                Cashier_Pid_TextFeild.setText("");
                Cashier_Quantity_TextFeild.setText("");
                Cashier_total_label.setText("00.00");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Display the total price of purchases
    public void purchaseDisplayTotal() {
        purchaseCustomerId();
        String sql = "SELECT SUM(price) FROM bill WHERE customerId = ?";
        connect = database.connectdb();

        try {
            prepare = connect.prepareStatement(sql);
            prepare.setInt(1, customerId);
            result = prepare.executeQuery();

            if (result.next()) {
                totalP = result.getDouble("SUM(price)");
            }
            Cashier_total_label.setText(String.valueOf(totalP));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Process the payment and add to customer receipt
    public void purchasePay() {
        purchaseCustomerId();
        purchaseDisplayTotal();
        String sql = "INSERT INTO customerreceipt (customerId, total, date) VALUES (?, ?, ?)";
        connect = database.connectdb();

        try {
            Date date = new Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());

            if (Cashier_table.getItems().isEmpty()) {
                showErrorAlert("Error Message", "Please choose the product first");
            } else {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("CONFIRMATION Message");
                alert.setHeaderText(null);
                alert.setContentText("Are you sure?");
                Optional<ButtonType> option = alert.showAndWait();

                if (option.get() == ButtonType.OK) {
                    prepare = connect.prepareStatement(sql);
                    prepare.setInt(1, customerId);
                    prepare.setDouble(2, totalP);
                    prepare.setDate(3, sqlDate);
                    prepare.executeUpdate();

                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successful!");
                    alert.showAndWait();
                    purchaseReset();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // public void purchaseReceipt () {
    // purchaseDisplayTotal();
    // HashMap hash = new HashMap();
    // hash.put ("marketP", customerId);

    // try{
    // Alert alert;
    // if (totalP == 0) {
    // showErrorAlert("Error Message", "Invalid :3");
    // }

    // JasperDesign jDesign = JRXmlLoader. load("");
    // JasperReport jReport = JasperCompileManager.compileReport(jDesign);
    // JasperPrint jPrint = JasperFillManager.fillReport(jReport, hash, connect);

    // JasperViewer.viewReport(jPrint,false);
    // }catch (Exception e){e.printStackTrace ();}
    // }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
