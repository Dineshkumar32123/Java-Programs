package com.revision;

public class Wrapper {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a);//pdt
        Integer i=a; //implicit--->AutoBoxing
        System.out.println(i); //10--->variable
        Float f = Float.valueOf(i);//Explicit--->Boxing
        System.out.println(f); //10.0--->Object
    }
}
