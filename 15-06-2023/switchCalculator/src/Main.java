import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter value a");
        int a = sc.nextInt();
        System.out.println("enter value b");
        int b = sc.nextInt();
        System.out.println("choose a task");
        System.out.println("\n 1.Add \n 2.sub \n 3.multi \n 4.Division \n 5.mod");
        int c = sc.nextInt();
        switch(c){
            case 1:
            {
                System.out.println("Add of a and b is: "+(a+b));
            }break;
            case 2:
            {
                System.out.println("sub of a and b is: "+(a-b));
            }break;
            case 3:
            {
                System.out.println("mul of a and b is: "+(a*b));
            }break;
            case 4:
            {
                System.out.println("Divi of a and b is: "+(a/b));
            }break;



        }
    }
}