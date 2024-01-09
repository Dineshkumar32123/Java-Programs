package com.programs;

import java.util.Scanner;

public class Fibonacci {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the  number: ");
        int until=sc.nextInt();
        int num1=0;
        int num2=1;
        int num3=0;
        for (int i=1;i<=until;i++){
            num3=num1+num2;
            System.out.print(num3+ " ");
            num1=num2;
            num2=num3;
        }
    }
}
