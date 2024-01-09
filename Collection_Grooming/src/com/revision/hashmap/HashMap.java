package com.revision.hashmap;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer,String> head = new java.util.HashMap();

        head.put(04,"Leo");
        head.put(01,"Leo");
        head.put(02,"Vikram");
        head.put(03,"kaithi");

//        System.out.println(head.get(03));
//        System.out.println(head.containsValue("Leo"));
//        System.out.println(head.containsKey(02));
//        System.out.println(head.size());

        System.out.println("--------------------------------------------");
        System.out.println(head.entrySet());
        System.out.println("--------------------------------------------");
        for (Integer i : head.keySet()){
            System.err.println(i);
        }
        for (String s : head.values()){
            System.err.println(s);
        }

    }
}
