package com.part1_programs;
//numbers which is divisible the given number

public class factors {
    public static void main(String[] args) {
        int a=10;
        System.out.println("The factors of 5 is: ");
        for(int i=1;i<=a;i++){
            if (a%i==0){
                System.out.println("\t"+i);
            }

        }
    }
}
