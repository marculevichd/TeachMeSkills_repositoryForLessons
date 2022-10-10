package com.example.homework_teachmeskills;

import java.io.FileNotFoundException;

public class Neobrabotanie {

    public static void main(String[] args) {


        try{
            throwUnCheckedException();
        } catch (NullPointerException e){
            System.out.println("handle unchecked exception");
        }



        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    static void throwUnCheckedException() throws NullPointerException {
        throw new NullPointerException("runtime");
    }

    static void throwCheckedException() throws FileNotFoundException {
        throw new FileNotFoundException("compileTime");
    }

}
