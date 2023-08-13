import java.util.Scanner;
public class factor {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        int a = s.nextInt();
        fact(a);
    }
    public static void fact(int a){
        int b=1 ;
        for(int i=1;i<=a;i++){
            b=b*i;
        }
        System.out.println("The factorial of given number is :"+b);
    }
}