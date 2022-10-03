package com.example.homework_teachmeskills;

public class Inteface_and_Absctraction {




    public static void main(String[] args) {

    }



}

interface Ifly {
    void fly1();
}

abstract class Birds {
    abstract void walk1();
}

class Goloob extends Birds implements Ifly {
    @Override
    void walk1() {

    }

    @Override
    public void fly1() {

    }

}

class Vorobey extends Birds implements Ifly {
    @Override
    void walk1() {

    }

    @Override
    public void fly1() {

    }
}

class Pinguin extends Birds {
    @Override
    void walk1() {

    }


}
