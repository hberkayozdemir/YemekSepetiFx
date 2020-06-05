package Controller;
import DataBase.DataBase;
import DataBase.OsDetector;
import DataBase.Path;
import OOP.Person;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.InputEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;
import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import DataBase.*;
import java.io.IOException;

public class Controller {
    private String x;
    private  int y=0;
    Path p=new Path();
    DataBase db=new DataBase();
    OsDetector oss=new OsDetector();

    FileFinder f=new FileFinder();
    private  String idd;
    @FXML

// hata ekranı parametreleri

// dogru check ekranı parametreleri

//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------

    public void UserLogin_Back(InputEvent e){
// make file Registiration from DataBase Method
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/UserTypeSelection.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 600, 380);
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

    public  void NotAddProduct(InputEvent e){
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


    public void UserTypeSelection_BrowseBtn(InputEvent e) {



        if(oss.OsDetected().equals("win")){
            Stage stage = new Stage();
            DirectoryChooser directoryChooser = new DirectoryChooser();
            File selectedDirectory = directoryChooser.showDialog(stage);
            if(selectedDirectory == null){
                //No Directory selected
            }else{
                this. x=selectedDirectory.getAbsolutePath();
                this.y++;
                p.setPath(".\\Logs");
            }


        }
       else if(oss.OsDetected().equals("osx")   || oss.OsDetected().equals("linux")){
            // its will work on mac  and linux very good but in win we have to change
            Stage stage = new Stage();
            DirectoryChooser directoryChooser = new DirectoryChooser();
            File selectedDirectory = directoryChooser.showDialog(stage);
            if(selectedDirectory == null){
                //No Directory selected
            }else{
                String x=selectedDirectory.getAbsolutePath();
                p.setPath(x);
            }
        }
        else {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/False.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 357, 598);
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













       /*
        if(p.getPath()==null){
            control.FalsePathDidntSet();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/False.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 598, 357);
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
        else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/UserLogin.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 420, 550);
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
    }*/
// bu kısımlar cok onemli burayı ileride duzelticez su an cok sorun cıkarıyor
    /*
        if(oss.OsDetected().equals("win")){
            Stage stage = new Stage();
            DirectoryChooser directoryChooser = new DirectoryChooser();
            File selectedDirectory = directoryChooser.showDialog(stage);
                String x=selectedDirectory.getAbsolutePath();
                p.setPath(x);
                char z='\\';
                String m=Character.toString(z);
                System.out.println(m);
                x.replaceAll(m,m+m);
                p.setPath(x);
        }
     if(oss.OsDetected().equals("osx")   || oss.OsDetected().equals("linux")){
        // its will work on mac  and linux very good but in win we have to change
            Stage stage = new Stage();
            DirectoryChooser directoryChooser = new DirectoryChooser();
            File selectedDirectory = directoryChooser.showDialog(stage);
            if(selectedDirectory == null){
                //No Directory selected
            }else{
                String x=selectedDirectory.getAbsolutePath();
                p.setPath(x);
            }
        }
    else {
        control.FalseUnspportedOs();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("False.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 357, 598);
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
*/



    public void UserTypeSelection_UserBtn(InputEvent e) {



        if(x==null || y==0){

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/NotHavePath.fxml"));

                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 598, 357);
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
        else {

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/UserLogin.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 420, 550);
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
    public void UserTypeSelection_RestourantBtn(InputEvent e){


        if(x==null||y==0){

            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/NotHavePath.fxml"));

                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 598, 357);
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
else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/RestourantLogin.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 643, 500);
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


    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//                                                              userLogin
    public void UserLogin_NewAccountBtn(InputEvent e){
// make file Registiration from DataBase Method
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/UserRegisteration.fxml"));
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


   @FXML
   private TextField UserIDD;
    @FXML
    private Label Information;
    @FXML
    private TextField UserPassWordd;

    public void UserLogin_LoginBtn(InputEvent e) {
// make Login control if()
        if ((f.userFinder(UserIDD.getText())) != null) {
            idd=UserIDD.getText();
            if (db.read(UserIDD.getText(),UserPassWordd.getText())) {

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
        }

        else if((f.RestourantFinder(UserIDD.getText())!=null)){

            if (db.Adminread(UserIDD.getText(),UserPassWordd.getText())) {
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



        }
        else{
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/GUI/IdWrong.fxml"));
                Stage stage = new Stage();
                Scene root = new Scene(fxmlLoader.load(), 598, 357);
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

    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //                                   Restourant Login
    public void RestourantLogin_LoginBtn(InputEvent e){
// make Login control if()
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
    public void RestourantLogin_NewRestourantBtn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/RestourantRegisteration.fxml"));
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
    //restaurnt loginbAck
    public void UserLogin_BackBtn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/UserTypeSelection.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 605, 395);
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
    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//                                 Restourant Registiration
    public void RestourantRegistiration_LoginBtn(InputEvent e){
// make Login control if()
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

    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//                                                         BakeryMenu( tum restorant typeları bunu kullanıcak)
    public void BakeryMenu_Bucket(InputEvent e){
// do nothing
    }
    public void BakeryMenu_Back(InputEvent e){
// make Login control if()
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
    // FXML ID to objects.
    // UserRegistiration Fxml elements
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //                                          User Registiration
    public TextField UserID;
    public TextField UserPassWord;
    public TextField UserPhone;
    public TextField UserAdress;
    public void UserRegistiration_Register(InputEvent e){
// make Login control if()

        String a=UserID.getText() ;
        String b= UserAdress.getText();
        String c= UserPassWord.getText();
        String d= UserPhone.getText();
        Person person=new Person(a,c,d,b);

        db.WriteInformationID(person);
        db.WriteInformation(person);
        db.WriteInformationTelNo(person);
        db.WriteInformationPassWord(person);
        db.WriteInformationAdress(person);


        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/UserLogin.fxml")); // ileride hata ve onay mesajları eklenicek
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 420, 550);
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
    public void UserRegistiration_Back(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/UserLogin.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 420, 550);
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
    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//                                             Sepetim


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


//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //                                    Restourant List

    public  void RestourantList_Bucket(InputEvent e){
       // don nothing
    }
    public  void RestourantList_ExOrders(InputEvent e){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/ExOrders.fxml"));
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


    public void RestourantList_BackBtn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/UserLogin.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 420, 550);
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
    public void RestourantList_1Btn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/CinLokantasi.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 1255, 658);
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


    public void RestourantList_2Btn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/Kebapci.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 1255, 658);
            stage.setTitle("Yemek Sepeti FX   -Register-");
            stage.setScene(root);
            stage.show();
            final Node source = (Node) e.getSource();
            final Stage seagreen = (Stage) source.getScene().getWindow();
            seagreen.close();


        } catch (IOException Ex) {
            Ex.printStackTrace();
        }    }



    public void RestourantList_3Btn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/Pizzaci.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 1255, 658);
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



    public void RestourantList_4Btn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/Tatlici.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 1255, 658);
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


    public void RestourantList_5Btn(InputEvent e){
// make Login control if()
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/BakeryMenu.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 1255, 658);
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

    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    public void Exorders_Back(InputEvent e){
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

    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//                                     Restourant Register
    public  void RestourantRegister_RegisterBtn(InputEvent e){


        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/RestourantLogin.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 420, 550);
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

    public  void RestourantRegister_BackBtn(InputEvent e){


        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/RestourantLogin.fxml"));
            Stage stage = new Stage();
            Scene root = new Scene(fxmlLoader.load(), 645, 505);
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
    //----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //                          Restourant Login
    public void RestourantLogin_Comments(InputEvent e)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/CommentChineseRest.fxml"));
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
    public void RestourantLogin_Comments2(InputEvent e)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/CommentKebab.fxml"));
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
    public void RestourantLogin_Comments3(InputEvent e)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/CommentPizza.fxml"));
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
    public void RestourantLogin_Comments4(InputEvent e)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/CommentDessert.fxml"));
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
    public void RestourantLogin_Comments5(InputEvent e)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/GUI/CommentBakery.fxml"));
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

//---------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------------------------------------------------------------


}
