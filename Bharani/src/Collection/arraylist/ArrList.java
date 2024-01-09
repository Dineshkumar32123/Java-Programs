package Collection.arraylist;

import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();//10

        arr.add(3);
        arr.add("Hii");
        arr.add(4);
        arr.add(3);
        arr.add(null);

        System.out.println(arr.contains(5));


        System.out.println(arr);

    }
}
