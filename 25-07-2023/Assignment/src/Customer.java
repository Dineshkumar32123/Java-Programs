 class Customer extends Bank {
    String cname;
    long accNo;
    double balance;

    Customer(String cname,long accNo,double balance,String BankName,String branch,String ifsc_code){
        super(BankName,branch,ifsc_code);
        this.cname=cname;
        this.accNo=accNo;
        this.balance=balance;
    }
}
