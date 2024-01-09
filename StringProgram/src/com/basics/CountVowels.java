package com.basics;

public class CountVowels {
    public static void main(String[] args) {
        String a="HEllo";
        char ch[]=a.toCharArray();
        int count=0;
        boolean flag=false;
        for(int i=0;i<a.length();i++){
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'|| ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                            ch[i]=0;

            }
        }
        for(int i=0;i<a.length();i++){
            if (ch[i]!=0){
                System.out.print(ch[i]+" ");
            }
        }
                System.out.println();
        System.out.println("The vowels present in the given string is: "+count);
    }
}
