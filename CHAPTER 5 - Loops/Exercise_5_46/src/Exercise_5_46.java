import java.util.Scanner;

/** Reverse a string */
public class Exercise_5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String phrase = input.nextLine();

        String reverse = " ";
        for (int i = 0; i < phrase.length(); i++) {
            reverse = phrase.charAt(i) + reverse;
        }
        System.out.println("The reversed string is " + reverse);
    }
}
