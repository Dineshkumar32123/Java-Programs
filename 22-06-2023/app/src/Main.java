import java.util.Scanner;
public class Main {
    static Scanner s = new Scanner(System.in);
     static  String BRANCH_NAME ="VADAPALANI";
     static int fees = 30000;
     static int no_Placement = 300;

    static {
        System.out.println("\t\t\t\t WELCOME TO Q-SPIDER");
    }
    public static void main(String[] args){
        int choice = 0;

        while (choice != 3) { //while !=3
            System.out.println("Choose the task");
            System.out.println("\t1.Login");
            System.out.println("\t2.qSpider_Details");
            System.out.println("\t3.Logout");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    qSpiders();
                    break;
                case 3:

                    break;
                default:
                    System.out.println("Enter the valid number");
                    break;
            }
        }
        System.out.println("Logout successful");
    }
        public static void login(){
            System.out.println("Login successfully...");
        }
        public static void qSpiders(){
            System.out.println("Branch Name: "+BRANCH_NAME);
            System.out.println("Fees: "+fees);
            System.out.println("No. of placements: "+no_Placement);
        }
}


