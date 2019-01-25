import java.util.Scanner;

/** Count uppercase letters */
public class Exercise_5_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        int numberOfUppercase = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                if (Character.toUpperCase(s.charAt(i)) == s.charAt(i)) {
                    numberOfUppercase++;
                }
            }
            /* Additional solution
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                numberOfUppercase++;*/
        }
        System.out.println("The number of uppercase letters is " + numberOfUppercase);
    }
}
