package com.example.darklogin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        try{
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
            AnchorPane pane = loader.load();

        Scene scene = new Scene(pane);

        stage.setTitle("Dark Login!");
        stage.setScene(scene);
        stage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch();
    }
}