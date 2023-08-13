import java.util.Scanner;
class Main{
    static  Scanner sc = new Scanner (System.in);

    public static void main(String[] args)throws Exception {

        System.out.println("Enter the value of A ");
        int a = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("Enter the value of B ");
        int b = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("==================CALCULATOR===================");
        System.out.println("The addition of A and B is " + (a+b));
        System.out.println("The Subraction of A and B is "+ (a-b));
        System.out.println("The Multiplication of A and B is "+ (a*b));
        System.out.println("The Division of A and B is " + (a/b));
        System.out.println("The Remainder of Division is " + (a%b));
        System.out.println("----------------------------------------------");
    }

}