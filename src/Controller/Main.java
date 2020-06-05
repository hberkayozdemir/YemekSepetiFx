package GUI;

import DataBase.DataBase;


import java.util.Scanner;

import OOP.Person;
import OOP.Restourant;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/GUI/UserTypeSelection.fxml"));
        primaryStage.setTitle("Yemek Sepeti FX   -Login-");
        primaryStage.setScene(new Scene(root, 600, 380));
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args);


        Scanner scn=new Scanner(System.in);

        System.out.println(getOperatingSystem());

    }

    public static String getOperatingSystem() {
        String os = System.getProperty("os.name").toLowerCase();
        // System.out.println("Using System Property: " + os);
        return os;
    }

    public static void RegisterBtnExmple(Person ab){

        DataBase db=new DataBase();
        db.WriteInformation(ab);
        db.WriteInformationAdress(ab);
        db.WriteInformationPassWord(ab);
        db.WriteInformationTelNo(ab);
        db.WriteInformationID(ab);
    }

    public static void RegisterRestourantBtnExmple(Restourant res){

        DataBase db=new DataBase();
        db.RestourantWriteInformation(res);
        db.RestourantWriteInformationAdress(res);
        db.RestourantWriteInformationName(res);
        db.RestourantWriteInformationSlogan(res);

    }
    public static  void RestourantReadRegister(Restourant rre){
        DataBase db=new DataBase();
        System.out.println("All : "+db.RestourantReadInformation(rre));
        System.out.println("ID  :"+db.RestourantReadInformationName(rre));
        System.out.println("Adress :"+db.RestourantReadInformationSlogan(rre));
        System.out.println("Tel No : "+db.RestourantReadInformationAdress(rre));
    }



}
