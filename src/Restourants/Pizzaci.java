package Restourants;

import OOP.PizzaEconomy;
import OOP.Counters;
import OOP.Economy;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.InputEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;


public   class Pizzaci implements Initializable{
        @FXML
        private Label PizzaCounter;
    @FXML
    private TableView<Products> Table;
    @FXML
    private TableColumn ColName;
    @FXML
    private TableColumn ColPrice;
    @FXML
    private TableColumn ColQuantity;
    PizzaEconomy eco=new PizzaEconomy();


        Counters count=new Counters();
        public void MixedPizza(InputEvent e){

            PizzaciSiparis.add(new Products("Mixed Pizza",1,32.85));
            count.increaseCount();
            count.LabelSetter(PizzaCounter);
        }
        public void UrfaKebap(InputEvent e){

            PizzaciSiparis.add(new Products("Urfa Kebap",1,22.85));
            count.increaseCount();
            count.LabelSetter(PizzaCounter);
        }
        public void PepperoniPizza(InputEvent e){

            PizzaciSiparis.add(new Products("Pepperoni Pizza",1,25.35));
            count.increaseCount();
            count.LabelSetter(PizzaCounter);
        }
        public void CrustyPizza(InputEvent e){

            PizzaciSiparis.add(new Products("Crusty Pizza",1,42.55));
            count.increaseCount();
            count.LabelSetter(PizzaCounter);
        }
        public void MilanoPizza(InputEvent e){

            PizzaciSiparis.add(new Products("MilanoPizza",1,13.30));
            count.increaseCount();
            count.LabelSetter(PizzaCounter);
        }
        public void Lasagna(InputEvent e){

            PizzaciSiparis.add(new Products("Lasagna",1,18.70));
            count.increaseCount();
            count.LabelSetter(PizzaCounter);
        }
        public  void deleteLast(InputEvent  e){
count.DecreaseCount();
count.LabelSetter(PizzaCounter);
            if(PizzaciSiparis.size()-1<=0) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("/GUI/NotAddProduct.fxml"));
                    Stage stage = new Stage();
                    Scene root = new Scene(fxmlLoader.load(), 598, 357);
                    stage.setTitle("Try Again");
                    stage.setScene(root);
                    stage.show();
                    final Node source = (Node) e.getSource();
                    final Stage seagreen = (Stage) source.getScene().getWindow();
                    seagreen.close();
                } catch (IOException Ex) {
                    Ex.printStackTrace();
                }
            }
            else {

                PizzaciSiparis.remove(PizzaciSiparis.size() - 1);
            }
        }
        public void deleteAll(InputEvent e){
count.ZeroCount();
count.LabelSetter(PizzaCounter);

            List<Products> prod = new ArrayList<>();
            for (Iterator<Products> it = PizzaciSiparis.iterator(); it.hasNext(); )
            {
                Products pr = it.next();
                prod.add(pr);
            }
            double a = 0;
            for(int i=0;i<=PizzaciSiparis.size()-1;i++)
            {
                a += prod.get(i).getProductPrice();
            }

            eco.setPrice(a);


            if(PizzaciSiparis.size()-1<=0) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("/GUI/NotAddProduct.fxml"));
                    Stage stage = new Stage();
                    Scene root = new Scene(fxmlLoader.load(), 598, 357);
                    stage.setTitle("Try Again");
                    stage.setScene(root);
                    stage.show();
                    final Node source = (Node) e.getSource();
                    final Stage seagreen = (Stage) source.getScene().getWindow();
                    seagreen.close();
                } catch (IOException Ex) {
                    Ex.printStackTrace();
                }
            }
            else {
                Table.getItems().clear();
            }
        }
        ObservableList<Products> PizzaciSiparis= FXCollections.observableArrayList();

        @Override
        public void initialize(URL location, ResourceBundle resources) {


            ColName.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
            ColPrice.setCellValueFactory(new PropertyValueFactory<>("ProductPrice"));
            ColQuantity.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity"));
            Table.setItems(PizzaciSiparis);



        }
        public void Back(InputEvent e){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/RestourantList.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 660, 475);
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
    public void NavigateRestourant(InputEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/Pizzaci.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 660, 475);
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
