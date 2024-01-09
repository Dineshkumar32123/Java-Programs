package com.typesofinheritance;

public class Grandchild extends Child{
    Grandchild(){}
    Grandchild(String cname,String pname,int age){
        super(cname,pname,age);
    }
    public static void main(String[] args) {
        Grandchild gc =new Grandchild("Dinesh","Sakthi",55);
        System.out.println(gc.cname);
        System.out.println(gc.pname);
        System.out.println(gc.age);
    }
}
