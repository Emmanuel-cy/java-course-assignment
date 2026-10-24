package com.emmanuel;

public class StretchChallenge {
    void main() {
        10
        int amount = Integer.parseInt(
                IO.readln("Withdrawal amount in whole dollars: ")
        );

        int hundreds = amount / 100;
        amount %= 100;

        int fifties = amount / 50;
        amount %= 50;

        int twenties = amount / 20;
        amount %= 20;


        int tens = amount / 10;
        amount %= 10;

        int fives = amount / 5;
        amount %= 5;

        int ones = amount;

        int totalBills = hundreds + fifties + twenties
                + tens + fives + ones;

        IO.println("$100 bills: " + hundreds);
        IO.println("$50 bills:  " + fifties);
        IO.println("$20 bills:  " + twenties);
        IO.println("$10 bills:  " + tens);
        IO.println("$5 bills:   " + fives);
        IO.println("$1 bills:   " + ones);
        IO.println("Total physical bills dispensed: " + totalBills);
    }

}
