package com.example.jfx2.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    private Button getStarted;

    @FXML
    private Button signIn;

    @FXML
    private Button signUp;

    @FXML
    void getStarted(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("mainPage.fxml"));// going to main page
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switchToSignIn(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("signIn.fxml"));// switching to signIn page
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
