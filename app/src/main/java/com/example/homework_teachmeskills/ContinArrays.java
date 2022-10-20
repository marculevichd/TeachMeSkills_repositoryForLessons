package com.example.homework_teachmeskills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ContinArrays {

    public static void main(String[] args) {

        Object[] numbers = {3, 1, 4, 6, 2, 5, 7, 9, 8};

        ArrayList arrayList = new ArrayList(Arrays.asList(numbers)); // преобразование массива в колекцию также можно через List.of(numbers), но тогда нужен Integer а не int

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }


        Collections.sort(arrayList);
        Collections.reverse(arrayList);// или reverseOrder
        arrayList.toArray();




    }


}
