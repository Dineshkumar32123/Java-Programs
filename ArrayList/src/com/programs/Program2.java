package com.programs;
//multiple Array List

import java.util.ArrayList;

/*
* Here we created two ArrayList a1 and a2.

* with the help of addAll(), we are joining the values of a1 and a2.

* And also we're using containsAll() which is used check "whether the elements in a2 is completely presented in a1".

* If it's completely presented means it'll return true or return false.
*/
public class Program2 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(1);
        a1.add("Two");

        ArrayList a2= new ArrayList();
        a2.add(3);
        a2.add('4');

        a1.addAll(a2);
        System.out.println(a1);

        System.out.println(a1.containsAll(a2));


    }
}
