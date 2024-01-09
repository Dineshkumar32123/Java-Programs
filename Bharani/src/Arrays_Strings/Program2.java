package Arrays_Strings;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        int b[] = {32,68,92,55,20};
//        for (int i = 0 ; i < b.length ; i++){
//            System.out.println(b[i]);
//        }

        System.out.println(Arrays.toString(b));
        b[2]=0;
        b[1]=44;
        System.out.println(Arrays.toString(b));

        for (int i = 0; i<b.length ;i++){
            if (b[i]!=0){
                System.out.print(b[i]+" ");
            }
        }

    }
}
