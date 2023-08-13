import java.util.Scanner;
public class Qspiders {
    static Scanner scanner = new Scanner(System.in);
    static String branch = "VADAPALANI";
    static int fees = 30000;
    static int no_Placements = 100;

    public static void login() {
        System.out.println("LOGIN SUCCESSFUL");
    }
    public static void QspidersDetails(){
        System.out.println("=====================");
        System.out.println(branch);
        System.out.println(fees);
        System.out.println(no_Placements);
        System.out.println("======================");
    }
    public static void logout(){
        System.out.println("LOGOUT SUCCESSFUL");
    }
}

