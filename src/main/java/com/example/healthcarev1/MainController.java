package com.example.healthcarev1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

import java.io.IOException;


public class MainController {

    @FXML
    private Button Fridayeighteenlinebutton;

    @FXML
    private Button Fridayeightlinebutton;

    @FXML
    private Button Fridayelevenlinebutton;

    @FXML
    private Button Fridayfifteenlinebutton;

    @FXML
    private Button Fridayfirstlinebutton;

    @FXML
    private Button Fridayfivelinebutton;

    @FXML
    private Button Fridayfourteenlinebutton;

    @FXML
    private Button Fridayfourthlinebutton;

    @FXML
    private Button Fridayninelinebutton;

    @FXML
    private Button Fridaynineteenlinebutton;

    @FXML
    private Button Fridaysecondlinebutton;

    @FXML
    private Button Fridaysevenlinebutton;

    @FXML
    private Button Fridayseventeenlinebutton;

    @FXML
    private Button Fridaysixlinebutton;

    @FXML
    private Button Fridaysixteenline;

    @FXML
    private Button Fridaytenlinebutton;

    @FXML
    private Button Fridaythirdlinebutton;

    @FXML
    private Button Fridaythirteenlinebutton;

    @FXML
    private Button Fridaytwelflinebutton;

    @FXML
    private Button Fridaytwentylinebutton;

    @FXML
    private ChoiceBox<?> calendarcheckbox;

    @FXML
    private Button calendarfive;

    @FXML
    private Button calendarfour;

    @FXML
    private Button calendarone;

    @FXML
    private Button calendarsix;

    @FXML
    private Button calendartwo;

    @FXML
    private Button calendrathree;

    @FXML
    private Label family;

    @FXML
    private Button loginbutton;

    @FXML
    private Button mondayeighteenlinebutton;

    @FXML
    private Button mondayeightlinebutton;

    @FXML
    private Button mondayelevenlinebutton;

    @FXML
    private Button mondayfourteenlinebutton;

    @FXML
    private Button mondaynineteenlinebutton;

    @FXML
    private Button mondayseventeenlinebutton;

    @FXML
    private Button mondaysixteenline;

    @FXML
    private Button mondaythirteenlinebutton;

    @FXML
    private Button mondaytwelflinebutton;

    @FXML
    private Button mondaytwentylinebutton;

    @FXML
    private Button mondeyfifteenlinebutton;

    @FXML
    private Button mondeyfirstlinebutton;

    @FXML
    private Button mondeyfivelinebutton;

    @FXML
    private Button mondeyfourthlinebutton;

    @FXML
    private Button mondeyninelinebutton;

    @FXML
    private Button mondeysecondlinebutton;

    @FXML
    private Button mondeysevenlinebutton;

    @FXML
    private Button mondeysixlinebutton;

    @FXML
    private Button mondeythirdlinebutton;

    @FXML
    private Button moneytenlinebutton;

    @FXML
    private Label name;

    @FXML
    private Button saturdayeighteenlinebutton;

    @FXML
    private Button saturdayeightlinebutton;

    @FXML
    private Button saturdayelevenlinebutton;

    @FXML
    private Button saturdayfifteenlinebutton;

    @FXML
    private Button saturdayfirstlinebutton;

    @FXML
    private Button saturdayfivelinebutton;

    @FXML
    private Button saturdayfourteenlinebutton;

    @FXML
    private Button saturdayfourthlinebutton;

    @FXML
    private Button saturdayninelinebutton;

    @FXML
    private Button saturdaynineteenlinebutton;

    @FXML
    private Button saturdaysecondlinebutton;

    @FXML
    private Button saturdaysevenlinebutton;

    @FXML
    private Button saturdayseventeenlinebutton;

    @FXML
    private Button saturdaysixlinebutton;

    @FXML
    private Button saturdaysixteenline;

    @FXML
    private Button saturdaytenlinebutton;

    @FXML
    private Button saturdaythirdlinebutton;

    @FXML
    private Button saturdaythirteenlinebutton;

    @FXML
    private Button saturdaytwelflinebutton;

    @FXML
    private Button saturdaytwentylinebutton;

    @FXML
    private Button sundayeighteenlinebutton;

    @FXML
    private Button sundayeightlinebutton;

    @FXML
    private Button sundayelevenlinebutton;

