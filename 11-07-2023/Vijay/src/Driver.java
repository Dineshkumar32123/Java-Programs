import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of ename");
        String name = s.next();
        System.out.println("Enter the value od employee id");
        int id = s.nextInt();
        Employee e = new Employee(name,id);
        System.out.println("====EMPLOYEE DETAILS====");
        System.out.println(e.ename);
        System.out.println(e.eid);
    }
}
