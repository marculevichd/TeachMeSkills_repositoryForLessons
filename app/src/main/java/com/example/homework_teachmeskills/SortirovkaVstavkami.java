package com.example.homework_teachmeskills;

import java.util.Arrays;

public class SortirovkaVstavkami {


    public static void main(String[] args) {
        int[] massive = {1, 5, -3, 17, 3, 2, 13};
        System.out.println(Arrays.toString(massive));

        for (int i = 0; i < massive.length; i++) {
            int current = massive[i];
            int newValue = i - 1;
            while (newValue >= 0 && current < massive[newValue]) {
                massive[newValue + 1] = massive[newValue];
                newValue--;
            }
            massive[newValue + 1] = current;
            System.out.println(Arrays.toString(massive));
        }
    }
}
