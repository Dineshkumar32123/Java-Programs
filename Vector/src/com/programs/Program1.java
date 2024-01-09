package com.programs;

import java.util.Vector;

public class Program1 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Paithiyam1");
        v.add("Paithiyam2");
        v.add(null);
        v.add(3);
        v.addElement("Element1 is added");

        for (int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }
    }
}
