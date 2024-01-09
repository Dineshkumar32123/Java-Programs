package com.programs;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

/*
* In this program we are using listIterator() which is present inside ListIterator(I) that Iterator present inside List in the
  Flow chart.
* listIterator() contains hasPrevious() and previous().

* By using ListIterator(I) and listIterator() only we need to use hasPrevious() and previous().

* where l is the obj reference of ListIterator ,and we're passing car (Array list obj ref) to ListIterator.

* hasPrevious() is used to tell whether the element is present or not in the Last index where the hasNext() ends, and it'll start to move Backwards. If the element present it'll return true or return false.

* previous() is used to print the value/object where the index is presented and also moves the cursor to before element.

* It'll do until the hasPrevious() returns false which is placing inside while loop.

* By using this ListIterator, we will use both iterator methods [hasNext() and next()] and ListIterator methods [hasPrevious() and previous()].

* with the help of hasNext() and next() we'll move forward and print the element. when reaching the end of ArrayList, by using hasPrevious() and previous()
  we'll come Backwards and again print the element.

* so, we'll achieve both forward and backward using ListIterator.

* */

public class Program4 {
    public static void main(String[] args) {
        ArrayList car = new ArrayList();
        car.add("Audi");
        car.add("Benz");
        car.add("BMW");

        ListIterator l = car.listIterator();

        while (l.hasNext()){
            System.out.println(l.next());
        }


        System.out.println();
        while ((l.hasPrevious())){
            System.out.println(l.previous()); //way 3 -->using ListIterator
        }
    }
}
