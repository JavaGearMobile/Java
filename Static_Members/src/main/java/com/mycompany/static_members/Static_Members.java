package com.mycompany.static_members;
public class Static_Members {
    public static void main(String[] args) {
        Simple.printNumber();
        Simple.printMessage();

        Simple.someNumber = 20;
        Simple.someMessage = "Java";

        Simple.printNumber();
        Simple.printMessage();
    }
}
