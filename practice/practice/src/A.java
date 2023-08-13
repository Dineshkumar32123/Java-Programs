public class A {
    String a;
    A(String a){
        this.a = a;
    }
}

 class B extends A{
    String b;
    B(String b, String a){
        super(a);
        this.b = b;
    }
}

 class C extends B {
    String c;
    C(String c, String b, String a){
        super(b,a);
        this.c = c;
    }
}

class Driver{
    public static void main(String[] args) {
        C cref = new C("20","30","40");
        System.out.println(cref.a);
        System.out.println(cref.b);
        System.out.println(cref.c);
    }
}