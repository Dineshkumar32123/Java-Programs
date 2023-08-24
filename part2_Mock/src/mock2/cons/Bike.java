package mock2.cons;

public class Bike {
    String bname;
    String bid;

    Bike(){}
    Bike(String bname){
        this.bname=bname;
    }
    Bike(String bname,String bid){
        this.bname=bname;
        this.bid=bid;
    }
}
class BikeDriver{
    public static void main(String[] args) {
        Bike b = new Bike("R15");
        Bike b1 = new Bike("Rx100","32123");
        System.out.println(b.bid);
        System.out.println(b.bname);
        System.out.println("==============");
        System.out.println(b1.bid);
        System.out.println(b1.bname);


    }
}
