import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
        static int temp = 0; static int sum = 0;
    public static void main(String[] args) {
        System.out.println("Enter the value of no: ");
        int choice = scanner.nextInt(); //145
        int given_No = choice;
        while(choice!=0){
            temp = choice%10; // temp = 5
            sum = sum + fact(temp); //0+1=1
            choice = choice/10; //14
        }
        if(given_No==sum){
            System.out.println(given_No+" is the strong number");
        }else{
            System.out.println(given_No+" is not a strong number");
        }

    }
    public static int fact(int temp){
        int fact = 1;
        for(int i = 1;i<=temp;i++){

            fact = fact*i; //1
        }
        return fact;
    }
}