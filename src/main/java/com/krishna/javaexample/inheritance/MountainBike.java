package com.krishna.javaexample.inheritance;

/**
 * MountainBike
 */
public class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int gear, int speed, int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newVal) {
        seatHeight = newVal;
    }

    public String toString() {
        return (super.toString() + "\n seat height is " + seatHeight);
    }
}