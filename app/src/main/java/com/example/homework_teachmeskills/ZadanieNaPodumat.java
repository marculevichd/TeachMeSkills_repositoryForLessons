package com.example.homework_teachmeskills;

import java.util.Arrays;

public class ZadanieNaPodumat {

    public static void main(String[] args) {


        int[][] numbers = {{3, 1, 4}, {6, 2, 5}, {7, 9, 8}};


        for (int[] number1D : numbers) {
            Arrays.sort(number1D);
            for (int number : number1D) {
                System.out.print(number + " ");
            }
        }
        System.out.println();


        for (int[] number1D : numbers) {
            for (int number = 0; number < number1D.length; number++) {
                System.out.print(number1D[numbers.length - 1] - number);
            }
        }// куда делать единичка?!!!!!!!!! по желанию
        // перезаписать значения двумерного массива в одномерный и отсортировать по убыванию



    }


}
