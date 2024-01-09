import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    String name;
    int id;
    int age;
    Student(){}
    Student(String name,int id,int age){
        this.name=name;
        this.id=id;
        this.age=age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Dinesh",123,22);
        Student s2 = new Student("Bharani",321,22);
        Student s3 = new Student("Sam",456,5);

        List<Student> l = new ArrayList<>();
        l.add(s1);
        l.add(s2);
        l.add(s3);

        Iterator i = l.listIterator();
        while(i.hasNext()){
//            System.out.println(i.next());
            Student s = (Student)i.next();
        }
        System.out.println("Student name: "+s1.name+"\nStudent id: "+s1.id+"\nAge: "+s1.age);
        System.out.println();
        System.out.println("Student name: "+s2.name+"\nStudent id: "+s2.id+"\nAge: "+s2.age);
        System.out.println();
        System.out.println("Student name: "+s3.name+"\nStudent id: "+s3.id+"\nAge: "+s3.age);
    }
}
