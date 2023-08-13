public class p3 {
    static String a="hii mf";

    static {
        System.out.println("MLSI");
        m1();
    }
    public static void m1(){
        System.out.println("m1");
    }

    public static void main(String[] args) {
        int a = 3;
        System.out.println("main starts..");
        System.out.println(p3.a);
        System.out.println("main ends..");

    }
}
