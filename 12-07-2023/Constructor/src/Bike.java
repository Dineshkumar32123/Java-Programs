public class Bike {
    String model;
    String price;
    String color;
    int engine_cc;
    int millage;
    int top_speed;


    Bike(String model){
        this.model = model;
    }
    Bike(String model,String price){
        this.model = model;
        this.price = price;
    }
    Bike(String model,String price,String color){
        this.model = model;
        this.price = price;
        this.color = color;
    }
    Bike(String model,String price,String color,int engine_cc){
        this.model = model;
        this.price = price;
        this.color = color;
        this.engine_cc=engine_cc;
    }
    Bike(String model,String price,String color,int engine_cc,int millage){
        this.model = model;
        this.price = price;
        this.color = color;
        this.engine_cc=engine_cc;
        this.millage=millage;
    }
    Bike(String model,String price,String color,int engine_cc,int millage,int top_speed){
        this.model = model;
        this.price = price;
        this.color = color;
        this.engine_cc=engine_cc;
        this.millage=millage;
        this.top_speed=top_speed;
    }
}