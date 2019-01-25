import java.util.Scanner;

public class Exercise_5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        // Compute monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        // Compute monthly payment
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - (Math.pow(1 / (1 + monthlyInterestRate), years * 12)));

        // Initialize interest and principal
        double interest, principal, balance = loanAmount;


        // Display monthly payment & total payment
        System.out.printf("\nMonthly Payment: %4.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %6.2f\n", monthlyPayment * years * 12);

        System.out.println("\nPayment #      Interest     Principal       Balance");
        for (int i = 1; i <= years*12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance -= principal;
            System.out.printf("%2d%18.2f%14.2f%17.2f\n", i, interest, principal, balance);
        }


    }
}
