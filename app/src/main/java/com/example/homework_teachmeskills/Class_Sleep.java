package com.example.homework_teachmeskills;

public class Class_Sleep {

    public static void main(String[] args) {
        ThreadClass6 threadClass6 = new ThreadClass6();
        threadClass6.start();

        long start = System.currentTimeMillis();
        System.out.println("called in thread: " + ThreadClass6.currentThread().getName() + " "+ start);



    }

}

class ThreadClass6 extends  Thread {
    @Override
    public void run() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long start = System.currentTimeMillis();
        Thread thread = Thread.currentThread();
        System.out.println("I run this code in " + thread.getName() + " " + start);
    }
}