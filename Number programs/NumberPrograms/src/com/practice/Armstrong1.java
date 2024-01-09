package com.practice;

public class Armstrong1 {
    public static void main(String[] args) {
        int num=1634;
        int last=0;
        int res=0;
        int givennum=num;

        while (num>0){
            last=num%10;
            res=res+(last*last*last*last);
            num=num/10;
        }
        if (givennum==res)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

    }
}
