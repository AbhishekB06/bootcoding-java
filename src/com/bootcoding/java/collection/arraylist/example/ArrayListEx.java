package com.bootcoding.java.collection.arraylist.example;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        int[] elements = new int[2];
        elements[0] = 10;
        elements[1] = 20;

        ArrayList arrayList = new ArrayList();
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add("hello");
        String hello = "hello";

        ArrayList<Integer> intData = new ArrayList<>();
        intData.add(50);
        intData.add(60);
//        intData.add("hello"); // gives compilation error

        for(int i = 0; i < intData.size(); i++){
            System.out.println(intData.get(i));
        }
    }

}
