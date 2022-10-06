package com.example.homework_teachmeskills;

public class AnonimClass {

    static IRepository iRepository = new IRepository() { // анонимный класс, в инициализации не нуждается, ишь создает экземляр для интерфейса
        @Override
        public void login(String username, String password) {
            System.out.println("popopop");
        }
    };
// такой анонимный класс реализует всего один метод интерфейса










    public static void main(String[] args) {
        iRepository.login("soso", "1231243123");
    }




}
