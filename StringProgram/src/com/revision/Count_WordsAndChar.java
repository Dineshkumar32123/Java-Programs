package com.revision;

public class Count_WordsAndChar {
    public static void main(String[] args) {
        //i/p: Hi I am Dinesh
        //o/p: words:4, characters:11(Except space)
        String string = "Hi I am Dinesh";
//        String res="";
        int words=0;
        int letters=0;
        String s1[]=string.split(" "); //use to remove unwanted letters
        for(int i=0;i<s1.length;i++){
//            res=res+" "+s1[i];
            words++;
        }
        char ch[]=string.toCharArray();
        for(int i=0;i<ch.length;i++){
            if (ch[i]!=32)
                letters++;

        }
        System.out.println(words);
        System.out.println(letters);
    }
}
