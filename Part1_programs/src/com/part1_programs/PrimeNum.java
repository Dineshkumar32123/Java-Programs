package com.part1_programs;
//number which is divisible by 1 and itself.

public class PrimeNum {
//    public static void main(String[] args) {
//        int a=13;
//        for(int i=2;i<a;i++){
//            if (a%i==0) {
//                System.out.println("prime number");
//                break;
//            }
//            else
//                System.out.println("Not a prime number");
//            break;
//        }
//    }


    public static void main(String[] args) {
        int a=6;
        for (int i=2;i<28;i++){
            if (a%i==0){
                System.out.println("not prime");
                break;
            }

            else {
                System.out.println("prime");
                break;
            }
        }
    }
}
