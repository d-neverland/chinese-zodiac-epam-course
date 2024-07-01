package com.epam.speedlimit.violator;

public class Car {
    private final double distance;
    private final double time;

    public Car(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }
    public double calculateSpeed() {
        return distance * time;
    }
    public boolean isSpeeding(int speedLimit) {
        return calculateSpeed() > speedLimit;
    }
}
