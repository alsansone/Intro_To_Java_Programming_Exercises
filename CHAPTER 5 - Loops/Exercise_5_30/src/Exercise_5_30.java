/* Financial application: compound value */
import java.util.Scanner;

public class Exercise_5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly deposit: ");
        double monthlyDeposit = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double monthlyInterestRate = annualInterestRate / 1200;
        double currentAmount = monthlyDeposit * (1 + monthlyInterestRate);

        for (int i = 1; i < months; i++) {
            currentAmount += monthlyDeposit * (1 + monthlyInterestRate);
        }
        System.out.printf("After " + (months > 1 ? months + " months" : months + " month") + " the account " +
                "will be at $%5.2f dollars", currentAmount);
    }
}
