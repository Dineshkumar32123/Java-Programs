package com.programs;

import java.util.ArrayList;

/*
* There are 5 ways to printing the ArrayList
     1.Obj ref of ArrayList
     2.By using Iterator
     3.By using ListIterator
     4.By using For loop
     5.By using For each loop
*/

public class Program1 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add("Three");
        a.add('4');
        a.add(true);
        a.add(null);

        System.out.println(a);//way 1
        System.out.println();
        a.remove("Three");

        System.out.println();
        System.out.println(a.get(4));
        System.out.println();
        System.out.println(a.contains(null));
        System.out.println();
        System.out.println(a);
    }
}
