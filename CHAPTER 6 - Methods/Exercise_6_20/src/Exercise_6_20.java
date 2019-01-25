import java.util.Scanner;

/** Count the letters in a string */
public class Exercise_6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The string has " + countLetters(s) + " letters");

    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
}
