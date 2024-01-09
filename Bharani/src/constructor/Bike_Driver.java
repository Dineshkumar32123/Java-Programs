package constructor;

public class Bike_Driver {
    public static void main(String[] args) {
        Bike b = new Bike("rx100");
        Bike b1 = new Bike("Dio","Black");
        Bike b2 = new Bike("RE","blue","Yamaha");
        Bike b3 = new Bike("Hero honda","brown","hero",30000);
        Bike b4 = new Bike("Scooty","red","abc",50000,"150cc");

        System.out.println(b4.eng_cc);
        System.out.println(b.model);


    }
}
