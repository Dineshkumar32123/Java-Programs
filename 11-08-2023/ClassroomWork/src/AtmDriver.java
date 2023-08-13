public class AtmDriver {
    public static void main(String[] args) {
        System.out.println("========By using Object=======");

//        Atm a = new Atm();
        Child c = new Child("SBI",3000,1000,99999.99);
        System.out.println("The bank name is:  "+c.bname());
        System.out.println("The withdrawal amount is: "+c.withdraw());
        System.out.println("The deposit amount is: "+c.deposit());
        System.out.println("The balance is:"+ c.balance());
        //upcasting
        System.out.println("========By using upcasting=======");

        Atm a = new Child("SBI",3000,1000,99999.99);
        System.out.println("The bank name is:  "+a.bname());
        System.out.println("The withdrawal amount is: "+a.withdraw());
        System.out.println("The deposit amount is: "+a.deposit());
        System.out.println("The balance is:"+ a.balance());
        //downcasting
        Child c1 = (Child) a;
        System.out.println("========By using Downcasting=======");
        System.out.println("The bank name is:  "+c1.bname());
        System.out.println("The withdrawal amount is: "+c1.withdraw());
        System.out.println("The deposit amount is: "+c1.deposit());
        System.out.println("The balance is:"+ c1.balance());

    }
}
