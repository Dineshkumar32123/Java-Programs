package mock2.encapsulation;

public class Student{
    private String name ="Dinesh";
    private int id =321;
    Student(){

    }
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public void setname(String name,int id){
        this.name=name;
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

}
class StudentDriver{
    public static void main(String[] args) {
        Student s=new Student();
//        System.out.println(s.getname());
        s.setname("Bharani",123);
        System.out.println(s.getname());
        System.out.println(s.getid());
    }
}
