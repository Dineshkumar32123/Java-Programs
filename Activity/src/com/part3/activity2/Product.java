package com.part3.activity2;

import java.util.Arrays;

import static com.part3.activity2.Array1.sc;

public class Product {
    static int i;
    static int prod=1;
    public static void main(String[] args) {
        System.out.println("enter the size of array: ");
        int size=sc.nextInt();
        System.out.println("enter the values");
        int b[]=new int[size];
        for (i=0;i<b.length;i++){
            b[i]=sc.nextInt();
            prod=prod*b[i];

        }

        System.out.println("The old array is: "+Arrays.toString(b));
        System.out.println("the product of array is: "+prod);
    }

}
