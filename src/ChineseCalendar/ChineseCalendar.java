package ChineseCalendar;

import java.util.Scanner;

public class ChineseCalendar {
    public static final String [] ANIMALS = {
            "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat"
    };

    public static void main(String[] args) {
        Scanner yearInput = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = yearInput.nextInt();
        yearInput.close();

        Zodiac zodiac = new Zodiac(year);
        System.out.println("The Chinese zodiac animal for the year " + year + " is "+ zodiac.getAnimal());
    }





}
