import java.util.Scanner;

public class methodDriver {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        boolean flag = true;
        System.out.println("-------------CALCULATOR----------");
        do {
            System.out.println("\tChoose the option");
            System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
            System.out.println("Enter the choice: ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1: {
                    MethodPara.add(a, b);
                }
                break;
                case 2: {
                    MethodPara.sub(a, b);
                }
                break;
                case 3: {
                    MethodPara.multi(a, b);
                }
                break;
                case 4: {
                    MethodPara.div(a, b);
                }
                break;
                default: {
                    System.out.println("please enter the valid number...!");
                    flag=false;
                }
            }
        } while (flag);
    }
}
