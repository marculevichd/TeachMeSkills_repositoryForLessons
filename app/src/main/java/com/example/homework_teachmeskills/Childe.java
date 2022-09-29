package com.example.homework_teachmeskills;

public class Childe extends Parent{


    void phoneNubmer(int number) {

    }

    void phoneNubmer (int nubmer, String mobileOperator) {

    }


    @Override // аннотация
    void speak() {
        super.speak(); // тихо
        System.out.println("громко"); // громко если переопределили
        // при пустом - ничего не выводиться
    }

    public static void main(String[] args) {


        Parent childe = new Childe();
        childe.colorEyes = "green"; // green
        childe.speak();





    }
}


class Parent {
    String colorEyes= "blue";

    void speak() {
        System.out.println("тихо");
    }


}
