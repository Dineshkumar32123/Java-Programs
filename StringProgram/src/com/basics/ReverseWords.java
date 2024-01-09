package com.basics;

public class ReverseWords {
    public static void main(String[] args) {
        String name="Java is a easy";
        //o.p: easy a is Java
        //word--split(" ") ------------[java,is,a,esay]
        String rev="";//converting into string array
        String s[]=name.split(" ");
        for (int i=s.length-1;i>=0;i--){
            rev=rev+" "+s[i];
        }
        System.out.println(rev);

    }
}
