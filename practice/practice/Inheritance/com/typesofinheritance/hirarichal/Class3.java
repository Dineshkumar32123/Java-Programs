package com.typesofinheritance.hirarichal;

public class Class3 extends Class1{
    String c;
    Class3(){}
    Class3(String a,String c){
        super(a);
        this.c=c;
    }

    public static void main(String[] args) {
        Class3 c=new Class3("a ","c");
        System.out.println(c.a);
        System.out.println(c.c);
        c.class1();
        Class2 c2=new Class2("value a","value b");
        System.out.println(c2.a);
        System.out.println(c2.b);
        c2.class1();
    }
}
