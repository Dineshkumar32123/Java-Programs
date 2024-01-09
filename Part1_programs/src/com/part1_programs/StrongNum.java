package com.part1_programs;

public class StrongNum {
    public static void main(String[] args) {
        int a=145;int temp=a;
        int sum=0;
        int rem=0;
        while(a>0){
            rem=a%10;
            sum=sum+fact(rem);
            a=a/10;
        }
        if(temp==sum)
            System.out.println("The given num is Strong number");
        else
            System.out.println("The num is not strong number");

    }
    public static int fact(int rem){
        int factorial=1;
        for(int i=1;i<=rem;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}
