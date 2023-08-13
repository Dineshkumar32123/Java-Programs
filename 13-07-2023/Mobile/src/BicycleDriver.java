import java.util.Scanner;

public class BicycleDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the brand: ");
        String brand=scanner.next();
        System.out.println("Enter the price: ");
        int price=scanner.nextInt();
        System.out.println("Enter the no of Gears: ");
        int gears = scanner.nextInt();
        System.out.println("Enter the color: ");
        String color = scanner.next();
        Bicycle b = new Bicycle(brand,price,gears,color);
        System.out.println("====CYCLE DETAILS====");
        System.out.println(b.brand);
        System.out.println(b.price);
        System.out.println(b.noOfGears);
        System.out.println(b.color);
        System.out.println("------------------------");
    }
}
