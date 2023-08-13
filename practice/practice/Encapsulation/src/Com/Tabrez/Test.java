package Com.Tabrez;

public class Test {
    private String color="Black";
    private int Age=22;
    //cons
    Test(){
        //L>I
    }
    //helper methods
    public String getColor(){return color;}
    public int getAge(){return Age;}
    public void setColor(String new_clr){
        color=new_clr;
    }
    public void setAge(int new_Age){
        Age=new_Age;
    }
}
