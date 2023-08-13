public class NonStatic {
    String s;
    int a =33;
    int b=22;
    int c=10;

    public static void main(String[] args) {
        NonStatic obj=new NonStatic();
        //System.out.println(s);  // I can't access directly without obj
        System.out.println(obj.s); // I can access by using object ref. name
    }
}
