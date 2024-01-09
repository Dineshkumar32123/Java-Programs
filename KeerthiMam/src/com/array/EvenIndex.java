package com.array;

import java.util.Arrays;

public class EvenIndex {
    public static void main(String[] args) {
        int [] a={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        System.out.println("The even numbers are: ");
//        for (int i=0;i<a.length;i++){
//            if (i%2==0)
//                System.out.print(a[i]+" ");
//        }


        for (int i=0;i<a.length;i=i+2){
                System.out.print(a[i]+" ");
        }
    }
}
