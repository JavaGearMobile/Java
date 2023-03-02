package com.mycompany.static_members;

public class Simple {
    static int someNumber = 10;
    static String someMessage = "message";

    static void printNumber() {
        System.out.println(someNumber);
    }

    static void printMessage() {
        System.out.println(someMessage);
    }
}
