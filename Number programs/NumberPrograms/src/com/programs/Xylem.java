package com.programs;

import java.util.Scanner;

public class Xylem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = 154;  //231
        int last = num%10;  //1
        int sum = 0; //sum =0
        num = num/10;  //num=23

        while (num>9){
            sum = sum+num%10;  //0+1--->1    1+3=4
            num=num/10;    //23    2
        }
        int f_l=num+last;
        if(sum==f_l){
            System.out.println("The given num is xylem");
        }
        else
            System.out.println("The given num is phloem");
    }
//    int num=187;
//    int last = num%10;  //7
//        num = num/10;  //18
//        int sum=0;
//        while(num>9){
//            sum=sum+num%10;
//            num=num/10;
//        }
//        int fl= num+last;
//        if (fl==sum)
//            System.out.println("It's com.programs.Xylem");
//        else
//            System.out.println("Pholem");
//
//    }
}
