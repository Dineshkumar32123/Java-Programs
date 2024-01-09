import java.util.ArrayList;
import java.util.Iterator;

public class Car {
    String brand;
    int carNum;
    double price;

    Car(){}
    Car(String brand, int carNum, double price){
        this.brand=brand;
        this.carNum=carNum;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", carNum=" + carNum +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car c1 = new Car("Audi",123,1400000);
        Car c2 = new Car("Benz",123,1400000);
        Car c3 = new Car("BMW",321,130000);

        ArrayList<Car> al = new ArrayList<>();
        al.add(c1);
        al.add(c2);
        al.add(c3);

        for (Car a: al) {
            System.out.println(a);
        }
    }
}
