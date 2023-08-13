import java.util.*;
public class Primenum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=s.nextInt();
        boolean prime = isPrime(n);
        if(prime){
            System.out.println(n+" is prime number");
        }
        else{
            System.out.println(n+" is not prime number");
        }
    }
    public static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
