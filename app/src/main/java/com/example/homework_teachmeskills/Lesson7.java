package com.example.homework_teachmeskills;

public class Lesson7 {
    static RepositoryImpl iRepositiry;


    static Anonum anonum = new Anonum(){ // это анонимный класс - наследник определенного класса
        @Override
        void hackNetWork() {
            super.hackNetWork(); // покажет поведение родителя
            System.out.println("новое поведение ");
        }
    };

    public static void main(String[] args) {
    iRepositiry = new RepositoryImpl(); // инициализация классом, который имплементирует интерфейс
    iRepositiry.login("qwe","1231");


        anonum.hackNetWork();





    Shop shop = Shop.CLOSE; // экземляр enum создать нельзя, сразу надо обращаться к константам внутри
        switch (shop) {
            case OPEN:
                System.out.println("oootkrit");
                break;
            case CLOSE:
                System.out.println("zakrit");
                break;
        }



    }





    enum Shop{
        OPEN,
        CLOSE
    }




}




class Anonum {
    void hackNetWork(){
        System.out.println("rrrr");
    }

}




class Vneshniy {
    void method (){
        System.out.println("print");
    }
    private String a = "nedostupno";
    public String publicString = "?";
    static String staticString = "staticString";
    class Vnutreniy{ // Inner
        Vnutreniy vnutreniy = new Vnutreniy();
        void method (){
            System.out.println(a);
        }
    }



    static class Vlojenniy{ // Nested
        //System.out.println(a); // не скопилируется тк вложенные класс не видит приватные обхекты внешнего класса
        //System.out.println(publicString); //  к публичному тоже


        void method (){ // данный метод реально использовать тк классы разные, соотвественно методы локальные
            System.out.println("print");
            System.out.println(staticString);// статистические объекты реально использовать
        }

    }


}