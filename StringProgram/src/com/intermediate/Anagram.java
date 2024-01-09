package com.intermediate;
//
import java.util.Arrays;
//
//public class Anagram {
//    public static void main(String[] args) {
//        String s1 = "cat";
//        String s2 = "jyg";
//        char ch1[] = s1.toCharArray();
//        char ch2[] = s2.toCharArray();
//        boolean flag = false;
//        if(ch1.length==ch2.length){
//            Arrays.sort(ch1);
//            Arrays.sort(ch2);
//             flag = Arrays.equals(ch1,ch2);
//             if (flag){
//                 System.out.println(s1+ " and "+ s2 + " are anagram");
//             }else
//                 System.out.println("The given string is not anagram");
//        }
//        else
//            System.out.println("The given string is not anagram");
//
//
//    }
//}

class Anagram{
    public static void main(String[] args) {
        String s1="cat";
        String s2="mct";
        boolean flag =false;
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        if (ch1.length==ch2.length){
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            flag=Arrays.equals(ch1,ch2);
            if (flag){
                System.out.println("The given string is anagram");
            }
            else
                System.out.println("The given string is not an anagram");
        }
        else
            System.out.println("It is not anagram");
    }
}
