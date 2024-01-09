package com.practice;

public class Factorial1 {
    public static void main(String[] args) {
        int num=3;
        int fact=1;
        System.out.println(method(num));

    }
    public static  int method(int num){
        if (num==0||num==1)
            return 1;
        return num*method(num-1);
    }


//        for (int i=1;i<=num;i++){
//            fact=fact*i;
//        }
//        System.out.println("The factorial of "+num+" is "+fact);
}
