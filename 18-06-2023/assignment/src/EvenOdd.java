import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number a:");
        int n = s.nextInt();
        oddeven(n);
    }
    public static void oddeven(int n){
        if(n%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }
}
