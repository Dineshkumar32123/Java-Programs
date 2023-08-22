package mock2;

public class Mo1 {
    public static void a(int a, int b){
        System.out.println("Add: "+(a+b));
    }

    public static String a(String a, String b){
//        String res = (a+""+b);
        return a+""+b;
//        System.out.println(res);
    }

    public static void a(double a, char b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        a(1,2);
        a("Hello","M.F..");
        a(1300.00, (char) 99);
    }
}
