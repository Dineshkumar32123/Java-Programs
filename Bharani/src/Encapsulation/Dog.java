package Encapsulation;

public class Dog {
    private String color = "Black";
    private int leg = 4;
   private int price = 10000;

//   Getter for color
    public String getColor(){
        return color;
    }

//    setter for color
    public void setColor(String color){
        this.color=color;
    }

//    getter for leg
    public int getLeg(){
        return leg;
    }
//    setter for leg
    public  void setLeg(int leg){
        this.leg = leg;
    }

}
