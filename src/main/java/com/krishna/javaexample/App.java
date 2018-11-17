package com.krishna.javaexample;

import com.krishna.javaexample.aggregation.AggregationMain;
import com.krishna.javaexample.compiletimepolymorphism.Greeter;
import com.krishna.javaexample.compositon.CompositionMain;
import com.krishna.javaexample.encapsulation.UserMain;
import com.krishna.javaexample.inheritance.BicycleMain;
import com.krishna.javaexample.runtimepolymorphism.ShapeMain;

public class App 
{
    public static void main(String[] args)
    {
        // 1) aggregation 
        AggregationMain aggregation = new AggregationMain();
        aggregation.RunAggregation();

        // 2) composition 
        CompositionMain composition = new CompositionMain();
        composition.CompRun();

        // 3) runtime polymorphism 
        ShapeMain polymorp = new ShapeMain();
        polymorp.runShape();

        // 4) compile-time polymorphism
        Greeter compliGreeting = new Greeter();
        compliGreeting.runGreeter();

        // 5) inheritance 
        BicycleMain bicycle = new BicycleMain();
        bicycle.RunBicycle();

        // 6) encapsulation
        UserMain user = new UserMain();
        user.runUser();
    }
}