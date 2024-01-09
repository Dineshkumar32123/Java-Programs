package com.basics;

public class Count_WordsAndChar{
    public static void main(String[] args) {
        String name="He is good student";
        //o/p: words:4, characters:15
        String s[]=name.split(" ");  //[he,is,good,student]
        int char_count=0;
        int word_count=0;
        for (int i=0;i<s.length;i++){
            word_count++;
        }
        char ch[]=name.toCharArray(); //[h,e, ,i,s, ,g,o,o,d, ,s,t,u,d,e,n,t]
        for (int i=0;i<ch.length;i++){
            if (ch[i]!=32){ //asscci value for space
                char_count++;
            }
        }
        System.out.println("Number of Words: "+word_count);
        System.out.println("Number of Characters: "+char_count);
    }
}
