import java.util.Scanner;

public class Exercise_5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();

        System.out.println("Interest Rate    Monthly Payment    Total Payment");

        for (double i = 5; i <= 8; i += .125) {
            // Calculate monthly interest rate
            double monthlyInterestRate = i / 1200;
            // Calculate monthly payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1
            -1 / Math.pow(1 + monthlyInterestRate, years * 12));
            // Calculate total payment
            double totalPayment = monthlyPayment * years * 12;
            // Display to console
            System.out.printf("%5.3f%% %16.2f %20.2f\n", i, monthlyPayment, totalPayment);
        }
    }
}
