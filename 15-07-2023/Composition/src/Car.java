public class Car {
    String brand;
    String color;
    Engine e;

    Car(String brand,String color,Engine e){
        this.brand = brand;
        this.color = color;
        this.e=e;
    }

    public static void main(String[] args) {
        Car c = new Car("Audi","Blue",new Engine(2000,586));
        System.out.println(c.brand);
        System.out.println(c.color);
        System.out.println(c.e.engcc);
        System.out.println(c.e.engnum);
    }


}