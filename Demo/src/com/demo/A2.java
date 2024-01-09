public class A2 {
    static int a=10;
    int b=20;

    public  void fun(A2 m){
        int b=30;
        System.out.println(m.b);
    }
    public static void main(String[] args) {
        System.out.println(A2.a);
        A2 ref = new A2();
        ref.fun(ref);
    }
}
