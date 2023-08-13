import java.util.Scanner;

public class Factors {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        for(int i = 1;i<=a;i++){
            if(a%i==0)
                System.out.println("The factor given num is "+i);
        }
    }
}
