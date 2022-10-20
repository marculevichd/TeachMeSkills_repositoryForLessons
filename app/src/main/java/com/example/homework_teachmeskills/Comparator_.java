package com.example.homework_teachmeskills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_ {


    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Person("sasha", 1));
        arrayList.add(new Person("ava", 2));
        arrayList.add(new Person("kado", 3));
        arrayList.add(new Person("qwe", 6));
        arrayList.add(new Person("haha", 19289123));




        System.out.println();


        Collections.sort(arrayList, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return Integer.valueOf(person.getAge()).compareTo(
                        Integer.valueOf(t1.getAge())
                );
            }
        });

//        for (Person person1: arrayList){
//            System.out.println(person1.getAge());
//        }




    }
}


class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
