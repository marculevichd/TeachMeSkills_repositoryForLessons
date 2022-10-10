package com.example.homework_teachmeskills;

import androidx.annotation.Nullable;

public class CastomException {

    public static void main(String[] args) {
        Shop shop = new Shop();

        try {
            shop.setAge(0);
        } catch (Shop.CantSellToChildException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(shop.getAge());
        }

    }
}


class Shop {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) throws CantSellToChildException {
        if (age < 18) {
            throw new CantSellToChildException("sorry, y a child");
        } else {
            this.age = age;
            System.out.println("alco sold");
        }
    }

    class CantSellToChildException extends Exception {
        private String message;

        CantSellToChildException(String message) {
            this.message = message;
            //setMessage(message);
        }

        @Override
        public String getMessage() {
            return message;
        }

//        private void setMessage(String message) {
//            this.message = message;
//        }
    }


}