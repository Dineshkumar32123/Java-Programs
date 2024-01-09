package inheritance.multi_level;

public class Driver {
    public static void main(String[] args) {
        A aref = new A("A class value...");
        System.out.println(aref.a);//A class value...
        B bref = new B("B class value..","A class value...");
        System.out.println(bref.a);//A class value...
        System.out.println(bref.b);//B class value..
//        System.out.println(bref.c);//Error
        C cref = new C("c","b","a");
        System.out.println(cref.a);//a
        System.out.println(cref.b);//b
        System.out.println(cref.c);//c
    }
}
