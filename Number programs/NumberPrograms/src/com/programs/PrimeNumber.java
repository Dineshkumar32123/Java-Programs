package com.programs;

import java.util.Scanner;

public class PrimeNumber {
        static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
//        boolean prime=true;
//        for (int i = 2; i < a; i++) {
//            if (a%i==0) {
//                prime = false;
//              }
//            }
//        if(prime==true){
//            System.out.println(a+" is a prime number");
//        }
//        else
//            System.out.println(a+" is not a prime number");
        boolean flag = false;
        for(int i=2;i<a;i++){
            if(a%i==0) {
                flag=true;

            }
            }
//                System.out.println(flag);
        if (flag==false)
            System.out.println("prime number");
        else
            System.out.println(" not Prime number");
        }
    }




