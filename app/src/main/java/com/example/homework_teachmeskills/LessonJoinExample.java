package com.example.homework_teachmeskills;

import javax.xml.transform.Source;

public class LessonJoinExample {

    public static void main(String[] args) {
        System.out.println("main thread is running");

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Second thread is running");
            }
        };
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("main thread finished");












    }


}
