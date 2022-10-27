package com.example.homework_teachmeskills;

public class Lesson13_1 {

    public static void main(String[] args) {
        // способ 2 через анонимный класс

        ThreadClass3 threadClass3 = new ThreadClass3(){
            @Override
            public void run() {
                System.out.println("Run in Thread in annonym class");
            }
        }; // через анонимный класс локально переопределили метод run()
        threadClass3.start();

        // способ 3 не создавая вообще классы

        Thread thread4 = new Thread(){
            @Override
            public void run() {
                System.out.println("I'm running in thread anonym");
            }
        };
        thread4.start();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Rannuble thread is running");
            }
        };
        Thread thread = new Thread(runnable); // то же самое что и в способе 1
        thread.start();


    }
}




class ThreadClass3 extends Thread { // через Thread
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

