package com.programs;

import java.util.ArrayList;
import java.util.Iterator;

/*
* In this program we are using iterator() which is present inside Iterator(I) that Iterator present inside Iterable in the
  Flow chart.
* iterator() contains hasNext() and next().

* By using Iterator and iterator() only we need to use hasNext() and next().

* where i is the obj reference of Iterator ,and we're passing sub (Array list obj ref) to Iterator.

* hasNext() is used to tell whether the element is present or not in that particular index. If the element present it'll return true or return false.

* next() is used to print the value/object where the index is presented and also moves the cursor to next element.

* It'll do until the hasNext() returns false which is placing inside while loop.

* The disadvantage of Iterator is its only used for iterating elements in "Forward direction only".

* To overcome this we are having another iterator called ListIterator.

* */
public class Program3 {
    public static void main(String[] args) {
        ArrayList sub = new ArrayList();
        sub.add("JAVA");
        sub.add("SQL");
        sub.add("WEB TECH");

        System.out.println(sub);//way 1-->using obj ref.
        System.out.println();

        Iterator i = sub.iterator();
        while(i.hasNext()){
            System.out.println(i.next()); //way 2 -->using iterator
        }

    }
}
