package com.programs;//public class com.programs.Armstrong {
//    static  int num=153;
//    static int armno=0;
//    static int last=0;
//    static int givennum=num;
//    static int length = length(num);
//    public static void main(String[] args) {
//
//
//        while (num != 0) {
//            last=num%10;
//            armno=armno+cube(last);
//            num=num/10;
//        }
//        if (givennum==armno){
//            System.out.println("com.programs.Armstrong ");
//        }
//        else
//            System.out.println("No armstrong");
//
//    }
//    public static int cube(int last){
//            int cube=1;
//        for (int i=1;i<= length;i++){
//            cube=cube*last;
//        }
//        return cube;
//    }
//
//    public static int length(int num){
//        int count=0;
//        while(num!=0){
//            num=num/10;
//            count++;
//        }
//        return count;
//    }
//}

class Armstrong{
    public static void main(String[] args) {
        int num=370;
        int last=0;
        int res=0;
        int givennum=num;
        while(num>0){
            last=num%10;
            res=res+(last*last*last);
            num=num/10;
        }
        if (givennum==res)
            System.out.println("it's armstrong");
        else
            System.out.println("Not armstrong");
    }
}
