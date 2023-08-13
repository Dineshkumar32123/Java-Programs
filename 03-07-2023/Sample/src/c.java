public class c {
    int a = 25;
    {
        m1(); //20
    }
    public void m1(){
        a=20;
    }
}
class D{
    static int a = 80;
    int b=35;
    public static void A(){
        c cref = new c();
        D dref = new D();
        System.out.println(cref.a);
        System.out.println(dref.a);
        System.out.println("h");

    }

    public static void main(String[] args) {
        c cref = new c();
        D dref = new D();
        System.out.println("h");
        System.out.println(cref.a);
        System.out.println(D.a);
        A();

    }
}
