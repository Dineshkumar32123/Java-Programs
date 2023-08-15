public interface Manager extends Employee {
    public abstract String  mname();

}
class Student implements Manager{
    @Override
    public void ename(){
        System.out.println("Virat");
    }
    public void eid(){
        System.out.println("321");
    }
    public void salary(){
        System.out.println("35000");
    }
    public String mname(){
        return "Dinesh";
    }
}
