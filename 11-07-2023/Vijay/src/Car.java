public class Car {
    String brandName;
    String color;
    int price;

    Car(String brandName,String color,int price){
        this.brandName=brandName;
        this.color=color;
        this.price=price;
    }
    public static void main(String[] args) {
        Car c = new Car("Audi","Black",500000);
        System.out.println(c.brandName);
        System.out.println(c.color);
        System.out.println(c.price);
    }
}