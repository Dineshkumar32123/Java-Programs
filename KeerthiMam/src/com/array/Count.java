package com.array;

import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int [ ] a={1,2,3,4,5};
        int count=0;
        System.out.println(Arrays.toString(a));
        for (int i=0;i<a.length;i++){
            count++;
        }
        System.out.println("The count of Array is: "+count);
    }
}
