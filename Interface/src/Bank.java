public abstract class Bank {
    public abstract String bname();
    abstract void loc(String loc);
    abstract void roi();
}

class  Child extends Bank{
    @Override
    public String bname() {
        return "SBI";
    }
    public void loc(String loc){
        System.out.println(loc);
    }
    public void roi(){
        System.out.println("Rate of interest is: 8%");
    }

}