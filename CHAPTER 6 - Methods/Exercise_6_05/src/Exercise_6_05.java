import java.util.Scanner;

public class Exercise_6_05 {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Prompt user
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        // Invoke the method
        displayNumbers(number1,number2,number3);
    }
    // Method to sort numbers
    public static void displayNumbers(double num1,double num2,double num3) {
            double temp; // Hold number to swap
            // Checks if number 2 is less than numbers 1 & 3
            if (num2 < num1 && num2 < num3){
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
            // Checks if number 3 is less than numbers 1 & 2
            else if (num3 < num1 && num3 < num2) {
                temp = num1;
                num1 = num3;
                num3 = temp;
            }
            // Checks if number 3 is less than number 2 in a new statement
            if (num3 < num2) {
                temp = num2;
                num2 = num3;
                num3 = temp;
            }

            // Display result
            System.out.println(num1 + " " + num2 + " " + num3);
    }
}
