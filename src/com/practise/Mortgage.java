package com.practise;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("enter the amount of loan do you want to get: ");
        int principal = input.nextInt();
        System.out.print("enter the annual interest rate: ");
        float annualInterestRate = input.nextFloat();
        float monthlyRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        System.out.print("enter Period (years): ");
        int years = input.nextInt();
        int months = years * MONTHS_IN_YEAR;
        double mortgage = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate ,months) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(mortgage);
        System.out.println("Mortage: " + mortgageFormatted);
    }
}
