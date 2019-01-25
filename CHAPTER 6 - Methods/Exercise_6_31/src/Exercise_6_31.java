import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);
        // Prompt user to enter card #
        System.out.print("Enter a credit card number as a long number: ");
        long number = input.nextLong();
        // Display Results
        if (isValid(number))
            System.out.println(number + " is valid");
        else
            System.out.println(number + " is invalid");
    }
    // Return true if the card number is valid
    public static boolean isValid(long number) {
        // Returns size, prefix and sum and returns true if all pass
        return (getSize(number) >= 13 && getSize(number) <= 16 && (prefixMatched(number, 4) ||
                prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6)) &&
                (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }
    // Get the result from Step 2
    public static int sumOfDoubleEvenPlace(long number) {
        // Stores sum in a int variable
        int sum = 0;
        // Converts number to a string
        String s = number + "";
        // Loops through even placed digits
        for (int i = s.length()-2; i >= 0; i -= 2) {
            // Takes the sum of the digits and runs them through getDigits to check double digit or no
            sum += getDigit(Integer.parseInt(s.charAt(i) + "") * 2);
        }
        return sum;
    }
    // Return this number if it is a single digit, otherwise, return the sum of the two digits
    public static int getDigit(int number) {
        // Check if number is greater than 9
        if (number > 9)
            // If greater than 9 add both digits together and return that number
            return number / 10 + number % 10;
        else
            // Return original number
            return number;
    }
    // Return sum of odd place digits in number
    public static int sumOfOddPlace(long number) {
        // Variable to hold sum
        int sum = 0;
        // Convert number to a string to loop through characters
        String s = number + "";
        // Loops through each character starting from the last one and continuing up the string every 2 digits
        for (int i = s.length()-1; i >= 0; i -= 2) {
            // Obtains the character at a particular index, changes it to a string and then parses it to an int
            sum += Integer.parseInt(s.charAt(i) + "");
        }
        return sum;
    }

    // Return true if the digit d is a prefix for number
    public static boolean prefixMatched(long number, int d) {
        // Takes length of d (either 1 or 2) runs that through getPrefix method and determines if equals d
        return getPrefix(number, getSize(d)) == d;
    }
    // Return the number of digits in d
    public static int getSize(long d) {
        // Converts number to string
        String s = d + "";
        // Returns length of the string
        return s.length();
    }
    // Return the first k number of digits from number. If the number of digits in number is less than k, return number
    public static long getPrefix(long number, int k) {
        // Compares the length of the number to the length of k which based on the isValid method can be 1 or 2
        if (getSize(number) > k) {
            // Stores the number as a string
            String s = number + "";
            // Converts string to int and takes digits from index 0 to index k - 1
            return Integer.parseInt(s.substring(0, k));
        }
        // returns the number if length is <= k
        return number;
    }
}
