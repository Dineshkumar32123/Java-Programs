package com.array;

import java.util.Scanner;

public class OddIndex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the values: ");
        int a[]=new int[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
//        for (int i=0;i<a.length;i++){
//            if (i%2!=0)
//                System.out.print(a[i]+" ");
//        }

        for (int i=0;i< a.length;i+=2){
            System.out.print(a[i]+" ");
        }
    }
}
