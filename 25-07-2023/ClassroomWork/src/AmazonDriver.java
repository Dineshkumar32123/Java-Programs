import java.util.Scanner;

public class AmazonDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the appname: ");
        String appName=sc.next();
        System.out.println("Enter the customername: ");
        String customerName=sc.next();
        Amazon a = new Amazon(appName,customerName); //obj for amazon
//        Basics b = new Basics(); //obj for basics
//        Allensolly as = new Allensolly(); //obj for allensolly

//        System.out.println("=======Amazon Details=========");
//        System.out.println(a.appName);
//        System.out.println(a.customerName);
//        System.out.println("=======Basics Details=========");
//        System.out.println(b.shirtPrice);
//        System.out.println(b.appName);
//        System.out.println(b.customerName);
//        System.out.println("=======Allensolly Details=========");
//        System.out.println(as.discount);
//        System.out.println(as.shirtPrice);
//        System.out.println(as.appName);
//        System.out.println(as.customerName);


        a.amazonDetails();
//        as.basicsDetails();
//        as.allensollyDetails();
    }

}
