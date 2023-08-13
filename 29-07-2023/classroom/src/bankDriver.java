//import java.util.Scanner;

public class bankDriver {
//    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank b = new Bank();

        System.out.println("----Bank Details-----");
        System.out.println(" Bank name: "+b.getbankname("ICICI"));
//        b.setrateOfInterest(roi);
        System.out.println("Rate of interest: "+b.getrateOfInterest(20));
//        b.setbranch("Banglore");
        System.out.println("Branch name: "+b.getbankname("Bangalore"));
        System.out.println("-----Customer Details-----");
        b.customerDetails("bharani",994438,999999);

    }
}
