package tabrez;

public class Bike {
    String bname,color;
    double bprice;
    Tyre t1,t2;

    Bike(){
        //L.I
    }
    public Bike(String bname,String color,double bprice,Tyre t1,Tyre t2){
        //L.I
        this.bname=bname;
        this.color=color;
        this.bprice=bprice;
        this. t1 = t1;
        this.t2=t2;
    }
    //Behaviours
    public void detailsOfBike(){
        System.out.println("The name of the bike is: "+bname);
        System.out.println("The color of the bike is: "+color);
        System.out.println("The price of the bike is: "+bprice);
    }
    public void detailsOfTyre1(){
        t1.detailsOfTyre();
    }
    public void detailsOfTyre2(){
        t2.detailsOfTyre();
    }

    public static void main(String[] args) {
        System.out.println("\t\t\tBIKE-1:");
        Bike b = new Bike("RX-100","black",90000.0,new Tyre("CEAT","30MM",6500),new Tyre("MRF","40mm",7000));
        b.detailsOfBike();
        System.out.println("**********************************");
        System.out.println("---------Details of Tyre-1----------");
        b.detailsOfTyre1();
        System.out.println("---------Details of Tyre-2----------");
        b.detailsOfTyre2();
    }

}
