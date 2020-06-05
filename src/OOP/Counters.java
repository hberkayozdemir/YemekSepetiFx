package OOP;
import javafx.scene.control.Label;

public class Counters {
private  int Count;



public void increaseCount(){
    this.Count+=1;

}
public void DecreaseCount(){
    this.Count-=1;
}
public void ZeroCount(){
    this.Count=0;
}


    public Counters(){

    }
    public void LabelSetter(Label label){

        label.setText(Integer.toString(this.Count));
    }



}
