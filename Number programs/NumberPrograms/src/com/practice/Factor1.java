package com.practice;

public class Factor1 {
    public static void main(String[] args) {
        int num=6;
        System.out.println("The factors of 6 is: ");
        for (int i=1;i<=num;i++){
            if (num%i==0)
                System.out.print(i+" ");
        }
    }
}
