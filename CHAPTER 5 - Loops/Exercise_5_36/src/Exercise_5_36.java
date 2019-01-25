import java.util.Scanner;

/** Business application: checking ISBN */
public class Exercise_5_36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int number = input.nextInt();

        int sum = 0;
        int temp = number;

        // Loop through number from last to first
        for (int i = 9; i >= 1; i--) {
            sum += (temp % 10) * i;
            temp = temp / 10;
        }

        int checkSum = sum % 11;

        System.out.println("The ISBN-10 number is ");

        // Adds zero's in front of number
        temp = 100_000_000;
        while (number / temp == 0) {
            System.out.print("0");
            temp /= 10;
        }
        // Print number and determine last digit
        System.out.print(number);
        if (checkSum == 10) {
            System.out.print("X");
        } else {
            System.out.println(checkSum);
        }
    }
}
