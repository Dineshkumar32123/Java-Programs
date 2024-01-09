package com.practice;

public class Perfect1 {
    public static void main(String[] args) {
        int num=6;
        int res=0;

        for (int i=1;i<num;i++){
            if (num%i==0){
                res=res+i;
            }
        }
        if (res==num)
            System.out.println("Perfect number");
        else
            System.out.println("not a perfect number");
    }
}
