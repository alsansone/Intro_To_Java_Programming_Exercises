import java.util.Scanner;

public class Exercise_6_03 {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Prompt user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // Display results
        System.out.println("The integer entered " + number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome");

    }
    // Method to reverse the integer entered
    public static int reverse(int number) {
        // Create empty string for reverse value
        String r = "";
        // Convert int value to string
        String s = number + "";
        // Loop through string
        for (int i = s.length() - 1; i >= 0; i--) {
            // Assign particular character to new string
            r += s.charAt(i);
        }
        // Returns reversed string and converts to int value
        return Integer.parseInt(r);
    }
    // Method to determine if palindrome or not
    public static boolean isPalindrome(int number) {
        return number == reverse(number) ? true : false;
    }
}
