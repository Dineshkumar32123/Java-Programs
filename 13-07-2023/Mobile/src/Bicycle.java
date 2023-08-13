public class Bicycle {
    String brand;
    int price;
    int noOfGears;
    String color;

    Bicycle(){

    }
    Bicycle(String brand ){
        this();
        this.brand=brand;
    }
    Bicycle(String brand, int price){
        this(brand);
        this.price=price;
    }
    Bicycle(String brand, int price,int noOfGears){
        this(brand, price);
        this.noOfGears=noOfGears;
    }
    Bicycle(String brand, int price,int noOfGears,String color){
        this(brand,price,noOfGears);
        this.color=color;
    }
}
