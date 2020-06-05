package DataBase;
import OOP.Person;
import OOP.Restourant;

public class Path {
    private String path="./DataBase";
    // burası aslında null du otomatik kullanıcı secicekti ama olmadı:(
    // bir sonraki update te halledicem
    private String UserPath=path+"\\Users\\";
    private String RestourantPath=path+"\\Restoruants\\";
//C:\Users\berko\OneDrive\Masaüstü\Dosya\\Restoruants\\
    public String getPath() {
        return path;
    }

    public  String getUserPath(){
    return UserPath;
}
public String getRestourantPath(){
    return RestourantPath;
}

    public void setPath(String path) {
        this.path = path;
    }

    public void setRestourantPath(String restourantPath) {
        RestourantPath = restourantPath;
    }

    public String PathGenerator(Person p, String Parameter){

        if(Parameter.equals("ID")){
            return getUserPath()+p.getID()+"\\"+"ID.txt";
        }
        else if(Parameter.equals("PassWord")){
            return getUserPath()+p.getID()+"\\"+"Password.txt";

        }
        else if(Parameter.equals("TelNo")){
            return getUserPath()+p.getID()+"\\"+"TelNo.txt";
        }
        else if(Parameter.equals("Adress")){
            return getUserPath()+p.getID()+"\\"+"Adress.txt";
        }
        else if(Parameter.equals("All")){
            return getUserPath()+p.getID()+"\\"+"Informations.txt";
        }
        else{
            return getUserPath()+p.getID()+"\\"+"ERROR.txt";
        }

    }
    public  String RestoruantPathGenarator(Restourant R,String Parameter){

        if(Parameter.equals("Name")){
            return getRestourantPath()+R.getName()+"\\"+"Name.txt";
        }
        else if(Parameter.equals("Slogan")){
            return getRestourantPath()+R.getName()+"\\"+"Slogan.txt";

        }
        else if(Parameter.equals("Adress")){
            return getRestourantPath()+R.getName()+"\\"+"Adress.txt";
        }
        else if(Parameter.equals("All")){
            return getRestourantPath()+R.getName()+"\\"+"Information.txt";
        }
        else if(Parameter.equals("Star")){
            return getRestourantPath()+R.getName()+"\\"+"Star.txt";
        }
        else if(Parameter.equals("PassWord")){
            return getRestourantPath()+R.getName()+"\\"+"PassWord.txt";
        }
        else{
            return getRestourantPath()+R.getName()+"\\"+"Error.txt";
        }
    }
}
