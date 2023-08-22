package mock2;

public class MoR1 {
    public void method1(){
        System.out.println("First cls method...");
    }
}

class MoR2 extends MoR1{
    @Override
    public void method1(){
        System.out.println("Second cls method...");
    }
}
class MoR2driver{
    public static void main(String[] args) {
        MoR1 m1 = new MoR1();
        MoR2 m2 = new MoR2();

//            m1.method1();
//            m2.method1();
        MoR1 m1ref = new MoR2();
        m1ref.method1();
        MoR2 m2ref = (MoR2) m1ref;
        m2ref.method1();
    }
}