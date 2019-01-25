import java.util.Scanner;

/** Occurrences of a specific character */
public class Exercise_6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char c = input.nextLine().charAt(0);

        System.out.println("The number of occurrences of " + c + " in the string " + s + " is " + count(s, c));
    }

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }

        return count;
    }
}
