package com.microservice.Array;

public class StackOverflowExample {

    public static void display() {
        System.out.println("Calling display()");
        display(); // method calling itself again and again
    }

    public static void main(String[] args) {
        display();
    }
}