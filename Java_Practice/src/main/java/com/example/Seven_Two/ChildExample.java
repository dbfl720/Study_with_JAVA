package com.example.Seven_Two;

public class ChildExample {
    public static void main (String[] args) {
        com.example.java_practice.Child child = new com.example.java_practice.Child();

        com.example.Seven_Two.Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3();
    }
}
