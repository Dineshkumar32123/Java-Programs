package mock2.encapsulation;

public class Student {
    private String sname;
    private int sid;

    Student(){}
    Student(String sname,int sid){this.sname=sname;this.sid=sid;}
    //method
    public String getSname(){
        return sname;
    }
    public void setSname(String sname){
        this.sname=sname;
    }

    //getter setter for sid
    public int getSid(){
        return sid;
    }
    public void setSid(int sid){
        this.sid=sid;
    }
}
class SDriver{
    public static void main(String[] args) {
        Student s = new Student("Dinesh",123);
        System.out.println(s.getSname());
        s.setSname("Bharani");
        System.out.println(s.getSname());
        System.out.println(s.getSid());
        s.setSid(33);
        System.out.println(s.getSid());
    }
}
