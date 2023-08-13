package Com.poly.Assesment;
//method overloading

public class A {
    int a;
    String b;
    public static void m1(int a,String b){
        System.out.println("m1 is exe.");
    }
    public static void m1(int a, String b, double c){
        System.out.println("m2 is exe");
    }
    public static void main(String[] args) {
        m1(10,"Hi");
        m1(20,"hi",30);
    }
}