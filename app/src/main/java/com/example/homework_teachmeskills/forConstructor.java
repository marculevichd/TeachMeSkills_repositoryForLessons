package com.example.homework_teachmeskills;

public class forConstructor {



    public static void main(String[] args) {

        Friends myFriend = new Friends("Oleg", 21, "21.21.21");
//        String name = "Oleg";
//        int age = 30;
//        myFriend.born(); // не вызовется без конструктора
        myFriend.born();// вызовется потому что добавили констуктор
        Friends myFriend2 = new Friends("Oleja", 90);
        myFriend2.born();// вызовется потому что добавили второй констуктор

    }


}



class Friends{

    private String name;
    private int age ;
    private String birthday;

    public Friends(String name2, int age2, String birthday2){ // вызов конструктора
        this.name=name2;
        this.age=age2;
        this.birthday=birthday2;
    }
    public Friends(String name2, int age2){ // вызов второго конструктора без даты рождения
        this.name=name2;
        this.age=age2;
        }



    void born(){
        String conrgeculeishion = "";
        if(birthday==null || birthday.isEmpty()){
            conrgeculeishion = "no date of birthday";
        } else {conrgeculeishion= name + "has birthday on: " + birthday + " "+ "he is "+ age+ " old";}
        System.out.println(conrgeculeishion);
    }
}
