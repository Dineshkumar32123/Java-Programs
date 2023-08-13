import java.util.Scanner;
public class calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value of a ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b ");
        int b = sc.nextInt();
        add(a, b);
        sub(a, b);
        multiplication(a, b);
        division(a, b);
        remainder(a, b);
    }

    public static void add(int a, int b) {
        System.out.println("The addition of two numbers is "+ (a + b));
    }

    public static void sub(int a, int b) {
        System.out.println("The subraction of two numbers is "+(a-b));
    }

    public static void multiplication(int a, int b) {
        System.out.println("The Multiplication of two numbers is "+(a * b));
    }

    public static void division(int a, int b) {
        System.out.println("The Division of two numbers is "+(a / b));
    }

    public static void remainder(int a, int b) {
        System.out.println("The Remainder of two numbers is "+(a % b));
    }
}
