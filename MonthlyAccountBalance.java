/*
 * Course: C155
 * Assignment: Programming Assignment 2
 * Name: Ann C.
 * Date: Feb.5 2026
 * Purpose: Calculates the account balance after 6 months of monthly savings with interest.
 */

import java.util.Scanner;

public class MonthlyAccountBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter the amount 
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();

        // The interest rate
        double monthlyInterest = 0.05 / 12;

        // Calculate account value after each month
        double month1 = monthlySaving * (1 + monthlyInterest);
        double month2 = (monthlySaving + month1) * (1 + monthlyInterest);
        double month3 = (monthlySaving + month2) * (1 + monthlyInterest);
        double month4 = (monthlySaving + month3) * (1 + monthlyInterest);
        double month5 = (monthlySaving + month4) * (1 + monthlyInterest);
        double month6 = (monthlySaving + month5) * (1 + monthlyInterest);

        // Show result
        System.out.printf("After the sixth month, the account value is $%.2f\n", month6);

        input.close();
    }
}
