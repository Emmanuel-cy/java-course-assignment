package com.emmanuel;

public class FixtheBrokenCode {
    void main() {
        IO.println("=== Airport FX Booth ===");

        String customer = IO.readln("Customer name: ");
        int usdDollars = Integer.parseInt(IO.readln("USD Dollars to exchange (e.g. 200): "));

        // BUG 1: We want to charge a 3% commission fee on usdDollars.
        // Why is commission always 0?!
        int commissionPercent = 3;
        int commissionDollars = (commissionPercent / 100) * usdDollars;

        // BUG 2: We want to add a $2 flat service fee to commissionDollars,
        // why does the receipt print "Total Fee: $02" instead of adding them?!
        int flatFee = 2;
        IO.println("Total Fee: $" + commissionDollars + flatFee);

        // BUG 3: Why is netUsd ignoring the flatFee because of operator precedence / logic?
        int netUsd = usdDollars - commissionDollars + flatFee;

        IO.println("Customer " + customer + " receives exchange on: $" + netUsd);
    }
}