package com.example.homework_teachmeskills;

import java.util.Arrays;

public class Puzirek {
    public static void main(String[] args) {
        int[] massive = {1,5,-3,17,3,2,13};

        boolean isSorted = false;
        int buf;
        System.out.println(Arrays.toString(massive));
        while (isSorted==false) {

            isSorted = true;
            for (int i = 0; i < massive.length - 1; i++) { //< по возрастанию // при > по убыванию
                if (massive[i] > massive[i + 1]) {
                    isSorted = false;

                    buf = massive[i];
                    massive[i] = massive[i+1];
                    massive[i + 1] = buf;
                }
            }
            System.out.println(Arrays.toString(massive));
        }


    }


}
