package com.intermediate;

public class CompareStringRemoveDuplicate {
    public static void main(String[] args) {
        String s1="Dinesh";
        String s2="Bharani";
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        System.out.println("The Duplicates are: ");
        for (int i=0;i<ch1.length;i++){
            for (int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    System.out.print(ch1[i]+" ");
//                    System.out.print(ch2[j]);
                }
            }
        }
    }
}
