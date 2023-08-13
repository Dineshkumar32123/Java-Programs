import java.util.Scanner;

public class BagDriver {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Choose the color of bag: ");
        String bag_color=sc.next();
        System.out.println("Choose the price: ");
        int bag_price = sc.nextInt();
        Bag bag = new Bag(bag_color,bag_price);
        do {
            System.out.println("\t\tChoose the task: ");
            System.out.println("1.Add Book\n2.Remove Book\n3.Get Bookname");
            int choice = sc.nextInt();
            switch(choice){
                case 1:{
                    System.out.println("Enter the Book name: ");
                    String book_name=sc.next();
                    System.out.println("Enter the Book id: ");
                    int book_id=sc.nextInt();
                    System.out.println("Enter the Price: ");
                    int book_price=sc.nextInt();
                    bag.addBook(book_name,book_id,book_price);
                    break;
                }
                case 2:{
                    bag.removebook();
                    break;
                }
                case 3:{
                    bag.getBookName();
                    break;
                }

            }
        }while(flag);
    }
}
