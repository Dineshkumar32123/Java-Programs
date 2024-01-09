package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class P4 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("R15");
        a.add('a');
        a.add(null);

        ListIterator i=a.listIterator();
//        System.out.println(i.hasNext());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println();
        i.remove();
        System.out.println(i.hasPrevious());
        System.out.println(i.previous());
//        System.out.println(i.previous());
//        System.out.println(i.previous());

    }
}















//        System.out.println(i.next());//NoSuchElementException
//        i.remove();
//        System.out.println(a);
//        i.remove();//IllegalStateException
