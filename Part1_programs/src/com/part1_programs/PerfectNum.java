package com.part1_programs;
//the factors of number excluding given number  EQUAL to given number

public class PerfectNum {
    public static void main(String[] args) {
        int a=6;
        int per=0;
        for (int i=1;i<a;i++){
            if(a%i==0){
                per=per+i;
            }
        }
        if (per==a)
            System.out.println("Perfect number");
        else
            System.out.println("Not a Perfect number");
    }
}
