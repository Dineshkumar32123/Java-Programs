import java.util.*;
class Thread{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter your age :");
        double age = sc.nextDouble();
        System.out.println("processing....");
        Thread.sleep(1000);
        System.out.println("your Age is :"+ age);



    }
}
