public class Bank {
    private String bankname; //r
    private double rateOfInterest;  //r&w
    private String branch;  //r&w
//            String cname ;
//            int accno;
//            double balance;
    public String getbankname(String bname){
        bankname = bname;
        return bankname;
    }
    public double getrateOfInterest(double roi){
        rateOfInterest=roi;
        return rateOfInterest;
    }
    public void setrateOfInterest(double roi ){
        rateOfInterest=roi;
    }
    public String getbranch(){
        return branch;
    }
    public void setbranch(String branch){
        this.branch=branch;
    }
    public void customerDetails(String cname,int accno,double balance){
        System.out.println("Customer name: "+cname);
        System.out.println("account no: "+accno);
        System.out.println("balance: "+balance);
    }

}