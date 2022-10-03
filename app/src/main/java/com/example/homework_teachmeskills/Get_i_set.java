package com.example.homework_teachmeskills;

public class Get_i_set {


    public static void main(String[] args) {
    Shop shop = new Shop();
    shop.setAge(0);
    }


}


class Shop{
    private int age =0;

     int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18) {
            this.age = age;
            cellAlco();
        }else  System.out.println("Sorry, no"+ getAge()); // здесь нет инициализации так что возвращенное значение это 0
    }

    void cellAlco(){
                System.out.println("Alco! " + getAge());
    }
}
