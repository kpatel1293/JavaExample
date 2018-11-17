package com.krishna.javaexample.compiletimepolymorphism;

public class Greeting {
    public void greet() {
        System.out.println("General greetings");
    }

    // overloading method that can have different return types if the argument list is different
    public void greet(String name) {
        System.out.println("General greetings for " + name);
    }
}