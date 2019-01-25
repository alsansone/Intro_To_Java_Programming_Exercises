import java.util.Scanner;

public class Exercise_4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String message = input.nextLine();

        System.out.println("The string is " + message.length() + " characters long");
        System.out.println("The first character of the string is " + message.charAt(0));
    }
}
