package Arrays_Strings;

import java.util.Arrays;

public class Dynamic {
    public static void main(String[] args) {
        char a[] = new char[10];
        a[0]='L';
        a[1]='O';
        a[2]='V';
        a[3]='E';
        a[4]='Y';
        a[5]='O';
        a[6]='U';
        a[7]='H';
        a[8]='O';
        a[9]='T';

        System.out.println(a);//WAY 1

        //way2
        for (int z =0 ; z<a.length;z++){
            System.out.print(a[z]);
        }
        System.out.println();
        //way3
        System.out.println(Arrays.toString(a));
    }
}
