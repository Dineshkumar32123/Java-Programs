public class BankDriver {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("*********************");
        System.out.println(c.bname());
        c.loc("Chennai");
        c.roi();
        System.out.println("*********************");
        //upcasting
        Bank b = new Child();
        System.out.println(c.bname());
        b.loc("Malaysia");
        b.roi();
        System.out.println("*********************");
        //downcasting
        Child c1= (Child) b;
        System.out.println(c1.bname());
        c1.loc("TN");
        c1.roi();
    }
}
