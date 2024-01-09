package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class P3 {
    //ArrayList to Array
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("R15");
        a.add('a');
        a.add(null);
        System.out.println("Size of collection: "+a.size());
        Object[] o=a.toArray();

        System.out.println(Arrays.toString(o));
        System.out.println("Length of Array: "+o.length);
    }

}
