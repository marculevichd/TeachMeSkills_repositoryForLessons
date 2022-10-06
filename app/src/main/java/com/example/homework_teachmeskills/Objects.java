package com.example.homework_teachmeskills;

public class Objects {

    static void checkType(Object object){
        if(object instanceof Parent){
            ((Parent) object).walk();
        }else System.out.println("not parent");
    }


    String name (String name){
        if (name.isEmpty()) {
            return "Name is not enter";
        } else return name;
    }


    public static void main(String[] args) {
        Parent parent = new Parent();
        Mum mum = new Mum();
        checkType(mum);
        Objects object = new Objects();
        System.out.println(object.name("qweqwe"));

    }





}



class Parent{
    void walk(){
        System.out.println("parent called");
    }
}


class Mum extends Parent{
    @Override
    void walk() {
        System.out.println("Mum called");
    }
}

class Dad extends Parent{
    @Override
    void walk() {
        System.out.println("Dad called");
    }
    void sleep (){
        System.out.println("mum sleep");
    }
}


