public class Laptop {
    String ram = "RAM-8GB";
    String processor = "PROCESSOR-Ryzen 5";
    String colour = "COLOUR-Blue";
    String brand = "BRAND-Asus";
    String price = "PRICE-54000";
    public void laptopDetails(){
        System.out.println("   * This laptop is used to studying programmings and writing logics by using JAVA ");
    }

    public static void main(String[] args) throws Exception {
        Laptop ref = new Laptop();
        System.out.println("===============");
        Thread.sleep(1000);
        System.out.println(ref.ram);
        Thread.sleep(1000);
        System.out.println(ref.processor);
        Thread.sleep(1000);
        System.out.println(ref.colour);
        Thread.sleep(1000);
        System.out.println(ref.brand);
        Thread.sleep(1000);
        System.out.println(ref.price);
        Thread.sleep(1000);
        System.out.println("=================");
        System.out.println("Details: ");
        Thread.sleep(1000);
        ref.laptopDetails();
    }

}
