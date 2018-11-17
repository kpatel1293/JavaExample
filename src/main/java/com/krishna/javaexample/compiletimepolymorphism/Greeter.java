package com.krishna.javaexample.compiletimepolymorphism;

/**
 * Greeter
 */
public class Greeter {

    public void runGreeter() {
        Greeting greeting = new Greeting();
        greeting.greet();
        greeting.greet("Krishna");
    }
}