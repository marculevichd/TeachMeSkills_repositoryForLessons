package com.example.homework_teachmeskills;

public class DuoMassive {
    public static void main(String[] args) {
        int massive[][] = new int[][]{{1, 3, 4, 5}, {1, 2, 6, 8, 9}};
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j] + "\t");
            }
            System.out.println();
        }

        for (int[] i : massive) { // создание одномерного массива i в цикле for
            for (int j : i) {
                System.out.print(j + " ");
            }
        }
        System.out.println();


        int[][] number = new int[3][3];
        number[0][0] = 1;
        number[0][1] = 2;
        number[0][2] = 3;
        number[1][0] = 4;
        number[1][1] = 5;
        number[1][2] = 6;


        for (int massive1D = 0; massive1D < number.length; massive1D++) {
            for (int element = 0; element < number[massive1D].length; element++) {
                System.out.print(number[massive1D][element] + "\t");
            }
            System.out.println();
        }


        String[][] massiveString = new String[][]{
                {"IOS", "Android", "Flutter"},
                {"Developer"}
        };

        System.out.println("I'm " + massiveString[0][1] + " " + massiveString[1][0]);








    }
}
