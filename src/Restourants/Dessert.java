package Restourants;

import OOP.DessertEconmy;
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


public   class Dessert implements Initializable{
        @FXML
        private Label DessertCounter;

    @FXML
    private TableView<Products> Table;
    @FXML
    private TableColumn ColName;
    @FXML
    private TableColumn ColPrice;
    @FXML
    private TableColumn ColQuantity;
    DessertEconmy eco=new DessertEconmy();

        Counters count=new Counters();
        public void Baklava(InputEvent e){

            TatliciSiparis.add(new Products("Baklava",1,32.85));
            count.increaseCount();
            count.LabelSetter(DessertCounter);
        }
        public void Gullac(InputEvent e){

            TatliciSiparis.add(new Products("Gullac",1,22.85));
            count.increaseCount();
            count.LabelSetter(DessertCounter);
        }
        public void Sobiyet(InputEvent e){

            TatliciSiparis.add(new Products("Sobiyet",1,25.35));
            count.increaseCount();
            count.LabelSetter(DessertCounter);
        }
        public void Magnolia(InputEvent e){

            TatliciSiparis.add(new Products("Magnolia",1,42.55));
            count.increaseCount();
            count.LabelSetter(DessertCounter);
        }
        public void Pie(InputEvent e){

            TatliciSiparis.add(new Products("Pie",1,13.30));
            count.increaseCount();
            count.LabelSetter(DessertCounter);
        }
        public void Revani(InputEvent e){

            TatliciSiparis.add(new Products("Revani",1,18.70));
            count.increaseCount();
            count.LabelSetter(DessertCounter);
        }
        public  void deleteLast(InputEvent  e){
count.DecreaseCount();
count.LabelSetter(DessertCounter);
            if(TatliciSiparis.size()-1<=0) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("/GUI/NotAddProduct.fxml"));
                    Stage stage = new Stage();
                    Scene root = new Scene(fxmlLoader.load(), 470, 268);
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

                TatliciSiparis.remove(TatliciSiparis.size() - 1);
            }
        }
        public void deleteAll(InputEvent e){

            List<Products> prod = new ArrayList<>();
            for (Iterator<Products> it = TatliciSiparis.iterator(); it.hasNext(); )
            {
                Products pr = it.next();
                prod.add(pr);
            }
            double a = 0;
            for(int i = 0; i<= TatliciSiparis.size()-1; i++)
            {
                a += prod.get(i).getProductPrice();
            }

            eco.setPrice(a);


            if(TatliciSiparis.size()-1<=0) {
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("/GUI/NotAddProduct.fxml"));
                    Stage stage = new Stage();
                    Scene root = new Scene(fxmlLoader.load(), 470, 268);
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
        ObservableList<Products> TatliciSiparis = FXCollections.observableArrayList();

        @Override
        public void initialize(URL location, ResourceBundle resources) {


             ColName.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
            ColPrice.setCellValueFactory(new PropertyValueFactory<>("ProductPrice"));
            ColQuantity.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity"));
            Table.setItems(TatliciSiparis);



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
            fxmlLoader.setLocation(getClass().getResource("/GUI/Tatlici.fxml"));
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
