package com.programs;

public class Reverse {
    public static void main(String[] args) {
        int num = 1234;
        int last=0;
        int rev=0;
        while(num>0){
            last=num%10;
            rev=rev*10+last;
            num=num/10;
        }
        System.out.println("The reverse of given num is: "+rev);
    }
}
