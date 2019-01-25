import java.util.Scanner;

public class Exercise_4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = input.nextLine().charAt(0);

        if (Character.isLetter(letter)) {
            switch (Character.toUpperCase(letter)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
}
