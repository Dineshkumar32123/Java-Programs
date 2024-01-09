package com.basics;

public class Palindrome {
    public static void main(String[] args) {
        String name="Lol";
        String rev = "";
        char ch[]=name.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+""+ch[i];
        }
        if (rev.equalsIgnoreCase(name))
            System.out.println("It is Palindrome.");
        else
            System.out.println("It's not a palindrome");
    }
}
