package com.example.homework_teachmeskills;

public class ForInterface implements IAuth {

    static boolean isUserLoggedIn = false;
    @Override
    public void login() {
        isUserLoggedIn = true;
        System.out.println("Vhod proizveden");

    }

    @Override
    public void logout() {
        isUserLoggedIn = false;
        System.out.println("Vihod proizveden");
    }


    public static void main(String[] args) {
        ForInterface forInterface = new ForInterface();
        if(!isUserLoggedIn) forInterface.login();

        if(isUserLoggedIn) forInterface.logout();


    }







}


interface IAuth {
    void login();
    void logout();


}