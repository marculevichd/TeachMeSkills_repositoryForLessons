package com.example.homework_teachmeskills;

public class IntarfaceCallBack {


    public static void main(String[] args) {
        Button button = new Button(new LoginClickListener());
        button.buttonClicked();
    }
}


interface IAutorization1{

    void sendLoginRequest();
}


class Button {

    IAutorization1 iAutorization1;
    public Button (IAutorization1 action){
        this.iAutorization1 = action;
    }
    void buttonClicked(){
        iAutorization1.sendLoginRequest();
    }
}


class LoginClickListener implements IAutorization1{

    @Override
    public void sendLoginRequest() {
        System.out.println("Login request was successfully sent...");

    }
}