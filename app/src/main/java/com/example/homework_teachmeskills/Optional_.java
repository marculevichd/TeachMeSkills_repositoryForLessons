package com.example.homework_teachmeskills;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Optional;

public class Optional_ {

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {


// методы Optional isPresent - есть ли значения типа Optional; orElse - если значения нет; get - получить значение
        Optional<Integer> optional = Optional.of(10);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("no value");
        }


    }
}
