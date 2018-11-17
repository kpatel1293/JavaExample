package com.krishna.javaexample.runtimepolymorphism;

/**
 *  Polymorphism
 *  a process in which a call to an overridden method is resolved at runtime rather than compile-time.

 */
public class ShapeMain {
    public void runShape() {
        Shape s = new Shape();

        s = new Rectangle();
        s.draw();

        s = new Circle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
    
}