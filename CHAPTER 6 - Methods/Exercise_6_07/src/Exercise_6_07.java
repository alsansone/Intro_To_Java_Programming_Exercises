import java.util.Scanner;

public class Exercise_6_07 {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Prompt user to enter amount invested
        System.out.print("Enter the investment amount: ");
        double investment = input.nextDouble();
        // Prompt user to enter the annual interest rate
        System.out.print("Enter the investment rate: ");
        double rate = input.nextDouble() / 1200;
        // Constant to hold years
        final int NUMBER_OF_YEARS = 30;
        // Display results
        System.out.printf("%-10s%12s\n", "Years", "Future Value");
        for (int i = 1; i <= NUMBER_OF_YEARS; i++) {
            System.out.printf("%-10d%5.2f\n", i, futureInvestmentValue(investment, rate, i));
        }
    }
    // Method to calculate future investment
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
    }
}
