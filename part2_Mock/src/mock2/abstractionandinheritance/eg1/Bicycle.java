package mock2.abstractionandinheritance.eg1;

public class Bicycle implements Vehicle {
    int speed;
    int gear;

    @Override
    public  void changeGear(int newgear){
        gear=gear+newgear;
    }
    public void speedUp(int newspeed){
        speed = speed+newspeed;
    }

    public void applyBrake(int newbrake){
        speed=speed-newbrake;
    }

    public void detailsOfBicycle(){
        System.out.println("The speed of the Bicycle is: "+speed+ " km/hr" + " \n The gear number of the bicycle is: "+gear);
    }
}
