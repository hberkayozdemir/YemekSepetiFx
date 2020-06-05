package OOP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class KebapciEconmy {

     @FXML
     Label Total;






    public double getPrice()
    {
        return price;
    }
// 1



    public void setPrice(double price)
    {
        double temp=0;
        temp +=price;


        this.price3 = temp;

    }

    public void RefreshMoney(ActionEvent e)
    {
        Total.setText(KebapciTotalPrice());
    }


    public  String KebapciTotalPrice(){
        return Double.toString(price3);
    }
    public  String PizzaciTotalPrice(){
        return Double.toString(price4);
    }




    private static double price;
    private static double price1;
    private static double price2;
    private static double price3;
    private static double price4;




    public KebapciEconmy() {

    }

    public  void Back(InputEvent e){


        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/RestourantLogin.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 643, 503);
            stage.setTitle("Yemek Sepeti FX   -Register-");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        } catch (IOException Ex) {
            Ex.printStackTrace();
        }

    }

}
