package com.revision;

import java.util.Scanner;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String string = sc.next();
        String reverse="";
        char ch[]=string.toCharArray();
        for (int i=ch.length-1;i>=0;i--){
            reverse=reverse+""+ch[i];
        }
        if (string.equalsIgnoreCase(reverse))
            System.out.println(string+" is Palindrome");
        else
            System.out.println(string+" is not a Palindrome");
    }
}
