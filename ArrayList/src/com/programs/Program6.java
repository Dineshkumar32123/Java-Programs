package com.programs;

import java.util.ArrayList;
/*
 * In this program, we are using for each(way-5) for printing Collection.
*/
public class Program6 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        a1.add(1);
        a1.add(null);
        a1.add(2);

        for(Object o : a1){
            System.out.println(o); //way-5 --> using for each
        }
    }
}
