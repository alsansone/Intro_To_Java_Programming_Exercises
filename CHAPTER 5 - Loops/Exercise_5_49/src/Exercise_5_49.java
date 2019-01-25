import java.util.Scanner;

/** Count vowels and consonants */
public class Exercise_5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int numberOfVowels = 0;
        int numberOfConsonants = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (Character.toUpperCase(s.charAt(i)) == 'A' ||
                Character.toUpperCase(s.charAt(i)) == 'E' ||
                Character.toUpperCase(s.charAt(i)) == 'I' ||
                Character.toUpperCase(s.charAt(i)) == 'O' ||
                Character.toUpperCase(s.charAt(i)) == 'U') {
                    numberOfVowels++;
                } else {
                    numberOfConsonants++;
                }
            }
        }
        System.out.println("The number of vowels is " + numberOfVowels);
        System.out.println("The number of consonants is " + numberOfConsonants);
    }
}
