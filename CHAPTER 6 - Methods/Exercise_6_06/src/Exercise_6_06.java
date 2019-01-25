import java.util.Scanner;

public class Exercise_6_06 {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        // Invoke method
        displayPattern(number);
    }
    // Method to display pattern
    public static void displayPattern(int n) {
        // Loop through rows depending on number
        for (int row = 1; row <= n; row++) {
            // Print white spaces
            for (int i = row; i < n; i++) {
                System.out.print("  ");
            }
            // Print numbers
            for (int j = row; j >= 1; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
