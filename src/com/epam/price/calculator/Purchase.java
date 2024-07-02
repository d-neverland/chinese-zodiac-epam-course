package com.epam.price.calculator;

public class Purchase {

    public double calculateTotal(double amount) {
        double discount;
        if (amount < 100) {
            discount = 0.05;
        } else if (amount >= 100 && amount < 200) {
            discount = 0.10;
        } else {
            discount = 0.15;
        }
        return amount * (1 - discount);
    }
}
