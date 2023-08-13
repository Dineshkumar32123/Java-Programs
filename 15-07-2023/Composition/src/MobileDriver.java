public class MobileDriver {
    public static void main(String[] args) {
        Mobile m = new Mobile("Samsung",45000.00,new Battery("lithiyam ion","5v"));
        System.out.println("*******Mobile Details******");
        System.out.println("Brand: "+m.brand);
        System.out.println("Price: "+m.price);
        System.out.println("*******Battery Details******");
        System.out.println("Type: "+m.b.type);
        System.out.println("Voltage: "+m.b.voltage);

    }
}
