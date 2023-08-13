public class Main {
    int a = 10;
    static  int b = 35;
    int c = 80;
    static int d = 90;

    public static int variable(int a ,int b) {
        System.out.println(a/b);
        return a+b;
    }
    public static void main(String[] args) {
    Main vt = new Main();
        System.out.println(variable(25,5));
        System.out.println(vt.a+vt.c-vt.d+vt.b);
    }
}