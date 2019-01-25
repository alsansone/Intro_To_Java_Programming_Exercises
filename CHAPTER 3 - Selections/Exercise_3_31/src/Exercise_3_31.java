import java.util.Scanner;

public class Exercise_3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int conversion = input.nextInt();

        double amount;

        if (conversion == 0) {
            System.out.print("Enter the dollar amount: ");
            amount = input.nextDouble();
            double dollarToYuan = amount * exchangeRate;
            System.out.println("$" + amount + " is " + (int)(dollarToYuan * 100) / 100.0 + " yuan");
        } else if (conversion == 1) {
            System.out.print("Enter the RMB amount: ");
            amount = input.nextDouble();
            double yuanToDollar = amount / exchangeRate;
            System.out.println(amount + " yuan is $" + (int)(yuanToDollar * 100) / 100.0);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
