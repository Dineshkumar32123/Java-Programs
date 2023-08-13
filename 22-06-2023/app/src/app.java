import java.util.Scanner;
public class app {
    static Scanner s = new Scanner(System.in);
    static String Name = "DINESH";  //Global variable
    static long ph_no = 9944387074l;
    static String city = "Chennai";
//    static  {
//        String Name = "DINESH";  // local variable
//    }


    public static void main(String[] args) {
        int choice = 0;

        while(choice!=3){
            System.out.println("Enter the Choice:");
            System.out.println("\t 1. Login");
            System.out.println("\t 2. Details");
            System.out.println("\t 3. Logout");
            choice = s.nextInt();

        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                Details();
                break;
            case 3:
                break;
            default:
                System.out.println("Enter the valid number");
           }
        }
        System.out.print("Logout successful");
    }
    public static void login(){
        System.out.println("Login successful");
    }

    public static void Details() {
        System.out.println(Name);
        System.out.println(ph_no);
        System.out.println(app.city);
    }
}






