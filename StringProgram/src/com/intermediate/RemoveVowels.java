package com.intermediate;

public class RemoveVowels {
    public static void main(String[] args) {
        String a="Apple";
        char ch[]=a.toCharArray();
        for (int i=0;i<ch.length;i++){
            if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
                ch[i]=0;
            }
        }
        for (int i=0;i<ch.length;i++){
            if(ch[i]!=0){
                System.out.print(ch[i]+" ");
            }
        }
    }
}
