package exception;

public class ClassDriver {
    public static void main(String[] args) {
        try {
            Class_A aref = new Class_A();
            Class_B bref = new Class_B();
//            System.out.println(aref.a);

            Class_B bref1 = (Class_B) aref;
        }catch(ClassCastException ce){
            System.out.println("Handeled");
        }
    }
}
