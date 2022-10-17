package com.example.homework_teachmeskills;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class ArrayList_ {

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList();

        arrayList.add("a");
        arrayList.add("s");
        arrayList.add("d");
        arrayList.add("p");

        System.out.println(arrayList.get(0));
        System.out.println(arrayList.indexOf("p"));
        System.out.println(arrayList.size());
        arrayList.remove("d");

        System.out.println(arrayList.indexOf("a"));
        arrayList.add(0, "ooo");
        System.out.println(arrayList.indexOf("a"));

        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList.size());

    }
}
