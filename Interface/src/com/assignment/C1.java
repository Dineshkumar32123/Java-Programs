package com.assignment;


import java.util.Scanner;

public class C1 implements I3{
    static Scanner sc = new Scanner(System.in);
    @Override
    public int areaOfSquare(int a){

        a=a*a;
        return a;
    }
    public void areaOfRectangle(int l, int w){
        int res=l*w;
        System.out.println("The area of Rectangle is: "+res);
    }
    public void areaOfTriangle(double b,double h){

        double res = (b*h)/2;
        System.out.println("The area of Triangle is: "+res);
    }
}
