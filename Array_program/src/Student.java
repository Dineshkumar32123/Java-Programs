public class Student extends Object{
    String sname="Dinesh";
    int sid=12;

    @Override
    public String toString() {
        return sname + " " + sid;
    }
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.toString());
    }
}