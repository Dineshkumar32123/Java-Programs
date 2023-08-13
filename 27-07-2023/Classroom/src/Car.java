public class Car {
        String brand;
        Car(String brand){
            this.brand = brand;
        }
    }
    class Bike extends Car {
        double price;
        Bike(double price,String brand){
            super(brand);
            this.price=price;

        }
    }
    class BikeDriver{
        public static void main(String[] args) {
            Car c =new Bike(40000,"Audi");
            System.out.println(c.brand);
//        System.out.println(c.price);// CTE because we cannot access child class from parent class
        }
    }

