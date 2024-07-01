package com.epam.speedlimit.violator;

import java.util.Scanner;

public class SpeedCheck {

    private static final double TIME = 0.5;
    private static final int SPEED_LIMIT = 45;

    public static void main(String[] args) {
        double distance = getDistance();
        Car car = new Car(distance, TIME);
        if (car.isSpeeding(SPEED_LIMIT)) {
            System.out.println("The driver violated the traffic rules.");
        } else {
            System.out.println("The driver did not violate the traffic rules.");
        }
    }

    private static double getDistance() {
        try (Scanner distanceInput = new Scanner(System.in)) {
            return distanceInput.nextDouble();
        }
    }
}
