package com.programs;

public class StrongNumber {

    public static void main(String[] args) {
         int num = 145;
         int last=0;
         int sum = 0;
         int givennum = num;
        while(num!=0){
            last=num%10;
            sum=sum+fact(last);
            num=num/10;
        }
        if (givennum==sum)
            System.out.println("Strong number");
        else
            System.out.println("Not a Strong number");

    }
    public static int fact(int last){
        int factorial=1;
        for (int i=1;i<=last;i++){
             factorial=factorial*i;
        }
        return factorial;
    }
}
