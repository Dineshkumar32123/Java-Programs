package com.practice;

public class Reverse1 {
    public static void main(String[] args) {
        int num=32123;
        int last=0;
        int rev=0;
        int givennum=num;

        while (num>0){
            last=num%10;
            rev=rev*10+last;
            num=num/10;
        }
        if (givennum==rev){
            System.out.println("palindrom");
        }
        else
            System.out.println("Not palindrom");

    }
}
