package com.revision;

import java.util.Scanner;

public class Reverse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String string = sc.next();
        char ch[]=string.toCharArray();
        String reverse = "";
        for (int i=ch.length-1;i>=0;i--){
            reverse=reverse+ch[i];
        }
        System.out.println("The reverse of "+string+" is "+reverse);
    }
}
