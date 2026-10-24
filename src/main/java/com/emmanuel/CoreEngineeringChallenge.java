package com.emmanuel;

import java.util.Scanner;
public class CoreEngineeringChallenge {
    static void main() {

        Scanner input = new Scanner(System.in);


        // Get user input
        System.out.print("Freelancer Name: ");
        String freelancerName = input.nextLine();

        System.out.print("Invoice Amount in USD Cents: ");
        long invoiceAmount = input.nextLong();

        System.out.print("Withholding Tax Percentage: ");
        int taxPercentage = input.nextInt();

        System.out.print("Exchange Rate (Local Units per 1 USD): ");
        long exchangeRate = input.nextLong();

        // Step 1: Calculate withholding tax
        long taxAmount = (invoiceAmount * taxPercentage) / 100;
        long afterTax = invoiceAmount - taxAmount;

        // Step 2: Deduct flat wire fee
        long wireFee = 1500;
        long afterWireFee = afterTax - wireFee;

        // Step 3: Calculate FX conversion fee (1.5%)
        long fxFee = (afterWireFee * 15) / 1000;
        long netUsdCents = afterWireFee - fxFee;

        // Step 4: Convert to local currency units
        long payoutMinorUnits = netUsdCents * exchangeRate;
        long finalPayout = payoutMinorUnits / 100;


        input.close();
    }
}

