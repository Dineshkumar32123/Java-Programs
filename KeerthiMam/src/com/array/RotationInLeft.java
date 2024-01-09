package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class RotationInLeft {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int a[]={10,20,30,40,50};
        System.out.println(Arrays.toString(a));
        System.out.println("How many times it need to rotate: ");
        int rotate = sc.nextInt();
        for (int i=1;i<=rotate;i++) {
            int first = a[0];
            for (int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=first;
        }
            System.out.print(Arrays.toString(a));
    }
}
