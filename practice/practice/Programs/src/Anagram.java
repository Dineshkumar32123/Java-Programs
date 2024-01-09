
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s ="apple";
        String s1 = "apleo";
        boolean flag = false;
        char[] a=s.toCharArray();
        char[] b=s1.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        String m = "";
        String n = "";

        if (s.length()==s1.length()) {
            for (int i = 0; i < a.length; i++) {
                m=m+a[i];
                n=n+b[i];
            }
            if (m.equals(n)){
                System.out.println("Anagram...");
            }else
                System.out.println("Not Anagram..");

        }else
            System.out.println("Not Anagram");
    }
}
