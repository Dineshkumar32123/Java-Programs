package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        ArrayList obj1 =new ArrayList();
        obj1.add("Hello");
        obj1.add(1);
        obj1.add(true);
        obj1.add(null);
        obj1.add("java");

        obj1.add("hello");
        System.out.println(obj1);
    }
}
