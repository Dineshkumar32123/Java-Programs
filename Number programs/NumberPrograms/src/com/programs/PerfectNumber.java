package com.programs;

import java.util.Scanner;

public class PerfectNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int res=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                res= res+ i;
            }
        }
        if (num==res)
            System.out.println("It's Perfect number");
        else
            System.out.println("Not a perfect number");
    }
}
