public class Mobile {
    String brand;
    String processor;
    int price;

    Mobile(){

    }
    Mobile(String brand){
        this();
        this.brand=brand;
    }
    Mobile(String brand,String processor){
        this(brand);
        this.processor=processor;
    }
    Mobile(String brand,String processor,int price){
        this(brand, processor);
        this.price=price;
    }
    public static void main(String[] args) {
        Mobile m = new Mobile("Iqoo","888",35000);
        System.out.println("Mobile brand: "+m.brand);
        System.out.println(m.processor);
        System.out.println(m.price);
    }
}