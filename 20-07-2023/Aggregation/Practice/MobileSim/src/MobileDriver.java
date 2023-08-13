import java.util.Scanner;

public class MobileDriver {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the brand name: ");
        String brand = sc.next();
        System.out.println("Enter the ram: ");
        String ram = sc.next();
        System.out.println("Enter the price: ");
        int price = sc.nextInt();
        Mobile m=new Mobile(brand,ram,price);

        //
        System.out.println("Choose one: ");
        System.out.println("1.Insertsim\n2.removesim\n3.getsim");
        int choice= sc.nextInt();
        boolean flag=true;
        do {

            switch (choice){
                case 1:{
                    System.out.println("enter simno: ");
                    int simno= sc.nextInt();
                    System.out.println("enter s_provider: ");
                    String s_provider = sc.next();
                    m.insertSim(simno,s_provider);
                    break;
                }
                case 2:{
                    System.out.println("Sim is removing..");
                      m.removeSim();
                    break;
                }
                case 3: {
                    m.getSimno();
                    break;
                }

            }
        }while(flag);




    }
}
