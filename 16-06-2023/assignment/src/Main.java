public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        method(a);
        method(a, b);
        method(a, b, c);
    }

    public static void method(int a) {
        System.out.println(a);  //3
    }

    public static void method(int a, int b) {
        System.out.println(a + " " + b); //3 4
    }

    public static void method(int a, int b, int c) {
        System.out.println(a + " " + b + " " + c); //3 4 5
    }
}




