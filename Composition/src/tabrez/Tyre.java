package tabrez;

public class Tyre {
    String tname,size;
    double tprice;
    Tyre(){
        //L.I
         }
     Tyre(String tname,String size,double tprice){
        //L.I
        this.tname=tname;
        this.size=size;
        this.tprice=tprice;
    }
    //Behaviours
    public void detailsOfTyre(){
        System.out.println("The name of the tyre is: "+tname);
        System.out.println("The Size of the tyre is: "+size);
        System.out.println("The price of the tyre is: "+tprice);
    }

}
