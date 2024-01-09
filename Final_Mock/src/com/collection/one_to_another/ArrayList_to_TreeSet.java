package com.collection.one_to_another;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayList_to_TreeSet {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pineapple");

        System.out.println("\t\tBefore sorting: ");
        Iterator<String> i = fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();
        System.out.println();
        TreeSet<String> tfruits = new TreeSet(fruits);
        Iterator<String> i1 = tfruits.descendingIterator();
        System.out.println("\t\tAfter sorting: ");
        while (i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
