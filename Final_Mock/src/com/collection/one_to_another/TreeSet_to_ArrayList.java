package com.collection.one_to_another;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_to_ArrayList {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet();

        num.add(90);
        num.add(80);
        num.add(70);
        num.add(60);
        num.add(50);
        num.add(40);
        num.add(30);
        num.add(20);
        num.add(10);
        System.out.println("\t\tTreeset items: ");
        Iterator i = num.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println();


        System.out.println("\t\tArrayList items: ");
        ArrayList  al = new ArrayList(num);
        Iterator i1 = al.iterator();
        while(i1.hasNext()){
            System.out.print(i1.next()+" ");
        }
    }
}
