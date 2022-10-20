package com.example.homework_teachmeskills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_2 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("sasha");
        arrayList.add("ava");
        arrayList.add("kado");
        arrayList.add("qwe");
        arrayList.add("haha");


        Collections.sort(arrayList, Comparator.<String>naturalOrder());
        System.out.println(arrayList);

        Collections.sort(arrayList, Comparator.<String>reverseOrder());
        System.out.println(arrayList);
    }
}
class Person2 {
    private String name;

    Person2(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}