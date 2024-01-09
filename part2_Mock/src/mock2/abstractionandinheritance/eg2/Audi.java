package mock2.abstractionandinheritance.eg2;

public class Audi extends Car implements Machine {


    @Override
    public void accelerate(int a) {
        System.out.println("The acceleration speed of audi is: "+a+"km/hr");
    }

    public void slowDown(int a){
        System.out.println("The audi is slowdowned to: "+a+"km/hr");
    }

    public void start(){
        System.out.println("Audi car is started to ride...");
    }
    public void stop(){
        System.out.println("Audi car is Stopped...");
    }

}
