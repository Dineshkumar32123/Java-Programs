package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RotationInRight {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(a));
        System.out.println("Enter count: ");
        int count = sc.nextInt();
        for (int i=1;i<=count;i++){
            int last = a[a.length-1];
            for (int j=a.length-1;j>0;j-- ) {
                a[j] = a[j-1];
            }
            a[0]=last;
        }
        System.out.print(Arrays.toString(a));
    }
}

/*
//Arrays[Problem]
1.finding the elements present in tha array or not(searhing a array)---use binary search.
2.Binary seacrh
bubble sort
//merge sort
left rotation
right rotation
removing duplicates from array
First sec Third largest from an Array(Finding nth largest)
First sec Third Smallest from an Array(Finding nth smallest)
 */