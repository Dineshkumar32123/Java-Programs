public class Main {
     String variableName = "water bottle";
     double height = 15.5;
     int weight = 3;
     public void bottleDetails(){
         System.out.println("   Used to carry and drink water");
     }

    public static void main(String[] args) throws Exception {
         Main ref_name=new Main(); //object creation
        System.out.println("---------------------");
        System.out.println(ref_name.variableName);
        System.out.println(ref_name.height);
        System.out.println(ref_name.weight);
        System.out.println("-------------------");
        System.out.println("The Details are: ");
        ref_name.bottleDetails();

    }
}