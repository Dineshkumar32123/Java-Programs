public class customerDriver {
    public static void main(String[] args) {
        Customer c = new Customer("Dinesh",987654321,15033.2,"Indian bank","T.v.malai","idbi007234");
        System.out.println("===========Bank Details============");
        System.out.println("customer name: "+c.cname);
        System.out.println("Account no: "+c.accNo);
        System.out.println("Balance: "+c.balance);
        System.out.println("Bank name: "+c.BankName);
        System.out.println("Branch: "+c.branch);
        System.out.println("IFSC code: "+c.ifsc_code);
    }
}
