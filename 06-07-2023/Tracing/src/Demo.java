public class Demo {
    static {
        a = 10;
    }
    static int a= 20;
    int b = 30;

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(a*d.a);
    }

}
