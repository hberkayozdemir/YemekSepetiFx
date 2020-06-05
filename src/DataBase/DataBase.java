package DataBase;

import OOP.Person;
import OOP.Restourant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DataBase {
// person

    public boolean Adminread(String BOSSID,String BOSSPASSWORD){

        Path p=new Path();

        try (BufferedReader br = new BufferedReader(new FileReader(p.getRestourantPath()+BOSSID+"\\"+"BOSSPASS.txt"))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                if (BOSSPASSWORD.equals(sCurrentLine))
                {
                    return true;
                }
                else {
                    return  false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }
    public boolean read(String username,String Password){

        Path p=new Path();

        try (BufferedReader br = new BufferedReader(new FileReader(p.getUserPath()+username+"\\"+"Password.txt"))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                if (Password.equals(sCurrentLine))
                {
                    return true;
                }
                else {
                    return  false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }


    public String ReadIdfromSelectedID(String r){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.getUserPath()+r+"\\"+"ID.txt"), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String ReadPasswordFromSelectedID(String r){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream1 = Files.lines(Paths.get(pathh.getUserPath()+r+"\\"+"Password.txt"), StandardCharsets.UTF_8))
        {
            stream1.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();

    }

    public String ReadInformation(String ID){
    Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(String.valueOf(Paths.get(pathh.getUserPath()+ID+"\\"+"Informations.txt"))), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
}
    public String ReadInformationID(Person p){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.PathGenerator(p,"ID")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String ReadInformationPassWord(Person p){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.PathGenerator(p,"PassWord")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String ReadInformationTelno(Person p){
        Path pathh=new Path();
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.PathGenerator(p,"TelNo")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String ReadInformationAdress(Person p){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.PathGenerator(p,"Adress")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public  void WriteInformationID(Person p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"ID"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.getID());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  void WriteInformationPassWord(Person p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"PassWord"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.getPassword());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  void WriteInformationTelNo(Person p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"TelNo"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.getTelNo());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void WriteInformationAdress(Person p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"Adress"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.getAdress());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  void WriteInformation(Person p) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.PathGenerator(p,"All"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(p.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
// restourant
    public  void RestourantWriteInformation(Restourant R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.RestoruantPathGenarator(R,"All"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void RestourantWriteInformationName(Restourant R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.RestoruantPathGenarator(R,"Name"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  void RestourantWriteInformationSlogan(Restourant R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.RestoruantPathGenarator(R,"Slogan"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.getSlogan());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  void RestourantWriteInformationAdress(Restourant R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.RestoruantPathGenarator(R,"Adress"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.getAdress());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public  void RestourantWriteStar(Restourant R) {
        Path path=new Path();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(path.RestoruantPathGenarator(R,"Star"));
            //inherited method from java.io.OutputStreamWriter
            fileWriter.write(R.getAdress());

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Read Restourant String values

    public String RestourantReadInformationAdress(Restourant R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.RestoruantPathGenarator(R,"Adress")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String RestourantReadInformationName(Restourant R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.RestoruantPathGenarator(R,"Name")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String RestourantReadInformationSlogan(Restourant R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.RestoruantPathGenarator(R,"Slogan")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }

    public String RestourantReadInformation(Restourant R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.RestoruantPathGenarator(R,"All")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String RestourantReadStar(Restourant R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.RestoruantPathGenarator(R,"Star")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }
    public String RestourantReadPassword(Restourant R){
        Path pathh=new Path();

        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(pathh.RestoruantPathGenarator(R,"PassWord")), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return contentBuilder.toString();
    }


}