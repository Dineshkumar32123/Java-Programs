package com.basics;

import java.util.Scanner;

public class Duplicates_PresentorNot {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter string: ");

    String name=sc.next();
    char ch[]=name.toCharArray();
    boolean flag =false;
    for(int i=0;i<ch.length;i++){
        for (int j=i+1;j<ch.length;j++){
            if (ch[i]==ch[j]){
                flag=true;
                break;
            }
        }
    }
    if (flag)
        System.out.println("The Duplicate is present");
    else
        System.out.println("There is no Duplicate in the given String");

    }
}
