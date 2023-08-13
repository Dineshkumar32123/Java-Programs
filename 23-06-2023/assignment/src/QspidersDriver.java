import java.util.Scanner;

public class QspidersDriver {
    static Scanner scanner = new Scanner(System.in);
        static{
            System.out.println("\t\t\t\tWELCOME TO QSPIDERS");
        }
        static boolean flag = true;
    public static void main(String[] args) {
            do{
                System.out.println("Choose the task:");
                System.out.println("\t1.LOGIN");
                System.out.println("\t2.QSPIDERS_DETAILS");
                System.out.println("\t3.LOGOUT");
                int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    Qspiders.login();
                    break;
                case 2:
                    Qspiders.QspidersDetails();
                    break;
                case 3:
                    Qspiders.logout();
                    flag = false;
                    break;
                default:
                    System.out.println("Please Enter the valid number");
                }
            }while(true);
    }
}