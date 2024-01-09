package com.revision;
import java.util.Scanner;

public class CountofAlpNumSym {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        String string="AbcD@.com";
        char ch[]=string.toCharArray();
        System.out.println("\tThe uppercase alphabets are: ");
        for (int i=0;i<ch.length;i++){
            if (ch[i]>='A'&&ch[i]<='Z'){
                System.out.println(ch[i]);
            }
        }
        System.out.println("\tThe Lowercase alphabets: ");
            for (int i=0;i<ch.length;i++) {
                if (ch[i] >= 'a' && ch[i] <= 'z') {
                    System.out.println(ch[i]);
                }
            }
        System.out.println("\tThe Symbols are: ");
        for (int i=0;i<ch.length;i++) {
            if (ch[i] >= 32 && ch[i] <= 64) {
                System.out.println(ch[i]);
            }
        }
    }
}
