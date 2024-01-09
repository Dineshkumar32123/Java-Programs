package mock2.abstractionandinheritance.eg1;

public class VehicleDriver {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.changeGear(2);
        b.speedUp(130);
        b.applyBrake(1);

        Car c = new Car();
        c.speedUp(250);
        c.changeGear(5);
        c.applyBrake(3);

        b.detailsOfBicycle();
        c.detailsOfCar();
    }
}
