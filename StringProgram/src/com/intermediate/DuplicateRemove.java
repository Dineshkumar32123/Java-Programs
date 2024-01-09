package com.intermediate;

public class DuplicateRemove {
    public static void main(String[] args) {
        String s="Hello";
        String dup="";
        char ch[]=s.toCharArray();
        for (int i=0;i<ch.length;i++){
            for (int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println("The duplicate present in the string is: "+ch[i]);
                    ch[i]=0;
                    ch[j]=0;
                }
            }

        }

        for (int i=0;i<ch.length;i++) {
            if (ch[i] != 0)
                System.out.print(ch[i] + " ");
        }
    }
}
