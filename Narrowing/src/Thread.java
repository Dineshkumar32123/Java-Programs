//
//import java.util.*;
//class Thread{
//    static Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) throws Exception {
////        System.out.println("Enter your age :");
////        double age = sc.nextDouble();
////        System.out.println("processing....");
////        java.lang.Thread.sleep(1000);
//        System.out.println("your Age is "+ age);
//    }
//}
import java.util.*;
class A1{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws  Exception {
        System.out.println("Enter Your mobile Number :");
        long num = sc.nextLong();
        java.lang.Thread.sleep(2000);
        System.out.println("processing...");
        java.lang.Thread.sleep(1000);
        System.out.println("Retriving your OTP...");
//        int otp = sc.nextInt();
        int otp = (int)(Math.random()*9999+9999);
        java.lang.Thread.sleep(1000);
        System.out.println("Your mobile number is: "+num+" and Your OTP is: "+otp);


    }
}
