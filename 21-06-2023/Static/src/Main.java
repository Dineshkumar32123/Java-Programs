public class Main {
    static  int a= 3;  //static variable
    public static void main(String[] args) {
        int a = 10; //Local variable
        System.out.println(a);
//        System.out.println(Main.a);
    }
}
class Dinesh{
    public static void main(String[] args) {
        {
            System.out.println(Main.a);
        }
    }
}