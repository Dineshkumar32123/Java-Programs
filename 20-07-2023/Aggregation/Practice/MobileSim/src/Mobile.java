public class Mobile {
   String brand;
   String ram;
   int price;
   Sim s;

   Mobile(String brand,String ram,int price){
       this.brand=brand;
       this.ram=ram;
       this.price=price;
   }
   public void insertSim(int simno,String s_provider){
       s = new Sim( simno,  s_provider);
   }
   public void removeSim(){
       s=null;
       System.out.println("sim removed..");
   }
   public void getSimno(){
       System.out.println("The sim number is: "+s.simno);
   }

}