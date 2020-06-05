package Restourants;
import OOP.ChinieseEconmy;

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


public  class Chinesee implements Initializable{
        @FXML
        private Label ChinaCounter;

Counters count=new Counters();
        @FXML
        private TableView<Products> Table;
        @FXML
        private TableColumn ColName;
        @FXML
        private TableColumn ColPrice;
        @FXML
        private TableColumn ColQuantity;
       ChinieseEconmy eco= new ChinieseEconmy();

    public Chinesee() {
    }

    public void Sushi(InputEvent e){

            observableList.add(new Products("Sushi",1,32.85));

            count.increaseCount();
            count.LabelSetter(ChinaCounter);


        }
        public void ChowMain(InputEvent e){

            observableList.add(new Products("Chow Main",1,22.85));

            count.increaseCount();
            count.LabelSetter(ChinaCounter);


        }
        public void MapoTofu(InputEvent e){

            observableList.add(new Products("Mapo Tofu",1,25.35));

            count.increaseCount();
            count.LabelSetter(ChinaCounter);

        }
        public void Spareribs(InputEvent e){

            observableList.add(new Products("Spare ribs",1,42.55));

            count.increaseCount();
            count.LabelSetter(ChinaCounter);


        }
        public void SpringRolls(InputEvent e){

            observableList.add(new Products("SpringRolls",1,13.30));

            count.increaseCount();
            count.LabelSetter(ChinaCounter);

        }
        public void Noodles(InputEvent e){

            observableList.add(new Products("Noodles",1,18.70));

            count.increaseCount();
            count.LabelSetter(ChinaCounter);


        }
        public  void deleteLast(InputEvent  e){
count.DecreaseCount();
count.LabelSetter(ChinaCounter);
            if(observableList.size()-1<=0) {
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

                observableList.remove(observableList.size() - 1);
            }
        }
        public void deleteAll(InputEvent e){
count.ZeroCount();
count.LabelSetter(ChinaCounter);
            List<Products> prod = new ArrayList<>();
            for (Iterator<Products> it = observableList.iterator(); it.hasNext(); )
            {
                Products pr = it.next();
                prod.add(pr);
            }
            double a = 0;
            for(int i = 0; i<= observableList.size()-1; i++)
            {
                a += prod.get(i).getProductPrice();
            }

            eco.setPrice(a);


            if(observableList.size()-1<=0) {
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


        public void initialize(URL location, ResourceBundle resources) {


            ColName.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
            ColPrice.setCellValueFactory(new PropertyValueFactory<>("ProductPrice"));
            ColQuantity.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity"));
            Table.setItems(observableList);

        }

    public ObservableList<Products> observableList = FXCollections.observableArrayList();

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
                fxmlLoader.setLocation(getClass().getResource("/GUI/Cinlokantasi.fxml"));
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
    public void NavigateSiparisRestourant(InputEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/CinLokantasiSiparis.fxml"));
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