    @FXML
    private Button sundayfifteenlinebutton;

    @FXML
    private Button sundayfirstlinebutton;

    @FXML
    private Button sundayfivelinebutton;

    @FXML
    private Button sundayfourteenlinebutton;

    @FXML
    private Button sundayfourthlinebutton;

    @FXML
    private Button sundayninelinebutton;

    @FXML
    private Button sundaynineteenlinebutton;

    @FXML
    private Button sundaysecondlinebutton;

    @FXML
    private Button sundaysevenlinebutton;

    @FXML
    private Button sundayseventeenlinebutton;

    @FXML
    private Button sundaysixlinebutton;

    @FXML
    private Button sundaysixteenline;

    @FXML
    private Button sundaytenlinebutton;

    @FXML
    private Button sundaythirdlinebutton;

    @FXML
    private Button sundaythirteenlinebutton;

    @FXML
    private Button sundaytwelflinebutton;

    @FXML
    private Button sundaytwentylinebutton;

    @FXML
    private Button therthday;

    @FXML
    private Button therthdayeighteenlinebutton;

    @FXML
    private Button therthdayeightlinebutton;

    @FXML
    private Button therthdayelevenlinebutton;

    @FXML
    private Button therthdayfifteenlinebutton;

    @FXML
    private Button therthdayfirstlinebutton;

    @FXML
    private Button therthdayfivelinebutton;

    @FXML
    private Button therthdayfourteenlinebutton;

    @FXML
    private Button therthdayfourthlinebutton;

    @FXML
    private Button therthdayninelinebutton;

    @FXML
    private Button therthdaysecondlinebutton;

    @FXML
    private Button therthdaysevenlinebutton;

    @FXML
    private Button therthdayseventeenlinebutton;

    @FXML
    private Button therthdaysixlinebutton;

    @FXML
    private Button therthdaysixteenline;

    @FXML
    private Button therthdaytenlinebutton;

    @FXML
    private Button therthdaythirdlinebutton;

    @FXML
    private Button therthdaythirteenlinebutton;

    @FXML
    private Button therthdaytwelflinebutton;

    @FXML
    private Button therthdaytwentylinebutton;

    @FXML
    private Button tuestandeighteenlinebutton;

    @FXML
    private Button tuestandeightlinebutton;

    @FXML
    private Button tuestandelevenlinebutton;

    @FXML
    private Button tuestandfifteenlinebutton;

    @FXML
    private Button tuestandfirstlinebutton;

    @FXML
    private Button tuestandfivelinebutton;

    @FXML
    private Button tuestandfourteenlinebutton;

    @FXML
    private Button tuestandfourthlinebutton;

    @FXML
    private Button tuestandninelinebutton;

    @FXML
    private Button tuestandnineteenlinebutton;

    @FXML
    private Button tuestandsecondlinebutton;

    @FXML
    private Button tuestandsevenlinebutton;

    @FXML
    private Button tuestandseventeenlinebutton;

    @FXML
    private Button tuestandsixlinebutton;

    @FXML
    private Button tuestandsixteenline;

    @FXML
    private Button tuestandtenlinebutton;

    @FXML
    private Button tuestandthirdlinebutton;

    @FXML
    private Button tuestandthirteenlinebutton;

    @FXML
    private Button tuestandtwelflinebutton;

    @FXML
    private Button tuestandtwentylinebutton;

    @FXML
    private Button wednasdayeighteenlinebutton;

    @FXML
    private Button wednasdayeightlinebutton;

    @FXML
    private Button wednasdayelevenlinebutton;

    @FXML
    private Button wednasdayfifteenlinebutton;

    @FXML
    private Button wednasdayfirstlinebutton;

    @FXML
    private Button wednasdayfivelinebutton;

    @FXML
    private Button wednasdayfourteenlinebutton;

    @FXML
    private Button wednasdayfourthlinebutton;

    @FXML
    private Button wednasdayninelinebutton;

    @FXML
    private Button wednasdaynineteenlinebutton;

    @FXML
    private Button wednasdaysecondlinebutton;

    @FXML
    private Button wednasdaysevenlinebutton;

    @FXML
    private Button wednasdayseventeenlinebutton;

    @FXML
    private Button wednasdaysixlinebutton;

    @FXML
    private Button wednasdaysixteenline;

