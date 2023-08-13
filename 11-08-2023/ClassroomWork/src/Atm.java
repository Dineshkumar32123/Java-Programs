abstract class Atm {
    public abstract String bname();
    public abstract double withdraw();
    public abstract double deposit();
    public abstract double balance();
}
class Child extends Atm{
    String bname;
    double withdraw;
    double deposit;
    double balance;
    Child(String bname,double withdraw, double deposit, double balance){
        this.bname=bname;
        this.withdraw=withdraw;
        this.deposit=deposit;
        this.balance=balance;
    }
    @Override
    public String bname(){
        return bname;
    }
    @Override
    public double withdraw(){
        return withdraw;
    }
    @Override
    public double deposit(){
        return deposit;
    }
    @Override
    public double balance(){
        return balance;
    }
}