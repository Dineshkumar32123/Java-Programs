import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int choice = scanner.nextInt();  //145
        int given_No = choice;
        int temp = 0;
        int sum = 0;
        while (choice != 0) {
            temp = choice % 10;  //5
            sum = sum + fact(temp);  //--->0+1=1 1+2=3 3+3=6 6+4=10 10+5=15 ======>15
            choice = choice / 10;  //14
        }
        if (given_No == sum) {
            System.out.println(given_No + " is a strong number");
        } else {
            System.out.println(given_No + " is not a strong number");
        }


    }

    public static int fact(int temp){
        int i; int fact = 1;
        for(i=1;i<=temp;i++) {
            fact = fact * i; //1 2 3 4 5
        }
            return fact;
    }
}