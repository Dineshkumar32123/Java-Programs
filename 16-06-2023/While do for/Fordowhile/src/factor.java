import java.util.Scanner;
public class factor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = s.nextInt();
        for(int i =1;i<=n;i++){
            if(n%i==0){
                System.out.println("The factors of number is :"+i);
            }
        }
//                System.out.println("The factor of the number is :"+n);
//        System.out.println("The factor is :"+a);
    }
}
