package OOP;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class DessertEconmy {


    public Label Total;






// 1



    public void setPrice(double price)
    {
        double temp=0;
        temp +=price;


        this.price2 = temp;

    }




    public  String DessertTotalPrice(){
        return Double.toString(price2);
    }





    private static double price2;





    public DessertEconmy() {

    }
    public void RefreshMoney(ActionEvent e)
    {
        Total.setText(DessertTotalPrice());
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
