import java.util.Scanner;

public class Exercise_4_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String unicode = input.next();

        System.out.println("The Unicode for the character " + unicode + " is " + (int)unicode.charAt(0));
    }
}
