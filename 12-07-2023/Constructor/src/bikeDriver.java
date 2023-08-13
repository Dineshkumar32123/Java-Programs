public class bikeDriver {
    public static void main(String[] args) {
        Bike b = new Bike("Rx100");
        Bike b1 = new Bike("Rx100","Rs.100000");
        Bike b2 = new Bike("Rx100","Rs.100000","Black");
        Bike b3 = new Bike("Rx100","Rs.100000","Black",100);
        Bike b4 = new Bike("Rx100","Rs.100000","Black",100,30);
        Bike b5 = new Bike("Rx100","Rs.100000","Black",100,30,240);

        System.out.println("====Bike Details====");
        System.out.println("Model: "+b5.model);
        System.out.println("Price: "+b5.price);
        System.out.println("Color: "+b5.color);
        System.out.println("CC: "+b5.engine_cc);
        System.out.println("Millage: "+b5.millage);
        System.out.println("Top_speed: "+b5.top_speed);
    }
}
