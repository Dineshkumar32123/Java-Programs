public class Amazon {
    String appName;
    String customerName;
    Amazon(String appName,String customerName){
        this.appName=appName;
        this.customerName=customerName;
    }

    public void amazonDetails(){
        System.out.println("App name: "+appName);
        System.out.println("Customer name: "+customerName);
    }
}
//class Basics extends Amazon{
//    Basics(int shirtPrice){
//        this.shirtPrice=shirtPrice;
//    }
//    int shirtPrice=200;
//    public void basicsDetails(){
//        System.out.println("Shirt price: "+shirtPrice);
//    }
//}
//
//class Allensolly extends Basics{
//    String discount ="50%";
//    Allensolly(String discount){
//        this.discount=discount;
//    }
//    public void allensollyDetails(){
//        System.out.println("Discount: "+discount);
//    }
//}