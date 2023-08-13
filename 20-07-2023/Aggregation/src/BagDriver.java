import java.util.Scanner;

public class BagDriver {
    static Scanner s = new Scanner(System.in);
    static boolean flag =true;
    public static void main(String[] args)  throws Exception
    {
        System.out.println("******************************************");
        System.out.println("Enter the bag colour:");
        String color = s.next();
        Thread.sleep(1000);
        System.out.println("Enter the bag price:");
        double bprice = s.nextDouble();
        Bag bag = new Bag(color,bprice);
        Thread.sleep(1000);
        do{
            System.out.println("**********  Choose the task ****************");
            System.out.println("1.addBook \n2.removebook \n3.getBookName");
            int choice = s.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter book name : ");
                    String bname = s.next();
                    System.out.println("Enter book id:");
                    int bid = s.nextInt();
                    System.out.println("Enter book price:");
                    double price = s.nextDouble();
                    bag.addBook(bname,bid,price);
                }
                break;
                case 2:
                {
                    bag.removeBook();
                }
                break;
                case 3:
                {
                    bag.getBookName();
                }
                break;
                default:
                {
                    System.out.println("Enter correct option!!...");

                }
                break;
            }
        }
        while(flag);

    }
}
