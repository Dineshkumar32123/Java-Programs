public class Object {
    static String s =  "Qsp";
    String s1="jsp";
    public void m1(){
        Object obj = new Object();
        System.out.println(Object.s);
    }
    public static void main(String [] args){
        Object obj = new Object();
        obj.m1();
    }
}
