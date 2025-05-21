package com.jasong.githubpet.githubpet;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class PetApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            //Load FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("GitHubPet.fxml"));
            Parent root = loader.load();

            //Setting the scene
            Scene scene = new Scene(root);
            primaryStage.setTitle("GitHub Pet Simulator");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
