package com.basics;

public class CountOfString {
    public static void main(String[] args) {
        String s="Hello";
        int count=0;
//        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            count++;
        }
        System.out.println(count);
    }
}
