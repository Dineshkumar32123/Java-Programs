package com.array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int [] b = new int[a.length];
        System.out.println(a); //address
        for (int i=0;i< a.length;i++){
            b[i]=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
