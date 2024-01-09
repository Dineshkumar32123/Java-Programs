package com.intermediate;

public class ReverseSentence {
    public static void main(String[] args) {
        String s="You're good soul";
        String rev="";
        String s1[]=s.split("");//[you're,good,soul]
        for (int i=s1.length-1;i>=0;i--){
            rev=rev+""+s1[i];
        }
        System.out.println(rev);
    }
}
