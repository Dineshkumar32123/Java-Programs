package com.practice;

public class Strong1 {
    public static void main(String[] args) {
        int num=145;
        int last=0;
        int givennum=num;
        int res=0;
        while (num>0){
             last=num%10;
             res=res+fact(last);
             num=num/10;
        }
        if (givennum==res)
            System.out.println("Strong num");
        else
            System.out.println("Not strong");
    }
    public static int fact(int last){
        int factorial=1;
        for (int i=1;i<=last;i++){
            factorial=factorial*i;
        }
            return factorial;
    }
}
