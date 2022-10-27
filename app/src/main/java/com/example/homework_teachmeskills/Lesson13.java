package com.example.homework_teachmeskills;

public class Lesson13 {
    public static void main(String[] args) {
        // способ 1 создание потоков


        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start(); // запускает поток

        ThreadClass2 threadClass2 = new ThreadClass2();// создание объекта кот будет имплемент Runnable

        Thread thread1 = new Thread(threadClass2);// здесь в поток передали объект который имплементирует Runnable
        thread1.start();


    }


}


class ThreadClass1 extends Thread { // способ 1 через Thread
    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass2 implements Runnable { // способ 2 через Runnable
    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}



