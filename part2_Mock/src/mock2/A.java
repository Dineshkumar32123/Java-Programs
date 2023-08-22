package mock2;

//public class Ms1 {
//    public void sample(){
//        System.out.println("output of ms1...");
//    }
//}
//class Ms2 extends Ms1{
//    public void sample(){
//        System.out.println("output of ms2...");
//    }
//}
//class Ms2Driver{
//    public static void main(String[] args) {
//        Ms1 m1 = new Ms1();
//        Ms2 m2 = new Ms2();
//
////        m1.sample();
//        Ms1 m1ref = new Ms2();//upcasting
//        m1ref.sample();
//        Ms2 m2ref = (Ms2) m1ref;//downcasting
//        m2ref.sample();
//    }
//}

public class A{
    public static void  fun(){
        System.out.println("Qsp fun..");

    }
}

class B extends  A {
    public static void fun() {
        System.out.println("Jsp fun..");
    }
}
class Bdriver{
    public static void main(String[] args) {
            A a = new A();
            a.fun();
            B  b = new B();
            b.fun();
            //up
            A a1 = new B();
            a1.fun();
            //down
            B b1 = (B) a1;
            b1.fun();

        }
    }


