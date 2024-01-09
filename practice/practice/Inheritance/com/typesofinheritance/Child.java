package com.typesofinheritance;

public class Child extends Parent {
    String cname;
    Child(){}
    Child(String cname,String pname,int age){
        super(pname,age);
        this.cname=cname;
    }

    public static void main(String[] args) {
        Parent p=new Parent("Kumar",58);

//        System.out.println(p.pname);
//        System.out.println(p.age);
//        System.out.println(p.cname);
        Child c =new Child("Dinesh","Kumar",60);
        System.out.println(c.cname);
        System.out.println(c.pname);
        System.out.println(c.age);
    }

}
