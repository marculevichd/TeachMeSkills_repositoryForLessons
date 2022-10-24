package com.example.homework_teachmeskills;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;

import java.util.function.Consumer;

public class PrimerStream {

    static Consumer<String> printUpperCase = str ->{
        System.out.println(str.toUpperCase()+ " ");// кастомный Consumer
    };


    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<Person>();
        arrayList.add(new Person("ccc"));
        arrayList.add(new Person("kkk"));
        arrayList.add(new Person("aaa"));
        arrayList.add(new Person("eee"));
        arrayList.add(new Person("bbb"));

//    for (Person person: arrayList){
//        System.out.println(person);
//    }

        arrayList.stream().map(Person::getName).forEach( // преобразование Person в имена Person    // forEach берет значение
                System.out::print
        );

        arrayList.stream().map(Person::getName).forEach((n)->{
            System.out.print(n+ ", ");
            }); // лябда принимает n

        arrayList.stream().map(Person::getName).forEach(printUpperCase);


    }






}


class Person {
    private String name;

    Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
