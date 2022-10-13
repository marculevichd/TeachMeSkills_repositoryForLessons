package com.example.homework_teachmeskills;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Massivi {


    public static void main(String[] args) {
        String[] massive1 = new String[3];
        massive1[0] = "1";
        massive1[1] = "2";
        massive1[2] = "3";

        String[] massive2 = {"1", "2", "3", "4", "5"};
        String massive3[] = new String[3]; // значение по умолчанию для всех элементов
        String massive4[] = {"1", "2", "3", "4", "5"};
        String massive5[] = new String[]{"1", "2", "3", "4", "5"};


        System.out.println();
        for (int i = 0; i < massive1.length; i++) {
            System.out.println(massive1[i]);
        }


        String[] massiveString1 = new String[]{"1", "2"};
//        massiveString[2] = "3"; // вышли за переделы массива// расширение невозможно
        massiveString1 = new String[]{"1", "2", "3"}; // перезаписали значение массива // это другой объект


//        методы массива
// sort
        int[] massive10 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        for (int i = 0; i <= massive10.length - 1; i++) {
            System.out.print(massive10[i] + " ");
        }
        System.out.println("\n");

        Arrays.sort(massive10);
        for (int i = 0; i <= massive10.length - 1; i++) {
            System.out.print(massive10[i] + " ");
        }
        System.out.println("\n");

        // binarySearch - поиск индекса по значению
        System.out.println(Arrays.binarySearch(massive10, 33));


        // toString
        System.out.println(Arrays.toString(massive10));


        int[] massive11 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        for (int i = 0; i < massive10.length; i++) {
            System.out.print(massive10[i] + " ");
        }

// for each
        for (int i : massive11) {
            System.out.print(i + " ");
        }

// задача найти минимальное и максимальное значение массива
        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};

// способ 1
        int max = mas[0];
        int min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            max = max < mas[i] ? mas[i] : max;
            min = min > mas[i] ? mas[i] : min;
        }
        System.out.println("\n" + max + "       " + min);
// способ 2
        Arrays.sort(mas);
        System.out.println(mas[0] + " " + mas[mas.length - 1]);


        int[] temp = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};
        double averageTemp;
        int sumOfTemp = 0;
        for (int i = 0; i < temp.length; i++) {
            sumOfTemp += temp[i];
        }
        averageTemp = (double) sumOfTemp / temp.length;
        System.out.println(averageTemp);












    }
}
