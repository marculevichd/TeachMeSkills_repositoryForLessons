package com.example.homework_teachmeskills;

public class Lesson8_1 {
    public static void main(String[] args) {


        // пример вызова NullPointerException

        getWrongValue(null);


    }

    static void getWrongValue(Integer value) {
        try {
            System.out.println(value.toString());
        } catch (NullPointerException nameException) {
            System.out.println("исключение NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("исключение RuntimeException");
        } catch (Exception e) {
            System.out.println("исключение Exception");
        } finally {
            System.out.println("блок finally ");
        }
    }

}
