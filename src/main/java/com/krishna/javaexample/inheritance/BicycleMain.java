package com.krishna.javaexample.inheritance;

/**
 * BicycleMain
 */
public class BicycleMain {
    public void RunBicycle() {
        MountainBike mountainBike = new MountainBike(3, 100, 25);
        System.out.println(mountainBike.toString());
    }
}