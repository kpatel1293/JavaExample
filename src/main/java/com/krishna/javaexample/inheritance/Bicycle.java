package com.krishna.javaexample.inheritance;

/**
 * Bicycle
 */
public class Bicycle {
    private int gear; 
    private int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    
    public void applyBrake(int dec) {
        speed -= dec;
    }

    public void speedUp(int inc) {
        speed += inc;
    }

    @Override
    public String toString() {
        return ("Number of gears are " + gear + "\n speed of bicycle is " + speed);
    }
}