    @FXML
    private Button wednasdaytenlinebutton;

    @FXML
    private Button wednasdaythirdlinebutton;

    @FXML
    private Button wednasdaythirteenlinebutton;

    @FXML
    private Button wednasdaytwelflinebutton;

    @FXML
    private Button wednasdaytwentylinebutton;

    @FXML
    void initialize(){
        loginbutton.setOnAction(this::handle);
        mondeyfirstlinebutton.setOnAction(this::handle1);
        mondeysecondlinebutton.setOnAction(this::handle);
        mondeythirdlinebutton.setOnAction();
        mondeyfourthlinebutton.setOnAction();
        mondeyfivelinebutton.setOnAction();
        mondeysixlinebutton.setOnAction();
        mondeysevenlinebutton.setOnAction();
        mondeyninelinebutton.setOnAction();
        moneytenlinebutton.setOnAction();
        mondayelevenlinebutton.setOnAction();
        mondaytwelflinebutton.setOnAction();
        mondaythirteenlinebutton.setOnAction();
        mondayfourteenlinebutton.setOnAction();
        mondeyfifteenlinebutton.setOnAction();
        mondeysixlinebutton.setOnAction();
        mondayseventeenlinebutton.setOnAction();
        mondayeighteenlinebutton.setOnAction();
        mondaynineteenlinebutton.setOnAction();
        mondaytwentylinebutton.setOnAction();
        tuestandfirstlinebutton.setOnAction();
        tuestandsecondlinebutton.setOnAction();
        tuestandthirdlinebutton.setOnAction();
        tuestandfourteenlinebutton.setOnAction();
        tuestandfivelinebutton.setOnAction();
        tuestandsixlinebutton.setOnAction();
        tuestandsevenlinebutton.setOnAction();
        tuestandeightlinebutton.setOnAction();
        tuestandninelinebutton.setOnAction();
        tuestandtenlinebutton.setOnAction();
        tuestandelevenlinebutton.setOnAction();
        tuestandtwelflinebutton.setOnAction();
        tuestandthirteenlinebutton.setOnAction();
        tuestandfourteenlinebutton.setOnAction();
        tuestandfifteenlinebutton.setOnAction();
        tuestandsixteenline.setOnAction();
        tuestandseventeenlinebutton.setOnAction();
        tuestandeightlinebutton.setOnAction();
        tuestandnineteenlinebutton.setOnAction();
        tuestandtwentylinebutton.setOnAction();
        wednasdayfirstlinebutton.setOnAction();
        wednasdaysecondlinebutton.setOnAction();
        wednasdaythirdlinebutton.setOnAction();
        wednasdayfourthlinebutton.setOnAction();
        wednasdayfivelinebutton.setOnAction();
        wednasdaysixlinebutton.setOnAction();
        wednasdaysevenlinebutton.setOnAction();
        wednasdayeightlinebutton.setOnAction();
        wednasdayninelinebutton.setOnAction();
        wednasdaytenlinebutton.setOnAction();
        wednasdayelevenlinebutton.setOnAction();
        wednasdaytwelflinebutton.setOnAction();
        wednasdaythirteenlinebutton.setOnAction();
        wednasdayfourteenlinebutton.setOnAction();
        wednasdayfifteenlinebutton.setOnAction();
        wednasdaysixteenline.setOnAction();
        wednasdayseventeenlinebutton.setOnAction();
        wednasdayeighteenlinebutton.setOnAction();
        wednasdaytwentylinebutton.setOnAction();
        therthday.setOnAction();
        therthdayfirstlinebutton.setOnAction();
        therthdaysecondlinebutton.setOnAction();
        therthdaythirdlinebutton.setOnAction();
        



    }

    private void handle(ActionEvent actionEvent) {
        loginbutton.getScene().getWindow().hide();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("com/example/healthcarev1/logindesighn.fxml"));

        try {
            loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
    private void handle1(ActionEvent actionEvent){
        mondeyfirstlinebutton.getScene().getWindow().hide();

        FXMLLoader loadbutton = new FXMLLoader();
        loadbutton.setLocation(getClass().getResource("Clientbutton.fxml"));

        Parent button1 = loadbutton.getRoot();
        Stage stagebutton = new Stage();
        stagebutton.setScene(new Scene(button1));
        stagebutton.showAndWait();

    }


}
