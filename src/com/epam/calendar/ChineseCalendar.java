package com.epam.calendar;

import java.util.Scanner;

public class ChineseCalendar {

    private static final Zodiac ZODIAC = new Zodiac();

    public static void main(String[] args) {
        int year = readYear();
        System.out.println("The Chinese zodiac animal for the year " + year + " is " + ZODIAC.getAnimal(year));
    }

    private static int readYear() {
        Scanner yearInput = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = yearInput.nextInt();
        yearInput.close();
        return year;
    }
}
