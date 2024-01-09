package mock2.relationship.is_a_relation.multi_level;

public class Person3 extends Person2{
    void p3(){
        System.out.println("This is from method of p3...");
    }

    public static void main(String[] args) {
    Person3 p3 = new Person3();

//    Person2 p2ref = new Person3();
        Person2 p2ref = new Person2();

        p3.p3();
        System.out.println(p3.p2());
        System.out.println(p3.p1());
        System.out.println();

        //upcast for person2
        System.out.println(p2ref.p2());
        System.out.println(p2ref.p1());
        System.out.println();

        //Person1
        Person1 p1ref= new Person1();
        System.out.println(p1ref.p1());

    }

}
