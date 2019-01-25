/* Financial application: compute CD value */
import java.util.Scanner;

public class Exercise_5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount: ");
        double amount = input.nextDouble();
        System.out.print("Enter the annual percentage yield: ");
        double annualPercentYield = input.nextDouble();
        System.out.print("Enter the number of months: ");
        int months = input.nextInt();

        double monthlyPercentYield = annualPercentYield / 1200;

        System.out.println("Month   CD Value");
        for (int i = 1; i <= months; i++) {
            amount = amount * (1 + monthlyPercentYield);
            System.out.printf("%-2d %13.2f\n", i, amount);
        }
    }
}
