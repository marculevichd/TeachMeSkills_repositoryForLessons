package com.example.homework_teachmeskills;

public class ConstantiInterface implements IAuthorization{


    @Override
    public void login(boolean userIsLoggedIn) {
        if (userIsLoggedIn){
            System.out.println("user is logged in");
        }
        if (!userIsLoggedIn){
            System.out.println("user is not logged in");
        }
    }

    public static void main(String[] args) {
        ConstantiInterface constantiInterface = new ConstantiInterface();
        constantiInterface.login(userIsLoggedIn);


    }



}


interface IAuthorization{
    boolean userIsNotLoggedIn = false; // это константы
    boolean userIsLoggedIn = true;

    void login(boolean userIsLoggedIn);

}

