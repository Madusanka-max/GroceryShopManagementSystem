/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package groceryshopmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author isuru
 */

public class GroceryShopManagementSystem extends Application {
    
    
    private double X=0;
    private double Y=0;

    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        
        Scene scene = new Scene(root);
        
        root. setOnMousePressed ( (MouseEvent event) ->{
            X = event . getSceneX ();
            Y = event.getSceneY ();
        });
        
        root.setOnMouseDragged ((MouseEvent event) ->{
            stage.setX (event.getScreenX() - X);
            stage.setY(event.getScreenY () - Y);

            stage.setOpacity(.8);
        });
        
        root. setOnMouseReleased ( (MouseEvent event) ->{
            stage.setOpacity(1);
        });
        
        stage.initStyle (StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }




    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        launch(args);

        
    }
    
}


