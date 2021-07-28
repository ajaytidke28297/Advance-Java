package org.ajay.enums;

public class Main {

    public static void main (String [] args) {
        Color color = Color.RED;

        System.out.println("RED ENUM name : " + color.name());
        System.out.println("RED ENUM value : " + color.getValue());

        for (Color c1: Color.values()) {
            System.out.println("ENUM value : " + c1.name());
        }
    }
}
