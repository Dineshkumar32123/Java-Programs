import java.util.Scanner;

class olaDriver{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Enter the customer name: ");
        String cname = sc.next();
        System.out.println("Enter the password: ");
        int password = sc.nextInt();
        System.out.println("Enter the contact number: ");
        long cnum = sc.nextLong();
        ola o =new ola(cname,password,cnum); //obj for ola
        mini m1 = new mini(15,cname,password,cnum);//obj for mini
        macro m2 = new macro(30,cname,password,cnum);//obj for mini
        sedan s = new sedan(50,cname,password,cnum);//obj for mini


        System.out.println("\tChoose the vehicle: ");
        System.out.println("1.MINI\n2.MACRO\n3.SEDAN");
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        Thread.sleep(1000);
        System.out.println("Enter the kilometers: ");
        int kmeter = sc.nextInt();
        Thread.sleep(1000);
        if (a==1){
            System.out.println("Cab is booking...");
            Thread.sleep(1000);
            System.out.println("\t\t MINI cab booked ");
            Thread.sleep(1500);
            System.out.println("Pay rs."+kmeter*m1.mini_price);
            System.out.println("\t\tHappy journey...!  Stay safe...!");
        } else if (a==2) {
            System.out.println("Cab is booking...");
            Thread.sleep(1000);
            System.out.println("*** Macro booked ***");
            Thread.sleep(1500);
            System.out.println("Pay rs."+kmeter* m2.macro_price);
            System.out.println("\t\tHappy journey...!  Stay safe...!");
        } else if (a==3) {
            System.out.println("Cab is booking...");
            Thread.sleep(1000);
            System.out.println("*** Sedan booked ***");
            Thread.sleep(1500);
            System.out.println("Pay rs."+kmeter* s.sedan_price);
            System.out.println("\t\tHappy journey...!  Stay safe...!");
        }
        else {
            System.out.println("Processing.....");
            Thread.sleep(1000);
            System.out.println("Enter the valid cab number...!");
            Thread.sleep(800);
            System.out.println("Thank you!!!");
        }
    }
}