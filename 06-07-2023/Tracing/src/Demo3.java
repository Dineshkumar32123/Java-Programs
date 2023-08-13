public class Demo3 {
    static int a = 20;
    {
        System.out.println("hello");
    }
    static {
        System.out.println("java");
    }
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.a = 40;
        System.out.println(a);
    }
}
