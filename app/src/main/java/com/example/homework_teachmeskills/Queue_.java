package com.example.homework_teachmeskills;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Queue_ {


    public static void main(String[] args) {

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.offer("hey");
        priorityQueue.offer("t");
        priorityQueue.offer("beq");
        priorityQueue.offer("beq");
        priorityQueue.offer("t");
        priorityQueue.offer("hey");

        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());//  удаляет первый элемент
        System.out.println(priorityQueue.element());// не удаляет первый элемент

        priorityQueue.add("5");
        priorityQueue.add("2");
        System.out.println(priorityQueue);


        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addFirst(1);
        System.out.println(arrayDeque);
        arrayDeque.add(2);
        System.out.println(arrayDeque);
        arrayDeque.addLast(10);
        System.out.println(arrayDeque);
        arrayDeque.push(1000);

        System.out.println(arrayDeque);

        arrayDeque.peek();
//        arrayDeque.peekFirst();
//        arrayDeque.peekLast();
//        arrayDeque.poll();
//        arrayDeque.pollFirst();
//        arrayDeque.pollLast();

        List list = new ArrayList();
        list.addAll(arrayDeque);
        System.out.println(list.get(1));






    }

}
