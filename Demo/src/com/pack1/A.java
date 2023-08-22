package com.pack1;

public class A {
    protected int a=10;
    protected void m1(){
        System.out.println("m1");
    }
    protected A(){
        System.out.println("cons..");
    }

    public static void main(String[] args) {
        A a = new A();

    }
}
