package com.example.homework_teachmeskills;

import java.util.Arrays;

public class TrioMassive {

    public static void main(String[] args) {


        int[][][] numbers = new int[][][]{
                {
                        {
                                1, 2, 3
                        },
                        {
                                4, 5, 6
                        }
                },
                {
                        {
                                7, 8, 9
                        }
                }
        };

        for (int[][] number2D : numbers) {
            for (int[] number1D : number2D) {
                for (int number : number1D) {
                    System.out.print(number + "\t");
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(numbers));


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                for (int l = 0; l < numbers[i][j].length; l++) {
                    System.out.print(numbers[i][j][l] + "\t");
                }
                System.out.println();
            }
        }


    }
}
