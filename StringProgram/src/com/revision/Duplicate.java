package com.revision;

import java.util.Scanner;

public class Duplicate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String: ");
        String s = sc.next();
        int count=0;
        char ch[]=s.toCharArray();
        boolean flag = false;
        for (int i=0;i<ch.length;i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println( count +" duplicate present int the string");

        }
        else{
            System.out.println("Duplicate not present in the String");

        }

    }
}
