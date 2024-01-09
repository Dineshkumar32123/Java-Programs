package com.revision;

public class Auto_Unboxing {
    public static void main(String[] args) {
        Integer i=26;
        //Integer--->float--->Object--->PDT
        float f = i; //implicitly---->AutoBoxing
        System.out.println(f);

        //explicit---->UnBoxing
        double d =i.doubleValue();//Object--->PDT
        System.out.println(d);
    }
}
