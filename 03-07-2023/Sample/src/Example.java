public class Example {
    static int a = 20;
    {
        System.out.println("hello"); // 2
    }
    static {
        System.out.println("java"); //1
    }
    public static void main(String[] args){
        Example d = new Example();
        d.a=40;
        System.out.println(a); //3
    }
}
