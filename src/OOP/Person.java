package OOP;
import DataBase.Path;

import java.io.File;

public class Person {
Path pp=new Path();


    private String ID;
    private String Password;
    private String TelNo;
    private String adress;
    private String Siparis;

    public Person(String ID, String password, String telNo, String adress) {
        this.ID = ID;
        Password = password;
        TelNo = telNo;
        this.adress = adress;
        new File(pp.getUserPath()+this.ID).mkdirs();
        System.out.println("Oldu");
        // file directory reating with consructor

    }

    public Person() {
        this.ID="Girilmedi";
        this.Password=" ";
        this.TelNo=" ";
        this.adress="Adres girilmedi...";
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getTelNo() {
        return TelNo;
    }

    public void setTelNo(String telNo) {
        TelNo = telNo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "ID='" + ID + '\'' +
                ", Password='" + Password + '\'' +
                ", TelNo=" + TelNo +
                ", adress='" + adress + '\'' +
                '}';
    }
}
