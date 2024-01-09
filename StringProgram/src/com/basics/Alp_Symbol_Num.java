package com.basics;

public class Alp_Symbol_Num {
    public static void main(String[] args) {
        int upper=0;
        int lower=0;
        int num=0;
        int sym=0;
        String mail="Qsp123@gmail.com";
        char ch[]=mail.toCharArray();
        for (int i=0;i<ch.length;i++){
            if ((ch[i]>=65&&ch[i]<=90)){
                upper++;
            } else if ((ch[i]>=97&&ch[i]<=122)) {
                lower++;
            }else if ((ch[i]>=48&&ch[i]<=57)) {
                num++;
            }
            else
                sym++;

        }
        System.out.println("The count of UpperCase Alphabet's is: "+upper);
        System.out.println("The count of Lowercase Alphabet's is: "+lower);
        System.out.println("The count of Numbers is: "+num);
        System.out.println("The count of Symbols is: "+sym);
    }
}
