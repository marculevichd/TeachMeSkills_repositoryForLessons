package com.example.homework_teachmeskills;

public interface IRepository {
    void login(String username, String password);

    default void logout() { // при наличии тела можно не реализовывать метод в классе
        System.out.println("2112");
    }










}
