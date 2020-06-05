package Restourants;

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

public     class Bakery implements Initializable {
        @FXML
        private Label BakeryCounter;
        Counters count=new Counters();
        public void Bread(InputEvent e){

            PastaneSiparisleri.add(new Products("Bread",1,2.0));
            count.increaseCount();
            count.LabelSetter(BakeryCounter);

        }

        public  void Cake(InputEvent e){
            PastaneSiparisleri.add(new Products("Cake",1,22.85));
            count.increaseCount();
            count.LabelSetter(BakeryCounter);
        }
        public void Pide(InputEvent e){
            PastaneSiparisleri.add(new Products("Pide",1,4.55));
            count.increaseCount();
            count.LabelSetter(BakeryCounter);
        }
        public void Cookie(InputEvent e){
            PastaneSiparisleri.add(new Products("Cookie",1,1.50));
            count.increaseCount();
            count.LabelSetter(BakeryCounter);
        }
        public  void TurkishBagel(InputEvent e){
            PastaneSiparisleri.add(new Products("Turkish Bagel",1,2.25));
            count.increaseCount();
            count.LabelSetter(BakeryCounter);
        }
        public void Muffin(InputEvent e){
            PastaneSiparisleri.add(new Products("Muffin",1,7.70));
            count.increaseCount();
            count.LabelSetter(BakeryCounter);
        }


        @FXML
        private TableView<Products> Table;
    @FXML
    private TableColumn ColName;
    @FXML
    private TableColumn ColPrice;
    @FXML
    private TableColumn ColQuantity;
    Economy eco=new Economy();


        public  void deleteLast(InputEvent  e){

            if(PastaneSiparisleri.size()-1<=0) {
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

                PastaneSiparisleri.remove(PastaneSiparisleri.size() - 1);
                count.DecreaseCount();
                count.LabelSetter(BakeryCounter);
            }
        }
        public void deleteAll(InputEvent e){
count.ZeroCount();
count.LabelSetter(BakeryCounter);
            List<Products> prod = new ArrayList<>();
            for (Iterator<Products> it = PastaneSiparisleri.iterator(); it.hasNext(); )
            {
                Products pr = it.next();
                prod.add(pr);
            }
            double a = 0;
            for(int i = 0; i<= PastaneSiparisleri.size()-1; i++)
            {
                a += prod.get(i).getProductPrice();
            }

            eco.setPrice(a);


            if(PastaneSiparisleri.size()-1<=0) {
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
        ObservableList<Products> PastaneSiparisleri = FXCollections.observableArrayList();

        @Override
        public void initialize(URL location, ResourceBundle resources) {


            ColName.setCellValueFactory(new PropertyValueFactory<>("ProductName"));
            ColPrice.setCellValueFactory(new PropertyValueFactory<>("ProductPrice"));
            ColQuantity.setCellValueFactory(new PropertyValueFactory<>("ProductQuantity"));
            Table.setItems(PastaneSiparisleri);

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
            fxmlLoader.setLocation(getClass().getResource("/GUI/BakeryMenu.fxml"));
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
