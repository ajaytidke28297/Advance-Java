package org.ajay.autoboxing_unboxing;

public class AutoBoxingDemo {
    public static void main(String[] args) {
        int i = 10;

        //Autobox
        Integer integer = Integer.valueOf(i);
        System.out.println("value of Integer obj: " + integer);

        //Unboxing
        int i1 = integer;
        System.out.println("Value of i1: " + i1);

        //Autobox
        Character character = 'a';
        System.out.println("Value of character: " + character);

        //Unboxing
        char ch = character;
        System.out.println("Value of ch: " + ch);
    }
}
