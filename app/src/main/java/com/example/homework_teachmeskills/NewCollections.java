package com.example.homework_teachmeskills;

import java.util.ArrayList;
import java.util.Iterator;

public class NewCollections {


    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Iterator iterator= arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Integer index = arrayList.indexOf(3);
        arrayList.remove(index);
        System.out.println(arrayList);



    }



}
