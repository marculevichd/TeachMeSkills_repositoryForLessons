package com.example.homework_teachmeskills;

import java.util.HashSet;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set_ {
    public static void main(String[] args) {

        SortedSet sortedSet = new TreeSet();
        sortedSet.add("a");
        sortedSet.add("c");
        sortedSet.add("b");
        sortedSet.add("c");
        sortedSet.add("z");
        sortedSet.add("c");


        System.out.println(sortedSet);


        HashSet hashSet = new HashSet();
        hashSet.add(new Student("aaaaa"));
        hashSet.add(new Student("bbbb"));
        hashSet.add(new Student("aaaaa"));
        hashSet.add(new Student("cccccccc"));
        hashSet.add("");

        System.out.println(hashSet.size());// 3 сутдента и строка
        System.out.println(hashSet);

    }
}



class Student {
    private String name;

    public Student(String name){
        this.name=name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}