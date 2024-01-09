package mock2.abstractionandinheritance.eg1;

public class Car implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newgear){
        gear=newgear;
    }
    public void speedUp(int newspeed){
        speed=speed+newspeed;
    }
    public void applyBrake(int newbrake){
        speed=speed-newbrake;
    }
    public void detailsOfCar(){
        System.out.println("The speed of car is: "+speed+" km/hr "+" \nThe gear number is: "+gear);
    }
}
