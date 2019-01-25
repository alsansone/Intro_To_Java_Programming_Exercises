import java.util.Scanner;

public class Exercise_6_04 {
    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);
        // Prompt user for integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // Display results
        System.out.print(number + " reversed is ");
        reverse(number);
    }
    // Reverse method
    public static void reverse(int number) {
        // Variable to hold reverse
        String r = "";
        // Variable to convert int to string
        String s = number + "";
        // Loop through characters of string
        for (int i = s.length() - 1; i >= 0; i--) {
            r += s.charAt(i);
        }
        System.out.println(r);
    }
}
