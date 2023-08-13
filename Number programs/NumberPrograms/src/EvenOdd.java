import java.util.Scanner;
public class EvenOdd {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println(a+" is even number");
        }
        else
            System.out.println(a+" is odd number");

    }
}