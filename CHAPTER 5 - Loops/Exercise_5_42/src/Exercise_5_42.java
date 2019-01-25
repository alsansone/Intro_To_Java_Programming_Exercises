import java.util.Scanner;

/** Financial application: find the sales amount */
public class Exercise_5_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter commission sought: ");
        double commissionSought = input.nextDouble();

        double commission = 0;
        double salesAmount = 0;

        for (salesAmount = 1; commission < commissionSought; salesAmount++) {
            if (salesAmount <= 5000) {
                commission = salesAmount * .08;
            } else if (salesAmount <= 10_000) {
                commission = 400 + (salesAmount - 5000) * .1;
            } else {
                commission = 900 + (salesAmount - 10000) * .12;
            }
        }
        System.out.println("The sales amount needed to make $" + commissionSought +
                " is $" + salesAmount);
    }
}
