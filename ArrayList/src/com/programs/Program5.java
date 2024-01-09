package com.programs;

import java.util.ArrayList;
/*
* In this program, we are using for loop(way-4) for printing ArrayList.

* The loop contains size, which is the size of the Array.

* get() is used to fetch the elements.
*/
public class Program5 {
    public static void main(String[] args) {
        ArrayList name = new ArrayList();
        name.add("Dinesh");
        name.add("Bharani");

        for (int i=0;i<name.size();i++){
            System.out.println(name.get(i));// way 4 -->using for loop
        }
    }
}
