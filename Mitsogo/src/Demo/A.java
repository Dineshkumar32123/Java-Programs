package Demo;

import java.util.HashMap;
import java.util.Map;

public class A {

    public static int minMelodyDays(String song) {
        int[] frequency = new int[26];
        int distinctNodes = 0;

        for (char c : song.toCharArray()) {
            if (frequency[c - 'a'] == 0) {
                distinctNodes++;
            }
            frequency[c - 'a']++;
        }

        return distinctNodes;
    }

    public static void main(String[] args) {
        String input1 = "abbaabed";
        int result1 = minMelodyDays(input1);
        System.out.println("Output for input1: " + result1);

        String input2 = "abcd";
        int result2 = minMelodyDays(input2);
        System.out.println("Output for input2: " + result2);
    }



}


