package com.epam.calendar;

public class Zodiac {
    private static final String[] ANIMALS =
            {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat"};

    public String getAnimal(int year) {
        int remainder = year % 12;
        return ANIMALS[remainder];
    }
}
