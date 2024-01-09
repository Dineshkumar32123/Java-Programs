package com.arraylist;

import java.util.ArrayList;

public class P2 {
    public static void main(String[] args) {

        ArrayList<String> obj3 = new ArrayList<>();
        obj3.add("String 1");
        obj3.add("String 2");
        obj3.add("String 3");

        for (String s : obj3 ){
                  System.out.println(s);
        }
    }
}
//        ArrayList obj4 = new ArrayList(obj3);
//        obj4.add("Good evening");
//        obj4.add(true);
//        obj4.add('D');



//        ArrayList obj2 = new ArrayList();
//        obj2.add("Hi");
//        obj2.add(true);
//        obj2.add(null);
