package com.epam.price.calculator;

import java.util.Scanner;

public class DiscountedPriceCalculator {

    private static final Purchase PURCHASE = new Purchase();

    public static void main(String[] args) {
        int amount = getAmount();
        double totalAmount = PURCHASE.calculateTotal(amount);
        System.out.printf("The total amount after discount is: $%.2f%n", totalAmount);
    }

    private static int getAmount() {
        try (Scanner priceInput = new Scanner(System.in)) {
            System.out.println("Enter the purchase amount: ");
            return priceInput.nextInt();
        }
    }
}
