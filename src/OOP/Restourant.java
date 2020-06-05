package OOP;

import DataBase.Path;

import java.io.File;


public class Restourant {
    private String Name;
    private String Slogan;
    private String Adress;
    private  String yorum;
    private double Star;

    Path p=new Path();

    // private String Yorumlar;
private Person person;



    public Restourant() {
        Name = " Bos ";
        Slogan = " Bos ";
        Adress = " Bos ";
        new File(p.getRestourantPath()+"\\"+this.Name).mkdirs();
    }

    public Restourant(String name) {
        Name = name;
        new File(p.getRestourantPath()+"\\"+this.Name).mkdirs();
    }

    public Restourant(String name, String slogan, String adress,Person person) {
        Name = name;
        Slogan = slogan;
        Adress = adress;
        this.person=person;
        new File(p.getRestourantPath()+"\\"+this.Name).mkdirs();

    }

    public Restourant(String name, String Adress) {
        Name = name;
        this.Adress = Adress;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSlogan() {
        return Slogan;
    }

    public void setSlogan(String slogan) {
        Slogan = slogan;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    @Override
    public String toString() {
        return "Restourant{" +
                "Name='" + Name + '\'' +
                ", Slogan='" + Slogan + '\'' +
                ", Adress='" + Adress + '\'' +
                '}';
    }




}
