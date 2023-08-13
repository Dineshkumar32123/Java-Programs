import java.util.Scanner;

public class Signup {
    static  int sid;
    static int pwd;
    static long contact;
    static boolean student_did_signup= false;
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {


        if (student_did_signup = false) {
            //New user
            System.out.println("Please enter sid");
            int sid = sc.nextInt();
            System.out.println("please enter password ");
            int pwd = sc.nextInt();
            System.out.println("please enter your Contact number");
            long contact = sc.nextLong();
//            student_did_signup==true;
            System.out.println("Signup done");

        }
        else{
            System.out.println("please login");
        }
    }

}