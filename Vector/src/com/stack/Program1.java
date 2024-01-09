package com.stack;

import java.util.Stack;

public class Program1 {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push("Element1");
        s1.push(true);
        s1.push(null);
//        System.out.println(s1);
//        s1.pop();
//        System.out.println(s1);
////        s1.pop();
////        s1.pop();
//        System.out.println(s1);
//        s1.pop();
//        System.out.println(s1);// EmptyStackException
        System.out.println(s1.peek());
    }
}
