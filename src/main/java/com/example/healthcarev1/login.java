package com.example.healthcarev1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class login extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(login.class.getResource("logindesighn.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 500);
        stage.setTitle("Login");
        stage.setScene(scene);В
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}