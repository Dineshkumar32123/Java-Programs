package constructor;

public class Bike {
    String model;
    String color;
    String b_name;
    int price;
    String eng_cc;

    Bike(String model){
        this.model=model;
    }
    Bike(String model,String color){
        this(model);
        this.color=color;
    }

    Bike(String model,String color,String b_name){
        this(model, color);
        this.b_name=b_name;
    }
    Bike(String model,String color,String b_name,int price){
        this(model, color, b_name);
        this.price=price;
    }
    Bike(String model,String color,String b_name,int price,String eng_cc){
        this(model, color, b_name, price);
        this.eng_cc=eng_cc;
    }


}
