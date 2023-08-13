public class A {
    int b=10;
}
class B extends A{
    int b=20;
    public  void method1(){
        int b =30;
        System.out.println(super.b);//A class variable
        System.out.println(b);//B class Local variable
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.b);//B class global variable
        b.method1();//10 20
    }
}
