package com.revision.hashmap;

import java.util.LinkedHashMap;

public class Linked_Hash_Map {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> books = new LinkedHashMap<>();
        books.put(3,"Tamil");
        books.put(1,null);
        books.put(null,null);

        LinkedHashMap<Integer,String> books1 = new LinkedHashMap<>();
        books.put(3,"Tamil");
        books.put(1,null);
        books.put(2,"English");

        LinkedHashMap<String,Integer> marks = new LinkedHashMap<>();
        marks.put("Student1",01);
        marks.put("Student3",03);
        marks.put("Student2",02);

//        System.out.println(marks.entrySet());
        books1.putAll(books);
        System.out.println(books1);
//        System.out.println(books);
//        System.out.println(marks);
    }

}
